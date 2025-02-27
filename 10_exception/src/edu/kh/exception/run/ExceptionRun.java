package edu.kh.exception.run;

import edu.kh.exception.model.service.ExceptionService;
import edu.kh.exception.model.service.UserException;

public class ExceptionRun {

	public static void main(String[] args) {
		
		try {
			new ExceptionService().ex5();
		} catch (UserException e) {
			
			System.out.println(e.getMessage());
			// 발생한 예외가 뱉은 메시지
		} 
		
	}

}
