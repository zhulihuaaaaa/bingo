<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<meta http-equiv="Cache-Control" content="no-transform">

<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">

<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<meta name="apple-mobile-web-app-capable" content="yes">

<meta name="layoutmode" content="standard">

<meta name="apple-mobile-web-app-status-bar-style" content="black">

<meta name="renderer" content="webkit">

<link rel="shortcut icon" href="../../favicon.ico">

<META content="${SingleNews.getNewsTitle() }" name=keywords>

<META content="${SingleNews.getNewsTitle() }" name=description>

<title>比高新能源</title>

<meta name="HandheldFriendly" content="true">

<!-- QQ强制全屏 -->

<meta name="x5-fullscreen" content="true">

<!-- UC强制全屏 -->

<meta name="full-screen" content="yes">

<!-- QQ应用模式 -->

<meta name="x5-page-mode" content="app">

<!-- UC应用模式 -->

<link href="../../templates/default/images/style.css" rel="stylesheet" type="text/css">
<script type=text/javascript>
function fontZoom(size)
{
   document.getElementById('con').style.fontSize=size+'px';
}
</script>
</head>

<body style="background:#f7f5f4;">







<div class="news_content">

<div class="section">



<div class="main_news">

<div class="header-news"><a href="../../"><img src="../../news/html/images/logo.jpg" alt=" 比高新能源"></a></div>

<div class="xq_title">${SingleNews.getNewsTitle() }</div>

<div class="xq_Time">  发稿时间：${SingleNews.getAddTime() }&nbsp;&nbsp;来源：比高新能源&nbsp;&nbsp;文字大小：[<a  href="javascript:fontZoom(20)">大</a>][<a  href="javascript:fontZoom(16)">中</a>][<a   href="javascript:fontZoom(12)">小</a>]</div>


<div class="xq_newscon" id="con"><p style="text-align: center;"><img src="${SingleNews.getPicUrl()}" title="1495700460118203.png" alt="blob.png"/></p><p>${SingleNews.getNewsContent()}</p><p style="text-align: center;"></p></div>




<div class="share" >

<div  class="share_l"></div>

<div class="share_r" >

<!-- JiaThis Button BEGIN -->

<div class="jiathis_style" >

   <span class="jiathis_txt">点击分享：</span>

	<a class="jiathis_button_tsina"></a>
	<!-- <a class="jiathis_button_qzone"></a> -->


	<a class="jiathis_button_tqq"></a>

	<a class="jiathis_button_cqq"></a>
	
	<a class="jiathis_button_douban"></a>
<!-- 	<a class="jiathis_button_weixin"></a>
 -->
	<!-- <a href="http://www.jiathis.com/share" class="jiathis jiathis_txt jtico jtico_jiathis" target="_blank"></a> -->

   

</div>

<script type="text/javascript" src="http://v3.jiathis.com/code/jia.js" charset="utf-8"></script>

<!-- JiaThis Button END -->

</div>



</div>




<div class="clearfix"> </div>
</div>



</div>

<div class="clearfix"> </div>

<div class="news_buttom">





<a title="设为首页" onclick="SetHome(this,window.location)" href="javascript:void(0)">设为首页</a>|<a title="加入收藏" onclick="shoucang(document.title,window.location)" href="javascript:void(0)">加入收藏</a>|<a title="法律声明" href="http://c-snd.com/page/flsm/index.php">法律声明</a>|<a title="建议留言" href="http://c-snd.com/form/suggestions/">建议留言</a>|<a title="我要投稿" href="http://c-snd.com/page/lianluo/index.php">我要投稿</a> 
<p>Copyright © &nbsp;比高新能源&nbsp;&nbsp;<a href="http://www.miitbeian.gov.cn/" target="_blank">备案号：苏ICP备06010136号</a>&nbsp;&nbsp;技术支持：比高新能源</p><div style="width:300px;margin:0 auto; padding:5px 0;">
		 		<a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=32050502000247" style="display:inline-block;text-decoration:none;height:20px;line-height:20px;"><img src="http://www.c-snd.com/templates/default/images/gongan.png" style="float:left;" /><p style="float:left;height:20px;line-height:20px;margin: 0px 0px 0px 5px; color:#939393;">苏公网安备 32050502000247号</p></a>
		 	</div>
<p></p>
<script type="text/javascript"> 
// 设置为主页 
// ztffei collection arrangement
function SetHome(obj,vrl){ 
try{ 
obj.style.behavior='url(#default#homepage)';obj.setHomePage(vrl); 
} 
catch(e){ 
if(window.netscape) { 
try { 
netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect"); 
} 
catch (e) { 
alert("此操作被浏览器拒绝！\n请在浏览器地址栏输入'about:config'并回车\n然后将 [signed.applets.codebase_principal_support]的值设置为'true',双击即可。"); 
} 
var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch); 
prefs.setCharPref('browser.startup.homepage',vrl); 
}else{ 
alert("您的浏览器不支持，请按照下面步骤操作：1.打开浏览器设置。2.点击设置网页。3.输入："+vrl+"点击确定。"); 
} 
} 
} 
// 加入收藏 兼容360和IE6 
function shoucang(sTitle,sURL) 
{ 
try 
{ 
window.external.addFavorite(sURL, sTitle); 
} 
catch (e) 
{ 
try 
{ 
window.sidebar.addPanel(sTitle, sURL, ""); 
} 
catch (e) 
{ 
alert("加入收藏失败，请使用Ctrl+D进行添加"); 
} 
} 
} 
</script>

11















</div>

</div></body></html>
