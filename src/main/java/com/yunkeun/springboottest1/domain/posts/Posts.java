package com.yunkeun.springboottest1.domain.posts;

import com.yunkeun.springboottest1.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter                                                     // 클래스 내 모든 필드의 Getter 메소드를 자동 생성 (롬복의 어노테이션)
@NoArgsConstructor                                          // 기본 생성자 자동 추가, public Posts() {}와 같은 효과 (롬복의 어노테이션)
@Entity                                                     // 테이블과 명시될 클래스임을 나타냄 (JPA의 어노테이션)
public class Posts extends BaseTimeEntity {
    @Id                                                     // 해당 테이블의 PK 필드를 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // PK 생성 규칙을 나타낸다.
    private Long id;

    @Column(length = 500, nullable = false)                 // 테이블의 칼럼을 나타내며 기본값 외에 추가로 변경이 필요한 옵션이 있는 경우 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    private String author;

    @Builder                                                // 해당 클래스의 빌더 패턴 클래스 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
