<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, minimal-ui">
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>Название</td>
            <td>ИНН</td>
            <td>АТИ</td>
        </tr>
        <#list orgs as o>
            <tr>
                <td><a name="${o.id}" href="org/edit/${o.id}">${o.orgName}</a></td>
                <td>${o.orgInn}</td>
                <td>${o.orgAti}</td>
            </tr>
        </#list>
    </table>

</body>
</html>