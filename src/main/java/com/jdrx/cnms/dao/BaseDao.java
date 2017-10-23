package com.jdrx.cnms.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
    int insert(T var1);

    int insertList(List<T> var1);

    int update(T var1);

    int updateList(List<T> var1);

    T getById(Long var1);

    int deleteById(Long var1);

    List<T> listBy(Map<String, Object> var1);

    List<T> listAll();

    T getBy(Map<String, Object> var1);
}
