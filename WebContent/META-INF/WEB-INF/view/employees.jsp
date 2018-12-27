<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<

<link rel="stylesheet" type="text/css" href="res/css/bootstrap.min.css">
<script src="res/js/jquery.js"></script>
<script src="res/js/bootstrap.js"></script>

<link rel="stylesheet" type="text/css" href="res/DataTables/datatables.min.css">
<script src="res/DataTables/datatables.min.js"></script>




<title>Atos - Employees</title>
</head>
<body>

	 <div class="container">
          <!-- Content here -->
          
            <div class="page-header">
                <h1>List of Employees</h1>      
            </div>
            <div class="jumbotron">
            <label>Search for Skills</label>
            <input type="text" class="column_filter" id="search"> </input>
            
                <table id="employees" class="table table-hover">
                  <thead>
                    <tr>
                      <th scope="col">Name</th>
                      <th scope="col">Role</th>
                      <th scope="col">Salary</th>
                      <th scope="col">Skills</th>
                    </tr>
                  </thead>
                  <tbody>
                  	<c:forEach items="${employees}" var="employee">
	                    <tr>
	                      <td>${employee.name}</td>
	                      <td>${employee.role}</td>
	                      <td>${employee.salary}</td>
	                      <td>
	                      <c:forEach items="${employee.skills}" var="skill">
	                      ${skill} | </c:forEach>
	                      </td>
	                    </tr>
                    </c:forEach>
                    
                  </tbody>
                </table>
            </div>
        </div>    
<script type="text/javascript">

function filterColumn ( i ) {
	
	let key =  $('#search').val();
	let key2 = key.replace(" ", "|");
	console.log(key2);
	
 
   $('#employees').DataTable().column( i ).search(key2, true, false).draw();
  
}

$(document).ready( function () {

    $('#employees').DataTable();
    
    $('input.column_filter').on( 'keyup click', function () {
        filterColumn(3);
    } );
    
} );

</script>
</body>
</html>