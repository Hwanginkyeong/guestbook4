package com.javaex.dao;


import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVo;

@Repository
public class GuestbookDao {
	
		
		@Autowired
		private DataSource dataSource;
		
		
		//List 
		public List<GuestbookVo> getList() {

				List<GuestbookVo> guestbookList = new ArrayList<GuestbookVo>();
			
			return guestbookList;
				
		}//List 끝 
		
		
		
		//insert
		public int insert(GuestbookVo vo) {
			
			int count = 0;
		
			return count;
		}
		//insert 끝 

		//delete
		public int delete(GuestbookVo gusetbookvo) {
			
				int count = 0;
				
				return count;
		}
		//delete 끝 
		
		//select
		public GuestbookVo select(int index) {
			
			GuestbookVo guestbookVo = new GuestbookVo();
				
				//쿼리문 만들기
				pstmt = conn.prepareStatement(query);
				
				//바인딩
				pstmt.setInt(1, index );
							
				//실행
				rs = pstmt.executeQuery();
					
			// 4.결과처리
				
				while(rs.next()) {
					int no = rs.getInt("no");
					String name = rs.getString("name");
					String password = rs.getString("password");
					String content = rs.getString("content");
					String regDate = rs.getString("reg_date");
					
					guestbookVo.setNo(no);
					guestbookVo.setName(name);
					guestbookVo.setPassword(password);
					guestbookVo.setContent(content);
					guestbookVo.setRegDate(regDate);
				}
				
			
	
					
			return guestbookVo;
		
		}//select 끝 

}
