package com.techm.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class OcsFailureDelegate implements JavaDelegate{

	private static final Logger LOGGER = LoggerFactory.getLogger(OcsFailureDelegate.class);

	  @Override
	  public void execute(DelegateExecution execution) throws Exception {
	    LOGGER.info("in Ocs Failure Delegate.... ");
	  }
}