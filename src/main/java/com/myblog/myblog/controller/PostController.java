package com.myblog.myblog.controller;

import com.myblog.myblog.payload.PostDto;
import com.myblog.myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }

//    @PreAuthorize("hasRole('ADMIN')")
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
    // http://localhost:8080/api/posts?pageNo=0&pageSize=3&sortBy=description&sortDir=desc
    @GetMapping
    public List<PostDto> getAllPostById(
            @RequestParam(name="pageNo" ,required = false,defaultValue = "0") int pageNo,
            @RequestParam(name="pageSize" ,required = false,defaultValue = "3") int pageSize,
            @RequestParam(name="sortBy" ,required = false,defaultValue = "id") String sortBy,
            @RequestParam(name="sortDir" ,required = false,defaultValue = "asc") String sortDir
    ){
        List<PostDto> postDtos=postService.getAllPostById(pageNo,pageSize,sortBy,sortDir);
        return postDtos;
    }
}