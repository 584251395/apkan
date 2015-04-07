 <%@tag pageEncoding="utf-8"%>
 <script  type="text/javascript">
    var t = null;
    t = setTimeout(time,1000);
    function time()
    {
       clearTimeout(t);
       dt = new Date();
       var year=dt.getFullYear();
       var month=dt.getMonth()+1;
       var day=dt.getDate();
       var h=dt.getHours();
       var m=dt.getMinutes();
       var s=dt.getSeconds();
       $("#timeShow").empty();
       $("#timeShow").append("现在的时间为："+year+"年"+month+"月"+day+"日  "+h+"时"+m+"分"+s+"秒");
       t = setTimeout(time,1000);              
    } ;
  </script>
  <font id="timeShow"></font>