import java.sql.*;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;

public class jdbc1 {
   static final String DB_URL = "jdbc:mysql://localhost:3600/test";
   static final String USER = "root";
   static final String PASS = "mohit13579";

   public static void main(String[] args) throws ClassNotFoundException {
      // Open a connection
      Class.forName("com.mysql.jdbc.Driver");
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}