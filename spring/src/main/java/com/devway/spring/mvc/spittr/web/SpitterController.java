package com.devway.spring.mvc.spittr.web;

import com.devway.spring.mvc.spittr.Spitter;
import com.devway.spring.mvc.spittr.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * @author devway
 * @date 2017-12-20
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpitterController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterationForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistartion(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm";
        }

        spittleRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getName();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String name, Model model) {
        Spitter spitter = new Spitter();
        spitter.setName(name);
        model.addAttribute(spitter);
        return "profile";
    }

    @RequestMapping(value = "/register2", method = RequestMethod.GET)
    public String showRegisterationForm2(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm2";
    }

    @RequestMapping(value = "/register2", method = RequestMethod.POST)
    public String processRegistartion2(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm2";
        }

        spittleRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getName();
    }
}
