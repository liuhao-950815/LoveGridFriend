$(function () {
    //获取浏览器当前窗口可视区域高度
    var windowHeight = $(window).height();
    //设置图片高度
    $("#background").height(windowHeight);
    //加载layuiForm组件
    layui.use('form', function(){
        var form = layui.form;

        //各种基于事件的操作，下面会有进一步介绍
    });
    //加载layui日期组件
    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#loveDate' //指定元素
        });
    });
})