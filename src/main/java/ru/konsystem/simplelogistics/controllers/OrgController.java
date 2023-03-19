package ru.konsystem.simplelogistics.controllers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.konsystem.simplelogistics.model.Organization;
import ru.konsystem.simplelogistics.repositories.TypeOrgRepository;
import ru.konsystem.simplelogistics.services.OrgService;

@Controller
@RequiredArgsConstructor
public class OrgController {
    private final OrgService orgService;
    private final TypeOrgRepository typeOrgRepository;

    @PostMapping("/org/edit")
    public String createOrg(@NonNull Organization org, Model model) {
        Organization result = orgService.createOrg(org);
        if (result == null) {
            model.addAttribute("errorMsg","Не получилось добавить в бд организацию!");
            return "/org/edit";
        }
        return "org/all-orgs?#"+result.getId();
    }

    @GetMapping("/org/edit")
    public String createOrg(Model model) {
        model.addAttribute("typesOrg", typeOrgRepository.findAll());
        return "org/org";
    }

    @GetMapping("/all-orgs")
    public String showAllOrgs(Model model) {
        model.addAttribute("orgs", orgService.getAll());
        return "org/all-orgs";
    }
}
