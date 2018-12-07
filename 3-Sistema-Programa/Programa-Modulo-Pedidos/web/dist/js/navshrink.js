$(window).scroll(function(){
	if ($(document).scrollTop()>50) {
		$('nav').addClass('shrink');
		$('.logo__img').css({"width": "40px","height":"40px","margin-top":"2px", "transition":"all .5s ease-in-out"});
		$('.logo-caja__text').css({"padding":"0"});
	}else{
		$('nav').removeClass('shrink');
		$('.logo__img').css({"width": "53px","height":"53px","margin-top":"-2px"});
		$('.logo-caja__text').css({"padding":"0 3px"});
	}
})
