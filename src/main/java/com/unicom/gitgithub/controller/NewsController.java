package com.unicom.gitgithub.controller;

import com.unicom.gitgithub.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:NewsController
 * @Auther: unicom on 2019/5/31 9:04.
 * @Discription: 新闻模块
 */
@RestController
@RequestMapping("news")
public class NewsController {
    private String a = "";

    /**
     * @return
     */
    @RequestMapping("getAllNews")
    public List<News> getAllNews() {
        News news = new News("1", "1", "1111");
        News news1 = new News("2", "2", "2222");
        News news2 = new News("3", "3", "3333");
        News news3 = new News("4", "4", "4444");

        List<News> newsList = new ArrayList<>();
        newsList.add(news);
        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        return newsList;
    }
}
