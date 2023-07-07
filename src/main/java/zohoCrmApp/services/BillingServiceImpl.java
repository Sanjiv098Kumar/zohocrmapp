package zohoCrmApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohoCrmApp.entities.Billing;
import zohoCrmApp.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	public BillingRepository billingRepo;

	@Override
	public Billing saveBill(Billing bill) {
		// TODO Auto-generated method stub
		Billing newbill = billingRepo.save(bill);
		
		return newbill;
	}

}
