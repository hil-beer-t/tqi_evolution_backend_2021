package com.company.loansimulator.utils;

import java.util.Calendar;

public class GenerateCod {
    public Long clientId;

    public GenerateCod() {
    }

    public GenerateCod(Long clientId) {
        this.clientId = clientId;
    }

    public String getCod() {

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get((Calendar.DAY_OF_MONTH));
        int seconds = c.get((Calendar.SECOND));

        StringBuilder cod = new StringBuilder();
        cod.append(year).append("0").append(month+1).append(day).append(seconds).append(clientId);

        return cod.toString();
    }
}
