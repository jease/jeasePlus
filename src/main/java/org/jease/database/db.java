/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jease.database;

import org.jease.database.dao.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author @ghsaseminya
 */
public class db {

    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_URL = "";
    Connection conn = null;
    Statement stmt = null;
    private String USER = "";
    private String PASS = "";

    public db(String driver,String url,String user,String pass) {
        this.JDBC_DRIVER=driver;
        this.DB_URL=url;
        this.USER=user;
        this.PASS=pass;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (Exception s) {
        }
    }

    public boolean select_user(Users u){
        try {
            String psql="select id from users where username='"+u.getEmail()+"'";
            ResultSet rs=stmt.executeQuery(psql);
            boolean registered=false;
            while(rs.next()){
                registered=true;
                u.setId(rs.getInt("id"));
                
            }
            String sql="";
            if(!registered) {
                sql = "insert into users (username,password,google_id, google_name, google_given_name, google_family_name, google_link, google_picture, google_gender,name) values (?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                preparedStatement.setString(1, u.getEmail());
                preparedStatement.executeUpdate();
                ResultSet rs2 = preparedStatement.getGeneratedKeys();
                if (rs2.next()) {
                    u.setId(1);

                } else {

                    preparedStatement.setString(8, "");
                    preparedStatement.executeUpdate();
                }
            }
            return registered;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    
    }
    public void insert_user(String u,String p,String name){
        try {
            String sql = "insert into users (name,username,password) values ('"+name+"','"+u+"','"+p+"')";
            stmt.executeUpdate(sql);
            }catch(Exception e) {
            e.printStackTrace();
            
        }
    }

}
