package dbHelper;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHelper{


	static final String createAddressTbl = "" +
			"CREATE TABLE addresstable " +
			"( ID integer  primary key," +
			"NAME varchar(20) not null, " +
			"FURIGANA varchar(40) not null, " +
			"KUBUN varchar(20) not null," +
			"PCMAIL varchar(100), " +
			"PHONEMAIL varchar(100), " +
			"TEL varchar(13), " +
			"MEMO varchar(255) " +
			")";
	public DbHelper(){
		File file = new File("labomailer.db");
		if (!file.exists()){
			execSql(createAddressTbl);
		}
	}
	public void execSql(String sql){
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:labomailer.db");
			Statement stmt = conn.createStatement();

			stmt.execute(sql);
			conn.close();
			System.out.println("sql run accepted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}




}
