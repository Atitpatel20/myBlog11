package com.myblog.myblog.service.impl;

import com.myblog.myblog.entity.Post;
import com.myblog.myblog.exception.ResourceNotFoundException;
import com.myblog.myblog.payload.PostDto;
import com.myblog.myblog.repository.PostRepository;
import com.myblog.myblog.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Post is not found with this id: " + id)
        );
        PostDto dto = mapToDto(post);
        return dto;
    }

    @Override
    public List<PostDto> getAllPostById() {
        List<Post> posts = postRepository.findAll();
        List<PostDto> dtos = posts.stream().map(p -> mapToDto(p)).collect(Collectors.toList());
        return dtos;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post posts = mapToEntity(postDto);

        Post savePost = postRepository.save(posts);
        PostDto dto = mapToDto(savePost);
        return dto;
    }
    PostDto mapToDto (Post post){
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }
    Post mapToEntity (PostDto postDto){
        Post posts = new Post();
        posts.setId(postDto.getId());
        posts.setTitle(postDto.getTitle());
        posts.setDescription(postDto.getDescription());
        posts.setContent(postDto.getContent());
        return posts;
    }
}
