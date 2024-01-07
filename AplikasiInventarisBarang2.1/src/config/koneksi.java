/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.*;



/**
 *
 * @author acer
 */
public class koneksi {
     public static void main(String[] args) {
       try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventaris", "root", "");

            if (connection != null) {
                System.out.println("Koneksi berhasil!");
                connection.close();
            } else {
                System.out.println("Koneksi gagal!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Terjadi kesalahan koneksi database!");
        }
    }
        }

/**
 *
 * @author acer
 */

      