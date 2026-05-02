package com.klef.fsad.exam.service;

import java.util.List;
import com.klef.fsad.exam.model.Invoice;

public interface InvoiceService {
    Invoice addInvoice(Invoice invoice);
    List<Invoice> getAllInvoices();
}


@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository repo;

    public Invoice addInvoice(Invoice invoice) {
        return repo.save(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }
}
