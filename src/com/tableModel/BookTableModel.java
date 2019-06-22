package com.tableModel;


public class BookTableModel {

    private int bookId;
    private String name;
    private String author;
    private String category;
    private String description;
    private int noOfCopies;

    public BookTableModel(int bookId, String name, String author, String category, String description, int noOfCopies) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.category = category;
        this.description = description;
        this.noOfCopies = noOfCopies;
    }

    public BookTableModel() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }
}
