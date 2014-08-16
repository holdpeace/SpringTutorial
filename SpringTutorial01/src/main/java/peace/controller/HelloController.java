package peace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//此類別為Spring Controller元件
@Controller
public class HelloController {

	//透過 @RequestMapping 指定從/hello會被對應到此hello()方法
    @RequestMapping("/hello")
    //透過 @ResponseBody 告知Spring，此函數的回傳值是HTTP Response的本文
    public @ResponseBody String hello(){
		return "Hello World!";
	}
	
    //加入{}對URL進行參數化
	@RequestMapping("/hello/{name}")
	//加入 @PathVariable 讓Spring自動將URL轉換為此方法的參數
	public @ResponseBody String hello(@PathVariable("name") String name){
		return "Hello " + name;
	}
	
}
