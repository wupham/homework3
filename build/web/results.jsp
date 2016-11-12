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
        
    <td><b>Years:</b><br><c:forEach var="i" begin="1" end="${user.years}">
            <c:out value="${user.numYears[i]}"/><br></c:forEach></p></td></tr>
    <td><b>Values:</b><br><c:forEach var="i" begin="1" end="${user.years}">
                    <elon:currencyFormat amount="${user.value[i]}"/><br></c:forEach></p></td></tr>
        </div>
        </table>
   
<%@ include file="includes/footer.html"%>