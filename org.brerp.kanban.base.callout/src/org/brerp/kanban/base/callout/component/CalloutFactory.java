package org.brerp.kanban.base.callout.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;

/**
 *
 * Callout Factory
 *
 * @version $Id: CalloutFactory.java, 17/08/2016 15:27:12 muriloht
 */
public class CalloutFactory implements IColumnCalloutFactory
{

	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName)
	{
		List<IColumnCallout> list = new ArrayList<IColumnCallout>();

		return list != null ? list.toArray(new IColumnCallout[0]) : new IColumnCallout[0];
	}

}
