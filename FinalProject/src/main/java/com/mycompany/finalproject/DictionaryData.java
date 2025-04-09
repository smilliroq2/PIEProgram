/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author jacks
 */
import java.util.*;

public class DictionaryData {
    // This line creates the total map containing all word types, subtypes,
    // and word lists respectively
    private static final Map<String, Map<String, List<String>>> dictionary = new HashMap<>();

    // Static method to initialize the word lists under each subcategory, with
    //the default language for user interaction/translation being English.
    public static void initializeData() {
        // This section creates Map Arrays for each of the different types
        //of nouns.
        Map<String, List<String>> nounSubcategories = new HashMap<>();
        nounSubcategories.put("Common Noun", Arrays.asList
        ("person", "dog", "ear", "mouth", "phone",
            "man", "cat", "nose", "program", "computer", 
            "woman", "family", "eye", "system", "text", 
            "child", "group", "head", "friend", "screen", 
            "parent", "number", "foot", "enemy", "keyboard", 
            "mother", "thing", "leg", "question", "message", 
            "father", "student", "arm", "answer", "partner", 
            "day", "country", "hand", "work", "husband", 
            "star", "problem", "machine", "home", "wife", 
            "morning", "part", "solution", "clothing", "boyfriend", 
            "noon", "place", "year", "food", "girlfriend", 
            "afternoon", "case", "month", "water", "north", 
            "evening", "week", "decade", "money", "south", 
            "night", "community", "company", "government", "east",
             "midnight", "neighbor", "employee", "country", "west",
             "city", "language", "dictionary", "car", "airplane"));
        
        nounSubcategories.put("Proper Noun", Arrays.asList
        ("January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", 
            "December", "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"));
        
        nounSubcategories.put("Abstract Noun", Arrays.asList
        ("love", "anger", "joy", "fear", "hate", "happiness", "sadness",
            "courage", "peace", "hope", "honesty", "wisdom", "wisdom", 
            "generosity", "beauty", "empathy", "sympathy", "apathy", 
            "respect", "strength", "truth", "trust", "pride", 
            "jealousy", "life", "death"));
        
        nounSubcategories.put("Collective Noun", Arrays.asList
        ("quiver", "body", "regiment", "cluster", "range", "crew", "dynasty",
            "class", "ream", "collection", "squad", "company", 
            "set", "bevy", "staff", "haul", "sheaf", "string", 
            "fling", "shower", "flight", "stud", "string", "stack", 
            "line", "block", "gang", "chest", "cloud", 
            "crowd", "party", "school"));

        
        // This section creates Map Arrays for each of the different types
        //of verbs.
    Map<String, List<String>> verbSubcategories = new HashMap<>();
    verbSubcategories.put("Action Verb", Arrays.asList
    ("walk", "listen", "write", "eat", "run", "cry", "open", "drink", 
        "ride", "think", "close", "cook", "sit", "sing", "sleep", 
        "wash", "stand", "watch", "throw", "talk", "fight", "dance", 
        "cut", "push", "laugh", "crawl", "fly", "pull", "read", 
        "slide", "give", "climb", "play", "win", "jump", "wait"));
          
    verbSubcategories.put("Stative Verb", Arrays.asList
    ("have", "sound", "love", "need", "know", "disagree", "cost", "own", 
        "hear", "like", "desire", "believe", "deny", "measure", 
        "possess", "smell", "dislike", "wish", "doubt", "promise", 
        "weigh", "pack", "see", "hate", "hope", "think", "satisfy", 
        "owe", "consist", "look", "adore", "value", "suppose", "realize", 
        "seem", "involve", "taste", "prefer", "recognize", "appear", "fit", 
        "include", "touch", "care", "forget", "astonish", "depend", "contain", 
        "feel", "mind", "remember", "please", "matter", "want", "appreciate", 
        "mean", "surprise", "agree", "concern", "understand"));
        
    verbSubcategories.put("Transitive Verb", Arrays.asList
    ("praise", "summon", "strengthen", "tempt", "reassure", "befriend", 
        "soothe", "soak", "enlist", "love", "draw", "lead", "turn on", 
        "grab", "ignite", "impress", "inflate", "turn off", "push", 
        "preach", "worship", "embrace", "modify", "reduce"));
        
    verbSubcategories.put("Linking", Arrays.asList
    ("appear", "be", "look", "prove", "become", "remain", "did", "seem", 
            "smell", "does", "sound", "feel", "stay", "taste", 
            "grow", "had", "turn", "has", "will", "would"));
        
    
        // This section creates Map Arrays for each of the different types
        //of adjectives.
        Map<String, List<String>> adjSubCategories = new HashMap<> ();
        adjSubCategories.put("Possessive", Arrays.asList
        ("my", "your", "our", "his", "her", "their", "its"));
        
        adjSubCategories.put("Interrogative", Arrays.asList
        ("what", "which", "whose" ));
        
        adjSubCategories.put("Demonstrative", Arrays.asList
        ("this", "that", "these", "those"));
        
        adjSubCategories.put("Compound", Arrays.asList
        ("hard-working", "high-tech", "long-term", "low-budget", 
                "old-fashioned", "open-minded", "right-handed", 
                "left-handed", "well-known", "well-dressed", "blue-collar", 
                "white-collar", "wide-eyed", "well-read", "well-received", 
                "high-end", "low-key", "close-knit", "high-energy", 
                "hard-hitting", "fast-paced", "strong-willed"));
        
        
        // This section creates Map Arrays for each of the different types
        //of prepositions.   
    Map<String, List<String>> prepSubCategories = new HashMap<> ();
    prepSubCategories.put("Time", Arrays.asList
    ("in", "at", "on", "during", "for", "until", "since", "from", 
         "to", "ago", "before", "by", "after", "to", 
         "past", "between", "within"));
    
    prepSubCategories.put("Place", Arrays.asList
    ("in", "on", "beside", "at", "between", 
        "under", "behind", "in front of", "above",
        "opposite", "perpendicular", "parallel", 
        "among", "on top of", "near", "far"));
    
    prepSubCategories.put("Movement", Arrays.asList
    ("up", "down", "out of", "into", "in", "out", "under", "above", 
        "next to", "toward", "away", "past", "over", 
        "between",  "among", "in front of", "behind", 
        "onto", "off", "around", "under", "below", 
        "near", "far from", "along", "across", "through"));
    
    prepSubCategories.put("Manner", Arrays.asList
    ("with", "for", "of", "by", "like", "as", "in", "on"));
    
    
    // This section creates Map Arrays for each of the different types
    //of determiners.   
        Map<String, List<String>> detSubCategories = new HashMap<> ();
        detSubCategories.put("Articles", Arrays.asList
        ("a", "an", "the"));
        
        detSubCategories.put("Possessives", Arrays.asList
        ("my", "your", "his", "her", "their", "its", "our"));
        
        detSubCategories.put("Demonstratives", Arrays.asList
        ("this", "that", "these", "those"));
        
        detSubCategories.put("Quantifiers", Arrays.asList
        ("all", "every", "most", "many", "some", "a few", "any", "no", 
            "much", "a little", "several", "dozen", "hundred", 
            "thousand", "million", "billion", "none", "some of", 
            "plenty", "more", "less", "least", "a", "an"));
        
        

        // This section adds each of the subcategories into the dictionary
        //under their respective major categories
        dictionary.put("Noun", nounSubcategories);
        dictionary.put("Verb", verbSubcategories);
        dictionary.put("Adjective", adjSubCategories);
        dictionary.put("Preposition", prepSubCategories);
        dictionary.put("Determiner", detSubCategories);       
    }

    // This is the method that is used to obtain the subcategories under
    //each major word
    public static Map<String, List<String>> getSubcategories(String category) {
        return dictionary.get(category);
    }

   //This is the method is used to obtain the word lists under each subcategory
    public static List<String> getWords(String category, String subcategory) {
        Map<String, List<String>> subcategories = dictionary.get(category);
        return subcategories != null ? subcategories.get(subcategory) : Collections.emptyList();
    }
}
