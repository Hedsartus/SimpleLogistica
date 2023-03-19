package ru.konsystem.simplelogistics.services;

import ru.konsystem.simplelogistics.model.Organization;

import java.util.List;

public interface OrgService {
    Organization createOrg(Organization org);
    Organization updateOrg(Organization org);
    void deleteOrg();

    List<Organization> getAll();
}
