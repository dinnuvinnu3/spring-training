package com.dbs.project.recService;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.project.recModel.ReceiverInfo;
import com.dbs.project.recRepository.ReceiverRepo;

@Service
public class ReceiverService {

	@Autowired
	ReceiverRepo receiverRepo;


	public List<ReceiverInfo> getReceiverDetails() {
		// TODO Auto-generated method stub
		return receiverRepo.findAll();
	}


	public boolean validReceiverBic(String bic) {
		// TODO Auto-generated method stub
		ReceiverInfo bicDetails = receiverRepo.findById(bic).orElse(null);
		
		return bicDetails == null ? false : true;
	}

	
	
}
