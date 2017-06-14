$(function(){
		
		//加载响应图片
		function load_img(){
			var w_width=$(window).width();
				$('.n_baner img').each(function() {
					if(w_width>=1000){
						$(this).attr('src',$(this).attr('data-1920'));
					}else if(w_width<1000&&w_width>=768){
						$(this).attr('src',$(this).attr('data-990'));
					}else if(w_width<768){
						$(this).attr('src',$(this).attr('data-640'));
					}
				})
		 }load_img();
			
			
		//页面加载
		$(window).load(function() {
			var w_width=$(this).width(),
			    li_fisrt=$('.atlas li:first').clone(),
			 	li_last =$('.atlas li:last').clone();
				
				$('.atlas').append(li_fisrt);
				$('.atlas').prepend(li_last);
				
				if(w_width>=1000){
					$('.n_baner').find('li').width(1920);
					$('.n_baner').find('ul').css('margin-left',-1920);
				}else{
					$('.n_baner').find('li').width(w_width);
					$('.n_baner ul').css('margin-left',-w_width);
				}
		});
			
			
		//窗口变化
		$(window).resize(function(){
			var w_width=$(this).width();
			var toph=$('.atlas li img').height()*0.76;
				$('.n_baner .num').css('top',toph);
				
				load_img();
				
				if(w_width>=1000){
				    $('.n_baner').find('li').width(1920);
					$('.n_baner ul').css('margin-left',-1920*(num+1));
					
				}else{
					$('.n_baner').find('li').width(w_width);
					$('.n_baner ul').css('margin-left',-w_width*(num+1));
				}
			
			
				
		});
		
		
		//banner滚动
		var bannerroll = setInterval(move,5000),
			num        = 0;
			
			function move(){
				var li_w = $('.n_baner li').width();
					
					num<$('.n_baner li').length-1?num++:num=0;
					
					$('.n_baner .num a').eq(num).addClass('on')
					.siblings().removeClass('on');
					
					if(num==$('.n_baner li').length-2){
						$('.n_baner').find('ul').stop()
						.animate({marginLeft:-(num+1)*li_w},500,function(){
							num=0;
							
							$('.n_baner .num a').eq(num)
							.addClass('on')
							.siblings().removeClass('on');
							
							$(this).animate({marginLeft:-li_w},0)
						})
						
					}else{
						$('.n_baner').find('ul')
						.stop()
						.animate({marginLeft:-(num+1)*li_w},500);
					}
			};
			
			
		//指示点
		$('.n_baner .num a').click(function() {
			var li_w = $('.n_baner li').width(),
				index   = $(this).index();
				num     = index;
				
				$(this).addClass('on')
				.siblings().removeClass('on');
				
				$('.n_baner').find('ul').stop()
				.animate({marginLeft:-(num+1)*li_w},500);
		});
		
		//清楚定时器
		$('.n_baner').hover(function() {
			clearInterval(bannerroll) 
		},function(){
			bannerroll=setInterval(move,5000);
		});
		
		
		//移动端
		function touchleft(){
			var w_width=$(window).width(),
				Istrue=$('.n_baner ul').is(':animated');
				
				if(!Istrue){
					num<$('.n_baner li').length-2?num++:num=0;
					
					$('.n_baner .num a').eq(num).addClass('on')
					.siblings().removeClass('on');
					
					if(num==$('.n_baner li').length-2){
						$('.n_baner ul').stop()
						.animate({marginLeft:-(num+1)*w_width},500,function(){
							num=0;
							$('.n_baner .num a').eq(num).addClass('on')
							.siblings().removeClass('on');
							$(this).animate({marginLeft:-w_width},0);
						});
					}else{
						$('.n_baner ul').stop()
						.animate({marginLeft:-(num+1)*w_width},500);
					}
				}
		};
			
		function touchright(){
			var w_width=$(window).width(),
				Istrue=$('.n_baner ul').is(':animated');
				
				if(!Istrue){
					num>0?num--:num=$('.n_baner li').length-3;
					
					$('.n_baner .num a').eq(num).addClass('on')
					.siblings().removeClass('on');
					
					if(num==$('.n_baner li').length-3){
						$('.n_baner ul').animate({marginLeft:0},500,function(){
							$(this).animate({marginLeft:-w_width*(num+1)},0);
						})
					}else{
						$('.n_baner ul').animate({marginLeft:-w_width*(num+1)},500);
					}
					
				}
		};
			
		
		//移动端
	    var startX, startY, moveEndX, moveEndY, X, Y;
		
			$('.n_baner li').on('touchstart',function(e){
				clearInterval(bannerroll);
				startX = e.originalEvent.changedTouches[0].pageX,
				startY = e.originalEvent.changedTouches[0].pageY;
			});
			
			$('.n_baner li').on('touchmove',function(e){
				moveEndX = e.originalEvent.changedTouches[0].pageX,
				moveEndY = e.originalEvent.changedTouches[0].pageY,
				X = moveEndX - startX,
				Y = moveEndY - startY;
				if (Math.abs(X) > Math.abs(Y)){
					e.preventDefault();
					if(X>20){
						touchright()
					}else if(X<0) {
						touchleft()
					}	
				}
			});
			
			$('.n_baner li').on('touchend',function(e){
				e.preventDefault();
				moveEndX = e.originalEvent.changedTouches[0].pageX,
				moveEndY = e.originalEvent.changedTouches[0].pageY,
				X = moveEndX - startX,
				Y = moveEndY - startY;
				if(X==0&&Y==0){
					var _link=$(this).children('a').attr('href');
					window.open(_link)
				};
				bannerroll=setInterval(move,4000);
			});
			
	})