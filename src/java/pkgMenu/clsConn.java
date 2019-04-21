/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author garzo
 */
public class clsConn {

    Connection conector;

    public clsConn() {

    }

    public clsConn(Connection conector) {
        this.conector = conector;
    }

    public void Conectar() {
        String CadenaConexion = "jdbc:postgresql://localhost:5432/seguridad";
        String Usuario = "postgres";
        String Pass = "postgres";
        try {
            Class.forName("org.postgresql.Driver");
            this.conector = DriverManager.getConnection(CadenaConexion, Usuario, Pass);
            System.out.println("conectado.....");
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }
    
    public Connection getConexion(){
    return this.conector;
    }

}
