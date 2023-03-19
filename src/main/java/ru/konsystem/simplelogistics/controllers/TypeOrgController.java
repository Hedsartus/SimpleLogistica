package ru.konsystem.simplelogistics.controllers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.konsystem.simplelogistics.model.organization.TypeOrganization;
import ru.konsystem.simplelogistics.repositories.TypeOrgRepository;

@Controller
@RequiredArgsConstructor
public class TypeOrgController {
    private final TypeOrgRepository typeOrgRepository;

    @GetMapping("/typeorg")
    public String createTypeOrg() {
        return "typeorg";
    }

    @PostMapping("/typeorg")
    public String createTypeOrg(TypeOrganization typeOrg, Model model) {
        TypeOrganization typeOrganization = typeOrgRepository.save(typeOrg);
        if (typeOrganization == null) {
            model.addAttribute("errorMsg","Не получилось добавить в бд!");
            return "/typeorg";
        } else {
            model.addAttribute("compliteMsg","Успешно!!!");
        }

        return "redirect:/login";
    }

}
