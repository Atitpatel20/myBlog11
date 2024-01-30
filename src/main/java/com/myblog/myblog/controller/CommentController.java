package com.myblog.myblog.controller;

import com.myblog.myblog.payload.CommentDto;
import com.myblog.myblog.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // http://localhost:8080/api/comments?postId=1
    @PostMapping
    public ResponseEntity<CommentDto>createComments
    (@RequestBody CommentDto commentDto,
     long postId) {
        CommentDto dtos = commentService.createComments(commentDto, postId);
        return new ResponseEntity<>(dtos, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/comments/2
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCommentById(@PathVariable long id) {
        commentService.deleteComment(id);
        return new ResponseEntity<>("Record is deleted", HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<CommentDto>updateCommentById(@PathVariable long id,@RequestBody CommentDto commentDto){
        CommentDto dtos=commentService.updateComment(id,commentDto);
        return new ResponseEntity<>(dtos,HttpStatus.OK);
    }
}
