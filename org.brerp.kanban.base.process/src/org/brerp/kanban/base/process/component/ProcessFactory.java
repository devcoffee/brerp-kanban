package org.brerp.kanban.base.process.component;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;


/**
*
* Process Factory
*
* @version $Id: ProcessFactory.java, 17/08/2016 15:36:13 muriloht
*/
public class ProcessFactory implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className)
	{

		ProcessCall process = null;

		return process;
	}

}
