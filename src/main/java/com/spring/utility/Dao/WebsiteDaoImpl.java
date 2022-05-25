package com.spring.utility.Dao;

import org.springframework.stereotype.Repository;

import java.util.Random;
import java.util.UUID;

@Repository
public class WebsiteDaoImpl implements WebsiteDao {
    @Override
    public void add(){
        System.out.println("dao add....");
    }

    @Override
    public String generateShortUrl() {
        String uuid = UUID.randomUUID().toString();
        uuid=uuid.substring(0,7);
        String prefix = "https://mytinyurl.com/";
        uuid=prefix+uuid;
        return uuid;
    }

    @Override
    public boolean keyIsExist() {
        return false;
    }

}
