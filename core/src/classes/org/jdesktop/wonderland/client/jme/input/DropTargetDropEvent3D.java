/**
 * Open Wonderland
 *
 * Copyright (c) 2010, Open Wonderland Foundation, All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * The Open Wonderland Foundation designates this particular file as
 * subject to the "Classpath" exception as provided by the Open Wonderland
 * Foundation in the License file that accompanied this code.
 */
package org.jdesktop.wonderland.client.jme.input;

import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DropTargetDropEvent;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;
import org.jdesktop.wonderland.client.input.Event;

/**
 * 3D representation of a DropTarget event
 * @author Jonathan Kaplan <jonathankap@gmail.com>
 */
public class DropTargetDropEvent3D extends DropTargetEvent3D {
    private static final Logger LOGGER =
            Logger.getLogger(DropTargetDropEvent3D.class.getName());

    private Map<DataFlavor, Object> dataMap;

    static {
        /** Allocate this event type's class ID. */
        EVENT_CLASS_ID = Event.allocateEventClassID();
    }

    /**
     * Default constructor for cloning
     */
    protected DropTargetDropEvent3D() {
    }

    /**
     * Constructor
     */
    public DropTargetDropEvent3D(DropTargetDropEvent dropEvent) {
        super (dropEvent);

        // create an unmodifiable version. This will be passed directly into
        // clones.
        dataMap = Collections.unmodifiableMap(getData(dropEvent.getTransferable(),
                                                      dropEvent.getCurrentDataFlavors()));
    }

    /**
     * Return the DropTargetDropEvent associated with this event
     */
    @Override
    public DropTargetDropEvent getDropEvent() {
        return (DropTargetDropEvent) super.getDropEvent();
    }

    /**
     * Get the data flavors for this event
     */
    public DataFlavor[] getDataFlavors() {
        return dataMap.keySet().toArray(new DataFlavor[dataMap.size()]);
    }

    /**
     * Get data for a particular data flavor
     */
    public Object getTransferData(DataFlavor dataFlavor) {
        return dataMap.get(dataFlavor);
    }

    @Override
    public Event clone(Event event) {
        if (event == null) {
            event = new DropTargetDropEvent3D();
        }

        ((DropTargetDropEvent3D) event).dataMap = dataMap;

        return super.clone(event);
    }
}
