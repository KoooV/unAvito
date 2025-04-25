<!DOCKTYPE html>
<html>
<head>
    <title> BS market</title>
</head>
<body>
<h1>BS market</h1><hr>
<h4>Items</h4>
<#list products as item>
    <div>
        <p><b>${item.title}</b></p>
        <p>${item.price} | <a href="/product/${item.id}"> More...</a>/p>
    </div>
</#list>
<hr>
<h3>Create new item</h3>
<form action="/product/create" method="post">
    Item name: <input type="text" name="title"/><br><br>
    Item info: <input type="text" name="description"/><br><br>
    Item price: <input type="number" name="price"/><br><br>
    Item city: <input type="text" name="city"/><br><br>
    <input type="submit" value="add item"/>
</form>

</body>
</html>