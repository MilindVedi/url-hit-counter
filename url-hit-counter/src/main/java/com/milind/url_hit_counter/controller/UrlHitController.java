package com.milind.url_hit_counter.controller;

import com.milind.url_hit_counter.UrlHitCounterFeature;
import com.milind.url_hit_counter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    public UrlHitService urlHitService;

    @GetMapping("/count")
    public String getHitCount() {
        return String.valueOf(urlHitService.getCount());
    }

    @GetMapping("/username/{username}/count")
    public String getHitCountForUser(@PathVariable String username) {
        return String.valueOf(urlHitService.getHitCountForUser(username));
    }
}
