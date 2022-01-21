package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Controller
@RequestMapping(value="/guest")
public class GuestbookController {

	// 필드
	@Autowired
	private GuestbookDao guestbookDao;

	// 생성자

	// 메소드 gs

	// 메소드 일반
	@RequestMapping(value="/add", method = { RequestMethod.GET, RequestMethod.POST })
	public String add(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("GuestbookController>add()");
		System.out.println(guestbookVo);

		return "redirect:/guestbook4/guest";
	}

	@RequestMapping(value="/deleteform", method = { RequestMethod.GET, RequestMethod.POST })
	public String deleteForm() {
		System.out.println("GuestbookController>deleteForm()");

		return "deleteForm";

	}

	@RequestMapping(value="/delete", method = { RequestMethod.GET, RequestMethod.POST })
	public String delete(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("GuestbookController>delete()");

		
		return "redirect:/guestbook4/guest";

	}

	@RequestMapping(value="/list", method = { RequestMethod.GET, RequestMethod.POST })
	public String list(Model model) {
		System.out.println("PhoneController>list()");

		// 다오에서 리스트를 가져온다
		// GuestbookDao guestbookdao = new GuestbookDao();
		List<GuestbookVo> guestbookList = guestbookDao.getList();

		System.out.println(guestbookList.toString());

		// 컨트롤러-->DS데이터를 보낸다 (model)
		model.addAttribute("guestbookList", guestbookList);

		return "list";
	}

}


