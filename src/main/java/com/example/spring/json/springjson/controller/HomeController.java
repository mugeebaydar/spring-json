package com.example.spring.json.springjson.controller;

import com.example.spring.json.springjson.entity.Comment;
import com.example.spring.json.springjson.entity.Users;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class HomeController {

    public static List<Comment> getComments() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Comment>> response = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/comments/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Comment>>() {
                });
        List<Comment> commentList = response.getBody();
        return commentList;
    }



    public static List<Users> getUsersComments() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Users>> response = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/posts/1/users?id=1",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Users>>() {
                });
        List<Users> commentUserList = response.getBody();
        return commentUserList;
    }





}
