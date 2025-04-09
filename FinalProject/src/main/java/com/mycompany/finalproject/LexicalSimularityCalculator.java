/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author jacks
 */
public class LexicalSimularityCalculator {
    
    
    public static Text calculateLexicalSimilarity(String langOne, String langTwo){
        
        Text simResultText = new Text();
        Font font1 = new Font ("Elephant", 14);
        
        String simPercentage;
        
        switch(langOne) {
            case "English":
                switch (langTwo) {
                    case "English": simPercentage = "100%"; break;
                    case "Spanish": simPercentage = "7.91%"; break; 
                    case "French": simPercentage = "9.66%"; break;
                    case "German": simPercentage = "4.72%"; break;
                    case "Dutch": simPercentage = "6.08%"; break;
                    case "Polish": simPercentage = "2.58%"; break;
                    case "Russian": simPercentage = "2.03%"; break;
                    case "Hindi": simPercentage = "0.63%"; break;
                    case "Farsi": simPercentage = "0.27%"; break;
                    default: simPercentage = "0";
                }
                break;
                
                    case "Spanish":
                switch (langTwo) {
                    case "English": simPercentage = "7.91%"; break;
                    case "Spanish": simPercentage = "100%"; break; 
                    case "French": simPercentage = "11.20%"; break;
                    case "German": simPercentage = "3.58%"; break;
                    case "Dutch": simPercentage = "4.46%"; break;
                    case "Polish": simPercentage = "2.90%"; break;
                    case "Russian": simPercentage = "2.25%"; break;
                    case "Hindi": simPercentage = "0.59%"; break;
                    case "Farsi": simPercentage = "0.28%"; break;
                    default: simPercentage = "0";
                }
                break;       
                
                        case "French":
                switch (langTwo) {
                    case "English": simPercentage = "9.66%"; break;
                    case "Spanish": simPercentage = "11.20%"; break; 
                    case "French": simPercentage = "100%"; break;
                    case "German": simPercentage = "4.16%"; break;
                    case "Dutch": simPercentage = "5.33%"; break;
                    case "Polish": simPercentage = "2.90%"; break;
                    case "Russian": simPercentage = "2.44%"; break;
                    case "Hindi": simPercentage = ".56%"; break;
                    case "Farsi": simPercentage = "0.35%"; break;
                    default: simPercentage = "0";
                }
                break;    
                
                        case "German":
                switch (langTwo) {
                    case "English": simPercentage = "4.72%"; break;
                    case "Spanish": simPercentage = "3.58%"; break; 
                    case "French": simPercentage = "4.16%"; break;
                    case "German": simPercentage = "100%"; break;
                    case "Dutch": simPercentage = "9.20%"; break;
                    case "Polish": simPercentage = "2.84%"; break;
                    case "Russian": simPercentage = "2.96%"; break;
                    case "Hindi": simPercentage = "0.69%"; break;
                    case "Farsi": simPercentage = "0.31%"; break;
                    default: simPercentage = "0";
                }
                break;  
                
                        case "Dutch":
                switch (langTwo) {
                    case "English": simPercentage = "6.10%"; break;
                    case "Spanish": simPercentage = "4.46%"; break; 
                    case "French": simPercentage = "5.33%"; break;
                    case "German": simPercentage = "9.20%"; break;
                    case "Dutch": simPercentage = "2.82%"; break;
                    case "Polish": simPercentage = "2.82%"; break;
                    case "Russian": simPercentage = "2.48%"; break;
                    case "Hindi": simPercentage = "0.84%"; break;
                    case "Farsi": simPercentage = "0.33%"; break;
                    default: simPercentage = "0";
                }
                break;    
                
                        case "Polish":
                switch (langTwo) {
                    case "English": simPercentage = "2.58%"; break;
                    case "Spanish": simPercentage = "2.90%"; break; 
                    case "French": simPercentage = "2.86%"; break;
                    case "German": simPercentage = "2.84%"; break;
                    case "Dutch": simPercentage = "2.82%"; break;
                    case "Polish": simPercentage = "100%"; break;
                    case "Russian": simPercentage = "3.88%"; break;
                    case "Hindi": simPercentage = "0.58%"; break;
                    case "Farsi": simPercentage = "0.25%"; break;
                    default: simPercentage = "0";
                }
                break;  
                
                        case "Russian":
                switch (langTwo) {
                    case "English": simPercentage = "2.03%"; break;
                    case "Spanish": simPercentage = "2.25%"; break; 
                    case "French": simPercentage = "2.44%"; break;
                    case "German": simPercentage = "2.84%"; break;
                    case "Dutch": simPercentage = "2.48%"; break;
                    case "Polish": simPercentage = "3.88%"; break;
                    case "Russian": simPercentage = "100%"; break;
                    case "Hindi": simPercentage = "0.59%"; break;
                    case "Farsi": simPercentage = "0.26%"; break;
                    default: simPercentage = "0";
                }
                break;    
                
                        case "Hindi":
                switch (langTwo) {
                    case "English": simPercentage = "0.63%"; break;
                    case "Spanish": simPercentage = "0.59%"; break; 
                    case "French": simPercentage = "0.56%"; break;
                    case "German": simPercentage = "0.81%"; break;
                    case "Dutch": simPercentage = "0.84%"; break;
                    case "Polish": simPercentage = "0.59%"; break;
                    case "Russian": simPercentage = "0.62%"; break;
                    case "Hindi": simPercentage = "100%"; break;
                    case "Farsi": simPercentage = "0.46%"; break;
                    default: simPercentage = "0";
                }
                break;    
                
                        case "Farsi":
                switch (langTwo) {
                    case "English": simPercentage = "0.27%"; break;
                    case "Spanish": simPercentage = "0.28%"; break; 
                    case "French": simPercentage = "0.35%"; break;
                    case "German": simPercentage = "0.10%"; break;
                    case "Dutch": simPercentage = "0.33%"; break;
                    case "Polish": simPercentage = "0.25%"; break;
                    case "Russian": simPercentage = "0.26%"; break;
                    case "Hindi": simPercentage = "0.46%"; break;
                    case "Farsi": simPercentage = "100%"; break;
                    default: simPercentage = "0";
                }
                break;    
                
                        default:
                            simPercentage = "0";
    }
        
        simResultText.setText
        ("The Lexical Similarity between " + langOne + " and " + langTwo + " is: " + simPercentage);
        simResultText.setStyle("-fx-text-fill: white;");
        
        
        return simResultText;
    
}
}

