package com.spring.utility.Controller.Tinyurl;

import com.spring.utility.Models.Website;
import com.spring.utility.Repository.Websiterepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TinyUrlController {
    @Autowired
    private Websiterepo websiterepo;

    @GetMapping(value = "/websites")
    public List<Website> getWebsite(){
        return websiterepo.findAll();
    }

    @GetMapping(value = "/get{shortUrl}")
    public String getWebsite(@PathVariable String shortUrl, @RequestBody Website website){
       Website getWebsite = websiterepo.findById(shortUrl).get();
       String result = getWebsite.getLongUrl();

       return result;
    }


    @PostMapping(value = "/save")
    public String saveWebsite(@RequestBody Website website){
        websiterepo.save(website);
        return "Saved...";
    }

    @PutMapping(value = "/update/{shortUrl}")
    public String updateWebsite(@PathVariable String shortUrl, @RequestBody Website website ){
        Website updateWebsite = websiterepo.findById(shortUrl).get();
        updateWebsite.setShortUrl(website.getShortUrl());
        updateWebsite.setLongUrl(website.getLongUrl());
        updateWebsite.setAccessed(website.getAccessed());
        updateWebsite.setCreator(website.getCreator());
        websiterepo.save(updateWebsite);
        return "updating...";
    }
    @DeleteMapping(value = "/delete/{shortUrl}")
    public String deleteWebsite(@PathVariable String shortUrl){
        Website deleteWebsite = websiterepo.findById(shortUrl).get();
        websiterepo.delete(deleteWebsite);
        return "Deleting shortUrl:" + shortUrl;
    }

}
