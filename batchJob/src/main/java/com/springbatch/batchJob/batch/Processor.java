package com.springbatch.batchJob.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.springbatch.batchJob.model.User;


@Component
public class Processor implements ItemProcessor<User, User> {

	private static final Map<String, String> deptmap=new HashMap<String, String>();
	
	
	static
	{
		deptmap.put("1", "Technology Of Science");
		deptmap.put("2", "banking");
		deptmap.put("3", "Domain");
		
		
	}
	
	@Override
	public User process(User user) throws Exception {
		// TODO Auto-generated method stub
		String deptCode=user.getUser_code();
		String dept=deptmap.get(deptCode);
		user.setUser_department(dept);
		return user;
	}

}
