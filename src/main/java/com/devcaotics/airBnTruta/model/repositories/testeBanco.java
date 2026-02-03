package com.devcaotics.airBnTruta.model.repositories;
import java.sql.Connection;

public class testeBanco {
    public static void main(String[] args) {
        try {
            Connection conn = ConnectionManager.getCurrentConnection();
            System.out.println("✅ CONECTADO AO BANCO COM SUCESSO");
            System.out.println(conn);
        } catch (Exception e) {
            System.out.println("❌ ERRO AO CONECTAR NO BANCO");
            e.printStackTrace();
        }
    }
    
}
