<%@ page import="tree.Tree" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>

    <title>.:: Decision Tree ::.</title>
    <meta content="text/html; charset=utf-8" http-equiv="content-type"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link href="/CSS/TreeStyle.css" rel="stylesheet" type="text/css"/>
    <link href="/CSS/menu.css" rel="stylesheet" type="text/css"/>

    <script type="text/javascript" src="/jsLib/js/AC_OETags.min.js"></script>
    <script type="text/javascript" src="/jsLib/js/cytoscapeweb.min.js"></script>
    <script type="text/javascript" src="/jsLib/Graph.js"></script>

    <script type=text/javascript>
        window.onload = function () {
            <%

             boolean err = Boolean.parseBoolean(request.getParameter("err"));
             if (err) {
                   out.write("alert('" +  "سوال یا جواب انتخاب شده قابلیت حذف ندارد" + "');");
             }


             String xml = "";
             String jsXml = "";
             String line = "";
            if (request.getSession().getAttribute("TreeObject") != null){
                   xml = ((Tree)  request.getSession().getAttribute("TreeObject")).getXML();
                   for(char letter: xml.toCharArray()){
                          if (letter != '\n'){
                             line += letter;
                          } else{
                             if (!(line.trim().equals(""))) {
                             line = "\\" + line.trim() + "\\";
                             jsXml += "\n" +line ;
                             }
                             line="";
                          }
                   }
                  jsXml = "\\" + jsXml ;
            }
            %>


            var xml = '<%=jsXml%> ';
            showTreeByXml(xml);


        }

    </script>

</head>
<body style="background-color: teal">
<div style="direction: rtl; width: 100%;">
    <form id="mainForm" action="Process.jsp" method="post">
        <table cellspacing="1" style="width: 50%;text-align: right;margin-right: 2px">
            <tr>
                <td style="width:10%;"> سوال/جواب</td>
                <td><input name="q&a" style="width: 80%" type="text"/></td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td style="width:10%;">مقدار</td>
                <td><input name="weight" style="width: 20%" type="text"/></td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td style="width:10%;">احتمال</td>
                <td><input name="probability" style="width: 20%" type="text"/></td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td colspan="3" style="text-align: center">
                    <ul class="menu">
                        <li><a href="Process.jsp?newTree=true">درخت جدید </a></li>
                        <li><a href="#" onclick="insertNode();return false;">درج </a></li>
                        <li><a href="#" onclick="deleteNode();return false;">حذف </a></li>
                    </ul>
                </td>

            </tr>
        </table>
    </form>
</div>
<div id="DisplayTree">
    درخت تصمیم گیری
</div>
<div id="note">
    <p>Click nodes or edges.</p>
</div>
</body>
</html>