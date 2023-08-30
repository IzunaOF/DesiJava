package Util;

import Controllers.Start;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClient {

    private static Connection conexao;

    public static Connection getConnection() {
        if (conexao == null) {
            try {
                String url = Start.dotenv.get("DB_URL") ;
                String user = Start.dotenv.get("DB_USER") ;
                String password = Start.dotenv.get("DB_PASSWORD") ;

                conexao = DriverManager.getConnection(url, user, password);
                
                System.out.println("Conectado ao banco");
            } catch (SQLException e) {
                
                e.printStackTrace();
                System.out.println("Erro");
            }

        }
        return conexao;
    }
}
