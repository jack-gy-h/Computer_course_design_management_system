<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/12/14
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="/static/static-easyui/plugin/jeasyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css"
          href="/static/static-easyui/plugin/jeasyui/themes/icon.css">
    <link rel="stylesheet" type="text/css"
          href="/static/static-easyui/css/idea.css">
    <link rel="stylesheet" type="text/css"
          href="/static/static-easyui/plugin/mdeditor/css/editormd.min.css">
    <link rel="stylesheet" type="text/css"
          href="/static/static-easyui/css/customAdmin.css">


    <script type="text/javascript"
            src="/static/static-easyui/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript"
            src="/static/static-easyui/js/jquery.form.min.js"></script>
    <script type="text/javascript"
            src="/static/static-easyui/plugin/jeasyui/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="/static/static-easyui/plugin/jeasyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript"
            src="/static/static-easyui/plugin/mdeditor/editormd.min.js"></script>
    <script type="text/javascript">
        function topicAudit(state) {
            var id = ${ids1};
            $.messager.confirm("系统提示", "您确定要审核这个题目吗？", function (r) {
                if (r) {
                    // $.post("/student/topic/chosen/"+id , {}, function (result) {
                    //     if (result == "success") {
                    //         $("#topic_status").datagrid("reload");
                    //     } else {
                    //         $.messager.alert("系统提示", "选题失败！");
                    //     }
                    // });
                    $("#topic_content_foraudit_form").ajaxSubmit({
                        type: "post",
                        url: "/admin/topic/audit1/" + id + "/" +state,
                        contentType: false,
                        processData: false,
                        success: function (result) {
                            if (result == "success") {
                                alert("审核成功!");

                            } else {
                                alert("审核失败!");
                            }
                        }
                    })
                }
            });


        }

    </script>
</head>
<body>
<form id="topic_content_foraudit_form">
    <a href="javascript:history.back(-1)" class="easyui-linkbutton">返回上一页</a>
    <div>题目标题：${topic.topicTitle}</div>
    <div>所属课程：${topic.topicCourse}</div>
    <div>所属学期：${topic.topicSemester}</div>
    <div>题目类别：${topic.topicType}</div>
    <div>题目来源：${topic.topicSource}</div>
    <div>整合课程：${topic.topicIntegratedCurriculum}</div>
    <div>题目内容：${topic.topicContent}</div>
    <div>题目要求：${topic.topicRequirements}</div>
    <div>主要难点：${topic.topicMainDifficulties}</div>
    <div id="topic_status">题目状态：${topic.topicStatus}</div>
    <a href="javascript:topicAudit('Audit')" class="easyui-linkbutton">审核通过</a>
    <a href="javascript:topicAudit('UnPass')" class="easyui-linkbutton">审核不通过</a>
    <input type="hidden" id="id" name="id"/>


</form>


</body>
</html>
