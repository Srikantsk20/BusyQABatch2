package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hostname = "localhost";
        int port = 3306;
        String username = "root";
        String password = "root";
        String databaseName = "classicmodels"; // Change this to your database name
        
        // JDBC URL for MySQL database
        String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + databaseName ;

        // SQL query to execute
        String query1 = "Delete from payments where customerNumber = '144'"; // Change this to your table name
        String query2 = "Select * from payments where customerNumber = '141'";
        // Establishing the database connection
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the database!");
            
            // Perform database operations here
            Statement statement = connection.createStatement();
            statement.executeUpdate(query1);
            
            
           ResultSet resultSet =  statement.executeQuery(query2);
           if (!resultSet.next()) {
        	    System.out.println("ResultSet is empty");
        } else {
           //Displaying the results
            while (resultSet.next()) {
                // Assuming the table has two columns named "column1" and "column2"
                int column1Value = resultSet.getInt("customerNumber");
                System.out.println("Column1: " + column1Value);
            }
          }
            // Close the connection
           connection.close();
           System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.out.println("Connection to the database failed: " + e.getMessage());
        }
	}

}
