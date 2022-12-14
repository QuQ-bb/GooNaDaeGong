<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        ol, ul {
            padding-left: 0rem !important;
        }
    </style>
    <link rel="stylesheet" href="/resources/css/member/mypage.css">
</head>
<body>
    <div class="wrap">
    <c:import url="../template/header.jsp"></c:import>
        <section>
            <div class="css-luwwab eug5r8l4">
                <div class="css-833hqy ecbxmj4">
                    <div class="css-1v4whg ecbxmj3">마이페이지</div>
                    <ul class="css-1x9bshx ecbxmj2">
                        <li class="css-0 ecbxmj1">
                            <a class="active css-nk8664 ecbxmj0" href="./myOrder">주문 내역<span class="css-e41glx e1x0rfoo0"></span></a>
                        </li>
                        <li class="css-0 ecbxmj1">
                            <a class=" css-nk8664 ecbxmj0" href="./myLike">찜한 상품<span class="css-e41glx e1x0rfoo0"></span></a>
                        </li>
                        <li class="css-0 ecbxmj1">
                            <a class=" css-nk8664 ecbxmj0" href="./myReview">상품 후기<span class="css-e41glx e1x0rfoo0"></span></a>
                        </li>
                        <li class="css-0 ecbxmj1">
                            <a class=" css-nk8664 ecbxmj0" href="./myQNA">상품 문의<span class="css-e41glx e1x0rfoo0"></span></a>
                        </li>
                        <li class="css-0 ecbxmj1">
                            <a class=" css-nk8664 ecbxmj0" href="./myUpdate">개인 정보 수정<span class="css-e41glx e1x0rfoo0"></span></a>
                        </li>
                    </ul>
                    <a href="../qna/inquiry" class="css-17gln34 e19l01ug3">
                        <div class="css-1niy3no e19l01ug2">
                            <span class="css-1sdidca e19l01ug1">도움이 필요하신가요 ?</span>
                            <span class="css-rnnx2x e19l01ug0">1:1 문의하기</span>
                        </div>
                        <span class="css-1wkaywz e1x0rfoo0"></span>
                    </a>
                </div>
                <div class="css-171zbec eug5r8l3">
            <div class="css-j0lifa ed9qr673">
                <div class="css-fhxb3m ed9qr672">
                    <h2 class="css-xr9nhh ed9qr671">주문 내역</h2>
                </div>
            </div>
                    <div class="css-1dmsa3j e1jm6dy15"></div>
                    <div class="css-1c8nox e1ykq6gv1">
                            <c:forEach items="${order}" var="order" varStatus="">
                        <div class="css-4wlxei e1437c6414">
                            <div class="css-1hbtwy0 e1437c6413">
                                <span class="css-asma03 e1437c6412">
                                <fmt:formatDate value="${order.ord_date}" pattern="yyyy-MM-dd"/>
                                </span>
                                <a class="css-l9y4tx e1437c6411" href="./myOrderDetail?merchant_uid=${order.merchant_uid}">주문내역 상세보기</a>
                            </div>
                            <div class="css-7apail e1437c6410">
                                <div class="css-fhxb3m e1437c649">
                                    <!-- <img src="" alt="" class="css-1oc1pau e1437c648" value=""> -->
                                    <div class="css-1fttcpj e1437c647">
                                        <dl class="css-1ccl3pq e1437c646">
                                            <dt class="css-dzjp62 e1437c645">주문번호</dt>
                                            <dd class="css-1i58pf4 e1437c644">${order.merchant_uid}</dd>
                                        </dl>
    <!--                                     <dl class="css-1ccl3pq e1437c646">
                                            <dt class="css-dzjp62 e1437c645"></dt>
                                            <dd class="css-1o8e829 e1437c643"></dd>
                                        </dl> -->
                                     <!--    <dl class="css-1ccl3pq e1437c646">
                                            <dt class="css-dzjp62 e1437c645">결제방법</dt>
                                            <dd class="css-1i58pf4 e1437c644"></dd>
                                        </dl> -->
                                        <dl class="css-1ccl3pq e1437c646">
                                            <dt class="css-dzjp62 e1437c645">결제금액</dt>
                                            <dd class="css-1i58pf4 e1437c644"><fmt:formatNumber value="${order.ord_total2}" pattern="#,###" />원</dd>
                                        </dl>
                                        <dl class="css-1ccl3pq e1437c646">
                                            <dt class="css-dzjp62 e1437c645">상태</dt>
                                            <dd class="css-1i58pf4 e1437c644">${order.ord_status}</dd>
                                        </dl>
                                    </div>
                                </div>
                                <div class="css-s5xdrg e1437c642">
                                    <div class="css-1bbz142 e1437c640">
                                        <button class="css-oyz24n e4nu7ef3" type="button" height="36" radius="3">
                                            <span class="css-ymwvow e4nu7ef1">
                                                <a href="../qna/inquiry?merchant_uid=${order.merchant_uid}">
                                                1:1 문의
                                                </a>
                                            </span>
                                        </button>
                                        <div class="btnspace"></div>
                                        <button class="css-oyz24n e4nu7ef3" type="button" height="36" radius="3">
                                            <span class="css-ymwvow e4nu7ef1">
                                                <a href="../cancel/inquiry?merchant_uid=${order.merchant_uid}">
                                                    취소
                                                </a>
                                            </span>
                                        </button>
                                    </div>
                                    <span class="css-1fdt947 e1437c641">
                                        <div class="btnspace"></div>
                                        <button class="css-oyz24n e4nu7ef3" type="button" height="36" radius="3">
                                            <span class="css-ymwvow e4nu7ef1">
                                                <a href="../exchange/inquiry?merchant_uid=${order.merchant_uid}">
                                                교환
                                                </a>
                                            </span>
                                        </button>
                                        <div class="btnspace"></div>
                                        <button class="css-oyz24n e4nu7ef3" type="button" height="36" radius="3">

                                        <button onclick="location.href='../refund/inquiry?merchant_uid=${order.merchant_uid}'" class="css-oyz24n e4nu7ef3" type="button" height="36" radius="3">
                                            <span class="css-ymwvow e4nu7ef1">
                                                반품
                                            </span>
                                        </button>
                                    </span>
                                </div>
                            </div>
                        </div>
                            </c:forEach>
                        <div class="css-bx0kqw e1mkosgq0"></div>
                        <!-- 페이징 처리 -->
                        <div class="css-15jhycr e3tf63e0">
                            <div class="css-sxxs1g eytury60">
                            <c:choose>
                                    <c:when test="${pager.pre}">
                                        <button  type="button" class="css-rzcdhr e1hbwyso0" onClick="location.href='./myQNA?page=${pager.startNum-1}'">
                                            <div class="css-7qb0sc e1ilyb3p0">이전</div>
                                        </button>
                                    </c:when>
                                    <c:otherwise>
                                            <button type="button" class="css-rzcdhr e1hbwyso0" disabled="">
                                            <div class="css-7qb0sc e1ilyb3p0">이전</div>
                                        </button>
                                    </c:otherwise>
                                </c:choose>
                                    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
                                        <li class="page-item"><a class="page-link" href="./myOrder?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
                                    </c:forEach>
                                <c:choose>
                                    <c:when test="${pager.next}">
                                        <button type="button" class="css-1jwilit e1pk9060" onClick="location.href='./myQNA?page=${pager.lastNum+1}'">
                                        <div class="css-7qb0sc e1ilyb3p0">다음</div>
                                    </button>
                                    </c:when>
                                    <c:otherwise>
                                        <button disabled="" type="button" class="css-1jwilit e1pk9060">
                                        <div class="css-7qb0sc e1ilyb3p0">다음</div>
                                    </button>
                                    </c:otherwise>
                                </c:choose>
                            </div>
                        </div>
                    </div>
                </div>
              </div>
        </section>
        <c:import url="../template/footer.jsp"></c:import>
    </div> <!--wrap end-->
</body>
</html>