onload=function(){
    var arr = document.getElementsByClassName("slide");
    for(var i=0;i<arr.length;i++){
        arr[i].style.left = i*432+"px";
    }
}

function LeftMove(){
    var arr = document.getElementsByClassName("slide");//获取三个子div
    for(var i=0;i<arr.length;i++){
        var left = parseFloat(arr[i].style.left);
        left-=8;
        var width = 432;//图片的宽度
        if(left<=-width){
            left=(arr.length-1)*width;//当图片完全走出显示框，拼接到末尾
            clearInterval(moveId);
        }
        arr[i].style.left = left+"px";

    }
}
moveId=setInterval(LeftMove,30);//设置一个10毫秒定时器，并给自己取名



function divInterval(){
    moveId=setInterval(LeftMove,30);//设置一个10毫秒定时器
}
timeId=setInterval(divInterval,3000);//设置一个3秒的定时器。
