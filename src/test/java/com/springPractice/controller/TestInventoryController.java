package com.springPractice.controller;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.springPractice.service.SimpleProductManager;

public class TestInventoryController {

	InventoryController controller = new InventoryController();
	
	@Before
	public void setUp(){
		controller.setProductManager(new SimpleProductManager());
	}
	
	@Test
	public void testHelloControllerWillReturnHelloJSPAsView() throws Exception {
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("hello", modelAndView.getViewName());
	}
	
	@Test
	public void testHelloControllerWillReturnModelWithParameterNow() throws Exception {
		ModelAndView modelAndView = controller.handleRequest(null, null);
		Map model = (Map)modelAndView.getModel().get("model");
		assertNotNull((String)model.get("now"));
	}
}


