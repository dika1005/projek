package kelompok6.projek;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class koneksii {
    Connection con;
    
    public koneksii(){
        String Id = "toko";
        String Pass = "123";
        String Driver = "com.mysql.cj.jdbc.Driver";
        String Url = "jdbc:mysql://217.15.165.147:3306/db_toko";
        
        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(Url, Id, Pass);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
        }
    }
    public static void main(String[]args){
        koneksii k = new koneksii();
    }
}