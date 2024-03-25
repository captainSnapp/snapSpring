package com.snap.dao.pojo;

import java.util.List;

public class BookType {
    private String typeID;
    private String typeName;
    private String typeDesc;

    private List<Books> booksList;

    @Override
    public String toString() {
        return "BookType{" +
                "typeID='" + typeID + '\'' +
                ", typeName='" + typeName + '\'' +
                ", typeDesc='" + typeDesc + '\'' +
                ", booksList=" + booksList +
                '}';
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
};
