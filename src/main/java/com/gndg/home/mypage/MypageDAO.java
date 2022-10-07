package com.gndg.home.mypage;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gndg.home.gnItem.GnItemDTO;
import com.gndg.home.member.MemberDTO;
import com.gndg.home.member.MemberFileDTO;
import com.gndg.home.order.OrderDTO;
import com.gndg.home.qna.QnaDTO;

@Repository
public class MypageDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.gndg.home.mypage.MypageDAO.";
	
	//내 주문내역
	public List<OrderDTO> getMyOrder(OrderDTO orderDTO)throws Exception{
	    return sqlSession.selectList(NAMESPACE+"getMyOrder", orderDTO);
	}
	
	//내 주문 상세페이지
	public OrderDTO getMyOrderDetail(OrderDTO orderDTO)throws Exception{
	    return sqlSession.selectOne(NAMESPACE+"getMyOrderDetail", orderDTO);
	}
	
	//내 판매 내역
	public List<GnItemDTO> getMySale(GnItemDTO gnItemDTO)throws Exception{
	    return sqlSession.selectList(NAMESPACE+"getMySale", gnItemDTO);
	}
	
	//내 문의내역
	public List<QnaDTO> getMyQna(QnaDTO qnaDTO)throws Exception{
	    return sqlSession.selectList(NAMESPACE+"getMyQna", qnaDTO);
	}

	//회원정보 수정
	public int setMyUpdate(MemberDTO memberDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setMyUpdate", memberDTO);
	}
	//회원프로필 수정
	public int setMyFileUpdate(MemberFileDTO memberFileDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setMyFileUpdate", memberFileDTO);
	}
	//로그인 회원정보
	public MemberDTO getMyInfo(MemberDTO memberDTO)throws Exception{
	    return sqlSession.selectOne(NAMESPACE+"getMyInfo", memberDTO);
	}
	//로그인 회원프로필
	public MemberFileDTO getMyInfoFile(MemberFileDTO memberFileDTO)throws Exception{
	    return sqlSession.selectOne(NAMESPACE+"getMyInfoFile", memberFileDTO);
	}
	//탈퇴
	public int setMyDelete(MemberDTO memberDTO)throws Exception{
	    return sqlSession.update(NAMESPACE+"setMyDelete", memberDTO);
	}
}
