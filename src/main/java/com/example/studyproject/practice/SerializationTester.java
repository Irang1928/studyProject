package com.example.studyproject.practice;

import java.io.*;


// 직렬화, 역직렬화 테스트 코드
public class SerializationTester {
    public byte[] serialize() {
        Article article = new Article(1, "직렬화 테스트", "김탱일보", "감탱");

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (bos; ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(article);
        } catch (Exception e) {
            // ... 구현 생략
        }
        return bos.toByteArray();
    }

    public Article deserialize(byte[] serializedData) {
        ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
        try (bis; ObjectInputStream ois = new ObjectInputStream(bis)) {
            Object object = ois.readObject();
            return (Article)object;
        } catch (Exception e) {
            // ... 구현 생략
        }
        return null;
    }

    public static void main(String[] args) {
        SerializationTester serializationTester = new SerializationTester();
        byte[] serializedData = serializationTester.serialize();
        Article article = serializationTester.deserialize(serializedData);
        System.out.println(article);    // 결과 출력
    }
}
