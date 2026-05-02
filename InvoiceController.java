package com.klef.fsad.exam.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.fsad.exam.model.Invoice;
import com.klef.fsad.exam.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @PostMapping("/add")
    public Invoice addInvoice(@RequestBody Invoice invoice) {
        if (invoice.getInvoiceId() == 0)
            throw new RuntimeException("Invoice ID required");
        return service.addInvoice(invoice);
    }

    @GetMapping("/all")
    public List<Invoice> getInvoices() {
        return service.getAllInvoices();
    }
}
