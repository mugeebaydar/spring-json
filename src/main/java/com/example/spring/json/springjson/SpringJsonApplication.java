package com.example.spring.json.springjson;

import com.example.spring.json.springjson.controller.HomeController;
import com.example.spring.json.springjson.entity.Comment;
import com.example.spring.json.springjson.entity.Users;
import com.example.spring.json.springjson.service.CommentService;
import com.example.spring.json.springjson.service.UsersService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringJsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJsonApplication.class, args);

        List<Comment> commentList = HomeController.getComments();
        System.out.println(CommentService.filterByParameter(commentList));

        System.out.println("------------------------------------------------");

        List<Users> commentUserList =HomeController.getUsersComments();
        System.out.println(UsersService.filterByUsersParameter(commentUserList));

       /* List<Users> userIdList=HomeController.getUsersByParameter();
        System.out.println(UsersService.filterByUsersParameter(userIdList));*/

    }








}
