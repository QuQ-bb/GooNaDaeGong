package com.gndg.home.mypage;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.gndg.home.item.ItemDTO;
import com.gndg.home.item.ItemLikeDTO;
import com.gndg.home.item.ItemReviewDTO;
import com.gndg.home.member.MemberDTO;
import com.gndg.home.member.MemberFileDTO;
import com.gndg.home.order.OrderDTO;
import com.gndg.home.orders.OrdersDTO;
import com.gndg.home.qna.QnaDTO;
import com.gndg.home.util.MypagePager;

@Service
public class MypageService {
	
	@Autowired
	private MypageDAO mypageDAO;

	//내 주문내역
	public List<OrderDTO> getMyOrder(MypagePager mypagePager)throws Exception{
	    //내 주문 글 갯수
	    Long totalCount = mypageDAO.getMyOrderCount(mypagePager);
	    
	    mypagePager.setPerBlock(1L);
	    mypagePager.getNum(totalCount);
	    mypagePager.getRowNum();
	    
	    return mypageDAO.getMyOrder(mypagePager);
	}
	
	//내 주문 상세페이지
	public OrdersDTO getMyOrderDetail(OrdersDTO ordersDTO)throws Exception{
	    return mypageDAO.getMyOrderDetail(ordersDTO);
	}
	
	//내 판매내역
	public List<ItemDTO> getMySale(ItemDTO ItemDTO)throws Exception{
	    return mypageDAO.getMySale(ItemDTO);
	}
	
	//내 (상품)좋아요 목록
	public List<ItemLikeDTO> getMyLike(MypagePager mypagePager)throws Exception{
	    //내 좋아요 글 갯수
	    Long totalCount = mypageDAO.getMyLikeCount(mypagePager);
	    
	    mypagePager.setPerPage(9L);
	    mypagePager.setPerBlock(1L);
	    mypagePager.getNum(totalCount);
	    mypagePager.getRowNum();
	    
	    return mypageDAO.getMyLike(mypagePager);
	}
	
	
	//내 문의 내역
	public List<QnaDTO> getMyQna(MypagePager mypagePager)throws Exception{
	    //내 문의 글 갯수
	    Long totalCount = mypageDAO.getMyQnaCount(mypagePager);
	    
	    mypagePager.setPerBlock(1L);
	    mypagePager.getNum(totalCount);
	    mypagePager.getRowNum();
	    return mypageDAO.getMyQna(mypagePager);
	}
    //내 문의삭제
    public int setMyQnaDelete(QnaDTO qnaDTO)throws Exception{
       return mypageDAO.setMyQnaDelete(qnaDTO);
    }
	
	//내 후기 내역
	public List<ItemReviewDTO> getMyReview(MypagePager mypagePager)throws Exception{
	    //내 후기 글 갯수
	    Long totalCount = mypageDAO.getMyReviewCount(mypagePager);
	    
	    mypagePager.setPerBlock(1L);
	    mypagePager.getNum(totalCount);
	    mypagePager.getRowNum();
	    
	    return mypageDAO.getMyReview(mypagePager);
	}
	
	//내 문의 삭제
	public int setMyReviewDelete(ItemReviewDTO itemReviewDTO)throws Exception{
	    return mypageDAO.setMyReviewDelete(itemReviewDTO);
	}
	
	//회원정보 수정
	public int setMyUpdate(MemberDTO memberDTO, MultipartFile userfile,ServletContext servletContext)throws Exception{
		int result = mypageDAO.setMyUpdate(memberDTO);
		//1.HDD에 파일을 저장
		//2.저장할 폴더의 실제경로 반환
		String realPath = servletContext.getRealPath("resources/upload/member");
		System.out.println(realPath);
		
		//3.저장할 폴더의 정보를 가지고 있는 자바 객체를 선언
		File file = new File(realPath);
		
		//4.만약 폴더가 없으면 에러가 발생하기 대문에 폴더를 생성
		if(!file.exists()) {
			file.mkdirs();
		}
		//5.중복되지 않는 파일명 생성
		String fileName = UUID.randomUUID().toString();
		fileName = fileName+"_"+userfile.getOriginalFilename();
		
		//6.HDD에 파일 저장
		file = new File(file, fileName);
		userfile.transferTo(file);
		
		//7.HDD에 저장된 파일 정보를 DB에 저장
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		memberFileDTO.setFileName(fileName);
		memberFileDTO.setUser_id(memberDTO.getUser_id());
		memberFileDTO.setOriName(userfile.getOriginalFilename());
		
		mypageDAO.setMyFileUpdate(memberFileDTO);
		
		return result;
	}
	//로그인 회원정보
	public MemberDTO getMyInfo(MemberDTO memberDTO)throws Exception{
	    return mypageDAO.getMyInfo(memberDTO);
	}
	public MemberFileDTO getMyInfoFile(MemberFileDTO memberFileDTO)throws Exception{
	    return mypageDAO.getMyInfoFile(memberFileDTO);
	}
	//회원정보 탈퇴
	public int setMyDelete(MemberDTO memberDTO)throws Exception{
	    return mypageDAO.setMyDelete(memberDTO);
	}
}
