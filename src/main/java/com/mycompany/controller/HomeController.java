/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.repository.TabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author александр
 */
@Controller
public class HomeController {
 
  /*  @Autowired//(required=false)
    private TabRepository tabRep;*/
private TabRepository spittleRepository;



@Autowired
public HomeController(
TabRepository spittleRepository) {
this.spittleRepository = spittleRepository;
}

@RequestMapping(value="/", method=GET)
public String home() {
return "home";
}

@RequestMapping(value = "/tab", method = RequestMethod.GET)
    public String tab( Model model) {
        
        model.addAttribute("tabList",spittleRepository.findAll(new Sort(Sort.Direction.ASC, "name")));
       
        return "tab";
    }
    
    

}