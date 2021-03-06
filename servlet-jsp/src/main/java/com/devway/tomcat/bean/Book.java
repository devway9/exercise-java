package com.devway.tomcat.bean;

/**
 * Book class
 *
 * @author devway
 * @date 2017-12-07
 */
public class Book {
    private String bookName;
    private int pageNo;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
}
