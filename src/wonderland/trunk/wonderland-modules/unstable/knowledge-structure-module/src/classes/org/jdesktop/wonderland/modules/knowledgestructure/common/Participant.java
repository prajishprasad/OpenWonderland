/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.common;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author prajish
 */
@XmlRootElement(name="participant")
public class Participant {
    
    private String participantId;
    private List<CompletedConcept> completedConcepts;
    private List<CompletedChallenge> completedChallenges; 
    
    /* When (List of LO's in Challenge = List of LO's in completedConcepts) Then 
            Add challenge to completedChallenges List
    */

    @XmlAttribute(name="id")
    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    @XmlElementWrapper(name="completedConcepts")
    @XmlElement(name="completedConcept")
    public List<CompletedConcept> getCompletedConcepts() {
        return completedConcepts;
    }

    public void setCompletedConcepts(List<CompletedConcept> completedConcepts) {
        this.completedConcepts = completedConcepts;
    }

    @XmlElementWrapper(name = "completedChallenges")
    @XmlElement(name="completedChallenge")
    public List<CompletedChallenge> getCompletedChallenges() {
        return completedChallenges;
    }

    public void setCompletedChallenges(List<CompletedChallenge> completedChallenges) {
        this.completedChallenges = completedChallenges;
    }
    
}
