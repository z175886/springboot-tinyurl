package com.spring.utility.Dao;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class WebsiteDaoImpl implements WebsiteDao {
    @Override
    public void add(){
        System.out.println("dao add....");
    }

    @Override
    public String generateShortUrl() {
        String CHARSPOOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder str = new StringBuilder();
        Random rnd = new Random();
        while (str.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * CHARSPOOL.length());
            str.append(CHARSPOOL.charAt(index));
        }
        String resultStr = str.toString();
        String prefix = "https://tinyurl.com/";
        resultStr=prefix+resultStr;
        return resultStr;
    }

    @Override
    public boolean keyIsExist() {
        return false;
    }

}
