package com.example.spring.json.springjson.service;

import com.example.spring.json.springjson.entity.Comment;
import com.example.spring.json.springjson.entity.Users;
import com.example.spring.json.springjson.controller.HomeController;


import java.util.ArrayList;
import java.util.List;

public class UsersService {
    public static List<Users> filterByUsersParameter(List<Users> userFilterList) {

        List<Users> responseList = new ArrayList<>();

        for (Users user : userFilterList) {

            if (user.getId()==1) {
                responseList.add(user);
                System.err.println("--Name: " + user.getName().toLowerCase()
                        + " --Username: " + user.getUsername().toLowerCase()
                        + " --Phone: " + user.getPhone().toLowerCase());
            }
        }
        List<Users> usersList = responseList;
        return usersList;
    }

}
