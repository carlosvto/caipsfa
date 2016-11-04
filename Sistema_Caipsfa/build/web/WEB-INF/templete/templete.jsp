<%-- 
    Document   : templete
    Created on : 10-19-2016, 07:37:09 PM
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        <title>Dashboard - CAIPSFA</title>
        <!-- Bootstrap core CSS -->
        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="assets/css/zabuto_calendar.css">
        <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css" />
        <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">    
        <!-- Custom styles for this template -->
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/style-responsive.css" rel="stylesheet">
        <script src="assets/js/chart-master/Chart.js"></script>
    </head>
    <body>
        <section id="container" >
            <header class="header black-bg">
                    <div class="sidebar-toggle-box">
                        <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                    </div>
                  <!--logo start-->
                  <a href="#" class="logo"><b>CAIPSFA</b></a>
                  <!--logo end-->
                  <div class="nav notify-row" id="top_menu">
                      <!--  notification start -->
                      <!--  notification end -->
                  </div>
                  <div class="top-menu">
                      <ul class="nav pull-right top-menu">
                          <li><a class="logout" href="Logout.do?method=cerrar">Logout</a></li>
                      </ul>
                  </div>
              </header>
            <!--header end-->
            <!-- **********************************************************************************************************************************************************
            MAIN SIDEBAR MENU
            *********************************************************************************************************************************************************** -->
            <!--sidebar start-->
            <tiles:insert attribute="menuenf"/>
            <!--sidebar end-->

            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">

                    <div class="row">
                    
                        <tiles:insert attribute="content"/>

            <!-- **********************************************************************************************************************************************************
            RIGHT SIDEBAR CONTENT
            *********************************************************************************************************************************************************** -->                  

            <tiles:insert attribute="sidebar"/>
                    </div><! --/row -->
                </section>
            </section>

            <!--main content end-->
            <!--footer start-->
            <footer class="site-footer">
                <div class="text-center">
                    CAIPSFA 2016.
                    <a href="#" class="go-top">
                        <i class="fa fa-angle-up"></i>
                    </a>
                </div>
            </footer>
            <!--footer end-->
        </section>

          <!-- js placed at the end of the document so the pages load faster -->
          <script src="assets/js/jquery.js"></script>
          <script src="assets/js/jquery-1.8.3.min.js"></script>
          <script src="assets/js/bootstrap.min.js"></script>
          <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
          <script src="assets/js/jquery.scrollTo.min.js"></script>
          <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>
          <script src="assets/js/jquery.sparkline.js"></script>


          <!--common script for all pages-->
          <script src="assets/js/common-scripts.js"></script>

          <script type="text/javascript" src="assets/js/gritter/js/jquery.gritter.js"></script>
          <script type="text/javascript" src="assets/js/gritter-conf.js"></script>

          <!--script for this page-->
          <script src="assets/js/sparkline-chart.js"></script>    
              <script src="assets/js/zabuto_calendar.js"></script>	
              <script type="text/javascript">
              $(document).ready(function () {
              var unique_id = $.gritter.add({
                  // (string | mandatory) the heading of the notification
                  title: 'Welcome <%=session.getAttribute("USER").toString()%>!',
                  // (string | mandatory) the text inside the notification
                  text: 'Para mayor información sigue este link: <a href="https://www.ipsfa.com/index.php?option=com_content&view=frontpage&Itemid=1" target="_blank" style="color:#ffd777">IPSFA</a>.',
                  // (string | optional) the image to display on the left
                  image: 'assets/img/logo.png',
                  // (bool | optional) if you want it to fade out on its own or just sit there
                  sticky: true,
                  // (int | optional) the time you want it to be alive for before fading out
                  time: '',
                  // (string | optional) the class name you want to apply to that specific message
                  class_name: 'my-sticky-class'
              });

              return false;
              });
              </script>

              <script type="application/javascript">
              $(document).ready(function () {
                  $("#date-popover").popover({html: true, trigger: "manual"});
                  $("#date-popover").hide();
                  $("#date-popover").click(function (e) {
                      $(this).hide();
                  });

                  $("#my-calendar").zabuto_calendar({
                      action: function () {
                          return myDateFunction(this.id, false);
                      },
                      action_nav: function () {
                          return myNavFunction(this.id);
                      },
                      ajax: {
                          url: "show_data.php?action=1",
                          modal: true
                      },
                      legend: [
                          {type: "text", label: "Special event", badge: "00"},
                          {type: "block", label: "Regular event", }
                      ]
                  });
              });


              function myNavFunction(id) {
                  $("#date-popover").hide();
                  var nav = $("#" + id).data("navigation");
                  var to = $("#" + id).data("to");
                  console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
              }
          </script>
    </body>
</html>
