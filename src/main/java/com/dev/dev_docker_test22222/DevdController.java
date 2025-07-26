package com.dev.dev_docker_test22222;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevdController {
		
		@RequestMapping("/test")
		public String test() {
			return"this is test page for docker test compose ";
		}
	
	
		
		@RequestMapping("/docker")
		public String docker() {
			return"this is docker page for docker test compose ";
		}
	
	
}
