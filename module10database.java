//Written by Adara Blichfeldt

import java.sql.*;

public class module10database {

	public static void createNewDatabase(String fileName) {
		String url = "jdbc:sqlite:E:/Users/Adara/javadatabase_programs/sqlite/db/" + fileName;
		
		try(Connection conn = DriverManager.getConnection(url)){
			if(conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database has been created.");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void connect() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:E:/Users/Adara/javadatabase_programs/sqlite/db/wordOccurences.db";
			conn = DriverManager.getConnection(url);
			
			System.out.println("Connection has been established.");
			
			//creating new table
			
			//This code is used I just commented it out to be safe and not insert redundant data.
			
//			String sql = "CREATE TABLE IF NOT EXISTS words (\n"
//					+ " id int PRIMARY KEY,\n"
//					+ "word TEXT NOT NULL)";
//					Statement stat = conn.createStatement();
//					stat.execute(sql);
			
			//inserting words
			//I ran this code several times to insert all the words.
//			String sqlInsert = "INSERT INTO words(id, word) VALUES(?,?)";
//			 PreparedStatement pstat = conn.prepareStatement(sqlInsert);
//			 pstat.setInt(1, 4);
//			 pstat.setString(2, "a");
//			 pstat.executeUpdate();
			
			//selecting all
//			String getInfo = "SELECT * FROM words;";
//			Statement stat2 = conn.createStatement();
//			ResultSet rs = stat2.executeQuery(getInfo);
			
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(conn != null) {
					conn.close();
					System.out.println("Connection 1 closed.");
				}
			} catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	//method to select all words
	public static void selectAllWords() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:E:/Users/Adara/javadatabase_programs/sqlite/db/wordOccurences.db";
			conn = DriverManager.getConnection(url);
			
		String getInfo = "SELECT * FROM words;";
		Statement stat2 = conn.createStatement();
		ResultSet rs = stat2.executeQuery(getInfo);
		
		while(rs.next()) {
	         int id = rs.getInt("id");
	         String  word = rs.getString("word");
	         
	         System.out.println( "ID = " + id );
	         System.out.println( "word = " + word );
	      }
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	} finally {
		try {
			if(conn != null) {
				conn.close();
				System.out.println("Connection 2 closed.");
			}
		} catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
	
	public static void main(String[] args) {
		/*commented out to not make a new database every time I run the code.
		 * Even if there are the IF NOT EXISTS keywords I wanted to be safe.
		 */
		//createNewDatabase("wordOccurences.db");
		System.out.println("____________________________________");
		connect();
		
		selectAllWords();
		}
	
}
