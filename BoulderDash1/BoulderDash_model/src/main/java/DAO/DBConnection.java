package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The Class DBConnection.
 *
 * @author Jean-Aymeric Diet
 */

final class DBConnection {

	/** The connection. */
	private Connection					connection;
	
	/** The url. */
	private String							url = "jdbc:mysql://localhost/projetumljava?useSSL=false";

	/** The login. */
	private String							login = "root";

	/** The password. */
	private String							password = "";
	
	/** The password. */
	private Statement							statement;
	
	
	
	/**
	 * Instantiates a new DB connection.
	 */
	
	
	public DBConnection() {
     	this.open();
     }


	/**
	 * Open.
	 *
	 * @return the boolean
	 */
	
	 public boolean open() {
	        try {
	        	try {
	    			Class.forName("com.mysql.jdbc.Driver");
	    		} catch (ClassNotFoundException e) {
	    			e.printStackTrace();
	    		}
	            this.connection = DriverManager.getConnection(url,login,password);
	            this.statement = this.connection.createStatement();
	            return true;  
	        } catch (final SQLException exception) {
	            exception.printStackTrace();
	            return false;
	        }      
	    }

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	public Connection getConnection() {
		return this.connection;
	}

/**
 * Prepare call.
 *
 * @param query
 *            the query
 * @return the java.sql. callable statement
 */

public ResultSet executeQuery(final String query) {
    try {
        return this.getStatement().executeQuery(query);
    } catch (final SQLException e) {
        e.printStackTrace();
    }
    return null;
}


/**
 * Execute update.
 *
 * @param query
 *            the query
 * @return the int
 */
public int executeUpdate(final String query) {
    try {
        return this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
    } catch (final SQLException e) {
        e.printStackTrace();
    }
    return 0;
}

/**
 * Gets the statement.
 *
 * @return the statement
 */
public Statement getStatement() {
    return this.statement;
}

/**
 * Sets the statement.
 *
 * @param statement
 *            the new statement
 */
public void setStatement(final Statement statement) {
    this.statement = statement;
}
}