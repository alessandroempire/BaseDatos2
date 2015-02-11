import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;


public class Main {
	
	public static void main(String[] args) throws Exception
	{
		//Accessing driver from the JAR file
		Class.forName("com.mysql.jdbc.Driver");
		
		//Creating a variable for the connection called "con"
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fabi", "root", "gotita");
		//fabi es el  nombre de la base de datos
		//root es el user y gotita el password
		
		//Realizo la consulta sobre una tabla llamada authors existente en la db fabi
		PreparedStatement statement = con.prepareStatement("select * from authors");
		ResultSet result = statement.executeQuery();
		
		while (result.next())
		{
			//Imprimo el resultado de las columnas de la tabla que estoy consultando
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3));
		}
		
	}

}
