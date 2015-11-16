/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author prajish
 */
@XmlRootElement(name="completedChallenge")
public class CompletedChallenge {
    private Challenge challenge;
    private float score;
    private float time;

    @XmlElement(name = "challenge")
    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
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
