<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<link rel="stylesheet" href="/resources/css/notice/list.css">
</head>
<!-- <style>
    .form-control {
    
    appearance: auto;
    padding: 0px;
    
}

</style> -->
<body>
<div class="wrap">
    <!-- 헤더 임포트 -->
    <c:import url="../template/header.jsp"></c:import>


<!-- 본문 전체박스 -->
<div class="css-2b29tl eug5r8l5">

    <!-- 레이아웃 박스 -->
    <div class="css-luwwab eug5r8l4">

        <!-- sidebar -->
        <div class="css-833hqy ecbxmj4" id="sidebar">

            <div class="css-1v4whg ecbxmj3">
                고객센터
            </div>
            <ul class="css-1x9bshx ecbxmj2">
                <li class="css-0 ecbxmj1"><a href="../notice/list" class="active css-nk8664 ecbxmj0">공지사항<span class="css-e41glx e1x0rfoo0"></span></a></li>
                <li class="css-0 ecbxmj1"><a href="../faq/list" class=" css-nk8664 ecbxmj0">자주하는 질문<span class="css-e41glx e1x0rfoo0"></span></a></li>
                <li class="css-0 ecbxmj1"><a href="../qna/inquiry" class=" css-nk8664 ecbxmj0">1:1 문의<span class="css-e41glx e1x0rfoo0"></span></a></li>
            </ul>
            
        </div>
        <!-- sidebar 끝 -->
        
        <!-- 공지사항 본문 -->
        <div class="css-171zbec eug5r8l3">

            <!-- 공지사항 본문의 제목 -->
            <div class="css-1yc2nwy eug5r8l2">
                <h3 class="css-1ew6v8c eug5r8l1">공지사항</h3>
                
            </div>
            
            <!-- 공지사항 본문의 찐본문 -->
            <table class="css-r5t16v e1ehwelz4">
                <thead class="css-0 e1ehwelz3">
                    <tr class="css-etygac e1ehwelz0" style="border-bottom: 1px solid #ACACD5;
                    border-top: 1px solid #ACACD5;">
                        <th width="50" class="css-hyew2s e1ehwelz2">번호</th>
                        <th class="css-1k9dp5l e1ehwelz2">제목</th>
                        
                        <th width="100" class="css-135p6jy e1ehwelz2">등록일</th>
                    </tr>
                </thead>
                <tbody class="css-bjn8wh e1ehwelz1">
                    <!--  -->
                    
                    <c:forEach items="${list}" var="nl">
                        <!-- <a style="color: black;" href="./detail?nt_num=${nl.nt_num}"> -->
                            <tr class="css-x2m5rx e15yrn082" onclick="location.href='./detail?nt_num=${nl.nt_num}'">
                                <td class=" css-1k4d546 e15yrn081">${nl.nt_num}</td>
                                <td class=" css-s1v1rc e15yrn081">${nl.nt_title}
                                </td>
                                
                                <td class=" css-vzhbq5 e15yrn081">${nl.nt_date}</td>
				            </tr>
                        <!-- </a> -->
				    </c:forEach>
                    

                    


                </tbody>
            </table>

            <!-- 페이지 -->
            <div class="pagediv mt-3" style="display: flex; justify-content: center; ">
                <nav aria-label="Page navigation example">
                    <ul class="pagination paginate_sm">

                        <c:if test="${pager.pre}">
                            <li class="page-item"><a class="page-link" href="./list?page=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}">pre</a></li>
                        </c:if>
                        <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
                            <li class="page-item"><a class="page-link" href="./list?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
                        </c:forEach>
                        <li class="page-item ${pager.next?'':'disabled'}"><a class="page-link" href="./list?page=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}">next</a></li>
                    </ul>
                </nav>
            </div>

            <!-- 내용 Search -->
            <div class="" style="justify-content: center;
            display: flex;">
            <form action="./list" method="get" class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
        
                <div class="input-group">
                    <div class="search-category" id="search-category" style="margin-right: 5px;">
                        <!-- 클래스에서 custom-select-sm form-control-sm 뺌 -->
                        <select name="kind" class="custom-select form-control" style="appearance: auto; padding: d; height: 37px;">
                            <option class="kinds" value="nt_title">제목</option>
                            <option class="kinds" value="nt_contents">내용</option>
                            <option class="kinds" value="user_id">작성자</option>
                        </select>
                    </div>
                    <input name="search" value="${param.search}" id="search" type="text" class="form-control bg-light border-0 small w-10" placeholder="Search"
                        aria-label="Search" aria-describedby="basic-addon2" style="border-radius: 8px;">
                    <div class="input-group-append">
                        <button class="btn btn-primary" type="submit">
                            <i class="fas fa-search fa-sm"></i>
                        </button>
                    </div>
                </div>
            </form>
            </div>

            <!-- <div class="css-1kbzkwh efhuu1x1">
                <div class="css-sxxs1g eytury60">
                    <button disabled="" type="button" class="css-rzcdhr e1hbwyso0">
                        <div class="css-7qb0sc e1ilyb3p0">이전</div>
                    </button>
                    <button type="button" class="css-1jwilit e1pk9060">
                        <div class="css-7qb0sc e1ilyb3p0">다음</div>
                    </button>
                </div>
            </div> -->

            
            <!-- 기존 등록하기 버튼 혹시몰라서남겨두기 -->
            <!-- <div class="css-15jhycr e3tf63e0" style="position: relative;
            min-height: 44px;
            margin-top: 20px;
            text-align: center;">
                <a href="./add">
                <button class="css-1g9mj7 e4nu7ef3" type="button" width="120" height="42" radius="0" style="position: absolute;
                bottom: 0px; right: 0px; display: block; padding: 0px 10px; text-align: center;
                overflow: hidden; width: 120px; height: 42px; border-radius: 0px; color: rgb(255, 255, 255);
                background-color: #6667AB; border: 0px none;">
                    <span class="css-ymwvow e4nu7ef1">공지 등록</span>
                </button>
                </a>
            </div> -->

            <c:if test="${sessionScope.member.user_grade eq 2}">
                <!-- 관리자 전용 메뉴. 인터셉터 추가하기 -->
                <div class="mb-3" style="display: flex; justify-content: right; margin-top: 30px;">
                    <a href="./hidden">
                    <button class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"
                    style ="width: 120px;
                    height: 42px; 
                    background-color: cornflowerblue; border-color: cornflowerblue;">
                        <i class="fas fa-download fa-sm text-white-50"></i> 
                        
                            숨긴글 조회
                    </button>        
                    </a>

                    <a href="./add">
                    <button class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm ml-1"
                    style ="width: 120px;
                    height: 42px; background-color: #6667AB; border: 0px none; margin-left: 10px;">
                        <i class="fas fa-wrench fa-sm text-white-50"></i> 
                        
                            공지 등록
                    </button>   
                    </a>
                </div>
                <!-- 관리자 전용 메뉴. 인터셉터 추가하기 -->
            </c:if>


        </div>
        <!-- 공지사항 본문 끝 -->



    </div>
    <!-- 레이아웃 박스 끝 -->
    
    
</div>
<!-- 본문 전체 끝 -->




<!-- 푸터 -->
<c:import url="../template/footer.jsp"></c:import>
</div>


</body>
</html>