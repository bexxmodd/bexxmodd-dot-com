package com.bexxmodd

import com.bexxmodd.model.BlogPost
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class WebServer

fun main(args: Array<String>) {
    runApplication<WebServer>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}

@RestController
class HtmlController(val service: BlogPostService) {
    @GetMapping("/about")
    fun about(model: Model): String {
        model["title"] = "Bexx"
        return "about"
    }

    @PostMapping
    fun post(@RequestBody blogPost: BlogPost) {
        service.post(blogPost)
    }
}

interface BlogPostsRepository : CrudRepository<BlogPost, String>{

    @Query("select * from blog_posts")
    fun selectBlogPosts(): List<BlogPost>
}

@Service
class BlogPostService(val db: BlogPostsRepository) {
    fun selectBlogPosts(): List<BlogPost> = db.selectBlogPosts()
    fun post(post: BlogPost) {
        db.save(post)
    }
}