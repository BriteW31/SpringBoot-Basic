package com.demo.demo;

import org.springframework.web.bind.annotation.*;

// import org.springframework.web.bind.annotation.RestController;



@RestController

public class DemoController {

@GetMapping("/com/demo/demo")

public String sayHi() {

	return "Hello Everyone! This is Bright Wang. Here is a Demo.";

}

}