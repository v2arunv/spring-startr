package com.varun.startr.endpoints;

import com.varun.startr.models.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class ArticleEndpoint {

    private static final String response = "";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/article")
    @ResponseBody
    public Article getArticle(
            @RequestParam(name="url", required = true, defaultValue = "5_Whys") String url
    ) {
        long id = counter.incrementAndGet();
        return new Article(id, url, "Initial Content");
    }
}
