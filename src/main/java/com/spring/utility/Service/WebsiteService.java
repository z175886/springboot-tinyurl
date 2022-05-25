package com.spring.utility.Service;

import com.spring.utility.Models.Website;
import org.apache.xpath.operations.String;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface WebsiteService {
    List<Website> getAllWebsites();
    void saveWebsite(Website website);


}
