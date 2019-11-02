
package sql;

import java.sql.DriverManager;

public class DBconn {
    public static final String driver = "com.mysql.cj.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/bdaula";
    public static final String user = "root";
    public static final String psswd = "u2kW.#dp";
    
    public static java.sql.Connection conectar(){
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, psswd);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Falha de conexão");
            return null;
        }
    }
    
    public static void fecharConexao(java.sql.Connection con) {
        if (con != null) {
            try {
                con.close();
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
