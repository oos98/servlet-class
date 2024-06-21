package com.korea.comic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/test-server")
public class Test extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Test doGet 실행!!");	
		
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.append("<h1>Test server</h1>");
		out.append("<span>안녕하세요 테스트 서버입니다!</span>");
		out.append("<br>");
		out.append("<br>");
		out.append("<form action='/ex01/result' method='get'>"); // /result로 데이터를 보냄, get으로 실행 
		out.append("이름 : <input type='text' name=userName>");
		out.append("<br>");
		out.append("나이 : <input type='text' name=userAge>");
		out.append("<br>");
		out.append("<button type='submit'>전송</button>");
		out.append("</form>");
		
	}

}
