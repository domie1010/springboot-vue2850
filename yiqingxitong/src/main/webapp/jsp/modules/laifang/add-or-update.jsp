<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <%@ include file="../../static/head.jsp" %>
    <link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css"
          rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap-select.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" charset="utf-8">
        window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
    </script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<style>
    .error {
        color: red;
    }
</style>
<body>
<!-- Pre Loader -->
<div class="loading">
    <div class="spinner">
        <div class="double-bounce1"></div>
        <div class="double-bounce2"></div>
    </div>
</div>
<!--/Pre Loader -->
<div class="wrapper">
    <!-- Page Content -->
    <div id="content">
        <!-- Top Navigation -->
        <%@ include file="../../static/topNav.jsp" %>
        <!-- Menu -->
        <div class="container menu-nav">
            <nav class="navbar navbar-expand-lg lochana-bg text-white">
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="ti-menu text-white"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul id="navUl" class="navbar-nav mr-auto">

                    </ul>
                </div>
            </nav>
        </div>
        <!-- /Menu -->
        <!-- Breadcrumb -->
        <!-- Page Title -->
        <div class="container mt-0">
            <div class="row breadcrumb-bar">
                <div class="col-md-6">
                    <h3 class="block-title">编辑来访登记</h3>
                </div>
                <div class="col-md-6">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="${pageContext.request.contextPath}/index.jsp">
                                <span class="ti-home"></span>
                            </a>
                        </li>
                        <li class="breadcrumb-item">来访登记管理</li>
                        <li class="breadcrumb-item active">编辑来访登记</li>
                    </ol>
                </div>
            </div>
        </div>
        <!-- /Page Title -->

        <!-- /Breadcrumb -->
        <!-- Main Content -->
        <div class="container">

            <div class="row">
                <!-- Widget Item -->
                <div class="col-md-12">
                    <div class="widget-area-2 lochana-box-shadow">
                        <h3 class="widget-title">来访登记信息</h3>
                        <form id="addOrUpdateForm">
                            <div class="form-row">
                            <!-- 级联表的字段 -->
                                    <div class="form-group col-md-6 aaaaaa zhuhu">
                                        <label>住户</label>
                                        <div>
                                            <select id="zhuhuSelect" name="zhuhuSelect"
                                                    class="selectpicker form-control"  data-live-search="true"
                                                    title="请选择" data-header="请选择" data-size="5" data-width="650px">
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>住户编号</label>
                                        <input id="zhuhuDanhaoNumber" name="zhuhuDanhaoNumber" class="form-control"
                                               placeholder="住户编号" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>住户姓名</label>
                                        <input id="zhuhuName" name="zhuhuName" class="form-control"
                                               placeholder="住户姓名" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>住户手机号</label>
                                        <input id="zhuhuPhone" name="zhuhuPhone" class="form-control"
                                               placeholder="住户手机号" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>住户身份证号</label>
                                        <input id="zhuhuIdNumber" name="zhuhuIdNumber" class="form-control"
                                               placeholder="住户身份证号" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>现住地址</label>
                                        <input id="zhuhuAddress" name="zhuhuAddress" class="form-control"
                                               placeholder="现住地址" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>住户照片</label>
                                        <img id="zhuhuPhotoImg" src="" width="100" height="100">
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>年龄</label>
                                        <input id="zhuhuAge" name="zhuhuAge" class="form-control"
                                               placeholder="年龄" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>是否注射疫苗</label>
                                        <input id="zhuhuYimiaoValue" name="zhuhuYimiaoValue" class="form-control"
                                               placeholder="是否注射疫苗" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>来源地</label>
                                        <input id="zhuhuLaiyuandi" name="zhuhuLaiyuandi" class="form-control"
                                               placeholder="来源地" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>是否有7日内核酸证明</label>
                                        <input id="zhuhuHesuanValue" name="zhuhuHesuanValue" class="form-control"
                                               placeholder="是否有7日内核酸证明" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>行程轨迹</label>
                                        <input id="zhuhuXingcheng" name="zhuhuXingcheng" class="form-control"
                                               placeholder="行程轨迹" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>类型</label>
                                        <input id="zhuhuValue" name="zhuhuValue" class="form-control"
                                               placeholder="类型" readonly>
                                    </div>
                                    <div class="form-group col-md-6 zhuhu">
                                        <label>入住时间</label>
                                        <input id="zhuhuTime" name="zhuhuTime" class="form-control"
                                               placeholder="入住时间" readonly>
                                    </div>
                            <!-- 当前表的字段 -->
                                    <input id="updateId" name="id" type="hidden">
                                <input id="zhuhuId" name="zhuhuId" type="hidden">
                                    <div class="form-group col-md-6">
                                        <label>姓名</label>
                                        <input id="laifangName" name="laifangName" class="form-control"
                                               placeholder="姓名">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>手机号</label>
                                        <input id="laifangPhone" name="laifangPhone" class="form-control"
                                               onchange="laifangPhoneChickValue(this)"  placeholder="手机号">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>身份证号</label>
                                        <input id="laifangIdNumber" name="laifangIdNumber" class="form-control"
                                               onchange="laifangIdNumberChickValue(this)"  placeholder="身份证号">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>体温</label>
                                        <input id="tiwen" name="tiwen" class="form-control"
                                               onchange="tiwenChickValue(this)" placeholder="体温">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>来访事由</label>
                                        <input id="laifangShiyou" name="laifangShiyou" class="form-control"
                                               placeholder="来访事由">
                                    </div>
                                    <div class="form-group  col-md-6">
                                        <label>备注</label>
                                        <input id="laifangContentupload" name="file" type="file">
                                        <script id="laifangContentEditor" type="text/plain"
                                                style="width:100%;height:230px;"></script>
                                        <script type = "text/javascript" >
                                        //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
                                        //相见文档配置属于你自己的编译器
                                        var laifangContentUe = UE.getEditor('laifangContentEditor', {
                                            toolbars: [
                                                [
                                                    'undo', //撤销
                                                    'bold', //加粗
                                                    'redo', //重做
                                                    'underline', //下划线
                                                    'horizontal', //分隔线
                                                    'inserttitle', //插入标题
                                                    'cleardoc', //清空文档
                                                    'fontfamily', //字体
                                                    'fontsize', //字号
                                                    'paragraph', //段落格式
                                                    'inserttable', //插入表格
                                                    'justifyleft', //居左对齐
                                                    'justifyright', //居右对齐
                                                    'justifycenter', //居中对
                                                    'justifyjustify', //两端对齐
                                                    'forecolor', //字体颜色
                                                    'fullscreen', //全屏
                                                    'edittip ', //编辑提示
                                                    'customstyle', //自定义标题
                                                ]
                                            ]
                                        });
                                        </script>
                                        <input type="hidden" name="laifangContent" id="laifangContent-input">
                                    </div>
                                    <div class="form-group col-md-12 mb-3">
                                        <button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
                                        <button id="exitBtn" type="button" class="btn btn-primary btn-lg">返回</button>
                                    </div>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /Widget Item -->
            </div>
        </div>
        <!-- /Main Content -->
    </div>
    <!-- /Page Content -->
</div>
<!-- Back to Top -->
<a id="back-to-top" href="#" class="back-to-top">
    <span class="ti-angle-up"></span>
</a>
<!-- /Back to Top -->
<%@ include file="../../static/foot.jsp" %>
<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" charset="utf-8"
                 src="${pageContext.request.contextPath}/resources/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/laydate.js"></script>
<script>
    <%@ include file="../../utils/menu.jsp"%>
    <%@ include file="../../static/setMenu.js"%>
    <%@ include file="../../utils/baseUrl.jsp"%>

    var tableName = "laifang";
    var pageType = "add-or-update";
    var updateId = "";
    var crossTableId = -1;
    var crossTableName = '';
    var ruleForm = {};
    var crossRuleForm = {};


    // 下拉框数组
        <!-- 当前表的下拉框数组 -->
        <!-- 级联表的下拉框数组 -->
    var zhuhuOptions = [];

    var ruleForm = {};


    // 文件上传
    function upload() {

        <!-- 当前表的文件上传 -->

        $('#laifangContentupload').fileupload({
            url: baseUrl + 'file/upload',
            headers: {token: window.sessionStorage.getItem("token")},
            dataType: 'json',
            done: function (e, data) {
                UE.getEditor('laifangContentEditor').execCommand('insertHtml', '<img src=\"' + baseUrl + 'upload/' + data.result.file + '\" width=900 height=560>');
            }
        });


    }

    // 表单提交
    function submit() {
        if (validform() == true && compare() == true) {
            let data = {};
            getContent();
            if(window.sessionStorage.getItem('role') != '住户'){//当前登录用户不为这个
                if($("#zhuhuId") !=null){
                    var zhuhuId = $("#zhuhuId").val();
                    if(zhuhuId == null || zhuhuId =='' || zhuhuId == 'null'){
                        alert("被访者不能为空");
                        return;
                    }
                }
            }
            let value = $('#addOrUpdateForm').serializeArray();
            $.each(value, function (index, item) {
                data[item.name] = item.value;
            });
            let json = JSON.stringify(data);
            var urlParam;
            var successMes = '';
            if (updateId != null && updateId != "null" && updateId != '') {
                urlParam = 'update';
                successMes = '修改成功';
            } else {
                urlParam = 'save';
                    successMes = '添加成功';

            }
            httpJson("laifang/" + urlParam, "POST", data, (res) => {
                if(res.code == 0){
                    window.sessionStorage.removeItem('addlaifang');
                    window.sessionStorage.removeItem('updateId');
                    let flag = true;
                    if (flag) {
                        alert(successMes);
                    }
                    if (window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true") {
                        window.sessionStorage.removeItem('onlyme');
                        window.sessionStorage.setItem("reload","reload");
                        window.parent.location.href = "${pageContext.request.contextPath}/index.jsp";
                    } else {
                        window.location.href = "list.jsp";
                    }
                }
            });
        } else {
            alert("表单未填完整或有错误");
        }
    }

    // 查询列表
        <!-- 查询当前表的所有列表 -->
        <!-- 查询级联表的所有列表 -->
        function zhuhuSelect() {
            //填充下拉框选项
            http("zhuhu/page?page=1&limit=100&sort=&order=", "GET", {}, (res) => {
                if(res.code == 0){
                    zhuhuOptions = res.data.list;
                }
            });
        }

        function zhuhuSelectOne(id) {
            http("zhuhu/info/"+id, "GET", {}, (res) => {
                if(res.code == 0){
                ruleForm = res.data;
                zhuhuShowImg();
                zhuhuShowVideo();
                zhuhuDataBind();
            }
        });
        }



    // 初始化下拉框
    <!-- 初始化当前表的下拉框 -->

        function initializationzhuhuSelect() {
            var zhuhuSelect = document.getElementById('zhuhuSelect');
            if(zhuhuSelect != null && zhuhuOptions != null  && zhuhuOptions.length > 0 ) {
                for (var i = 0; i < zhuhuOptions.length; i++) {
                        zhuhuSelect.add(new Option(zhuhuOptions[i].zhuhuName, zhuhuOptions[i].id));
                }

                $("#zhuhuSelect").change(function(e) {
                        zhuhuSelectOne(e.target.value);
                });
            }

        }



    // 下拉框选项回显
    function setSelectOption() {

        <!-- 当前表的下拉框回显 -->
        <!--  级联表的下拉框回显  -->
            var zhuhuSelect = document.getElementById("zhuhuSelect");
            if(zhuhuSelect != null && zhuhuOptions != null  && zhuhuOptions.length > 0 ) {
                for (var i = 0; i < zhuhuOptions.length; i++) {
                    if (zhuhuOptions[i].id == ruleForm.zhuhuId) {//下拉框value对比,如果一致就赋值汉字
                        zhuhuSelect.options[i+1].selected = true;
                        $("#zhuhuSelect" ).selectpicker('refresh');
                    }
                }
            }
    }


    // 填充富文本框
    function setContent() {

        <!-- 当前表的填充富文本框 -->
        if (ruleForm.laifangContent != null && ruleForm.laifangContent != 'null' && ruleForm.laifangContent != '' && $("#laifangContentupload").length>0) {

            var laifangContentUeditor = UE.getEditor('laifangContentEditor');
            laifangContentUeditor.ready(function () {
                var mes = '';
                if(ruleForm.laifangContent != null){
                    mes = ''+ ruleForm.laifangContent;
                    mes = mes.replace(/\n/g, "<br>");
                }
                laifangContentUeditor.setContent(mes);
            });
        }
    }
    // 获取富文本框内容
    function getContent() {

        <!-- 获取当前表的富文本框内容 -->
        if($("#laifangContentupload").length>0) {
            var laifangContentEditor = UE.getEditor('laifangContentEditor');
            if (laifangContentEditor.hasContents()) {
                $('#laifangContent-input').attr('value', laifangContentEditor.getPlainTxt());
            }
        }
    }
    //数字检查
        <!-- 当前表的数字检查 -->
        function laifangPhoneChickValue(e){
            var this_val = e.value || 0;
            var reg=/^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/;
            if(!reg.test(this_val)){
                e.value = "";
                alert("手机号不正确");
                return false;
            }
        }
        function laifangIdNumberChickValue(e){
            var this_val = e.value || 0;
            var reg=/^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
            if(!reg.test(this_val)){
                e.value = "";
                alert("身份证号不正确");
                return false;
            }
        }


        function tiwenChickValue(e){
            var this_val = e.value || 0;
            var reg=/^[0-9]{0,6}(\.[0-9]{1,2})?$/;
            if(!reg.test(this_val)){
                e.value = "";
                alert("只允许输入整数6位,小数2位的数字");
                return false;
            }
        }

    function exit() {
        window.sessionStorage.removeItem("updateId");
        window.sessionStorage.removeItem('addlaifang');
        window.location.href = "list.jsp";
    }
    // 表单校验
    function validform() {
        return $("#addOrUpdateForm").validate({
            rules: {
                zhuhuId: "required",
                laifangName: "required",
                laifangPhone: "required",
                laifangIdNumber: "required",
                tiwen: "required",
                laifangShiyou: "required",
                laifangContent: "required",
                insertTime: "required",
            },
            messages: {
                zhuhuId: "被访者不能为空",
                laifangName: "姓名不能为空",
                laifangPhone: "手机号不能为空",
                laifangIdNumber: "身份证号不能为空",
                tiwen: "体温不能为空",
                laifangShiyou: "来访事由不能为空",
                laifangContent: "备注不能为空",
                insertTime: "来访时间不能为空",
            }
        }).form();
    }

    // 获取当前详情
    function getDetails() {
        var addlaifang = window.sessionStorage.getItem("addlaifang");
        if (addlaifang != null && addlaifang != "" && addlaifang != "null") {
            //注册表单验证
            $(validform());
            $('#submitBtn').text('新增');

        } else {
            $('#submitBtn').text('修改');
            var userId = window.sessionStorage.getItem('userId');
            updateId = userId;//先赋值登录用户id
            var uId  = window.sessionStorage.getItem('updateId');//获取修改传过来的id
            if (uId != null && uId != "" && uId != "null") {
                //如果修改id不为空就赋值修改id
                updateId = uId;
            }
            window.sessionStorage.removeItem('updateId');
            http("laifang/info/" + updateId, "GET", {}, (res) => {
                if(res.code == 0)
                {
                    ruleForm = res.data
                    // 是/否下拉框回显
                    setSelectOption();
                    // 设置图片src
                    showImg();
                    // 设置视频src
                    showVideo();
                    // 数据填充
                    dataBind();
                    // 富文本框回显
                    setContent();
                    //注册表单验证
                    $(validform());
                }

            });
        }
    }

    // 清除可能会重复渲染的selection
    function clear(className) {
        var elements = document.getElementsByClassName(className);
        for (var i = elements.length - 1; i >= 0; i--) {
            elements[i].parentNode.removeChild(elements[i]);
        }
    }

    function dateTimePick() {
            laydate.render({
                elem: '#insertTime-input'
                ,type: 'datetime'
            });
    }


    function dataBind() {


    <!--  级联表的数据回显  -->
        zhuhuDataBind();


    <!--  当前表的数据回显  -->
        $("#updateId").val(ruleForm.id);
        $("#zhuhuId").val(ruleForm.zhuhuId);
        $("#laifangName").val(ruleForm.laifangName);
        $("#laifangPhone").val(ruleForm.laifangPhone);
        $("#laifangIdNumber").val(ruleForm.laifangIdNumber);
        $("#tiwen").val(ruleForm.tiwen);
        $("#laifangShiyou").val(ruleForm.laifangShiyou);
        $("#laifangContent").val(ruleForm.laifangContent);
        $("#insertTime-input").val(ruleForm.insertTime);

    }
    <!--  级联表的数据回显  -->
    function zhuhuDataBind(){

                    <!-- 把id赋值给当前表的id-->
        $("#zhuhuId").val(ruleForm.id);

        $("#zhuhuDanhaoNumber").val(ruleForm.zhuhuDanhaoNumber);
        $("#zhuhuName").val(ruleForm.zhuhuName);
        $("#zhuhuPhone").val(ruleForm.zhuhuPhone);
        $("#zhuhuIdNumber").val(ruleForm.zhuhuIdNumber);
        $("#zhuhuAddress").val(ruleForm.zhuhuAddress);
        $("#zhuhuAge").val(ruleForm.zhuhuAge);
        $("#zhuhuYimiaoValue").val(ruleForm.zhuhuYimiaoValue);
        $("#zhuhuLaiyuandi").val(ruleForm.zhuhuLaiyuandi);
        $("#zhuhuHesuanValue").val(ruleForm.zhuhuHesuanValue);
        $("#zhuhuXingcheng").val(ruleForm.zhuhuXingcheng);
        $("#zhuhuContent").val(ruleForm.zhuhuContent);
        $("#zhuhuValue").val(ruleForm.zhuhuValue);
        $("#zhuhuTime").val(ruleForm.zhuhuTime);
        $("#insertTime").val(ruleForm.insertTime);
    }


    //图片显示
    function showImg() {
        <!--  当前表的图片  -->

        <!--  级联表的图片  -->
        zhuhuShowImg();
    }


    <!--  级联表的图片  -->

    function zhuhuShowImg() {
        $("#zhuhuPhotoImg").attr("src",ruleForm.zhuhuPhoto);
    }



    //视频回显
    function showVideo() {
    <!--  当前表的视频  -->

    <!--  级联表的视频  -->
        zhuhuShowVideo();
    }


    <!--  级联表的视频  -->

    function zhuhuShowVideo() {
        $("#zhuhuPhotoV").attr("src",ruleForm.zhuhuPhoto);
    }



    $(document).ready(function () {
        //设置右上角用户名
        $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
        //设置项目名
        $('.sidebar-header h3 a').html(projectName)
        //设置导航栏菜单
        setMenu();
        $('#exitBtn').on('click', function (e) {
            e.preventDefault();
            exit();
        });
        //初始化时间插件
        dateTimePick();
        //查询所有下拉框
            <!--  当前表的下拉框  -->
            <!-- 查询级联表的下拉框(用id做option,用名字及其他参数做名字级联修改) -->
            zhuhuSelect();



        // 初始化下拉框
            <!--  初始化当前表的下拉框  -->
            <!--  初始化级联表的下拉框  -->
            initializationzhuhuSelect();

        $(".selectpicker" ).selectpicker('refresh');
        getDetails();
        //初始化上传按钮
        upload();
    <%@ include file="../../static/myInfo.js"%>
                $('#submitBtn').on('click', function (e) {
                    e.preventDefault();
                    //console.log("点击了...提交按钮");
                    submit();
                });
        readonly();
        window.sessionStorage.removeItem('addlaifang');
    });

    function readonly() {
        if (window.sessionStorage.getItem('role') == '管理员') {
            //$('#jifen').attr('readonly', 'readonly');
            //$('#role').attr('style', 'pointer-events: none;');
        }
		else if (window.sessionStorage.getItem('role') == '住户') {
            // $(".aaaaaa").remove();
            $(".zhuhu").remove();//删除当前用户的信息
        }
		else if (window.sessionStorage.getItem('role') == '工作人员') {
            // $(".aaaaaa").remove();
            $(".gongzuo").remove();//删除当前用户的信息
        }
        else{
            // alert("未知情况.......");
            // var replyContentUeditor = UE.getEditor('replyContentEditor');
            // replyContentUeditor.ready(function () {
            //     replyContentUeditor.setDisabled('fullscreen');
            // });
        }
    }

    //比较大小
    function compare() {
        var largerVal = null;
        var smallerVal = null;
        if (largerVal != null && smallerVal != null) {
            if (largerVal <= smallerVal) {
                alert(smallerName + '不能大于等于' + largerName);
                return false;
            }
        }
        return true;
    }


    // 用户登出
    <%@ include file="../../static/logout.jsp"%>
</script>
</body>

</html>