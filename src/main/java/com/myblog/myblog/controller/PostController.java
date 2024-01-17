package com.myblog.myblog.controller;

import com.myblog.myblog.payload.PostDto;
import com.myblog.myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }


    @PostMapping
    public ResponseEntity<?> createPostDto(@RequestBody PostDto dto) {
        PostDto post = postService.createPost(dto);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }
    // http://localhost:8080/api/posts/particular?id=1
      @GetMapping("/particular")
        public ResponseEntity<PostDto> getPostById(@RequestParam long id){
            PostDto dto = postService.getPostById(id);
            return new ResponseEntity<>(dto,HttpStatus.OK);

    }
    @GetMapping
    public List<PostDto> getAllPostById(){
        List<PostDto> postDtos=postService.getAllPostById();
        return null;
    }
}