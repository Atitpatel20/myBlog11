package com.myblog.myblog.service;

import com.myblog.myblog.payload.PostDto;

import java.util.List;

public interface PostService  {
     PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);

    List<PostDto> getAllPostById(int pageNo, int pageSize, String sortBy, String sortDir);
}
