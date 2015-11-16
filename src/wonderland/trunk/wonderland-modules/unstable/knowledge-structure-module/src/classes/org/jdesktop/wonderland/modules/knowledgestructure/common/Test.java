/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdesktop.wonderland.modules.knowledgestructure.common;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author prajish
 */
public class Test {
    
    public static void main(String argv[]){
        try {
            /* To generate Concept.xml   */
            /*File file = new File("Concepts.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Concepts.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Concepts concepts = (Concepts) jaxbUnmarshaller.unmarshal(file);
            System.out.println(concepts);
            
            //Reconvert to XML
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(concepts, new File("GeneratedConcepts.xml"));*/

            /*
            // To generate Challenges.xml
            
            File file = new File("Challenges.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Challenges.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Challenges challenges = (Challenges) jaxbUnmarshaller.unmarshal(file);
            System.out.println(challenges);
            
            //Reconvert to XML
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(challenges, new File("GeneratedChallenges.xml")); */
            
            // To generate Participants.xml
            File file = new File("Participants.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Participants.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Participants participants = (Participants) jaxbUnmarshaller.unmarshal(file);
            System.out.println(participants);
            
            //Reconvert to XML
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(participants, new File("GeneratedParticipants.xml"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
