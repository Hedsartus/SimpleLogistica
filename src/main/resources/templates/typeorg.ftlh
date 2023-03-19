<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, minimal-ui">
    <title>Добавление вида организации</title>
</head>
<body>
    <#if errorMsg??>
        <h3 style="color: red">${errorMsg}</h3>
    </#if>
    <#if compliteMsg??>
        <h3 style="color: green">${compliteMsg}</h3>
    </#if>
    <form action="/typeorg" method="post">
        <table>
            <tr>
                <td>Название</td>
                <td><input type="text" name="togTitle" value="" /></td>
            </tr>
            <tr>
                <td>Сокр. название</td>
                <td><input type="text" name="togTitleFull" value="" /></td>
            </tr>
            <tr>
                <td>Обрамление в кавычки</td>
                <td><input type="checkbox" name="togQuote" checked></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Сохранить"/></td>
            </tr>
        </table>
    </form>
</body>
</html>