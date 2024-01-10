package com.myblog.myblog.service.impl;

import com.myblog.myblog.entity.Post;
import com.myblog.myblog.payload.PostDto;
import com.myblog.myblog.repository.PostRepository;
import com.myblog.myblog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post posts= new Post();
        posts.setTitle(postDto.getTitle());
        posts.setDescription(postDto.getDescription());
        posts.setContent(postDto.getContent());
        Post savePost = postRepository.save(posts);

        PostDto dto= new PostDto();
        dto.setTitle(savePost.getTitle());
        dto.setDescription(savePost.getDescription());
        dto.setContent(savePost.getContent());

        return dto;
    }
}
