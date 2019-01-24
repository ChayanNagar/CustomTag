<%@ taglib uri="WEB-INF/tlds/demo.tld" prefix="tt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Custom Tag</title>
</head>
<body>
<h2>Total customer:</h2>
<tt:totalcustomer/>
<h2>Total Product NA:</h2>
<tt:product status="NA"/>
<h2>Total Product dispatch:</h2>
<tt:product status="dispatch"/>
<h2>Loop using body custom tag:</h2>
<tt:loop count="5">
<h4>Chayan</h4>
</tt:loop>
</body>
</html>