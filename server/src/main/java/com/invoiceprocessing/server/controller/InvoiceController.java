package com.invoiceprocessing.server.controller;

import com.invoiceprocessing.server.model.Invoice;
import com.invoiceprocessing.server.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) // Allow requests from all origins with a max age of 3600 seconds (1 hour)
@RequestMapping("/api") // Base path for all endpoints in this controller
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/invoices") // Endpoint for adding a new invoice
    public Invoice addInvoice(@RequestBody Invoice invoice) {
        return invoiceService.addInvoice(invoice);
    }

    @GetMapping("/invoices") // Endpoint for retrieving all invoices
    public List<Invoice> getInvoices() {
        return invoiceService.getInvoices();
    }

    @DeleteMapping("/invoices/{invoiceId}") // Endpoint for deleting an invoice by ID
    public Invoice deleteInvoice(@PathVariable Long invoiceId) {
        return invoiceService.deleteInvoice(invoiceId);
    }
}
