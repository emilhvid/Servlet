<!DOCTYPE html>
<html>
<head>
<style>
#header {
    background-color:pink;
    color:white;
    text-align:center;
    padding:5px;
}

#section {
    width:750px;
    float:left;
    padding:10px;	 	 
}
#footer {
    background-color:pink;
    color:white;
    clear:both;
    text-align:center;
   padding:10px;	 	 
}
</style>
</head>
<body>

<div id="header">
<h1>Find your shop</h1>
</div>



<div id="section">
<h2>Search and get nearest located shop to you</h2>
<p>Do you want to save time and find the nearest specific shop to you, then below fill in the 
search criteria and submit, then you will get a route to your shop followed with public and private transportain possibilites.</p>
<p>You have to give an address or name of your shop,then you will be given transport option to that 
address and the price for the public transportation.</p>


<form action="FormOut.jsp">
  <fieldset>
    <legend>Your shop:</legend>
    Name of shop:<br>
    <input type="text" name="Nameofshop" value="Cafe Emil ">
    <br>
    Address of shop:<br>
    <input type="text" name="Addressofshop" value="Holte Hovedgade ">
    <br><br>
    <input type="submit" value="Search">
  </fieldset>
</form>
</div>
<div id="footer">
Butiksoegning 
</div>

</body>
</html>
