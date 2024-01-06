package com.bexxmodd.datasource

import com.bexxmodd.model.BlogPost

interface BlogPostDataSource {

    fun getBlogPosts(): Collection<BlogPost>
}