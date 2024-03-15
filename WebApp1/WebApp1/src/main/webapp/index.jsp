<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="builder.Product" %>
<%@ page import="builderProductBuilder" %>

<%
    Product product = new ProductBuilder()
                .setName("Iphone")
                .setPrice(19.99)
                .setDescription("This is an example product")
                .build();
%>



<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h1>Product details</h1>
    <p>Name: <%= product.getName() %> </p>
    <p>Price: <%= product.getPrice() %> </p>
    <p>Description: <%= product.getDescription() %> </p>

</body>
</html>
