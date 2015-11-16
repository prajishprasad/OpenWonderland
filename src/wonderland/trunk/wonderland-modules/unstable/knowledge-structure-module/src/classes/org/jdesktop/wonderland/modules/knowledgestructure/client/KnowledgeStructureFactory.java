/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.client;

import java.awt.Image;
import java.util.Properties;
import org.jdesktop.wonderland.client.cell.registry.annotation.CellFactory;
import org.jdesktop.wonderland.client.cell.registry.spi.CellFactorySPI;
import org.jdesktop.wonderland.common.cell.state.CellServerState;
import org.jdesktop.wonderland.modules.knowledgestructure.common.KnowledgeStructureServerState;

/**
 *
 * @author prajish
 */
@CellFactory
public class KnowledgeStructureFactory implements CellFactorySPI{

    public String[] getExtensions() {
        return new String[] {};
    }
    
    public <T extends CellServerState> T getDefaultCellServerState(Properties props) {
        KnowledgeStructureServerState state = new KnowledgeStructureServerState();
        return (T)state;
    }

    public String getDisplayName() {
        return "Knowledge Structure Module";
    }

    public String getDescription() {
        return "This module is used to read and write information into the various XML files";
    }

    public Image getPreviewImage() {
        return null;
    }
    
    
}
