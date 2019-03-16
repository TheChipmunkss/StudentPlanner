package SP;
import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane; 

public class studentPlannerDB {
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/planner";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "Student2019";
	   
	// ----------------------------------------------------------------------------------------------------------------------

	   public static Vector <String> getTasks(String strCategoryCode) {
	   	Connection conn = null;
	   	Statement stmt = null;

	    	try{
	      		//STEP 2: Register JDBC driver
	      		Class.forName("com.mysql.jdbc.Driver");

	      		//STEP 3: Open a connection
	      		conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      		//STEP 4: Execute a query
	      		stmt = conn.createStatement();
	      		String sql;
	      		// sql = " SELECT concat(description, ' (', due_date, ')') listColumn FROM tasks where complete_flag='N' ";
	      		sql = " SELECT concat(due_date, ': ', description) listColumn FROM tasks where complete_flag='N' " +
	      					"and category_code='" + strCategoryCode + "' " +
	      				    "order by due_date";
	      		ResultSet rs = stmt.executeQuery(sql);

				// now initiate return variable
				Vector <String> vecListToReturn = new Vector <String>();
	
		      		//STEP 5: Extract data from result set
	
				while ( rs.next() ) {
					vecListToReturn.add( rs.getString("listColumn")  );
				}

	      		//STEP 6: Clean-up environment
	      		rs.close();
	      		stmt.close();
	      		conn.close();

	    		return vecListToReturn;

	    	} catch(SQLException se) {
	      		//Handle errors for JDBC
	      		se.printStackTrace();
	    	} catch(Exception e) {
	      		//Handle errors for Class
	      		e.printStackTrace();
	    	} //end try

		return null;
	   } //end getTasks()
	   
	   // ----------------------------------------------------------------------------------------------------------------------

	   public static void insertTask(String strCategoryCode, String strDescription, String strDueDate) {
		   	Connection conn = null;
		   	Statement stmt = null;

		    	try{
		      		//STEP 2: Register JDBC driver
		      		Class.forName("com.mysql.jdbc.Driver");

		      		//STEP 3: Open a connection
		      		conn = DriverManager.getConnection(DB_URL,USER,PASS);

		      		//STEP 4: Execute a query
		      		stmt = conn.createStatement();
		      		String sql;
		      		sql = "insert into tasks(category_code,description,due_date,complete_flag)  "
		      				+ "values('" + strCategoryCode + "', '" + strDescription + "', '" 
		      							 + strDueDate + "', 'N')";
		      		
		      		//JOptionPane.showMessageDialog(null, sql);
		      			      		
		      		stmt.executeUpdate(sql);
		      		
		      		conn.commit(); // commit changes to database (otherwise will be rolled back)

		      		//STEP 5: Clean-up environment
		      		stmt.close();
		      		conn.close();

		    	} catch(SQLException se) {
		      		//Handle errors for JDBC
		      		se.printStackTrace();
		    	} catch(Exception e) {
		      		//Handle errors for Class
		      		e.printStackTrace();
		    	} //end try
		}
	   
	   // ----------------------------------------------------------------------------------------------------------------------
	   
	   public static Vector <String> getmessage_otd() {
	   	Connection conn = null;
	   	Statement stmt = null;

	    	try{
	      		//STEP 2: Register JDBC driver
	      		Class.forName("com.mysql.jdbc.Driver");

	      		//STEP 3: Open a connection
	      		conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      		//STEP 4: Execute a query
	      		stmt = conn.createStatement();
	      		String sql2;
	      		// need column name returned to be called listColumn so use alias
	      		sql2 = " SELECT description listColumn from message_otd order by rand() limit 1 ";
	      		ResultSet rs2 = stmt.executeQuery(sql2);

				// now initiate return variable
				Vector <String> vecListToReturn2 = new Vector <String>();
	
		      		//STEP 5: Extract data from result set
	
				while ( rs2.next() ) {
					vecListToReturn2.add( rs2.getString("listColumn")  );
				}

	      		//STEP 6: Clean-up environment
	      		rs2.close();
	      		stmt.close();
	      		conn.close();

	    		return vecListToReturn2;

	    	} catch(SQLException se) {
	      		//Handle errors for JDBC
	      		se.printStackTrace();
	    	} catch(Exception e) {
	      		//Handle errors for Class
	      		e.printStackTrace();
	    	} //end try

		return null;
	   } 
	
	   // ----------------------------------------------------------------------------------------------------------------------
	   
}
