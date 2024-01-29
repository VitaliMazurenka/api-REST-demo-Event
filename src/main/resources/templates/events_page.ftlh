<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>name</th>
            <th>description</th>
            <th>date</th>
        </tr>
        <#list eventList as event>
            <tr>
                <td>${event.name} </td>
                <td>${event.description} </td>
                <td>${event.date} </td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>