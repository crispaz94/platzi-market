package com.platzi.market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {

    private int purchaseId;
    private int clienteId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String active;
    private List<PurchaseItem> item;

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public List<PurchaseItem> getItem() {
        return item;
    }

    public void setItem(List<PurchaseItem> item) {
        this.item = item;
    }
}
