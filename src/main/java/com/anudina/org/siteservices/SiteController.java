package com.anudina.org.siteservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class SiteController {
    Logger logger = LoggerFactory.getLogger(SiteController.class);
    @RequestMapping("/getSite")
    public String getSite(){
        logger.info("getSite() Called");
        return "Site1";
    }
}
