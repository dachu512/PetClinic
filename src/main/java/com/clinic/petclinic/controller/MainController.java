package com.clinic.petclinic.controller;

import com.clinic.petclinic.domain.Pet;
import com.clinic.petclinic.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private PetService petService;

    @GetMapping(path = {"/index","/"})
    public String getMainPage(){
        return "index";
    }

    @GetMapping("/addPet")
    public String addPet(Pet pet){
        return "addPet";
    }

    @PostMapping("/addPet")
    public String addPetPost(@Valid Pet pet, BindingResult result, Model model) {
        petService.savePet(pet);
        model.addAttribute("pets", petService.findAllPet());
        return "index";
    }
}

