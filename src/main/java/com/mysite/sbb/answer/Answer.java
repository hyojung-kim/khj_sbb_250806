package com.mysite.sbb.answer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import com.mysite.sbb.question.Question;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createDate;

    @Column
    @CreationTimestamp  // insert 시 자동으로 현재 시간
    private LocalDateTime updated_at;

    @ManyToOne
    private Question question;
}
