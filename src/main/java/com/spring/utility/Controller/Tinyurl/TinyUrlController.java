package com.spring.utility.Controller.Tinyurl;

import com.spring.utility.Models.Website;
import com.spring.utility.Repository.Websiterepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TinyUrlController {
    @Autowired
    private Websiterepo websiterepo;

    @GetMapping(value = "/websites")
    public List<Website> getWebsite(){
        return websiterepo.findAll();
    }

    @GetMapping(value = "/get/{shortUrl}")
    public Website getWebsite(@PathVariable String shortUrl){
       return websiterepo.findById(shortUrl).get();
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
