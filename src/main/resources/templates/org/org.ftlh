<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, minimal-ui">
    <title>Title</title>
</head>
<body>
    <#if errorMsg??>
        <h3 style="color: red">${errorMsg}</h3>
    </#if>
    <form method="post" action="/org/edit">
        <table>
            <tr>
                <td>Название</td>
                <td><input name="orgName" value="" /></td>
            </tr>
            <tr>
                <td>ТИП</td>
                <td>
                    <select name="orgType">
                    <#list typesOrg as to>
                        <option value="${to.togId}">${to.togTitleFull}</option>
                    </#list>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Сокр. название</td>
                <td><input name="orgNameFull" value="" /></td>
            </tr>
            <tr>
                <td>АТИ</td>
                <td><input name="orgAti" value="" /></td>
            </tr>
            <tr>
                <td>ИНН</td>
                <td><input name="orgInn" value="" /></td>
            </tr>
            <tr>
                <td>КПП</td>
                <td><input name="orgKpp" value="" /></td>
            </tr>
            <tr>
                <td>ОГРН(ИП)</td>
                <td><input name="orgOgrn" value="" /></td>
            </tr>
            <tr>
                <td>Сайт</td>
                <td><input name="orgSite" value="" /></td>
            </tr>
            <tr>
                <td>Заметка</td>
                <td><input name="orgComment" value="" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Сохранить"/></td>
            </tr>
        </table>
    </form>
</body>
</html>