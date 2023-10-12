package kr.ac.mjc.blog.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Article {

    @Id
    @Column(name = "id",updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="title",nullable = false)
    private String title;
    @Column(name = "content",nullable = false)
    private String content;

    public Article(String title,String content){
        this.title=title;
        this.content=content;
    }

    public void update(String title,String content){
        this.title=title;
        this.content=content;
    }
}
