package com.bexxmodd.controller

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@Controller
class BlogController {

  @GetMapping("/")
  fun index(model: Model): String {
    model["title"] = "About"
    model["content"] =
      """
    <h1 class="page-title">About</h1>
    <div class="content-section">
      <p>
        I'm a Software Engineer at Google where I build client-side infrastructure to
        create the seamless integration of Google Assistant on various devices and also
        supercharging them with LLMs. My problem-solving powers extends to Kotlin,
        Java, C++, Rust, and Python, where I bring innovative solutions.
      </p>

      <p>
        My academic journey led me to obtain a Master's degree in Computer Science
        from the University of Pennsylvania's School of Engineering and Applied Science,
        a rewarding path that did come with the cost of losing 2760 hours of sleep.
        As an ardent advocate of Open-Source Software, I strive to contribute to impactful projects continuously.
      </p>

      <p>
        This is my personal sanctuary where I log about knowledge I've acquired and problems I've unraveled.
        Often I get philosophical and contemplate about the intricate interaction between carbon based
        and silicon based life forms. My curiosity centers around deciphering technology's
        profound impact on socio-economic development.
      </p>

      <p>
        I love everything SciFi and consider myself a Lego enthusiast. My passions harmonize with
        my career goals and are centered on the world of Software Engineering.
        I'm zealous about better understanding computers, users and our place in the universe,
        and to use this knowledge to build useful things.
      </p>
    </div>
      """.trimIndent()
    return "about"
  }

  @GetMapping("/logs")
  fun about(model: Model): String {
    return "about"
  }

}