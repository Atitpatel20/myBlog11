package com.myblog.myblog.repository;

import com.myblog.myblog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comment,Long> {
}
