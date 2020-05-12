$(function () {
    //获取浏览器当前窗口可视区域高度
    var windowHeight = $(window).height();
    //设置图片高度
    $("#background").height(windowHeight);
    //加载layuiForm组件
    layui.use('form', function(){
        var form = layui.form;
        //监听提交
        form.on('submit(formDemo)', function(data){
            //layer.msg(JSON.stringify(data.field));
            var field = data.field;
            var name = field.name;
            var relationship = field.relationship;
            var password = field.password;
            var loveDate = $("#loveDate").val();
            if (name=='陈思' && relationship==3 && password=='152039' && loveDate=='2015-01-06'){
                window.location.href="http://localhost:8088/CarouselImage.form";
                return false;
                //location.replace("http://localhost:8088/CarouselImage.form");
            } else {
                layer.msg('傻瓜！输入信息不匹配，你不是我的小宝贝，滚~');
                return false;
            }
        });
        //各种基于事件的操作，下面会有进一步介绍
    });
    //加载layui日期组件
    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#loveDate' //指定元素
            ,type: 'date'
        });
    });
})