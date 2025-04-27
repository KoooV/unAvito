<!DOCKTYPE html>
<html>
<head>
    <title> BS market</title>
</head>
<body>
<h1>Detailed info</h1>
<hr>
<b>Item name</b>${item.title}<br>
<b>Price</b>${item.price}<br>
<b>City</b>${item.city}<br>
<b>Description</b>${item.description}<br>
<hr>
<form action="/product/delete/${item.id}" method="post">
    <input type="submit" value="Delete item"/>
</form>
</body>
</html>

