<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cn">


<head>
    <%@ include file="../../static/head.jsp" %>
    <!-- font-awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">


    <link href="${pageContext.request.contextPath}/resources/css/bootstrap-select.css" rel="stylesheet">
    <!-- layui -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/resources/layui/layui.js"></script>
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
                        <h3 class="block-title">隔离监控管理</h3>
                    </div>
                    <div class="col-md-6">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item">
                                <a href="${pageContext.request.contextPath}/index.jsp">
                                    <span class="ti-home"></span>
                                </a>
                            </li>
                            <li class="breadcrumb-item">隔离监控管理</li>
                            <li class="breadcrumb-item active">隔离监控列表</li>
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
                            <h3 class="widget-title">隔离监控列表</h3>
                            <div class="table-responsive mb-3">
                                <div class="col-sm-12">
                                                                                                                                                                                                                                                             
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        身体状况
                                        <div class="layui-input-inline">
                                            <select name="shentiTypesSelectSearch"  style="width: 150px;" id="shentiTypesSelectSearch" class="form-control form-control-sm"
                                                    aria-controls="tableId">
                                            </select>
                                        </div>
                                    </div>
                                                                        
                                                                                                         
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        工作人员编号
                                        <div class="layui-input-inline">
                                            <input type="text" id="gongzuoDanhaoNumberSearch" style="width: 140px;" class="form-control form-control-sm"
                                                   placeholder="工作人员编号" aria-controls="tableId">
                                        </div>
                                    </div>
                                                     
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        工作人员姓名
                                        <div class="layui-input-inline">
                                            <input type="text" id="gongzuoNameSearch" style="width: 140px;" class="form-control form-control-sm"
                                                   placeholder="工作人员姓名" aria-controls="tableId">
                                        </div>
                                    </div>
                                                     
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        工作人员手机号
                                        <div class="layui-input-inline">
                                            <input type="text" id="gongzuoPhoneSearch" style="width: 140px;" class="form-control form-control-sm"
                                                   placeholder="工作人员手机号" aria-controls="tableId">
                                        </div>
                                    </div>
                                                     
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        工作人员身份证号
                                        <div class="layui-input-inline">
                                            <input type="text" id="gongzuoIdNumberSearch" style="width: 140px;" class="form-control form-control-sm"
                                                   placeholder="工作人员身份证号" aria-controls="tableId">
                                        </div>
                                    </div>
                                                                                                                                                             
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        职务
                                        <div class="layui-input-inline">
                                            <select name="zhiwuTypesSelectSearch"  style="width: 150px;" id="zhiwuTypesSelectSearch" class="form-control form-control-sm"
                                                    aria-controls="tableId">
                                            </select>
                                        </div>
                                    </div>
                                                                                                                                                             
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        类型
                                        <div class="layui-input-inline">
                                            <select name="gongzuoTypesSelectSearch"  style="width: 150px;" id="gongzuoTypesSelectSearch" class="form-control form-control-sm"
                                                    aria-controls="tableId">
                                            </select>
                                        </div>
                                    </div>
                                                                                                                                                             
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        住户编号
                                        <div class="layui-input-inline">
                                            <input type="text" id="zhuhuDanhaoNumberSearch" style="width: 140px;" class="form-control form-control-sm"
                                                   placeholder="住户编号" aria-controls="tableId">
                                        </div>
                                    </div>
                                                     
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        住户姓名
                                        <div class="layui-input-inline">
                                            <input type="text" id="zhuhuNameSearch" style="width: 140px;" class="form-control form-control-sm"
                                                   placeholder="住户姓名" aria-controls="tableId">
                                        </div>
                                    </div>
                                                     
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        住户手机号
                                        <div class="layui-input-inline">
                                            <input type="text" id="zhuhuPhoneSearch" style="width: 140px;" class="form-control form-control-sm"
                                                   placeholder="住户手机号" aria-controls="tableId">
                                        </div>
                                    </div>
                                                     
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        住户身份证号
                                        <div class="layui-input-inline">
                                            <input type="text" id="zhuhuIdNumberSearch" style="width: 140px;" class="form-control form-control-sm"
                                                   placeholder="住户身份证号" aria-controls="tableId">
                                        </div>
                                    </div>
                                                                                                                                                                                                                 
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        是否注射疫苗
                                        <div class="layui-input-inline">
                                            <select name="zhuhuYimiaoTypesSelectSearch"  style="width: 150px;" id="zhuhuYimiaoTypesSelectSearch" class="form-control form-control-sm"
                                                    aria-controls="tableId">
                                            </select>
                                        </div>
                                    </div>
                                                                                                         
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        是否有7日内核酸证明
                                        <div class="layui-input-inline">
                                            <select name="zhuhuHesuanTypesSelectSearch"  style="width: 150px;" id="zhuhuHesuanTypesSelectSearch" class="form-control form-control-sm"
                                                    aria-controls="tableId">
                                            </select>
                                        </div>
                                    </div>
                                                     
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        行程轨迹
                                        <div class="layui-input-inline">
                                            <input type="text" id="zhuhuXingchengSearch" style="width: 140px;" class="form-control form-control-sm"
                                                   placeholder="行程轨迹" aria-controls="tableId">
                                        </div>
                                    </div>
                                                                                                         
                                    <div class="layui-inline" style="margin-bottom: 10px;">
                                        类型
                                        <div class="layui-input-inline">
                                            <select name="zhuhuTypesSelectSearch"  style="width: 150px;" id="zhuhuTypesSelectSearch" class="form-control form-control-sm"
                                                    aria-controls="tableId">
                                            </select>
                                        </div>
                                    </div>
                                                                                                                                                            
                                    <div class="layui-inline" style="margin-left: 30px;margin-bottom: 10px;">
                                        <button onclick="search()" type="button" class="btn btn-primary">查询</button>
                                        <button onclick="add()" type="button" class="btn btn-success 新增">添加</button>
                                        <button onclick="graph()" type="button" class="btn btn-success 报表">报表</button>
                                        <button onclick="exportExcel()" type="button" class="btn btn-success 导出"><i class="fa fa-file-excel-o" aria-hidden="true"></i>导出</button>
                                        <button onclick="deleteMore()" type="button" class="btn btn-danger 删除">批量删除</button>
                                    </div>

                                    <span id="content11" style="color: red;float: right;font-size:24px"></span>
                                </div>
                                <table id="test_table" class="table table-bordered table-striped">
                                    <thead>
                                    <tr>
                                        <th class="no-sort" style="min-width: 35px;">
                                            <div class="custom-control custom-checkbox">
                                                <input class="custom-control-input" type="checkbox" id="select-all"
                                                       onclick="chooseAll()">
                                                <label class="custom-control-label" for="select-all"></label>
                                            </div>
                                        </th>

                                        <th >工作人员编号</th>
                                        <th >工作人员姓名</th>
                                        <th >工作人员手机号</th>
                                        <%--<th >工作人员身份证号</th>--%>
                                        <%--<th >现住地址</th>--%>
                                        <%--<th >工作人员照片</th>--%>
                                        <%--<th >职务</th>--%>
                                        <%--<th >负责区域</th>--%>
                                        <%--<th >备注</th>--%>
                                        <%--<th >类型</th>--%>
                                        <th >住户编号</th>
                                        <th >住户姓名</th>
                                        <th >住户手机号</th>
                                        <%--<th >住户身份证号</th>--%>
                                        <%--<th >现住地址</th>--%>
                                        <%--<th >住户照片</th>--%>
                                        <%--<th >年龄</th>--%>
                                        <%--<th >是否注射疫苗</th>--%>
                                        <%--<th >来源地</th>--%>
                                        <%--<th >是否有7日内核酸证明</th>--%>
                                        <%--<th >行程轨迹</th>--%>
                                        <%--<th >备注</th>--%>
                                        <%--<th >类型</th>--%>
                                        <%--<th >入住时间</th>--%>


                                        <th >隔离开始时间</th>
                                        <th >隔离结束时间</th>
                                        <th >隔离地点</th>
                                        <th >身体状况</th>
                                        <th >备注</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody id="thisTbody">
                                    </tbody>
                                </table>
                                <div class="col-md-6 col-sm-3">
                                    <div class="dataTables_length" id="tableId_length">

                                        <select name="tableId_length" aria-controls="tableId" id="selectPageSize"
                                                onchange="changePageSize()">
                                            <option value="10">10</option>
                                            <option value="25">25</option>
                                            <option value="50">50</option>
                                            <option value="100">100</option>
                                        </select>
                                        条 每页

                                    </div>
                                </div>
                                <nav aria-label="Page navigation example">
                                    <ul class="pagination justify-content-end">
                                        <li class="page-item" id="tableId_previous" onclick="pageNumChange('pre')">
                                            <a class="page-link" href="#" tabindex="-1">上一页</a>
                                        </li>

                                        <li class="page-item" id="tableId_next" onclick="pageNumChange('next')">
                                            <a class="page-link" href="#">下一页</a>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
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
    <script language="javascript" type="text/javascript"
            src="${pageContext.request.contextPath}/resources/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/js/bootstrap-select.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/resources/js/excel/excel-gen.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jszip.min.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/resources/js/FileSaver.js"></script>
    <script>

        <%@ include file="../../utils/menu.jsp"%>
        <%@ include file="../../static/setMenu.js"%>
        <%@ include file="../../utils/baseUrl.jsp"%>
        <%@ include file="../../static/getRoleButtons.js"%>
        <%@ include file="../../static/crossBtnControl.js"%>
        var tableName = "geli";
        var pageType = "list";
        var searchForm = {key: ""};
        var pageIndex = 1;
        var pageSize = 10;
        var totalPage = 0;
        var dataList = [];
        var sortColumn = '';
        var sortOrder = '';
        var ids = [];
        var checkAll = false;

        <!-- 级联表的级联字典表 -->
        var zhiwuTypesOptions = [];
        var gongzuoTypesOptions = [];
        var zhuhuYimiaoTypesOptions = [];
        var zhuhuHesuanTypesOptions = [];
        var zhuhuTypesOptions = [];

        <!-- 本表的级联字段表 -->
        var shentiTypesOptions = [];

        function init() {
            // 满足条件渲染提醒接口
        }

        // 改变每页记录条数
        function changePageSize() {
            var selection = document.getElementById('selectPageSize');
            var index = selection.selectedIndex;
            pageSize = selection.options[index].value;
            getDataList();
        }
        function exportExcel() {
            excel = new ExcelGen({
                "src_id": "test_table",
                "show_header": true
            });
            excel.generate();
        }


        // 查询
        function search() {
            searchForm = {key: ""};

        <!-- 级联表的级联字典表 -->
                                         
                            //工作人员编号
            var gongzuoDanhaoNumberSearchInput = $('#gongzuoDanhaoNumberSearch');
            if( gongzuoDanhaoNumberSearchInput != null){
                if (gongzuoDanhaoNumberSearchInput.val() != null && gongzuoDanhaoNumberSearchInput.val() != '') {
                    searchForm.gongzuoDanhaoNumber = $('#gongzuoDanhaoNumberSearch').val();
                }
            }
                     
                            //工作人员姓名
            var gongzuoNameSearchInput = $('#gongzuoNameSearch');
            if( gongzuoNameSearchInput != null){
                if (gongzuoNameSearchInput.val() != null && gongzuoNameSearchInput.val() != '') {
                    searchForm.gongzuoName = $('#gongzuoNameSearch').val();
                }
            }
                     
                            //工作人员手机号
            var gongzuoPhoneSearchInput = $('#gongzuoPhoneSearch');
            if( gongzuoPhoneSearchInput != null){
                if (gongzuoPhoneSearchInput.val() != null && gongzuoPhoneSearchInput.val() != '') {
                    searchForm.gongzuoPhone = $('#gongzuoPhoneSearch').val();
                }
            }
                     
                            //工作人员身份证号
            var gongzuoIdNumberSearchInput = $('#gongzuoIdNumberSearch');
            if( gongzuoIdNumberSearchInput != null){
                if (gongzuoIdNumberSearchInput.val() != null && gongzuoIdNumberSearchInput.val() != '') {
                    searchForm.gongzuoIdNumber = $('#gongzuoIdNumberSearch').val();
                }
            }
                                                             
            var zhiwuTypesSelectSearchInput = document.getElementById("zhiwuTypesSelectSearch");
            if(zhiwuTypesSelectSearchInput != null){
                var zhiwuTypesIndex = zhiwuTypesSelectSearchInput.selectedIndex;
                if( zhiwuTypesIndex  != 0){
                    searchForm.zhiwuTypes = document.getElementById("zhiwuTypesSelectSearch").options[zhiwuTypesIndex].value;
                }
            }
                                                             
            var gongzuoTypesSelectSearchInput = document.getElementById("gongzuoTypesSelectSearch");
            if(gongzuoTypesSelectSearchInput != null){
                var gongzuoTypesIndex = gongzuoTypesSelectSearchInput.selectedIndex;
                if( gongzuoTypesIndex  != 0){
                    searchForm.gongzuoTypes = document.getElementById("gongzuoTypesSelectSearch").options[gongzuoTypesIndex].value;
                }
            }
                                                             
                            //住户编号
            var zhuhuDanhaoNumberSearchInput = $('#zhuhuDanhaoNumberSearch');
            if( zhuhuDanhaoNumberSearchInput != null){
                if (zhuhuDanhaoNumberSearchInput.val() != null && zhuhuDanhaoNumberSearchInput.val() != '') {
                    searchForm.zhuhuDanhaoNumber = $('#zhuhuDanhaoNumberSearch').val();
                }
            }
                     
                            //住户姓名
            var zhuhuNameSearchInput = $('#zhuhuNameSearch');
            if( zhuhuNameSearchInput != null){
                if (zhuhuNameSearchInput.val() != null && zhuhuNameSearchInput.val() != '') {
                    searchForm.zhuhuName = $('#zhuhuNameSearch').val();
                }
            }
                     
                            //住户手机号
            var zhuhuPhoneSearchInput = $('#zhuhuPhoneSearch');
            if( zhuhuPhoneSearchInput != null){
                if (zhuhuPhoneSearchInput.val() != null && zhuhuPhoneSearchInput.val() != '') {
                    searchForm.zhuhuPhone = $('#zhuhuPhoneSearch').val();
                }
            }
                     
                            //住户身份证号
            var zhuhuIdNumberSearchInput = $('#zhuhuIdNumberSearch');
            if( zhuhuIdNumberSearchInput != null){
                if (zhuhuIdNumberSearchInput.val() != null && zhuhuIdNumberSearchInput.val() != '') {
                    searchForm.zhuhuIdNumber = $('#zhuhuIdNumberSearch').val();
                }
            }
                                                                                 
            var zhuhuYimiaoTypesSelectSearchInput = document.getElementById("zhuhuYimiaoTypesSelectSearch");
            if(zhuhuYimiaoTypesSelectSearchInput != null){
                var zhuhuYimiaoTypesIndex = zhuhuYimiaoTypesSelectSearchInput.selectedIndex;
                if( zhuhuYimiaoTypesIndex  != 0){
                    searchForm.zhuhuYimiaoTypes = document.getElementById("zhuhuYimiaoTypesSelectSearch").options[zhuhuYimiaoTypesIndex].value;
                }
            }
                                         
            var zhuhuHesuanTypesSelectSearchInput = document.getElementById("zhuhuHesuanTypesSelectSearch");
            if(zhuhuHesuanTypesSelectSearchInput != null){
                var zhuhuHesuanTypesIndex = zhuhuHesuanTypesSelectSearchInput.selectedIndex;
                if( zhuhuHesuanTypesIndex  != 0){
                    searchForm.zhuhuHesuanTypes = document.getElementById("zhuhuHesuanTypesSelectSearch").options[zhuhuHesuanTypesIndex].value;
                }
            }
                     
                            //行程轨迹
            var zhuhuXingchengSearchInput = $('#zhuhuXingchengSearch');
            if( zhuhuXingchengSearchInput != null){
                if (zhuhuXingchengSearchInput.val() != null && zhuhuXingchengSearchInput.val() != '') {
                    searchForm.zhuhuXingcheng = $('#zhuhuXingchengSearch').val();
                }
            }
                                         
            var zhuhuTypesSelectSearchInput = document.getElementById("zhuhuTypesSelectSearch");
            if(zhuhuTypesSelectSearchInput != null){
                var zhuhuTypesIndex = zhuhuTypesSelectSearchInput.selectedIndex;
                if( zhuhuTypesIndex  != 0){
                    searchForm.zhuhuTypes = document.getElementById("zhuhuTypesSelectSearch").options[zhuhuTypesIndex].value;
                }
            }
                                                                <!-- 本表的查询条件 -->

                             
                //身体状况
            var shentiTypesSelectSearchInput = document.getElementById("shentiTypesSelectSearch");
            if(shentiTypesSelectSearchInput != null){
                var shentiTypesIndex = shentiTypesSelectSearchInput.selectedIndex;
                if( shentiTypesIndex  != 0){
                    searchForm.shentiTypes= document.getElementById("shentiTypesSelectSearch").options[shentiTypesIndex].value;
                }
            }
                    getDataList();
        }

        // 获取数据列表
        function getDataList() {
            http("geli/page", "GET", {
                page: pageIndex,
                limit: pageSize,
                sort: sortColumn,
                order: sortOrder,
                //本表的
                shentiTypes: searchForm.shentiTypes,
            //级联表的
                gongzuoDanhaoNumber: searchForm.gongzuoDanhaoNumber,
                gongzuoName: searchForm.gongzuoName,
                gongzuoPhone: searchForm.gongzuoPhone,
                gongzuoIdNumber: searchForm.gongzuoIdNumber,
                zhiwuTypes: searchForm.zhiwuTypes,
                gongzuoTypes: searchForm.gongzuoTypes,

                zhuhuDanhaoNumber: searchForm.zhuhuDanhaoNumber,
                zhuhuName: searchForm.zhuhuName,
                zhuhuPhone: searchForm.zhuhuPhone,
                zhuhuIdNumber: searchForm.zhuhuIdNumber,
                zhuhuYimiaoTypes: searchForm.zhuhuYimiaoTypes,
                zhuhuHesuanTypes: searchForm.zhuhuHesuanTypes,
                zhuhuXingcheng: searchForm.zhuhuXingcheng,
                zhuhuTypes: searchForm.zhuhuTypes,


            }, (res) => {
                if(res.code == 0) {
                    clear();
                    $("#thisTbody").html("");
                var content="总人数: "+res.data.total+" 今日新增人数: "+res.countTodayNumber;
                document.getElementById('content11').innerText=content;
                    dataList = res.data.list;
                    totalPage = res.data.totalPage;
                    for (var i = 0; i < dataList.length; i++) { //遍历一下表格数据  
                        var trow = setDataRow(dataList[i], i); //定义一个方法,返回tr数据 
                        $('#thisTbody').append(trow);
                    }
                    pagination(); //渲染翻页组件
                    getRoleButtons();// 权限按钮控制
                }
            });
        }

        // 渲染表格数据
        function setDataRow(item, number) {
            //创建行 
            var row = document.createElement('tr');
            row.setAttribute('class', 'useOnce');
            //创建勾选框
            var checkbox = document.createElement('td');
            var checkboxDiv = document.createElement('div');
            checkboxDiv.setAttribute("class", "custom-control custom-checkbox");
            var checkboxInput = document.createElement('input');
            checkboxInput.setAttribute("class", "custom-control-input");
            checkboxInput.setAttribute("type", "checkbox");
            checkboxInput.setAttribute('name', 'chk');
            checkboxInput.setAttribute('value', item.id);
            checkboxInput.setAttribute("id", number);
            checkboxDiv.appendChild(checkboxInput);
            var checkboxLabel = document.createElement('label');
            checkboxLabel.setAttribute("class", "custom-control-label");
            checkboxLabel.setAttribute("for", number);
            checkboxDiv.appendChild(checkboxLabel);
            checkbox.appendChild(checkboxDiv);
            row.appendChild(checkbox)


                    //工作人员编号
            var gongzuoDanhaoNumberCell = document.createElement('td');
            gongzuoDanhaoNumberCell.innerHTML = item.gongzuoDanhaoNumber;
            row.appendChild(gongzuoDanhaoNumberCell);


                    //工作人员姓名
            var gongzuoNameCell = document.createElement('td');
            gongzuoNameCell.innerHTML = item.gongzuoName;
            row.appendChild(gongzuoNameCell);


                    //工作人员手机号
            var gongzuoPhoneCell = document.createElement('td');
            gongzuoPhoneCell.innerHTML = item.gongzuoPhone;
            row.appendChild(gongzuoPhoneCell);


                    //工作人员身份证号
            // var gongzuoIdNumberCell = document.createElement('td');
            // gongzuoIdNumberCell.innerHTML = item.gongzuoIdNumber;
            // row.appendChild(gongzuoIdNumberCell);
            //
            //
            //         //现住地址
            // var gongzuoAddressCell = document.createElement('td');
            // gongzuoAddressCell.innerHTML = item.gongzuoAddress;
            // row.appendChild(gongzuoAddressCell);
            //
            //
            //     //工作人员照片
            // var gongzuoPhotoCell = document.createElement('td');
            // var gongzuoPhotoImg = document.createElement('img');
            // var gongzuoPhotoImgValue = item.gongzuoPhoto;
            // if(gongzuoPhotoImgValue !=null && gongzuoPhotoImgValue !='' && gongzuoPhotoImgValue !='null'){
            //         gongzuoPhotoImg.setAttribute('src', gongzuoPhotoImgValue);
            //         gongzuoPhotoImg.setAttribute('height', 100);
            //         gongzuoPhotoImg.setAttribute('width', 100);
            //         gongzuoPhotoCell.appendChild(gongzuoPhotoImg);
            // }else{
            //         gongzuoPhotoCell.innerHTML = "暂无图片";
            // }
            // row.appendChild(gongzuoPhotoCell);
            //
            //             //职务
            // var zhiwuTypesCell = document.createElement('td');
            // zhiwuTypesCell.innerHTML = item.zhiwuValue;
            // row.appendChild(zhiwuTypesCell);
            //
            //
            //         //负责区域
            // var quyuCell = document.createElement('td');
            // quyuCell.innerHTML = item.quyu;
            // row.appendChild(quyuCell);
            //
            //
            //         //备注
            // var gongzuoContentCell = document.createElement('td');
            // //如果图文详情包含图片
            // if (item.gongzuoContent && item.gongzuoContent.indexOf('img') != -1) {
            //     //暂时只考虑图片+文字 和 文字+图片的情况
            //     var beginIndex = item.gongzuoContent.indexOf('<img');
            //     var endIndex = item.gongzuoContent.indexOf('>');
            //         gongzuoContentCell.innerHTML = item.gongzuoContent.substring(beginIndex, endIndex + 1).replace("img", "img width='100' height='100'");
            // } else {
            //     if (item.gongzuoContent != null && item.gongzuoContent != "" && item.gongzuoContent.length >= 11) {
            //             gongzuoContentCell.innerHTML = item.gongzuoContent.substring(0, 10) + "...";
            //     } else {
            //             gongzuoContentCell.innerHTML = item.gongzuoContent;
            //     }
            // }
            // row.appendChild(gongzuoContentCell);
            //
            //             //类型
            // var gongzuoTypesCell = document.createElement('td');
            // gongzuoTypesCell.innerHTML = item.gongzuoValue;
            // row.appendChild(gongzuoTypesCell);


                    //住户编号
            var zhuhuDanhaoNumberCell = document.createElement('td');
            zhuhuDanhaoNumberCell.innerHTML = item.zhuhuDanhaoNumber;
            row.appendChild(zhuhuDanhaoNumberCell);


                    //住户姓名
            var zhuhuNameCell = document.createElement('td');
            zhuhuNameCell.innerHTML = item.zhuhuName;
            row.appendChild(zhuhuNameCell);


                    //住户手机号
            var zhuhuPhoneCell = document.createElement('td');
            zhuhuPhoneCell.innerHTML = item.zhuhuPhone;
            row.appendChild(zhuhuPhoneCell);


                    //住户身份证号
            // var zhuhuIdNumberCell = document.createElement('td');
            // zhuhuIdNumberCell.innerHTML = item.zhuhuIdNumber;
            // row.appendChild(zhuhuIdNumberCell);
            //
            //
            //         //现住地址
            // var zhuhuAddressCell = document.createElement('td');
            // zhuhuAddressCell.innerHTML = item.zhuhuAddress;
            // row.appendChild(zhuhuAddressCell);
            //
            //
            //     //住户照片
            // var zhuhuPhotoCell = document.createElement('td');
            // var zhuhuPhotoImg = document.createElement('img');
            // var zhuhuPhotoImgValue = item.zhuhuPhoto;
            // if(zhuhuPhotoImgValue !=null && zhuhuPhotoImgValue !='' && zhuhuPhotoImgValue !='null'){
            //         zhuhuPhotoImg.setAttribute('src', zhuhuPhotoImgValue);
            //         zhuhuPhotoImg.setAttribute('height', 100);
            //         zhuhuPhotoImg.setAttribute('width', 100);
            //         zhuhuPhotoCell.appendChild(zhuhuPhotoImg);
            // }else{
            //         zhuhuPhotoCell.innerHTML = "暂无图片";
            // }
            // row.appendChild(zhuhuPhotoCell);
            //
            //             //年龄
            // var zhuhuAgeCell = document.createElement('td');
            // zhuhuAgeCell.innerHTML = item.zhuhuAge;
            // row.appendChild(zhuhuAgeCell);
            //
            //             //是否注射疫苗
            // var zhuhuYimiaoTypesCell = document.createElement('td');
            // zhuhuYimiaoTypesCell.innerHTML = item.zhuhuYimiaoValue;
            // row.appendChild(zhuhuYimiaoTypesCell);
            //
            //
            //         //来源地
            // var zhuhuLaiyuandiCell = document.createElement('td');
            // zhuhuLaiyuandiCell.innerHTML = item.zhuhuLaiyuandi;
            // row.appendChild(zhuhuLaiyuandiCell);
            //
            //             //是否有7日内核酸证明
            // var zhuhuHesuanTypesCell = document.createElement('td');
            // zhuhuHesuanTypesCell.innerHTML = item.zhuhuHesuanValue;
            // row.appendChild(zhuhuHesuanTypesCell);
            //
            //
            //         //行程轨迹
            // var zhuhuXingchengCell = document.createElement('td');
            // zhuhuXingchengCell.innerHTML = item.zhuhuXingcheng;
            // row.appendChild(zhuhuXingchengCell);
            //
            //
            //         //备注
            // var zhuhuContentCell = document.createElement('td');
            // //如果图文详情包含图片
            // if (item.zhuhuContent && item.zhuhuContent.indexOf('img') != -1) {
            //     //暂时只考虑图片+文字 和 文字+图片的情况
            //     var beginIndex = item.zhuhuContent.indexOf('<img');
            //     var endIndex = item.zhuhuContent.indexOf('>');
            //         zhuhuContentCell.innerHTML = item.zhuhuContent.substring(beginIndex, endIndex + 1).replace("img", "img width='100' height='100'");
            // } else {
            //     if (item.zhuhuContent != null && item.zhuhuContent != "" && item.zhuhuContent.length >= 11) {
            //             zhuhuContentCell.innerHTML = item.zhuhuContent.substring(0, 10) + "...";
            //     } else {
            //             zhuhuContentCell.innerHTML = item.zhuhuContent;
            //     }
            // }
            // row.appendChild(zhuhuContentCell);
            //
            //             //类型
            // var zhuhuTypesCell = document.createElement('td');
            // zhuhuTypesCell.innerHTML = item.zhuhuValue;
            // row.appendChild(zhuhuTypesCell);


                    //入住时间
            // var zhuhuTimeCell = document.createElement('td');
            // zhuhuTimeCell.innerHTML = item.zhuhuTime;
            // row.appendChild(zhuhuTimeCell);



            //隔离开始时间
            var geliStartTimeCell = document.createElement('td');
            geliStartTimeCell.innerHTML = item.geliStartTime;
            row.appendChild(geliStartTimeCell);


            //隔离结束时间
            var geliEndTimeCell = document.createElement('td');
            geliEndTimeCell.innerHTML = item.geliEndTime;
            row.appendChild(geliEndTimeCell);


            //隔离地点
            var geliAddressCell = document.createElement('td');
            geliAddressCell.innerHTML = item.geliAddress;
            row.appendChild(geliAddressCell);


            //身体状况
            var shentiTypesCell = document.createElement('td');
            shentiTypesCell.innerHTML = item.shentiValue;
            row.appendChild(shentiTypesCell);


                //备注
            var geliContentCell = document.createElement('td');
            //如果图文详情包含图片
            if (item.geliContent && item.geliContent.indexOf('img') != -1) {
                //暂时只考虑图片+文字 和 文字+图片的情况
                var beginIndex = item.geliContent.indexOf('<img');
                var endIndex = item.geliContent.indexOf('>');
                    geliContentCell.innerHTML = item.geliContent.substring(beginIndex, endIndex + 1).replace("img", "img width='100' height='100'");
            } else {
                if (item.geliContent != null && item.geliContent != "" && item.geliContent.length >= 11) {
                        geliContentCell.innerHTML = item.geliContent.substring(0, 10) + "...";
                } else {
                        geliContentCell.innerHTML = item.geliContent;
                }
            }
            row.appendChild(geliContentCell);



            //每行按钮
            var btnGroup = document.createElement('td');

            //详情按钮
            var detailBtn = document.createElement('button');
            var detailAttr = "detail(" + item.id + ')';
            detailBtn.setAttribute("type", "button");
            detailBtn.setAttribute("class", "btn btn-info btn-sm 查看");
            detailBtn.setAttribute("onclick", detailAttr);
            detailBtn.innerHTML = "查看";
            btnGroup.appendChild(detailBtn);

            //修改按钮
            var editBtn = document.createElement('button');
            var editAttr = 'edit(' + item.id + ')';
            editBtn.setAttribute("type", "button");
            editBtn.setAttribute("class", "btn btn-warning btn-sm 修改");
            editBtn.setAttribute("onclick", editAttr);
            editBtn.innerHTML = "修改";
            btnGroup.appendChild(editBtn);

            //删除按钮
            var deleteBtn = document.createElement('button');
            var deleteAttr = 'remove(' + item.id + ')';
            deleteBtn.setAttribute("type", "button");
            deleteBtn.setAttribute("class", "btn btn-danger btn-sm 删除");
            deleteBtn.setAttribute("onclick", deleteAttr);
            deleteBtn.innerHTML = "删除";
            btnGroup.appendChild(deleteBtn);
            row.appendChild(btnGroup);

            return row;
    }


        // 翻页
        function pageNumChange(val) {
            if (val == 'pre') {
                pageIndex--;
            } else if (val == 'next') {
                pageIndex++;
            } else {
                pageIndex = val;
            }
            getDataList();
        }

        // 下载
        function download(url) {
            window.open(url);
        }
        // 打开新窗口播放媒体
        function mediaPlay(url){
            window.open(url);
        }

        // 渲染翻页组件
        function pagination() {
            var beginIndex = pageIndex;
            var endIndex = pageIndex;
            var point = 4;
            //计算页码
            for (var i = 0; i < 3; i++) {
                if (endIndex == totalPage) {
                    break;
                }
                endIndex++;
                point--;
            }
            for (var i = 0; i < 3; i++) {
                if (beginIndex == 1) {
                    break;
                }
                beginIndex--;
                point--;
            }
            if (point > 0) {
                while (point > 0) {
                    if (endIndex == totalPage) {
                        break;
                    }
                    endIndex++;
                    point--;
                }
                while (point > 0) {
                    if (beginIndex == 1) {
                        break;
                    }
                    beginIndex--;
                    point--
                }
            }
            // 是否显示 前一页 按钮
            if (pageIndex > 1) {
                $('#tableId_previous').show();
            } else {
                $('#tableId_previous').hide();
            }
            // 渲染页码按钮
            for (var i = beginIndex; i <= endIndex; i++) {
                var pageNum = document.createElement('li');
                pageNum.setAttribute('onclick', "pageNumChange(" + i + ")");
                if (pageIndex == i) {
                    pageNum.setAttribute('class', 'paginate_button page-item active useOnce');
                } else {
                    pageNum.setAttribute('class', 'paginate_button page-item useOnce');
                }
                var pageHref = document.createElement('a');
                pageHref.setAttribute('class', 'page-link');
                pageHref.setAttribute('href', '#');
                pageHref.setAttribute('aria-controls', 'tableId');
                pageHref.setAttribute('data-dt-idx', i);
                pageHref.setAttribute('tabindex', 0);
                pageHref.innerHTML = i;
                pageNum.appendChild(pageHref);
                $('#tableId_next').before(pageNum);
            }
            // 是否显示 下一页 按钮
            if (pageIndex < totalPage) {
                $('#tableId_next').show();
                $('#tableId_next a').attr('data-dt-idx', endIndex + 1);
            } else {
                $('#tableId_next').hide();
            }
            var pageNumInfo = "当前第 " + pageIndex + " 页，共 " + totalPage + " 页";
            $('#tableId_info').html(pageNumInfo);
        }

        // 跳转到指定页
        function toThatPage() {
            //var index = document.getElementById('pageIndexInput').value;
            if (index < 0 || index > totalPage) {
                alert('请输入正确的页码');
            } else {
                pageNumChange(index);
            }
        }

        // 全选/全不选
        function chooseAll() {
            checkAll = !checkAll;
            var boxs = document.getElementsByName("chk");
            for (var i = 0; i < boxs.length; i++) {
                boxs[i].checked = checkAll;
            }
        }

        // 批量删除
        function deleteMore() {
            ids = []
            var boxs = document.getElementsByName("chk");
            for (var i = 0; i < boxs.length; i++) {
                if (boxs[i].checked) {
                    ids.push(boxs[i].value)
                }
            }
            if (ids.length == 0) {
                alert('请勾选要删除的记录');
            } else {
                remove(ids);
            }
        }

        // 删除
        function remove(id) {
            var mymessage = confirm("真的要删除吗？");
            if (mymessage == true) {
                var paramArray = [];
                if (id == ids) {
                    paramArray = id;
                } else {
                    paramArray.push(id);
                }
                httpJson("geli/delete", "POST", paramArray, (res) => {
                    if(res.code == 0){
                        getDataList();
                        alert('删除成功');
                    }
                });
            } else {
                alert("已取消操作");
            }
        }

        // 用户登出
        <%@ include file="../../static/logout.jsp"%>

        //修改
        function edit(id) {
            window.sessionStorage.setItem('updateId', id)
            window.location.href = "add-or-update.jsp"
        }

        //清除会重复渲染的节点
        function clear() {
            var elements = document.getElementsByClassName('useOnce');
            for (var i = elements.length - 1; i >= 0; i--) {
                elements[i].parentNode.removeChild(elements[i]);
            }
        }

        //添加
        function add() {
            window.sessionStorage.setItem("addgeli", "addgeli");
            window.location.href = "add-or-update.jsp"
        }

        //报表
        function graph() {
            window.location.href = "graph.jsp"
        }

        // 查看详情
        function detail(id) {
            window.sessionStorage.setItem("updateId", id);
            window.location.href = "info.jsp";
        }

    //填充级联表搜索下拉框
                                         
                     
                     
                     
                                                             
        function zhiwuTypesSelectSearch() {
            var zhiwuTypesSelectSearch = document.getElementById('zhiwuTypesSelectSearch');
            if(zhiwuTypesSelectSearch != null) {
                zhiwuTypesSelectSearch.add(new Option('-请选择-',''));
                if (zhiwuTypesOptions != null && zhiwuTypesOptions.length > 0){
                    for (var i = 0; i < zhiwuTypesOptions.length; i++) {
                            zhiwuTypesSelectSearch.add(new Option(zhiwuTypesOptions[i].indexName, zhiwuTypesOptions[i].codeIndex));
                    }
                }
            }
        }
                                                             
        function gongzuoTypesSelectSearch() {
            var gongzuoTypesSelectSearch = document.getElementById('gongzuoTypesSelectSearch');
            if(gongzuoTypesSelectSearch != null) {
                gongzuoTypesSelectSearch.add(new Option('-请选择-',''));
                if (gongzuoTypesOptions != null && gongzuoTypesOptions.length > 0){
                    for (var i = 0; i < gongzuoTypesOptions.length; i++) {
                            gongzuoTypesSelectSearch.add(new Option(gongzuoTypesOptions[i].indexName, gongzuoTypesOptions[i].codeIndex));
                    }
                }
            }
        }
                                                             
                     
                     
                     
                                                                                 
        function zhuhuYimiaoTypesSelectSearch() {
            var zhuhuYimiaoTypesSelectSearch = document.getElementById('zhuhuYimiaoTypesSelectSearch');
            if(zhuhuYimiaoTypesSelectSearch != null) {
                zhuhuYimiaoTypesSelectSearch.add(new Option('-请选择-',''));
                if (zhuhuYimiaoTypesOptions != null && zhuhuYimiaoTypesOptions.length > 0){
                    for (var i = 0; i < zhuhuYimiaoTypesOptions.length; i++) {
                            zhuhuYimiaoTypesSelectSearch.add(new Option(zhuhuYimiaoTypesOptions[i].indexName, zhuhuYimiaoTypesOptions[i].codeIndex));
                    }
                }
            }
        }
                                         
        function zhuhuHesuanTypesSelectSearch() {
            var zhuhuHesuanTypesSelectSearch = document.getElementById('zhuhuHesuanTypesSelectSearch');
            if(zhuhuHesuanTypesSelectSearch != null) {
                zhuhuHesuanTypesSelectSearch.add(new Option('-请选择-',''));
                if (zhuhuHesuanTypesOptions != null && zhuhuHesuanTypesOptions.length > 0){
                    for (var i = 0; i < zhuhuHesuanTypesOptions.length; i++) {
                            zhuhuHesuanTypesSelectSearch.add(new Option(zhuhuHesuanTypesOptions[i].indexName, zhuhuHesuanTypesOptions[i].codeIndex));
                    }
                }
            }
        }
                     
                                         
        function zhuhuTypesSelectSearch() {
            var zhuhuTypesSelectSearch = document.getElementById('zhuhuTypesSelectSearch');
            if(zhuhuTypesSelectSearch != null) {
                zhuhuTypesSelectSearch.add(new Option('-请选择-',''));
                if (zhuhuTypesOptions != null && zhuhuTypesOptions.length > 0){
                    for (var i = 0; i < zhuhuTypesOptions.length; i++) {
                            zhuhuTypesSelectSearch.add(new Option(zhuhuTypesOptions[i].indexName, zhuhuTypesOptions[i].codeIndex));
                    }
                }
            }
        }
                                                            
    //填充本表搜索下拉框
                             
        function shentiTypesSelectSearch() {
            var shentiTypesSelectSearch = document.getElementById('shentiTypesSelectSearch');
            if(shentiTypesSelectSearch != null) {
                shentiTypesSelectSearch.add(new Option('-请选择-',''));
                if (shentiTypesOptions != null && shentiTypesOptions.length > 0){
                    for (var i = 0; i < shentiTypesOptions.length; i++) {
                            shentiTypesSelectSearch.add(new Option(shentiTypesOptions[i].indexName,shentiTypesOptions[i].codeIndex));
                    }
                }
            }
        }
        
    //查询级联表搜索条件所有列表
            function zhiwuTypesSelect() {
                //填充下拉框选项
                http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhiwu_types", "GET", {}, (res) => {
                    if(res.code == 0){
                        zhiwuTypesOptions = res.data.list;
                    }
                });
            }
            function gongzuoTypesSelect() {
                //填充下拉框选项
                http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=gongzuo_types", "GET", {}, (res) => {
                    if(res.code == 0){
                        gongzuoTypesOptions = res.data.list;
                    }
                });
            }
            function zhuhuYimiaoTypesSelect() {
                //填充下拉框选项
                http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhuhu_yimiao_types", "GET", {}, (res) => {
                    if(res.code == 0){
                        zhuhuYimiaoTypesOptions = res.data.list;
                    }
                });
            }
            function zhuhuHesuanTypesSelect() {
                //填充下拉框选项
                http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhuhu_hesuan_types", "GET", {}, (res) => {
                    if(res.code == 0){
                        zhuhuHesuanTypesOptions = res.data.list;
                    }
                });
            }
            function zhuhuTypesSelect() {
                //填充下拉框选项
                http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhuhu_types", "GET", {}, (res) => {
                    if(res.code == 0){
                        zhuhuTypesOptions = res.data.list;
                    }
                });
            }

    //查询当前表搜索条件所有列表
            function shentiTypesSelect() {
                //填充下拉框选项
                http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=shenti_types", "GET", {}, (res) => {
                    if(res.code == 0){
                        shentiTypesOptions = res.data.list;
                    }
                });
            }










        $(document).ready(function () {
            //激活翻页按钮
            $('#tableId_previous').attr('class', 'paginate_button page-item previous')
            $('#tableId_next').attr('class', 'paginate_button page-item next')
            //隐藏原生搜索框
            $('#tableId_filter').hide()
            //设置右上角用户名
            $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
            //设置项目名
            $('.sidebar-header h3 a').html(projectName)
            setMenu();
            init();

            //查询级联表的搜索下拉框
            zhiwuTypesSelect();
            gongzuoTypesSelect();
            zhuhuYimiaoTypesSelect();
            zhuhuHesuanTypesSelect();
            zhuhuTypesSelect();

            //查询当前表的搜索下拉框
            shentiTypesSelect();
            getDataList();

        //级联表的下拉框赋值
                                                 
                         
                         
                         
                                                                         
            zhiwuTypesSelectSearch();
                                                                         
            gongzuoTypesSelectSearch();
                                                                         
                         
                         
                         
                                                                                                 
            zhuhuYimiaoTypesSelectSearch();
                                                 
            zhuhuHesuanTypesSelectSearch();
                         
                                                 
            zhuhuTypesSelectSearch();
                                                                        
        //当前表的下拉框赋值
                                                                                     
            shentiTypesSelectSearch();
                        
        <%@ include file="../../static/myInfo.js"%>
    });
</script>
</body>

</html>