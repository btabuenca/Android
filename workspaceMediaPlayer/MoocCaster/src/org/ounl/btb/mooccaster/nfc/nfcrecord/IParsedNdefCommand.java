 /*******************************************************************************
 * Copyright (C) 2014 Open University of The Netherlands
 * Author: Bernardo Tabuenca Archilla
 * Lifelong Learning Hub project 
 * 
 * This library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.ounl.btb.mooccaster.nfc.nfcrecord;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public interface IParsedNdefCommand {
	
	public final static String COMMAND_PLAY = "PLAY";
	public final static String COMMAND_PAUSE = "PAUSE";
	public final static String COMMAND_STOP = "STOP";
	public final static String COMMAND_FORWARD = "FORWARD";
	public final static String COMMAND_CAST = "CAST";
	public final static String COMMAND_UNKNOWN = "UNKNOWN";

    /**
     * Returns a view to display this record.
     */
    public View getView(Activity activity, LayoutInflater inflater, ViewGroup parent,
            int offset);

    public String getId();
    
    public String getCommand();
  
    public String getColor();
    

    
}