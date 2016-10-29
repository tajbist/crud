package com.dev;

import com.domain.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Oops on 7/23/2016.
 */
@Controller
public class HelloController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public @ResponseBody Student show(@PathVariable String name, Model model) {
        return  studentService.addStudent(name);
    }
}
