package ru.konsystem.simplelogistics.model;

import jakarta.persistence.*;
import lombok.Data;
import ru.konsystem.simplelogistics.model.organization.TypeOrganization;

@Entity
@Table(name = "org")
@Data
public class Organization {
    @Id
    @Column(name = "org_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "org_name")
    private String orgName;

    @Column(name = "org_name_full")
    private String orgNameFull;

    @Column(name = "org_ati")
    private String orgAti;

    @Column(name = "org_inn")
    private String orgInn;

    @Column(name = "org_kpp")
    private String orgKpp;

    @Column(name = "org_ogrn")
    private String orgOgrn;

    @Column(name = "org_site")
    private String orgSite;

    @Column(name = "org_comment")
    private String orgComment;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "org_type")
    private TypeOrganization orgType;

}
