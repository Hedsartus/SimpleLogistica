package ru.konsystem.simplelogistics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.konsystem.simplelogistics.model.Organization;

public interface OrgRepository extends JpaRepository<Organization, Long> {
}
