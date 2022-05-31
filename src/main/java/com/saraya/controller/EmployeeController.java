package com.saraya.controller;

import com.saraya.dto.EmployeeDto;
import com.saraya.model.Department;
import com.saraya.model.Employee;
import com.saraya.services.DepartmentService;
import com.saraya.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
@RequestMapping("/employees")
@SessionAttributes("username")
public class EmployeeController {
    EmployeeService service = new EmployeeService();
    DepartmentService serviceDept = new DepartmentService();

    @RequestMapping
    public String deptList(ModelMap model) {
        model.addAttribute("employees", service.getemployees());
        return "empList";
    }

    @RequestMapping(method = RequestMethod.POST)
    //Add the @Valid annotation...it will check for validation annotations before saving the object
    public String create(@ModelAttribute("employeeDto") @Valid EmployeeDto dto,
                         BindingResult result){
        // All the errors in the validation process will be kept in the BindingResult object
        //When errors occur...we have to handle it by loading the form page
        //We have the hasErrors() methods to check if there is any error in the validation process
        if (result.hasErrors()){
            //Here I only load the form page
            return "empNew";
        }
        service.createEmployee(dto);
        return "redirect:/employees";
    }

    @RequestMapping(value = "/{id}")
    public String getEmployee(@PathVariable("id") String id
            , ModelMap model) {
        model.addAttribute("employee", service.getEmployee(id));
        return "empDetail";
    }

    @RequestMapping("/new")
    public String create(ModelMap model) {
        model.put("departments", serviceDept.getDepartments());
        model.put("employeeDto", new EmployeeDto());
        return "empNew";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable String id, ModelMap model) {
        model.put("employee", service.getEmployee(id));
        model.put("departments", serviceDept.getDepartments());
        return "empNew";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.deleteEmployee(id);
        return "redirect:/employees";
    }
}
