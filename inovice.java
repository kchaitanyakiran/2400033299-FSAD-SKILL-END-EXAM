package com.klef.fsad.exam.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Invoice {

    @Id
    private int invoiceId; 

    private String name;
    private Date date;
    private String status;
    private double amount;

    
    public int getInvoiceId() { return invoiceId; }
    public void setInvoiceId(int invoiceId) { this.invoiceId = invoiceId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
