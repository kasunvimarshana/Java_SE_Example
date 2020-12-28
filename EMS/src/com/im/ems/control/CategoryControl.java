/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.ems.control;

import com.im.ems.model.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author KASUN
 */
public class CategoryControl {

    public static void save(Category category) {
        try {
            //1. Create sql Statement
            String sql = "INSERT into category (name) VALUES(?)";

            //2. Database Connection
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/dbexpense";
            String un = "root";
            String pw = "root";
            Connection connection = DriverManager.getConnection(url, un, pw);

            //3. Prepare Statement , Fill , Execute
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            //Fill
            preparedStatement.setString(1, category.getName());

            //Execute
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error\n" + e.getMessage());
        }
    }

    public static void update(Category category) {

    }

    public static void delete(int id) {

    }

    public static List<Category> list() {

        List<Category> list = new ArrayList<Category>();
        
        try {
            //1. Create sql Statement
            String sql = "SELECT * FROM category";

            //2. Database Connection
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/dbexpense";
            String un = "root";
            String pw = "root";
            Connection connection = DriverManager.getConnection(url, un, pw);

            //3. Get Result Create Objects and Add them to list
            ResultSet resultSet = connection.createStatement().executeQuery(sql);
            while(resultSet.next()){
                Category category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                list.add(category);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error\n" + e.getMessage());
        }

        return list;
    }

    public static Category get() {
        return null;
    }

}
