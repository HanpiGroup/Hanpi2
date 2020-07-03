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
<link href="css/style.min.css?v=4.0.0" rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">
</head>
<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
		<div id="wrapper">
			<!--右侧部分开始-->
			<div id="page-wrapper" class="gray-bg dashbard-1">
				<div class="row content-tabs">
					<nav class="page-tabs J_menuTabs">
						<div class="page-tabs-content">
							<a href="index" class="active J_menuTab" data-id="admin/welcome.jsp">首页</a>
						</div>
					</nav>
				</div>
				<div class="row J_mainContent" id="content-main">
					<div class="wrapper wrapper-content animated fadeInRight">
					    <div class="row">
					        <div class="col-sm-12">
					            <div class="ibox float-e-margins">
					
					                <!--标题栏和 添加按钮            开始-->
					                <div class="ibox-title">
					                    <h5>添加图书信息
					                        <small></small>
					                    </h5>
					
					                </div>
					                <!--标题栏和 添加按钮   结束-->
					
					
					                <div class="ibox-content">
					
										<form action="updateBook" method="post" name="form1" class="form-horizontal">
					      
											<input type="hidden" name="book_id" value="${currBook.book_id }">
					                        <div class="form-group">
					                            <label class="col-sm-2 control-label">图书名称:</label>
					                            <div class="col-sm-2">
					                                <input type="text" class="form-control" name="book_name" id="book_name" value="${currBook.book_name }"/>
					
					                            </div>
					                        </div>
					                        <div class="form-group">
					                            <label class="col-sm-2 control-label">图书价格:</label>
					                            <div class="col-sm-2">
					                                <input type="text" class="form-control" name="book_price" id="book_price" value="${currBook.book_price }"/>
					
					                            </div>
					                        </div>
					                        <div class="form-group">
					                            <label class="col-sm-2 control-label">图书介绍:</label>
					                            <div class="col-sm-2">
					                                <input type="text" class="form-control" name="book_detail" id="book_detail" value="${currBook.book_detail }"/>
					
					                            </div>
					                        </div>
					                        <div class="form-group">
					                            <label class="col-sm-2 control-label">图书出版社:</label>
					                            <div class="col-sm-2">
					                                <input type="text" class="form-control" name="book_public" id="book_public" value="${currBook.book_public }"/>
					
					                            </div>
					                        </div>
					                        <div class="form-group">
					                            <div class="col-sm-4 col-sm-offset-2">
					                                <input type="submit" value="添加商品">
					                            </div>
					                        </div>
					                    </form>
					                    <!--表格数据区------------结束-->
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