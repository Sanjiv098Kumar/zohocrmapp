package zohoCrmApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohoCrmApp.entities.Leads1;
import zohoCrmApp.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveOneLead(Leads1 lead) {
		// TODO Auto-generated method stub
		leadRepo.save(lead);
	}

	@Override
	public void deleteLeadById(long id) {
		// TODO Auto-generated method stub
		leadRepo.deleteById(id);
	}

	@Override
	public Leads1 getLeadById(long id) {
		// TODO Auto-generated method stub
		Optional<Leads1> findById = leadRepo.findById(id);
		Leads1 leads1 = findById.get();
		return leads1;
	}

	@Override
	public List<Leads1> getAllLeads() {
		// TODO Auto-generated method stub
		
		List<Leads1> findAll = leadRepo.findAll();
		return findAll;
	}

	

	
 
}
