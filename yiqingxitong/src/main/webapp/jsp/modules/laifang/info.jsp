<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <%@ include file="../../static/head.jsp" %>
    <link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css"
          rel="stylesheet">
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
                    <ul class="navbar-nav mr-auto" id="navUl">

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
                        <li class="breadcrumb-item active">来访登记登记</li>
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
                            <!-- 级联表所有字段 -->

                                        <div class="form-group col-md-6">
                                            <label>住户编号</label>
                                            <input id="zhuhuDanhaoNumber" name="zhuhuDanhaoNumber" class="form-control"
                                                   v-model="ruleForm.zhuhuDanhaoNumber" readonly>
                                        </div>


                                        <div class="form-group col-md-6">
                                            <label>住户姓名</label>
                                            <input id="zhuhuName" name="zhuhuName" class="form-control"
                                                   v-model="ruleForm.zhuhuName" readonly>
                                        </div>


                                        <div class="form-group col-md-6">
                                            <label>住户手机号</label>
                                            <input id="zhuhuPhone" name="zhuhuPhone" class="form-control"
                                                   v-model="ruleForm.zhuhuPhone" readonly>
                                        </div>


                                        <div class="form-group col-md-6">
                                            <label>住户身份证号</label>
                                            <input id="zhuhuIdNumber" name="zhuhuIdNumber" class="form-control"
                                                   v-model="ruleForm.zhuhuIdNumber" readonly>
                                        </div>


                                        <div class="form-group col-md-6">
                                            <label>现住地址</label>
                                            <input id="zhuhuAddress" name="zhuhuAddress" class="form-control"
                                                   v-model="ruleForm.zhuhuAddress" readonly>
                                        </div>


                                    <div class="form-group col-md-6">
                                        <label>住户照片</label>
                                        <img id="zhuhuPhotoImg" width="100" height="100">
                                    </div>

                                        <div class="form-group col-md-6">
                                            <label>年龄</label>
                                            <input id="zhuhuAge" name="zhuhuAge" class="form-control"
                                                   v-model="ruleForm.zhuhuAge" readonly>
                                        </div>


                                    <div class="form-group col-md-6">
                                        <label>是否注射疫苗</label>
                                        <input id="zhuhuYimiaoValue" name="zhuhuYimiaoValue" class="form-control"
                                               v-model="ruleForm.zhuhuYimiaoValue" readonly>
                                    </div>


                                        <div class="form-group col-md-6">
                                            <label>来源地</label>
                                            <input id="zhuhuLaiyuandi" name="zhuhuLaiyuandi" class="form-control"
                                                   v-model="ruleForm.zhuhuLaiyuandi" readonly>
                                        </div>


                                    <div class="form-group col-md-6">
                                        <label>是否有7日内核酸证明</label>
                                        <input id="zhuhuHesuanValue" name="zhuhuHesuanValue" class="form-control"
                                               v-model="ruleForm.zhuhuHesuanValue" readonly>
                                    </div>


                                        <div class="form-group col-md-6">
                                            <label>行程轨迹</label>
                                            <input id="zhuhuXingcheng" name="zhuhuXingcheng" class="form-control"
                                                   v-model="ruleForm.zhuhuXingcheng" readonly>
                                        </div>


                                    <div>
                                        <label>备注</label>
                                        <script id="zhuhuContentEditor" type="text/plain"
                                                style="width:800px;height:230px;"></script>
                                        <script type = "text/javascript" >
                                        //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
                                        //相见文档配置属于你自己的编译器
                                        var zhuhuContentUe = UE.getEditor('zhuhuContentEditor', {
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
                                        <input type="hidden" name="zhuhuContent" id="zhuhuContent-input">
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>类型</label>
                                        <input id="zhuhuValue" name="zhuhuValue" class="form-control"
                                               v-model="ruleForm.zhuhuValue" readonly>
                                    </div>


                                        <div class="form-group col-md-6">
                                            <label>入住时间</label>
                                            <input id="zhuhuTime" name="zhuhuTime" class="form-control"
                                                   v-model="ruleForm.zhuhuTime" readonly>
                                        </div>

                            <!-- 本表所有字段 -->



                                    <input id="updateId" name="id" type="hidden">
                                <input id="zhuhuId" name="zhuhuId" v-model="ruleForm.zhuhuId" readonly type="hidden">

                                    <div class="form-group col-md-6">
                                        <label>姓名</label>
                                        <input id="laifangName" name="laifangName" class="form-control"
                                               v-model="ruleForm.laifangName" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>手机号</label>
                                        <input id="laifangPhone" name="laifangPhone" class="form-control"
                                               v-model="ruleForm.laifangPhone" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>身份证号</label>
                                        <input id="laifangIdNumber" name="laifangIdNumber" class="form-control"
                                               v-model="ruleForm.laifangIdNumber" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>体温</label>
                                        <input id="tiwen" name="tiwen" class="form-control"
                                               v-model="ruleForm.tiwen" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>来访事由</label>
                                        <input id="laifangShiyou" name="laifangShiyou" class="form-control"
                                               v-model="ruleForm.laifangShiyou" readonly>
                                    </div>


                                <div>
                                    <label>备注</label>
                                    <script id="laifangContentEditor" type="text/plain"
                                            style="width:800px;height:230px;"></script>
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


                                    <div class="form-group col-md-6">
                                        <label>来访时间</label>
                                        <input id="insertTime" name="insertTime" class="form-control"
                                               v-model="ruleForm.insertTime" readonly>
                                    </div>

                                <div class="form-group col-md-12 mb-3">
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
<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>

<script>
    <%@ include file="../../utils/menu.jsp"%>
            <%@ include file="../../static/setMenu.js"%>
            <%@ include file="../../utils/baseUrl.jsp"%>

    var tableName = "laifang";
    var pageType = "add-or-update";
    var updateId = "";


    var ruleForm = {};
    var vm = new Vue({
        el: '#addOrUpdateForm',
        data: {
            ruleForm: {},
        },
        beforeCreate: function () {
            var id = window.sessionStorage.getItem("updateId");
            if (id != null && id != "" && id != "null") {
                $.ajax({
                    type: "GET",
                    url: baseUrl + "laifang/info/" + id,
                    beforeSend: function (xhr) {
                        xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));
                    },
                    success: function (res) {
                        if (res.code == 0) {
                            vm.ruleForm = res.data;
                            ruleForm = res.data;
                            showImg();
                            setContent();
                        } else if (res.code == 401) {
                        <%@ include file="../../static/toLogin.jsp"%>
                        } else {
                            alert(res.msg)
                        }
                    },
                });
            }
        },
        methods: {}
    });


    // 填充富文本框
    function setContent() {

        if (ruleForm.zhuhuContent != null && ruleForm.zhuhuContent != 'null' && ruleForm.zhuhuContent != '') {
            var zhuhuContentUeditor = UE.getEditor('zhuhuContentEditor');
                zhuhuContentUeditor.ready(function () {
                    var mes = '';
                    if(ruleForm.zhuhuContent != null){
                        mes = ''+ ruleForm.zhuhuContent;
                        mes = mes.replace(/\n/g, "<br>");
                    }
                    zhuhuContentUeditor.setContent(mes);
                    zhuhuContentUeditor.setDisabled('fullscreen');
            });
        }
        if (ruleForm.laifangContent != null && ruleForm.laifangContent != 'null' && ruleForm.laifangContent != '') {
            var laifangContentUeditor = UE.getEditor('laifangContentEditor');
                laifangContentUeditor.ready(function () {
                    var mes = '' + ruleForm.laifangContent;
                    laifangContentUeditor.setContent(mes);
                    laifangContentUeditor.setDisabled('fullscreen');
            });
        }
    }


    //图片显示
    function showImg() {
        $("#zhuhuPhotoImg").attr("src", ruleForm.zhuhuPhoto);
    }

    function exit() {
        window.sessionStorage.removeItem("updateId");
        window.sessionStorage.removeItem('addlaifang');
        window.location.href = "list.jsp";
    }

    // 下载
    function download(fileName) {
        var url = baseUrl+'file/download?fileName='+fileName;
        window.open(url);
    }

    //设置下载
    function setDownloadBtn() {

    }

    $(document).ready(function () {
        //设置右上角用户名
        $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
        //设置项目名
        $('.sidebar-header h3 a').html(projectName)
        setMenu();
        $('#exitBtn').on('click', function (e) {
            e.preventDefault();
            exit();
        });


    <%@ include file="../../static/myInfo.js"%>
    });
    // 用户登出
    <%@ include file="../../static/logout.jsp"%>
</script>
</body>

</html>