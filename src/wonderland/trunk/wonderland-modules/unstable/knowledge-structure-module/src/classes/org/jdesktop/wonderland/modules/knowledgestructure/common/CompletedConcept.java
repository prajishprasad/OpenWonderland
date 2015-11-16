/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.common;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author prajish
 */
@XmlRootElement(name="completedConcept")
public class CompletedConcept {
    private List<ConceptLOAssoc> conceptLOs;
    private float score;
    private float time;

    
    @XmlElement(name="concept")
    public List<ConceptLOAssoc> getConceptLOs() {
        return conceptLOs;
    }

    public void setConceptLOs(List<ConceptLOAssoc> conceptLOs) {
        this.conceptLOs = conceptLOs;
    }
    
    @XmlElement(name="score")
    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @XmlElement(name="time")
    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
    
}
