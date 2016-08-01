<!DOCTYPE html>
<html lang="en">

<head>

    
    <title>Online Bus Ticket Booking</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/freelancer.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
   
     <!-- Load jQuery from Google's CDN -->
    <!-- Load jQuery UI CSS  -->
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
   
    <!-- Load jQuery JS -->
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <!-- Load jQuery UI Main JS  -->
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
   
    <!-- Load SCRIPT.JS which will create datepicker for input field  -->
    

</head>
<style>
   .bodyColor {
  text-align: center;
  /*background: #18BC9C;*/
  	background: url("img/back.jpg") 30% 30%;
        
  color: white;
} 
  .form-control option {
      font-size:large;
      color:black;
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
                      <p>  <a href="UserLogin.html">Back</a></p>
                    </li>
                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>


<div style="position:fixed; left:80px; top:200px;margin-bottom: 2cm;"  >
<h2 style="margin-bottom: 2cm;">
Online Bus Ticket Booking With Zero Booking Fee!!!!</h2>

 
<form  id="searchBus" name="searchBus" action="Search.html" method="post">
   <table style="margin-bottom: 2cm;">
    <tr>
        <td>
        <div class="form-group">
      
            <p  >From</p>
      <select class="form-control"style="width:250Px; " name="source" id="source">
        <option > -- Select Source -- </option>
        <option>Chennai</option>
        <option>Trichy</option>
        <option>Madurai</option>
        <option>Tuticorin</option>
      </select>
           </div>
         </td>
        <td style="position:absolute;right: 350px;">
            <div class="form-group">
             <p>To</p>
      <select class="form-control"style="width:250Px" name="destination"  id="destination">
         <option > -- Select Destination -- </option>
        <option>Chennai</option>
        <option>Trichy</option>
        <option>Madurai</option>
        <option>Tuticorin</option>
      </select>
            </div>
        </td>
       
    
    </tr>
     
    
    </table>
     <p style="position:absolute;left:2Px;top:250px;margin-bottom: 2cm;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pick a Date
     <input name="dateOfTravel" id="dateOfTravel" style="position:absolute;left:2Px;color:black" type="text"  /></p>
     <button style="position:absolute;left:2Px;top:380px;"type="submit" onClick="sourceAndDestinationEvaluation()" class="btn btn-danger" >Select My Trip</button>
     <script>
  $(document).ready(
  
  /* This is the function that will get executed after the DOM is fully loaded */
  function () {
    $( "#dateOfTravel" ).datepicker({
      changeMonth: true,//this option for allowing user to select month
      changeYear: true //this option for allowing user to select from year range
    });
  }

);
  
 
  </script>
  
  </form>
  
 </div>
 

</body>
</html>
