<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title></title>
<!-- bootstrap -->
<link rel="stylesheet" href="../plugin/bootstrap/css/bootstrap.min.css" />
<!-- bootstrap-table -->
<link rel="stylesheet" href="../plugin/bootstrap_table/bootstrap-table.min.css" />

<script type="text/javascript">
function ajaxRequest(params){
	 console.log(params.data);
	 
         params.success({
             rows: [{
                 "username": 0,
                 "name": "Item 0",
                 "number": "$0"
             }]
         });
     
}

</script>
</head>
<body>
	<div class="container-fluid">
	<div class="row">
	  <div class="col-xs-12">
		<table id="userTable" data-toggle="table" data-height="500"
			data-ajax="ajaxRequest" data-search="true"
			data-side-pagination="server" data-pagination="true">
			<thead>
				<tr>
					<th data-field="id">ID</th>
					<th data-field="number">编号</th>
					<th data-field="username">用户名称</th>
					<th data-field="name">姓名</th>
					<th data-field="email">邮箱</th>
					<th data-field="phone">电话</th>
					<th data-field="ip">IP地址</th>
					<th data-field="bz">备注</th>
					<th data-field=create_time>创建时间</th>
					<th data-field="status">状态</th>
				</tr>
			</thead>
		</table>
	</div>
	  </div>
	</div>
</body>

<script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="../plugin/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"src="../plugin/bootstrap_table/bootstrap-table.min.js"></script>
</html>