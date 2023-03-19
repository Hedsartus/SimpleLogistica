package ru.konsystem.simplelogistics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.konsystem.simplelogistics.model.organization.TypeOrganization;

import java.util.List;
import java.util.Optional;

public interface TypeOrgRepository extends JpaRepository<TypeOrganization, Integer> {
    @Override
    Optional<TypeOrganization> findById(Integer integer);

    @Override
    List<TypeOrganization> findAll();
}
