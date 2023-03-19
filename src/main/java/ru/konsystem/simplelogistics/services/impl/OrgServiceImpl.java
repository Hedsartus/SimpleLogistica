package ru.konsystem.simplelogistics.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.konsystem.simplelogistics.model.Organization;
import ru.konsystem.simplelogistics.repositories.OrgRepository;
import ru.konsystem.simplelogistics.services.OrgService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrgServiceImpl implements OrgService {
    private final OrgRepository orgRepository;

    @Override
    public Organization createOrg(Organization org) {
        orgRepository.save(org);
        return orgRepository.save(org);
    }

    @Override
    public Organization updateOrg(Organization org) {
        return null;
    }

    @Override
    public void deleteOrg() {

    }

    @Override
    public List<Organization> getAll() {

        return orgRepository.findAll();
    }
}
