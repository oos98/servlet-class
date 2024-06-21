package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDTO {	
	private int memberId;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public int insertMember(MemberDTO memberDTO) {
		
		return 0;
	}
}
