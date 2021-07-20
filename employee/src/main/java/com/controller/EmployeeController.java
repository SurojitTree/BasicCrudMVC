package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.EmployeeDao;
import com.model.EmployeeModel;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;;

	@RequestMapping("/employee")
	public ModelAndView getEmployeeTable() {
		ModelAndView mv = new ModelAndView();
		List<EmployeeModel> empList = employeeDao.getEmployees();

		mv.addObject("list", empList);
		mv.setViewName("showEmployee");
		return mv;
	}

	@RequestMapping("/create")
	public ModelAndView createEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("empTable", new EmployeeModel());
		mv.setViewName("viewEmp");
		return mv;
	}

	@RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
	public ModelAndView saveEmp(@ModelAttribute("emp") EmployeeModel emp) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("added", employeeDao.insert(emp));
		mv.setViewName("redirect:/employee");
		return mv;

	}

	@RequestMapping("/delete/{email}")
	public ModelAndView delete(@PathVariable String email) {
		ModelAndView mv = new ModelAndView();
		String mail="";
		if(email.endsWith(".com"))
		{
			mail=email;
		}
		else
		{
			mail+=email+".com";
		}
		employeeDao.delete(mail);

		mv.setViewName("redirect:/employee");
		return mv;
	}
	@RequestMapping("/edit/{email}")
	public ModelAndView edit(@PathVariable String email)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("empTable", new EmployeeModel());
		mv.setViewName("editEmp");
		return mv;
	}
	@RequestMapping(value = "/editSave",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") EmployeeModel emp)
	{
		ModelAndView mv = new ModelAndView();
		employeeDao.save(emp);
		
		mv.setViewName("redirect:/employee");
		return mv;
		
	}
}
