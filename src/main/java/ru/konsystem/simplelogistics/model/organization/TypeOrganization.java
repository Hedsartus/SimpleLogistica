package ru.konsystem.simplelogistics.model.organization;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "typeorg")
@Data
public class TypeOrganization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tog_id")
    private Integer togId;

    @Column(name="tog_quote")
    private boolean togQuote;

    @Column(name="tog_title")
    private String togTitle;

    @Column(name="tog_title_full")
    private String togTitleFull;
}
