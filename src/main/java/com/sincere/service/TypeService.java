package com.sincere.service;

import com.sincere.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {

    Page listType(Pageable pageable);

    Type getType(Long id);

    Type updateType(String name, String id);

    Type addType(String name);

    void deleteType(Long id);

}
