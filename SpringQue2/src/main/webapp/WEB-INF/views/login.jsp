<html>
<head>
<title>Bhartesh's Server!!</title>
</head>
<body>
 <h1><p><font color="red">${errorMessage}</font></p></h1>  
 <h2>Enter principle amount, no. of years and rate of Interest</h2> 
 
    <form action="/login" method="POST">
       <a  >Principle amount : <input name="amount" type="text" /></a>
       <a>No. of Years : <input name="time" type="text" /></a> 
       <a>Rate of Interest <input name="rate" type="text"/></a>
       <input type="submit" value="Find S.I" />
    </form>
</body>
</html>