package com.example.spring.json.springjson.service;

import com.example.spring.json.springjson.entity.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentService {
    public static List<Comment> filterByParameter(List<Comment> filterList) {

        List<Comment> responseList = new ArrayList<>();
        System.out.println("Name ve Body alanlarında 'quo' kelimesi geçenlerin emaili ve bodysinin listelenmesi.");
        for (Comment comment : filterList) {

            if (comment.getName().toLowerCase().contains("quo") && comment.getBody().toLowerCase().contains("quo")) {
                responseList.add(comment);
                System.err.println("  ---EMAIL: " + comment.getEmail().toLowerCase() +
                        "  -----BODY: " + comment.getBody().toLowerCase());
            }
        }
        List<Comment> responseList1 = responseList;
        return responseList1;
    }
}
