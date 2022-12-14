package com.gndg.home.mypage;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gndg.home.item.ItemDTO;
import com.gndg.home.item.ItemLikeDTO;
import com.gndg.home.item.ItemReviewDTO;
import com.gndg.home.member.MemberDTO;
import com.gndg.home.member.MemberFileDTO;
import com.gndg.home.order.OrderDTO;
import com.gndg.home.orders.OrdersDTO;
import com.gndg.home.qna.QnaDTO;
import com.gndg.home.util.MypagePager;

@Repository
public class MypageDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.gndg.home.mypage.MypageDAO.";
	
	//내 주문내역
	public List<OrderDTO> getMyOrder(MypagePager mypagePager)throws Exception{
	    return sqlSession.selectList(NAMESPACE+"getMyOrder", mypagePager);
	}
	
	//내 주문 글 갯수
	public Long getMyOrderCount(MypagePager mypagePager)throws Exception{
	    return sqlSession.selectOne(NAMESPACE+"getMyOrderCount", mypagePager);
	}
	
	//내 주문 상세페이지
	public OrdersDTO getMyOrderDetail(OrdersDTO ordersDTO)throws Exception{
	    return sqlSession.selectOne(NAMESPACE+"getMyOrderDetail", ordersDTO);
	}
	
	//내 판매 내역
	public List<ItemDTO> getMySale(ItemDTO ItemDTO)throws Exception{
	    return sqlSession.selectList(NAMESPACE+"getMySale", ItemDTO);
	}
	
	//내 (상품)좋아요 목록
	public List<ItemLikeDTO> getMyLike(MypagePager mypagePager)throws Exception{
	    return sqlSession.selectList(NAMESPACE+"getMyLike", mypagePager);
	}
	//내 좋아요 글 갯수
	public Long getMyLikeCount(MypagePager mypagePager)throws Exception{
	    return sqlSession.selectOne(NAMESPACE+"getMyLikeCount", mypagePager);
	}
	
	//내 문의내역
	public List<QnaDTO> getMyQna(MypagePager mypagePager)throws Exception{
	    return sqlSession.selectList(NAMESPACE+"getMyQna", mypagePager);
	}
	
	//내 문의 글 갯수
	public Long getMyQnaCount(MypagePager mypagePager)throws Exception{
	    return sqlSession.selectOne(NAMESPACE+"getMyQnaCount", mypagePager);
	}
	
   //내 문의 삭제
   public int setMyQnaDelete(QnaDTO qnaDTO)throws Exception{
       return sqlSession.delete(NAMESPACE+"setMyQnaDelete", qnaDTO);
   }
	
	//내 후기 내역
	public List<ItemReviewDTO> getMyReview(MypagePager mypagePager)throws Exception{
	    return sqlSession.selectList(NAMESPACE+"getMyReview", mypagePager);
	}
	
	//내 후기 삭제
	public int setMyReviewDelete(ItemReviewDTO itemReviewDTO)throws Exception{
	    return sqlSession.delete(NAMESPACE+"setMyReviewDelete", itemReviewDTO);
	}
	
	//내 후기 글 갯수
	public Long getMyReviewCount(MypagePager mypagePager)throws Exception{
	    return sqlSession.selectOne(NAMESPACE+"getMyReviewCount", mypagePager);
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
