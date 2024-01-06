package com.bexxmodd.datasource.impl

import com.bexxmodd.datasource.BlogPostDataSource
import com.bexxmodd.model.BlogPost
import java.time.LocalDateTime
import org.springframework.stereotype.Repository

@Repository
class BlogPostDataSourceImpl : BlogPostDataSource {

    override fun getBlogPosts(): Collection<BlogPost> {
        return listOf(BlogPost("1", LocalDateTime.now(), "Title", "text as test"))
    }
}