/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panaderia;
import java.sql.Connection;
import java.sql.DriverManager;

public class Panaderia {
    Connection cn;
    public Connection conectar(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    cn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/panadería", "root","");
    } catch (Exception e){
    System.out.println("Error de conexion"+e);
    }
        return cn;
}
}
