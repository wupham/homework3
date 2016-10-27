<!--Copyright © 2016 Wes Upham and Sarah Hennenkamp--> 
<%@ include file="/includes/header.html"%>
        <div class="main">
					<jsp:useBean id="user" scope="request" class="edu.elon.calculate.User"/>
					<h1>Future Value Calculator</h1>
					<p>Investment Amount:   <jsp:getProperty name="user" property="amount"/></p>
            <p>Yearly Interest Rate:   <jsp:getProperty name="user" property="rate"/></p>
            <p>Number of Years:   <jsp:getProperty name="user" property="years"/></p>
            <p>Future Value:   <jsp:getProperty name="user" property="value"/></p>
        </div>
<%@ include file="includes/footer.html"%>