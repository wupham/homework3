<!--Copyright © 2016 Wes Upham and Sarah Hennenkamp and Nick Richu--> 
<%@ include file="/includes/header.html"%>
<%@taglib prefix="elon" uri="/WEB-INF/tlds/hw3tags.tld"  %>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<div class="main">
  <h1>Future Value Calculator</h1>
  <table>
    <tr>
      <td>Investment Amount:</td>  
      <td><elon:currencyFormat amount="${user.amount}"/></td>
    </tr>
    <tr>
      <td>Yearly Interest Rate:</td>   
      <td><c:out value="${user.rate}"/></td>
    </tr>
    <tr>    
      <td>Number of Years:</td>   
      <td><c:out value="${user.years}"/></td>
    </tr>
    <tr>
      <td>Future Value:</td>   
      <td><elon:currencyFormat amount="${user.value}"/></td>
    </tr>
  </table>
</div>
<%@ include file="includes/footer.html"%>