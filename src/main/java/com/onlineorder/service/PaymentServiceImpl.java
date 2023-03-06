package com.onlineorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineorder.dao.PaymentDAO;
import com.onlineorder.entities.Payment;
import com.onlineorder.exceptions.WrongPaymentIdException;



@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	private PaymentDAO paymentDao;

	@Override
	public List<Payment> getAllPayments() {
		return paymentDao.findAll();

	}

	@Override
	public Payment getPaymentById(Integer paymentId) throws WrongPaymentIdException{
		Payment p;
		if(paymentDao.findById(paymentId).isEmpty()) {
			throw new WrongPaymentIdException();
		}
		else {
			p=paymentDao.findById(paymentId).get();
		}
		return p;
	}


	@Override
	public Payment addPayment(Payment payment) {
		paymentDao.save(payment);
		return payment;
		
	}

	@Override
	public Payment updatePayment(Payment payment) {
		paymentDao.save(payment);
		return payment;
		
	}

	@Override
	public void deletePaymentById(Integer paymentId) {
		Payment t =paymentDao.getById(paymentId);
		paymentDao.delete(t);
		
	}

}
