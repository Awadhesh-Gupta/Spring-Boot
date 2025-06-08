package com.springboot.controller;

import com.springboot.model.GetterSetterForController;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;

class FirstnamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        setValue(text.trim().toLowerCase());      //usedforcustomchanges
    }
}

@RestController
@RequestMapping("/api/")
public class SampleController {

    @InitBinder
    protected void initbinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, "firstname", new FirstnamePropertyEditor());
    }

    @GetMapping("/fetchUser")
    public String getuserdetails(@ModelAttribute GetterSetterForController user) {
        return "Fetching and Returning User Details based on firstname " + user.getFirstname()
                + " and lastname " + user.getLastname()
                + " of age " + user.getAge();
    }
}
