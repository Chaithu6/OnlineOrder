package com.onlineorder.service;

import java.util.List;

import com.onlineorder.entities.Payment;
import com.onlineorder.exceptions.WrongPaymentIdException;




public interface PaymentService {
public List<Payment> getAllPayments();
public Payment getPaymentById(Integer productId) throws WrongPaymentIdException;
public Payment addPayment(Payment payment);
public Payment updatePayment(Payment payment);
public void deletePaymentById(Integer paymentId);

}
