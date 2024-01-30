package com.myblog.myblog.service;

import com.myblog.myblog.payload.CommentDto;
import org.springframework.web.bind.annotation.RequestParam;

public interface CommentService {
   CommentDto createComments( CommentDto commentDto, @RequestParam long postId);

    void deleteComment(long id);

    CommentDto updateComment(long id,CommentDto commentDto);
}
