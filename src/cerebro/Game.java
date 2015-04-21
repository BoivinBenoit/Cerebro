/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerebro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Damien
 */
public class Game {
    private final Id3 tree;
    private Id3 currentNode;
    private Model model;
    private ArrayList<String> userResponseIntitule = new ArrayList<String>();
    private ArrayList<String> userResponseValue = new ArrayList<String>();

    public Game(Id3 tree) {
        this.tree = tree;
        this.currentNode = tree;
    }

    public void start() {
        boolean propositionVraie = false;
        ArrayList<String> questionsFloues = new ArrayList<String>();



        while (!propositionVraie) {
            if (this.currentNode.m_Successors.length == 0) {
                System.out.println("Votre personnnage est-il ");
                System.out.println(this.currentNode.m_Attribute.name());
//                System.out.println(this.currentNode.m_Attribute);
                System.out.println("? y/n");
                propositionVraie = this.inputUser(new String[]{"y","n"}).equals("y");
                if (propositionVraie) {
                    //C'est le GG
                    model.changeScore(this.currentNode.m_Attribute.name(),this.userResponseIntitule, this.userResponseValue);
                } else {
                    //OMG YOU SUCK
                    if (questionsFloues.isEmpty()) {
//                        //on s'a gourré
                        System.out.println("Qui est votre personnage ?");
                        String newHero = inputUser();
                        if(model.characterAlreadyExists(newHero)) {
                            System.out.println("Ce personnage existe déjà dans la base de données. Ses informations ont été mises à jour selon vos réponses.");
                            model.changeScore(newHero,this.userResponseIntitule,this.userResponseValue);
                        } else {
                          System.out.println("Entrez une question qui différencie votre personnage de celui proposé : ");
                          String newQuestion = inputUser(new String[]{"oui","non"});
                            System.out.println(newQuestion + " ? oui/non");
                            String newResponse = inputUser();
                            boolean ResponseValue;
                            ResponseValue = newResponse.equals("oui");
                            deleteMaybe();
                            model.addNewHero(newHero,newQuestion,ResponseValue,userResponseIntitule,userResponseValue);
                        }
                    }
                    String qFloueCourante = questionsFloues.get(questionsFloues.size()-1);
                    int idQCourante = userResponseIntitule.indexOf(qFloueCourante);
                    String invertedrep = (userResponseValue.get(idQCourante).equals("oui"))?"non":"oui";
                    this.userResponseValue.set(idQCourante,invertedrep);
                    questionsFloues.remove(questionsFloues.size()-1);

//                    TODO redescendre sur l'arbre
                }
            } else {
                //On est forcement dans un noeud
                System.out.println(currentNode.m_Attribute.name());
                userResponseIntitule.add(currentNode.m_Attribute.toString());
                String CurrentResponse = inputUser();
                userResponseValue.add(CurrentResponse);
                switch(CurrentResponse){
                    case "probablement oui" :
                        questionsFloues.add(currentNode.m_Attribute.name());
                    case "oui" :
                        currentNode = currentNode.m_Successors[1];
                        break;
                    case "probablement non" :
                        questionsFloues.add(currentNode.m_Attribute.name());
                    case "non" :
                        currentNode = currentNode.m_Successors[0];
                        break;
                }
            }
        }
    }


    private String inputUser(String[] rep) {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        while (java.util.Arrays.asList(rep).indexOf(result) == -1) {
            System.out.println("?");
            result = sc.nextLine();
        }
        return result;
    }

    private String inputUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private void deleteMaybe(){
        for(String s : this.userResponseValue) {
            if(!s.equals("oui") && !s.equals("non")) {
                this.userResponseIntitule.remove(this.userResponseValue.indexOf(s));
                this.userResponseValue.remove(this.userResponseValue.indexOf(s));
            }
        }
    }
}
