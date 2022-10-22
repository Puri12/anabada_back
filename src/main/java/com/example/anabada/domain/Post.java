package com.example.anabada.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Post extends Timestamped{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Long price;

    @Column(nullable = false)
    private String imageUrl;

    //조회 수
    @Column(nullable = false)
    private int count;

    @OneToMany(mappedBy = "post",
                cascade = CascadeType.ALL,
                orphanRemoval = true)
    private final List<Comment> comments = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="member_ID", nullable = false)
    private Member member;

}
