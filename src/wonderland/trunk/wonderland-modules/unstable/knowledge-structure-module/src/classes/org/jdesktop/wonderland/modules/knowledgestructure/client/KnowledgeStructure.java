/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.client;

import java.util.List;
import org.jdesktop.wonderland.client.cell.Cell;
import org.jdesktop.wonderland.client.cell.CellCache;
import org.jdesktop.wonderland.common.cell.CellID;
import org.jdesktop.wonderland.common.cell.state.CellClientState;
import org.jdesktop.wonderland.modules.knowledgestructure.common.Challenge;
import org.jdesktop.wonderland.modules.knowledgestructure.common.Concept;
import org.jdesktop.wonderland.modules.knowledgestructure.common.KnowledgeStructureClientState;
import org.jdesktop.wonderland.modules.knowledgestructure.common.Participant;

/**
 *
 * @author prajish
 */
public class KnowledgeStructure extends Cell {
    private List<Concept> concepts=null;
    private List<Challenge>challenges=null;
    private List<Participant>participants=null;
    
    public KnowledgeStructure(CellID cellID, CellCache cellCache) {
        super(cellID, cellCache);
    }

    public List<Concept> getConcepts() {
        return concepts;
    }

    public void setConcepts(List<Concept> concepts) {
        this.concepts = concepts;
    }

    public List<Challenge> getChallenges() {
        return challenges;
    }

    public void setChallenges(List<Challenge> challenges) {
        this.challenges = challenges;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
    
    @Override
    public void setClientState(CellClientState state){
        super.setClientState(state);
        this.concepts=((KnowledgeStructureClientState)(state)).getConcepts();
        this.challenges=((KnowledgeStructureClientState)(state)).getChallenges();
        this.participants=((KnowledgeStructureClientState)(state)).getParticipants();
    }
    
}
