package com.snap.dao.mapper;

import com.snap.dao.pojo.BookType;
import com.snap.dao.pojo.Books;

import java.util.List;

public interface BooksTypeMapper {
    List<BookType> selectAll(BookType bookType);

    //    按书类别查询时用此方法
    List<BookType> selectOrder();

    void update(BookType bookType);

    void delete(int id);
}
