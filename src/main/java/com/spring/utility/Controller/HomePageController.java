package com.spring.utility.Controller;
import com.spring.utility.Controller.Tinyurl.TinyUrlController;
import com.spring.utility.Models.Website;
import com.spring.utility.Repository.Websiterepo;
import com.spring.utility.Service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomePageController {


    private WebsiteService websiteService;
    @Autowired
    public void setWebsiteService(WebsiteService websiteService) {
        this.websiteService = websiteService;
    }


//    @RequestMapping("/")
//    public String viewHomePage(Model model) {
//        //model.addAttribute("Message", "This is from controller");
//        model.addAttribute("WebsiteList",websiteService.getAllWebsites());
//
//        return "index";
//
//    }

    @RequestMapping("/")
    public String showForm(Model model) {
        //model.addAttribute("Message", "This is from controller");
        Website website = new Website();
        model.addAttribute("website",website);
        return "index";
    }

    @PostMapping("/generated")
    public String submitForm(@ModelAttribute("website") Website website){

        websiteService.saveWebsite(website);
        System.out.println(website);
        return "generated_success";
    }


}
