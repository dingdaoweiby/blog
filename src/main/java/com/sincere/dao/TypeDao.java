package com.sincere.dao;

import com.sincere.model.Type;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface TypeDao {
    Type getTypeById(Long id);
    Type updateTypeByNameAndId(String name, String id);
    Type insertTypeByName(String name);
    void deleteTypeById(Long id);
}
