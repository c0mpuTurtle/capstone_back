package com.example.emotionbot.db.member.entity;

import com.example.emotionbot.enums.ChatMode;
import com.example.emotionbot.enums.KeyboardYn;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(20)", nullable = false)
    private Long id;

    @Column(name = "login_id", columnDefinition = "varchar(100)", nullable = false)
    private String loginId;

    @Column(name = "password", columnDefinition = "varchar(100)", nullable = false)
    private String password;

    @Column(name = "nickname", columnDefinition = "varchar(100)", nullable = false)
    private String nickname;

    @Column(name = "clover", columnDefinition = "bigint(100)", nullable = false)
    private int clover;

    @Column(name = "keyboard_mode", columnDefinition = "varchar(5)", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private KeyboardYn keyboardYn;

    @Column(name = "chat_mode", columnDefinition = "varchar(5)", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private ChatMode chatMode;

    @Builder
    public Member(Long id, String loginId, String password, String nickname, int clover, KeyboardYn keyboardYn, ChatMode chatMode) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.nickname = nickname;
        this.clover = clover;
        this.keyboardYn = keyboardYn;
        this.chatMode = chatMode;
    }
}

