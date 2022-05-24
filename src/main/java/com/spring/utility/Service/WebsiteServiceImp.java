package com.spring.utility.Service;

import com.spring.utility.Dao.WebsiteDao;
import com.spring.utility.Models.Website;
import com.spring.utility.Repository.Websiterepo;
import org.hibernate.annotations.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WebsiteServiceImp implements  WebsiteService{
    @Resource(name = "websiteDaoImpl")
    private WebsiteDao websiteDao;
    @Autowired
    private Websiterepo websiterepo;

    @Override
    public List<Website> getAllWebsites() {
        return websiterepo.findAll();
    }

    @Override
    public void saveWebsite(Website website) {
        website.setShortUrl(websiteDao.generateShortUrl());
        this.websiterepo.save(website);
    }


}
