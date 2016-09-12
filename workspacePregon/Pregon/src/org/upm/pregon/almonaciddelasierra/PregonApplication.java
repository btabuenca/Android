package org.upm.pregon.almonaciddelasierra;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.upm.pregon.almonaciddelasierra.db.DatabaseHandler;
import org.upm.pregon.almonaciddelasierra.db.tables.EventDb;
import org.upm.pregon.almonaciddelasierra.db.ws.dataobjects.EventDO;

import android.app.Application;


public class PregonApplication extends Application {
	
	
	List<EventDb> events = new ArrayList<EventDb>();
	DatabaseHandler db;
	Properties config = new Properties();
	
//	private String version = "";
//	private String ws_path = "";
		
	
	@Override
	public void onCreate() {
		super.onCreate();
		
	}
	

	public List<EventDb> getEvents() {
		return events;
	}

	public void setEvents(List<EventDb> p) {
		events = p;
	}
	
	public void setEventsDO(List<EventDO> eDO) {
		
		List<EventDb> eventsDb = new ArrayList<EventDb>();		
		for (EventDO eventDO : eDO) {
			eventsDb.add(new EventDb(eventDO));
		}
		
		events = eventsDb;
	}

	public DatabaseHandler getDb() {
		return db;
	}

	public void setDb(DatabaseHandler db) {
		this.db = db;
	}


	public Properties getConfig() {
		return config;
	}


	public void setConfig(Properties config) {
		this.config = config;
	}	

//	public void setProperties(Properties properties) {
//		this.version = properties.getProperty(Constants.CP_VERSION);
//		this.ws_path = properties.getProperty(Constants.CP_WS_PATH);		
//	}	
	
//	public String getVersion() {
//		return version;
//	}
//	
//	public String getWSPath(){
//		return this.ws_path;
//	}	

}