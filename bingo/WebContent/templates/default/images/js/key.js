

$(function(){
	
	var window_w=$(window).width();
	var indexnav;
	if(window_w>=768){
		$('.menu>ul>li').hover(function() {
			indexnav = $(this).parents().find('li a.act').parent().index();
			$(this).children('a').addClass('on');
			$(this).siblings().children('a').removeAttr('class');
			
			$(this).siblings().find('.drop').slideUp(0);
			$(this).find('.drop').slideDown(0);
		},function(){
			$(this).find('.drop').slideUp(100);
				$('.menu>ul>li').eq(indexnav).siblings().children('a').removeAttr('class');
		$('.menu>ul>li').eq(indexnav).children('a').addClass('act');
		});
	}
	
	$('.m_menu').click(function(e) {
        $('.menu').slideToggle();
    });
	
	if(window_w<768){
		$('.menu>ul>li').click(function(e) {
            $(this).children('a').addClass('on');
			$(this).siblings().children('a').removeClass('on');
			$(this).siblings().find('.drop').slideUp(0);
			$(this).find('.drop').slideDown(0);
        });
		
		$('.menu .drop h4').click(function(e) {
			$(this).parent().siblings().find('.hide').slideUp();
			$(this).next('.hide').slideDown();	
    	});
	}
	
})



$(document).ready(function() {
	  var blw=$("#myscrollbox li").width();
	  //��ȡ������Ԫ���������
	  var liArr = $("#myscrollbox ul").children("li");
	  //��ȡ��Ԫ������
	  var mysw = $("#myscroll").width();
	  //��ȡ��Ԫ�������������
	  var mus = parseInt(mysw/blw);
	  //�������Ҫ��ʾ����Ԫ�ص�����
	  var length = liArr.length-mus;
	  //������Ԫ�ؿ��ƶ������������ص���Ԫ��������
	  var i=0
	  $("#right").click(function(){
		  i++
		  //���i��1
		  if(i<length){
		      $("#myscrollbox").css("left",-(blw*i));
			  //��Ԫ�ؼ��������ƶ�������Ϊ��Ԫ�صĿ��ȳ���i��
		  }else{
			  i=length;
			  $("#myscrollbox").css("left",-(blw*length));
			  //�������ƶ���Χ���������ƶ�����󼸸����ص�Ԫ����ʾʱi��ֵ�̶�λ�Ѿ����ߵ���Ԫ��������
	      }
      });
	  $("#left").click(function(){
		  i--
		  //���i��1
		  if(i>=0){
		     $("#myscrollbox").css("left",-(blw*i));
			 //��Ԫ�ؼ��������ƶ�������Ϊ��Ԫ�صĿ��ȳ���i��
		  }else{
			 i=0;
			 $("#myscrollbox").css("left",0);
			 //�������ƶ���Χ���������ƶ�����ǰ������Ԫ�ر���ʾʱiΪ0��
	      }
      });
});
