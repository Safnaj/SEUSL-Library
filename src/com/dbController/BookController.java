package com.dbController;


import com.db.DBConnection;
import com.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookController {

    public static int AddBook(Book book)throws ClassNotFoundException,SQLException {
        String SQL="INSERT INTO books VALUES(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, book.getBookId());
        stm.setObject(2, book.getName());
        stm.setObject(3, book.getAuthor());
        stm.setObject(4, book.getCategory());
        stm.setObject(5, book.getDescription());
        stm.setObject(6, book.getNoOfCopies());

        return  stm.executeUpdate();
    }

    public static int DeleteBook(Integer bookId) throws ClassNotFoundException, SQLException {

        String sql = "DELETE FROM books WHERE bookId ='"+bookId+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);

        return  stm.executeUpdate();
    }

    public static Book searchBook(Integer bookId) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM books WHERE bookId = ? ";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, bookId);
        ResultSet rst=stm.executeQuery();
        if(rst.next()){
            Book book = new Book(rst.getInt(1),rst.getString(2),rst.getString(3), rst.getString(4), rst.getString(5), rst.getInt(6));
            return book;
        }
        return null;
    }

}
