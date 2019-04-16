package bootWeb.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 全局异常处理类
 * @author y1216
 *
 */
@ControllerAdvice
public class GoblaException {
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public String dd(HttpServletRequest request,Exception e){
		  
		return "对不起，服务器繁忙";
		
	}

}
