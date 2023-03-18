package ru.konsystem.simplelogistics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.konsystem.simplelogistics.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
