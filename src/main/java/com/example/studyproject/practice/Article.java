package com.example.studyproject.practice;

import java.io.Serializable;

// 직렬화(Serializable) 예제
public class Article implements Serializable {
    private transient Integer id;   // 직렬화 대상에서 제외한다.
    private String title;
    private String pressName;
    private String reporterName;

    public Article(Integer id, String title, String pressName, String reporterName) {
        this.id = id;
        this.title = title;
        this.pressName = pressName;
        this.reporterName = reporterName;
    }

    // 멤버 필드 확인 용도로 재정의한다.
    @Override
    public String toString() {
        return String.format("id = %s, title = %s, pressName = %s, reporterName = %s", id, title, pressName, reporterName);
    }

}
