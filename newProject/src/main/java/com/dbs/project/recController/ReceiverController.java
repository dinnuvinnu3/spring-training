package com.dbs.project.recController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.project.recModel.ReceiverInfo;
import com.dbs.project.recService.ReceiverService;

@CrossOrigin("*")
@RestController
public class ReceiverController {

	@Autowired
	ReceiverService receiverService;
	
	@GetMapping("receiverHome")
	public List<ReceiverInfo> recHome() {
		return receiverService.getReceiverDetails();
	}
	
	@GetMapping("/checkBic")
	public Boolean checkReceiverBic(@RequestParam String bic) {
		return receiverService.validReceiverBic(bic)?true:false;
	}
	
}
