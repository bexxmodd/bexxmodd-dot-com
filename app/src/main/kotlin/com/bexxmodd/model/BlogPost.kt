package com.bexxmodd.model

import java.time.LocalDateTime
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.format.annotation.DateTimeFormat


@Table("BLOG_POSTS")
data class BlogPost(
    @Id val id: String?,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) val date: LocalDateTime,
    val title: String,
    val text: String)