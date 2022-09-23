package com.gndg.home.notice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gndg.home.AbstractTest;
import com.gndg.home.qna.QnaDAO;
import com.gndg.home.qna.QnaDTO;

public class NoticeTest extends AbstractTest{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//겟리스트 1단계는 성공. 2단계:서치 3단계:페이징
	@Test
	public void getList()throws Exception{
		List<NoticeDTO> ar = noticeDAO.getList();
		assertEquals(1, ar.size());
		//assertNotNull(ar);
	}


}