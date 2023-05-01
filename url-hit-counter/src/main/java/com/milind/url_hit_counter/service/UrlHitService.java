package com.milind.url_hit_counter.service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class UrlHitService {
    private HashMap<String, Integer> usersToCount = new HashMap<>();
    private int totalHitsCount;
    public int getCount() {
        totalHitsCount ++;
        return totalHitsCount;
    }

    public int getHitCountForUser(String username) {
        if(usersToCount.containsKey(username)) {
            usersToCount.put(username, usersToCount.get(username) + 1);
        }
        else {
            usersToCount.put(username, 1);
        }
        return usersToCount.get(username);
    }
}
