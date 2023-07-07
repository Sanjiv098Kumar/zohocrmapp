package zohoCrmApp.services;

import java.util.List;

import zohoCrmApp.entities.Leads1;

public interface LeadService {

	void saveOneLead(Leads1 lead);

	

	void deleteLeadById(long id);



     Leads1 getLeadById(long id);



	List<Leads1> getAllLeads();

	

}
