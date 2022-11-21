package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AdminAdvisorController extends ResponseEntityExceptionHandler{
	@ExceptionHandler(AdminNotFoundException.class)
    public ResponseEntity<Object> handleAdminNotFoundException(AdminNotFoundException i,WebRequest req)
    {
        
        return  new ResponseEntity<>(i.toString(),HttpStatus.NOT_FOUND);
    }
	@ExceptionHandler(AdminExistsException.class)
    public ResponseEntity<Object> handleAdminExistsException(AdminExistsException i,WebRequest req)
    {
        
        return  new ResponseEntity<>(i.toString(),HttpStatus.NOT_FOUND);
    }
	@ExceptionHandler(AdminNotLoggedException.class)
    public ResponseEntity<Object> handleAdminNotLoggedException(AdminNotLoggedException i,WebRequest req)
    {
        
        return  new ResponseEntity<>(i.toString(),HttpStatus.NOT_FOUND);
    }
	@ExceptionHandler(EmptyListReturnedException.class)
	public ResponseEntity<Object> handleEmptyListException(EmptyListReturnedException i,WebRequest req)
    {
        
        return  new ResponseEntity<>(i.toString(),HttpStatus.NOT_FOUND);
    }
	@ExceptionHandler(ObjectAddFailException.class)
	public ResponseEntity<Object> handleAddNotDoneException(ObjectAddFailException i,WebRequest req)
    {
        
        return  new ResponseEntity<>(i.toString(),HttpStatus.NOT_FOUND);
    }
}
