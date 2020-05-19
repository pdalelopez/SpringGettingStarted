package com.ITAcademy.restproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@RestController
public class HelloController
{
@RequestMapping("/")
public String HelloMethod(@RequestParam(value="name", defaultValue = "World") String name) 
{
return "Hello "+ name;
}
}
