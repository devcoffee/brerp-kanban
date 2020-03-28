package org.brerp.kanban.base.component;

import org.adempiere.base.event.AbstractEventHandler;
import org.compiere.util.CLogger;
import org.osgi.service.event.Event;

/**
 * Event Handler - ProjetoTemplate
 *
 * @version $Id: EventHandler.java, 17/08/2016 09:29:31 muriloht
 */
public class EventHandler extends AbstractEventHandler
{
	private static CLogger log = CLogger.getCLogger(EventHandler.class);

	protected void initialize()
	{
		log.info("initialize.. EventHandler");

	}

	protected void doHandleEvent(Event event) {

		log.info("starting.. Topic :" + event.getTopic());

	}

}
