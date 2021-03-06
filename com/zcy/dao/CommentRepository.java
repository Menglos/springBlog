package com.zcy.dao;

import com.zcy.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author: 张诚耀
 * @create: 2021-03-07
 */

public interface CommentRepository extends JpaRepository<Comment,Long>,JpaSpecificationExecutor<Comment>{

    List<Comment> findByBlogIdAndParentCommentNull(Long id, Sort sort);

    Comment getCommentById(Long id);

    @Query("select count(id) from Comment ")
    Integer getCommentTotal();

//    Integer countByIdAndBlog_Id(Long id,Long blogId);
}
