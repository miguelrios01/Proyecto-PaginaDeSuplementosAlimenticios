package com.proyecto.proyectods4.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.proyecto.proyectods4.Models.Acercade;
import com.proyecto.proyectods4.Models.Colaboradores;
import com.proyecto.proyectods4.Models.Infoextra;

public class AboutDb {
    Connection _cn;

    public AboutDb(){
        _cn = new Conexion().openDb();
    }

    public List<Acercade> ObtenerAcercade() {
        try {
            Statement stmt = _cn.createStatement();
            String query = "SELECT * FROM acerca_de";

            List<Acercade> acerca_de = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                Acercade contenido = new Acercade(
                    result.getString("titulo"),
                    result.getString("contenido")
                );

                acerca_de.add(contenido);
            }

            result.close();
            stmt.close();
            return acerca_de;

        } catch (Exception e) {
            int x = 1;
        }
        return null;
    }
    
    public List<Colaboradores> ObtenerColaboradores() {
        try {
            Statement stmt = _cn.createStatement();
            String query = "SELECT * FROM colaboradores";

            List<Colaboradores> colaboradores = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                Colaboradores contenido = new Colaboradores(
                    result. getInt ("id_col"),
                    result. getString ("contenido"),
                    result. getString ("imagen"),
                    result. getString ("colaborador")
                );

                colaboradores.add(contenido);
            }

            result.close();
            stmt.close();
            return colaboradores;

        } catch (Exception e) {
            int x = 1;
        }
        return null;
    }

    public List<Infoextra> ObtenerInfoextra() {
        try {
            Statement stmt = _cn.createStatement();
            String query = "SELECT * FROM info_extra";

            List<Infoextra> info_extra = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                Infoextra contenido = new Infoextra(
                    result.getString("titulo"),
                    result.getString("sub_titulo"),
                    result.getString("sub_titulo2")
                );

                info_extra.add(contenido);
            }

            result.close();
            stmt.close();
            return info_extra;

        } catch (Exception e) {
            int x = 1;
        }
        return null;
    }
}
