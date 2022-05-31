package com.saraya.controller;

import com.saraya.model.Department;
import com.saraya.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departments")
@SessionAttributes("username")
public class DepartmentController {
    DepartmentService service = new DepartmentService();

    @RequestMapping
    public String deptList(ModelMap model15) {
        model15.addAttribute("departments", service.getDepartments());
        return "deptList";
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
        return "deptDetail";
    }

    @RequestMapping("/new")
    public String create() {
        return "deptNew";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable String id, ModelMap model) {
        model.put("dept", service.getDepartment(id));
        return "deptNew";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.deleteDepartment(id);
        return "redirect:/departments";
    }
}
