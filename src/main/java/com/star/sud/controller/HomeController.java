/**
 * 
 */
package com.star.sud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sudarshan
 *
 */
@RestController
public class HomeController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(value = "/welcome")
	public String welcomeMsg() {

		return messageSource.getMessage("hello.world.message", null, LocaleContextHolder.getLocale());
	}

}
