package com.sincere.service;

import com.sincere.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl implements TypeService {
    @Override
    public Page listType(Pageable pageable) {
        return null;
    }

    @Override
    public Type getType(Long id) {
        return null;
    }

    @Override
    public Type updateType(String name, String id) {
        return null;
    }

    @Override
    public Type addType(String name) {
        return null;
    }

    @Override
    public void deleteType(Long id) {

    }
}
