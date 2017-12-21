package com.mbsoft.easytasks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mbsoft.easytasks.model.Task;
import com.mbsoft.easytasks.repository.TaskRepository;

@Controller
public class HomeController {
	@Autowired
	TaskRepository taskRepository;

	@RequestMapping("/")
	@ResponseBody
	public String helloHandler() {
		List<Task> tList=taskRepository.findAll();
		return "<h1>Hello World!</h1>"+tList.get(0).getContent();
	}
}
