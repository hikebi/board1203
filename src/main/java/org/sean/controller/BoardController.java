package org.sean.controller;


import org.sean.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	private static final Logger logger
	=LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model)throws Exception{
		logger.info("list...");
		
		//model.addAttribute("list",service.listAll());
	}
	
	
	
	
	
	

}
