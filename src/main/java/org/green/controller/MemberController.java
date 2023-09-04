package org.green.controller;

import org.green.domain.MemberVO;
import org.green.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("member/*")
@AllArgsConstructor
public class MemberController {
	@Setter(onMethod_= {@Autowired})
	private MemberService service;
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", service.getList());
	}
	@GetMapping("/log")
	public void redister() {
		
	}
	@PostMapping("/log")
	public String postregister(MemberVO mvo) {
		log.info("=======================");
		log.info("mvo : " + mvo);
		log.info("=======================");
		service.register(mvo);
	    return "redirect:/member/list";
	}
	
}
