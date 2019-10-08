<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign In</title>
</head>

<style>
    .middle {
        position: absolute;
        top: 50%;
        left: 50%;
        -moz-transform: translateX(-50%) translateY(-50%);
        -webkit-transform: translateX(-50%) translateY(-50%);
        transform: translateX(-50%) translateY(-50%);

    }
</style>
<body>

<div class="middle">
    <form action="/signIn" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="text" name="login" placeholder="Login">
        <br>
        <input type="password" name="password" placeholder="Password">
        <br>
        <input type="checkbox" name="remember-me"> Запомни меня
        <br>
        <input type="submit" value="SignIn">
        <br>
    </form>
    <form action="/signUp">
        <button>SignUp</button>
    </form>
</div>
</body>
</html>
