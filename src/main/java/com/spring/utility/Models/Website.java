package com.spring.utility.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Website {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String longUrl;
    @Id
    private String shortUrl;
    private int accessed;
    private String creator;
    public int getAccessed() {
        return accessed;
    }

    public void setAccessed(int accessed) {
        this.accessed = accessed;
    }



    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Website{" +
                "longUrl='" + longUrl + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", accessed=" + accessed +
                ", creator='" + creator + '\'' +
                '}';
    }
}
