<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

    
    <title>Online Bus Ticket Booking</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/freelancer.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
   
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
   
    <!-- Load SCRIPT.JS which will create datepicker for input field  -->
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

</head>
<style>
   .bodyColor {
  text-align: center;
  /*background: #18BC9C;*/
  	/*background: url("img/back.jpg") 30% 30%;*/
        
  color: white;
} 
  .form-control option {
      font-size:large;
      color:black;
    }

table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
    color:black;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #18BC9C;
    color: white;
}
</style>

<body id="page-top" class="bodyColor">

    <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
        <div class="container">
            <a class="navbar-brand" href="#page-top"><img style="position:fixed; left:1px;top:24px"class="img-responsive" src="img/bus.gif" alt=""></a>
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    
                    <li class="page-scroll">
                      <p>  <a href="login.jsp">Back</a></p>
                    </li>
                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    <c:if test="${!empty tripRoutes}">
<div style="border-top-width: 125px; border-top-style: solid;">
<table>
  <tr>
    <th>Travels</th>
    <th>Time</th>
    <th>Seats</th>
    <th>Price</th>

    <th></th>
  </tr>
  <c:forEach items="${tripRoutes}" var="tripRoutes">
  <tr>
    <td> <i class="fa fa-bus" style="font-size:24px;color:black"></i><c:out value="${tripRoutes.trip.bus.travels.name}"/></td>
    <td><i class="fa fa-clock-o" style="font-size:24px;color:black"></i></td>
    <td><i class="material-icons" style="font-size:24px:color:black"></i></td>
    <td><i class="fa fa-inr" style="font-size:36px;color:black"></i></td> 
    <td></td>
  </tr>
  </c:forEach>
</table>
</div>
</c:if>
</body>
</html>

