package com.snap.dao.pojo;

public class Books {

     private String bookID;
     private String bookTypeID;
     private String bookName;
     private String bookPrice;
     private String bookNumber;
     private String bookDesc;
     private BookType bookType;

     public BookType getBookType() {
          return bookType;
     }

     public void setBookType(BookType bookType) {
          this.bookType = bookType;
     }

     @Override
     public String toString() {
          return "Books{" +
                  "bookID='" + bookID + '\'' +
                  ", bookTypeID='" + bookTypeID + '\'' +
                  ", bookName='" + bookName + '\'' +
                  ", bookPrice='" + bookPrice + '\'' +
                  ", bookNumber='" + bookNumber + '\'' +
                  ", bookDesc='" + bookDesc + '\'' +
                  ", bookType=" + bookType +
                  '}';
     }

     public String getBookID() {
          return bookID;
     }

     public void setBookID(String bookID) {
          this.bookID = bookID;
     }

     public String getBookTypeID() {
          return bookTypeID;
     }

     public void setBookTypeID(String bookTypeID) {
          this.bookTypeID = bookTypeID;
     }

     public String getBookName() {
          return bookName;
     }

     public void setBookName(String bookName) {
          this.bookName = bookName;
     }

     public String getBookPrice() {
          return bookPrice;
     }

     public void setBookPrice(String bookPrice) {
          this.bookPrice = bookPrice;
     }

     public String getBookNumber() {
          return bookNumber;
     }

     public void setBookNumber(String bookNumber) {
          this.bookNumber = bookNumber;
     }

     public String getBookDesc() {
          return bookDesc;
     }

     public void setBookDesc(String bookDesc) {
          this.bookDesc = bookDesc;
     }
}
