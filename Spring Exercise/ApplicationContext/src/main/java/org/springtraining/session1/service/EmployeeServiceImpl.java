package org.springtraining.session1.service;

import org.springframework.stereotype.Service;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public long generateEmployeeId() {
		return System.currentTimeMillis();
	}

}
