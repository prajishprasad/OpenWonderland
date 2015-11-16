/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.common;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.jdesktop.wonderland.common.cell.state.CellServerState;
import org.jdesktop.wonderland.common.cell.state.annotation.ServerState;

/**
 *
 * @author prajish
 */
@XmlRootElement(name="knowledge-structure")
@ServerState
public class KnowledgeStructureServerState extends CellServerState{
    
    @XmlElement(name="concepts")
    private List<Concept> concepts=loadConceptXMLFromDisk();
    @XmlElement(name="challenges")
    private List<Challenge>challenges=loadChallengeXMLFromDisk();
    @XmlElement(name="participants")
    private List<Participant>participants=loadParticipantXMLFromDisk();
    
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
    public String getServerClassName() {
        return "org.jdesktop.wonderland.modules.knowledgestructure.server.KnowledgeStructureMO";
    }

    public List<Concept> loadConceptXMLFromDisk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Challenge> loadChallengeXMLFromDisk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Participant> loadParticipantXMLFromDisk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
