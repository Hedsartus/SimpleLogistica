package ru.konsystem.simplelogistics.model.organization;



import java.math.BigDecimal;
import java.time.LocalDate;

import static java.math.BigDecimal.ROUND_DOWN;


public class Finance {
    private int fin_id, fin_tsp, fin_typepay_client, fin_typepay_carrier;
    private BigDecimal fin_sum_client, fin_sum_carrier, fin_expenses;
    private String fin_condition_client, fin_condition_carrier, fin_invoice_carrier;
    private LocalDate fin_datedoc_client, fin_datedoc_carrier,
        fin_datepay_client, fin_datepay_carrier, fin_decided_client, fin_decided_carrier;

}
