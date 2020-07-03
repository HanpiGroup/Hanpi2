<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
<link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
<link href="css/bootstrap-table.min.css" rel="stylesheet">
<link href="css/style.min.css?v=4.0.0" rel="stylesheet">
</head>
<body class="fixed-sidebar full-height-layout gray-bg">
		<div id="wrapper">
			<nav class="navbar-default navbar-static-side" role="navigation">
				<div class="nav-close"><i class="fa fa-times-circle"></i>
				</div>
				<div class="sidebar-collapse">

					<ul class="nav" id="side-menu">
						<li class="nav-header">
							<div class="dropdown profile-element">
								<span></span>
								<span class="clear">
								</span>
									<span class="block m-t-xs">
										<strong class="font-bold" style="color: white;">
											您好：${currUser.user_name }
										</strong>
									</span>
									<span class="block m-t-xs">
										<strong class="font-bold" style="color: white;">
											网站访问次数：${count }
										</strong>
									</span>
							</div>
						</li>
						<li><a class="J_menuItem" href="userIndex" >查看图书</a></li>
						<li><a class="J_menuItem" href="myBooks" >我的借阅</a></li>
					</ul>
				</div>
			</nav>
			<!--右侧部分开始-->
			<div id="page-wrapper" class="gray-bg dashbard-1">
				<div class="row border-bottom">
					<nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
						<ul class="nav navbar-top-links navbar-right">
							<li class="hidden-xs">
								<a href="login.jsp">退出</a>
							</li>
						</ul>
					</nav>
				</div>
				<div class="row J_mainContent" id="content-main">
					<div class="wrapper wrapper-content animated fadeInRight">
						<div class="row">
							<div class="col-sm-12">
								<div class="ibox float-e-margins">
									<div class="ibox-content">
										<!--  内容列表   -->
										<div class="table-condensed">
											<table id="datalist" data-striped="true" style="width: 100%;">
												<thead>
													<tr>
														<th data-halign="center" data-align="center">图书编号</th>
														<th data-halign="center" data-align="center">图书名称</th>
														<th data-halign="center" data-align="center">图书价格</th>
														<th data-halign="center" data-align="center">图书介绍</th>
														<th data-halign="center" data-align="center">图书出版社</th>
														<th data-halign="center" data-align="center">图书状态</th>
														<th data-halign="center" data-align="center">操作</th>
													</tr>
												</thead>
												<c:forEach var="book" items="${books }">
													<tr>
														<td>${book.book_id }</td>
														<td>${book.book_name }</td>
														<td>${book.book_price }</td>
														<td>${book.book_detail }</td>
														<td>${book.book_public }</td>
														<td>
															<c:if test="${book.book_status == 0 }">
																未借
															</c:if>
															<c:if test="${book.book_status == 1 }">
																<span style="color: red;">已被借出</span>
															</c:if>
														</td>
														<td>
															<c:if test="${book.book_status == 0 }">
																<a href="addMyBook?book_id=${book.book_id }">借阅</a>
															</c:if>
															<c:if test="${book.book_status == 1 }">
																<span style="color: red;">不可借</span>
															</c:if>
														</td>
													</tr>
												</c:forEach>
												
											</table>
											
										</div>
									</div>
								</div>
							</div>

						</div>
					</div>

				</div>
			</div>
			<!--右侧部分结束-->
		</div>
	</body>
</html>