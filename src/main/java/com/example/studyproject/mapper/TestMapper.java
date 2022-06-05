package com.example.studyproject.mapper;

import com.example.studyproject.dto.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    public List<Test> getAll();
}
