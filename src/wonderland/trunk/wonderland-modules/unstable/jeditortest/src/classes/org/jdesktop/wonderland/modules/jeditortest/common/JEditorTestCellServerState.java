/**
 * Project Wonderland
 *
 * Copyright (c) 2004-2009, Sun Microsystems, Inc., All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * Sun designates this particular file as subject to the "Classpath" 
 * exception as provided by Sun in the License file that accompanied 
 * this code.
 */
package org.jdesktop.wonderland.modules.jeditortest.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.jdesktop.wonderland.modules.appbase.common.cell.App2DCellServerState;
import org.jdesktop.wonderland.common.cell.state.annotation.ServerState;

/**
 * The WFS server state class for JEditorTestCellMO.
 * 
 * @author deronj
 */
@XmlRootElement(name="jeditortest-cell")
@ServerState
public class JEditorTestCellServerState extends App2DCellServerState {
    
    /** The user's preferred width of the JEditor test window. */
    @XmlElement(name="preferredWidth")
    public int preferredWidth = 300;
    
    /** The user's preferred height of the JEditor test window. */
    @XmlElement(name="preferredHeight")

    public int preferredHeight = 300;
    
    /** Default constructor */
    public JEditorTestCellServerState() {}
    
    public String getServerClassName() {
        return "org.jdesktop.wonderland.modules.jeditortest.server.JEditorTestCellMO";
    }

    @XmlTransient public int getPreferredWidth () {
        return preferredWidth;
    }
    
    public void setPreferredWidth (int preferredWidth) {
        this.preferredWidth = preferredWidth;
    }
    
    @XmlTransient public int getPreferredHeight () {
        return preferredHeight;
    }
    
    public void setPreferredHeight (int preferredHeight) {
        this.preferredHeight = preferredHeight;
    }
    
    /**
     * Returns a string representation of this class.
     *
     * @return The server state information as a string.
     */
    @Override
    public String toString() {
        return super.toString() + " [JEditorTestCellServerState]: " +
	    "preferredWidth=" + preferredWidth + "," +
	    "preferredHeight=" + preferredHeight + "," +
	    "pixelScaleX=" + pixelScaleX + "," +
	    "pixelScaleY=" + pixelScaleY;
    }
}
