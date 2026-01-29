package org.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private final String url;
    private final String user ;
    private final String password ;


    public DBConnection( String url, String user, String password) {
        this.url = "jdbc:postgresql://localhost:5432/product_management_db";
        this.user = "product_manager_user";
        this.password = "123456";
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public Connection getConnection() {
        try(Connection conn = DriverManager.getConnection(url, user, password)){
            System.out.println("Connected to the database") ;
        } catch (SQLException e){
            throw new RuntimeException("Connection error", e);
        };
        return null;
    }
        public void attemptCloseConnection(){
        try{
            if(connection != null && !connection.isClosed()){
                connection.close();
        } catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
    }



}
