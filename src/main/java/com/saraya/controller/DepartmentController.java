package com.saraya.controller;

import com.saraya.model.Department;
import com.saraya.services.LoginService;
import com.saraya.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
    DepartmentService service = new DepartmentService();
    LoginService loginService = new LoginService();


    @RequestMapping
    public String deptList(ModelMap model) {
        model.addAttribute("departments", service.getDepartments());
        model.put("username", loginService.getLoggedInUsername());
        return "dept/list";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@RequestParam("deptName") String deptName
            , @RequestParam("id") String id){
        if (id.equals("")){
            Department d = service.createDepartment(deptName);
        }else {
            service.updateDepartment(id, deptName);
        }
        return "redirect:/departments";
    }

    @RequestMapping(value = "/{id}")
    public String getDepartment(@PathVariable("id") String id
            , ModelMap model) {
        model.addAttribute("dept", service.getDepartment(id));
        return "dept/detail";
    }

    @RequestMapping("/new")
    public String create() {
        return "dept/new";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable String id, ModelMap model) {
        model.put("dept", service.getDepartment(id));
        return "dept/new";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.deleteDepartment(id);
        return "redirect:/departments";
    }




}
