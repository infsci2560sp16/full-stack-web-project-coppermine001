<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Sign up</title>
<script src = "js/signup.js"></script>
<link rel="stylesheet" type="text/css" href="stylesheets/signup.css" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:700,300,300italic' rel='stylesheet' type='text/css'>
</head>
<body>
<h1>User Sign up</h1>
<div>
<form name="reg" action="/signup_action" >
<table>
<tr>
<td>Enter uername：</td>
<td>
 <input type="text" name="UserName" placeholder="Username can only contain numbers and letters">

</td>
</tr>
<tr>
<td>Enter password：</td>
<td> <input type="password" name="UserPassword"></td>
</tr>
<tr>
<td>Reenter password：</td>
<td> <input type="password" name="CUserPassword"></td>
</tr>
<tr>
<td>Nickname：</td>
<td> <input type="text" name="NickName"></td>
</tr>
<tr>
<td>Gender：</td>
<td> <input type="radio" name="Sex" value="0" checked>male<input type="radio" name="Sex" value="1">female</td>
</tr>
<tr>
<td>Email address：</td>
<td> <input type="text" name="Email"></td>
</tr>
</table>
<p>
<input type="submit" name="sub" value="register">
<input type="reset" name="res" value="reenter">
</p>
</form>
</div>
<a href="/login" target="_blank">back to login</a>


</body>
</html>
