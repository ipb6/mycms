package com.pb.apps.cms.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**   
*    
* 项目名称：cms   
* 类名称：TestController   
* 类描述：   
* 创建人：13914   
* 创建时间：2019年11月11日 下午7:13:45   
* @version        
*/


@RestController
@RequestMapping("/test")
public class TestController {
		
		@GetMapping("/findAll")
		public List<String> findAll() {
			List<String> list = new ArrayList<>();
			list.add("pb");
			list.add("haha");
			return list;
		} 
		
		@PostMapping("/save")
		public String save() {
			return "保存成功";
		}
}
