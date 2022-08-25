package com.dbs.project.service;

import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.project.model.ProjectInfo;
import com.dbs.project.reopsitory.ProjectRepo;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepo projectRepo;
	
	ProjectInfo projectInfo;

	public List<ProjectInfo> findAllDetails() {
		// TODO Auto-generated method stub
		return projectRepo.findAll();
	}

	public List<String> validCustomerId(String custId) {
		// System.out.println("Hello");
//		List<ProjectInfo> listOfCustomers = new ArrayList<ProjectInfo>();
//		listOfCustomers = projectRepo.findAll();
//		List<String> allCustomerIDs = new ArrayList<>();
//		for(ProjectInfo itr: listOfCustomers) {
//			allCustomerIDs.add(itr.getCustomerID());
//		}
//		return allCustomerIDs;
		ProjectInfo pi = projectRepo.findById(custId).orElse(null);
		List<String> customerDetails = new ArrayList<>();
		if(pi != null) {
			customerDetails.add(pi.getCustomerID());
			customerDetails.add(pi.getAccountHoldername());
			customerDetails.add(Integer.toString(pi.getClearBalance()));
			customerDetails.add(pi.getOverDraft());
		}
		return customerDetails;
		
	}

	public boolean ValidateOverDraft(int balance, String custId) {
		// TODO Auto-generated method stub
		ProjectInfo details = projectRepo.findById(custId).orElse(null);
		int bal = details.getClearBalance();
		if(details.getOverDraft().equals("No")) {
			if(balance > bal) {
				return false;
			}
			else {
				bal -= balance;
				details.setClearBalance(bal);
				projectRepo.save(details);
				return true;
			}
		}
		bal -= balance;
		details.setClearBalance(bal);
		projectRepo.save(details);
		return true;
	}

	
	
	

}
