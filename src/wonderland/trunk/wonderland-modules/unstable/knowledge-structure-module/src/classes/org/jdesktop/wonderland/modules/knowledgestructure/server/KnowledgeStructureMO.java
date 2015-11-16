/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.server;

import java.util.List;
import org.jdesktop.wonderland.common.cell.ClientCapabilities;
import org.jdesktop.wonderland.common.cell.state.CellClientState;
import org.jdesktop.wonderland.common.cell.state.CellServerState;
import org.jdesktop.wonderland.modules.knowledgestructure.common.Challenge;
import org.jdesktop.wonderland.modules.knowledgestructure.common.Concept;
import org.jdesktop.wonderland.modules.knowledgestructure.common.KnowledgeStructureClientState;
import org.jdesktop.wonderland.modules.knowledgestructure.common.KnowledgeStructureServerState;
import org.jdesktop.wonderland.modules.knowledgestructure.common.Participant;
import org.jdesktop.wonderland.server.cell.CellMO;
import org.jdesktop.wonderland.server.comms.WonderlandClientID;

/**
 *
 * @author prajish
 */
public class KnowledgeStructureMO extends CellMO{

    public KnowledgeStructureMO() {
    }

    private List<Concept> concepts=null;
    private List<Challenge>challenges=null;
    private List<Participant>participants=null;
    
    
    @Override
    protected String getClientCellClassName(WonderlandClientID clientID, ClientCapabilities capabilities) {
        return "org.jdesktop.wonderland.modules.knowledgestructure.client.KnowledgeStructure";
    }
    
    @Override
    public void setServerState(CellServerState state) {
        super.setServerState(state);
        this.concepts=((KnowledgeStructureServerState)(state)).getConcepts();
        this.challenges=((KnowledgeStructureServerState)(state)).getChallenges();
        this.participants=((KnowledgeStructureServerState)(state)).getParticipants();
    }
    
    @Override
    public CellServerState getServerState(CellServerState state) {
        if (state == null) {
            state = new KnowledgeStructureServerState();
            
        }
        ((KnowledgeStructureServerState)state).setConcepts(concepts);
        ((KnowledgeStructureServerState)state).setChallenges(challenges);
        ((KnowledgeStructureServerState)state).setParticipants(participants);
        return super.getServerState(state);
    }
    
    @Override
    public CellClientState getClientState(CellClientState state, WonderlandClientID clientID, ClientCapabilities capabilities) {
        if (state == null) {
            state = new KnowledgeStructureClientState();
        }
        ((KnowledgeStructureClientState)state).setConcepts(concepts);
        ((KnowledgeStructureClientState)state).setChallenges(challenges);
        ((KnowledgeStructureClientState)state).setParticipants(participants);
        return super.getClientState(state, clientID, capabilities);
    }
    
}
