package org.example;

import java.sql.*;

import lombok.experimental.SuperBuilder;

@SuperBuilder

public class SelectSyntax extends Main {

    Connection con = DriverManager.getConnection(url, user, password);
    Statement st = con.createStatement();
    String sql = "Select id, last_name from employee ";
    ResultSet rs = st.executeQuery(sql);

    while(rs.next()){
        System.out.println(rs.getString("id" + "last_name"));
    }
}
