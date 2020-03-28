package org.brerp.kanban.base.component;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;

/**
 * Model Factory
 *
 * @version $Id: ModelFactory.java, 17/08/2016 10:45:01 muriloht
 */
public class ModelFactory implements IModelFactory
{

	public Class<?> getClass(String tableName)
	{
		return null;
	}

	public PO getPO(String tableName, int Record_ID, String trxName) {
		return null;
	}

	public PO getPO(String tableName, ResultSet rs, String trxName) {
		return null;
	}
}
