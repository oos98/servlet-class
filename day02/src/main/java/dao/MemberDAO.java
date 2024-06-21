package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public void inserMember() {
		String sql = """
	            INSERT INTO TBL_MEMBER(MEMBER_ID, LOGIN_ID, PASSWORD, GENDER)
	            VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)
	            """;
		
//		try(
//				Connection conn = DBConnecter.getConnection();
//				PreparedStatement ps = conn.prepareStatement();
//				){
//			
//			ps.setString(1, loginId);
//			ps.setString(2, password);
//			ps.setString(3, gender);
//			
//			ps.executeUpdate();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}
