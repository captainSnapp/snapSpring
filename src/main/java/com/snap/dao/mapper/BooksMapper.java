package com.snap.dao.mapper;

import com.snap.dao.pojo.Books;

import java.util.List;

public interface BooksMapper {
    List<Books> select(Books books);

    void update(Books books);

    void delete(int id);
}
