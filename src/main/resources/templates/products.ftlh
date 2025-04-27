<!DOCKTYPE html>
<html>
<head>
    <title> unAvito</title>
</head>
<body>
<h1>unAvito</h1><hr>
<h4>ITEMS</h4>
<#list products as item>
    <div>
        <p><b>${item.title}</b></p>
        <p>${item.price} | <a href="/product/${item.id}"> More...</a> </p>
    </div>
</#list>
<hr>
<h3>Create new item</h3>
<form action="/product/create" method="post">
    name: <input type="text" name="title"/><br><br>
    info: <input type="text" name="description"/><br><br>
    price: <input type="number" name="price"/><br><br>
    city: <input type="text" name="city"/><br><br>
    <input type="submit" value="add item"/>
</form>

</body>
</html>