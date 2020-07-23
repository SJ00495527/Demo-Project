package com.techm.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateBalanceToOcsDelegate implements JavaDelegate{

	 private static final Logger LOGGER = LoggerFactory.getLogger(UpdateBalanceToOcsDelegate.class);

	  @Override
	  public void execute(DelegateExecution execution) throws Exception {
	    LOGGER.info("in update Balance to OCS Delegate..");
	  }


}

