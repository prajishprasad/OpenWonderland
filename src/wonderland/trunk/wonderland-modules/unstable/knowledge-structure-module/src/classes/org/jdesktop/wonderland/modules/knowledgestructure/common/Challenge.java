/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.common;

import java.util.ArrayList;
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
@XmlRootElement(name="challenge")
@XmlAccessorType(XmlAccessType.NONE)
public class Challenge {
    private String challengeId;
    private List<ConceptLOAssoc> conceptLOs; // Subset of learning objectives of concept
    private Integer maxScore;
    private List<Challenge> prerequisiteChallenges;

    @XmlAttribute(name="id")
    public String getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(String challengeId) {
        this.challengeId = challengeId;
    }

    @XmlElementWrapper( name="concepts" )
    @XmlElement(name="concept")
    public List<ConceptLOAssoc> getConceptLOs() {
        return conceptLOs;
    }

    public void setConceptLOs(List<ConceptLOAssoc> conceptLOs) {
        this.conceptLOs = conceptLOs;
    }
    @XmlElement(name="maxScore")
    public Integer getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
    }

    
    @XmlElementWrapper( name="prerequisiteChallenges" )
    @XmlElement(name="challenge")
    public List<Challenge> getPrerequisiteChallenges() {
        return prerequisiteChallenges;
    }

    
    public void setPrerequisiteChallenges(List<Challenge> prerequisiteChallenges) {
        this.prerequisiteChallenges = prerequisiteChallenges;
    }
    
    
    public List<String> getPrerequisiteChallengeIds(){
        List<String> challengeIds = new ArrayList<String>();
        if(prerequisiteChallenges!=null){
            for(Challenge challenge:prerequisiteChallenges){
                challengeIds.add(challenge.getChallengeId());
            }
        }
        
        return challengeIds;
    }
}
