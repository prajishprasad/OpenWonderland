/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.common;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author prajish
 */
@XmlRootElement(name="concept")
public class Concept {
    private String conceptId;
    private String conceptName;
    private String definition;
    private List<String> attributes;
    private List<LearningObjective> learningObjectives;
    private List<SubConcept> subConcepts;

    @XmlAttribute(name = "id")
    public String getConceptId() {
        return conceptId;
    }

    public void setConceptId(String conceptId) {
        this.conceptId = conceptId;
    }

    @XmlElement(name="name")
    public String getConceptName() {
        return conceptName;
    }

    public void setConceptName(String conceptName) {
        this.conceptName = conceptName;
    }

    //@XmlElement(name="definition")
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    @XmlElementWrapper( name="learningObjectives" )
    @XmlElement(name="learningObjective")
    public List<LearningObjective> getLearningObjectives() {
        return learningObjectives;
    }

    public void setLearningObjectives(List<LearningObjective> learningObjectives) {
        this.learningObjectives = learningObjectives;
    }

    @XmlElementWrapper( name="subConcepts" )
    @XmlElement(name="concept")
    public List<SubConcept> getSubConcepts() {
        return subConcepts;
    }

    public void setSubConcepts(List<SubConcept> subConcepts) {
        this.subConcepts = subConcepts;
    }
    
}
