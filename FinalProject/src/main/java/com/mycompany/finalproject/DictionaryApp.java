package com.mycompany.finalproject;
import static com.mycompany.finalproject.LexicalSimularityCalculator.calculateLexicalSimilarity;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.*;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class DictionaryApp extends Application {


    @Override
    public void start(Stage primaryStage) {
        
    //This section creates the fonts to be used throughout the program
        Pane pane = new Pane();
        Font font1 = new Font ("Elephant", 18);
        Font font2 = new Font ("Verdana", 16);
        Font font3 = new Font ("Cambria", 14); 
        DictionaryData.initializeData();
     
//This section uploads the image from the project files, sets its caption(s),
//and puts all of it together into a VBox
    Label friendlyGreeting = new Label ("Welcome! :)");
    friendlyGreeting.setFont(font1);
    friendlyGreeting.setStyle("-fx-text-fill: white;");
        
    Label picLabel = new Label("The Proto-Indo-European Family Tree (target langs circled)");
    picLabel.setFont(font1);
    picLabel.setStyle("-fx-text-fill: white;");
        
    Image image = new Image
        (getClass().getResourceAsStream("/images/PIEMapCircled.jpg"));
    ImageView imgView = new ImageView(image);
    imgView.setFitWidth(500);
    imgView.setFitHeight(500);
    imgView.setPreserveRatio(true);
        
    VBox picWithLabel = new VBox(5);
    picWithLabel.setStyle("-fx-alignment: center;");
    picWithLabel.getChildren().addAll(friendlyGreeting, imgView, picLabel);
    picWithLabel.setLayoutX(200);
    picWithLabel.setLayoutY(475);
        
    //This section creates the section of the program dedicated to showcasing
    //linguistic similarity via two choice boxes and a displayed String
       Label catLabel = new Label ("Please select a word category:");
       catLabel.setFont(font1);
       catLabel.setStyle("-fx-text-fill: white;");
       
       VBox catButtonsLayout = new VBox(10);
       catButtonsLayout.setStyle("-fx-background-color: purple;  -fx-padding: 10;");
       catButtonsLayout.getChildren().addAll(catLabel, createCategoryButtons(font2));
     
        ComboBox<String> langChoiceBoxOne = new ComboBox<>();
        ComboBox<String> langChoiceBoxTwo = new ComboBox<>();
        langChoiceBoxOne.getItems().addAll
        ("Dutch", "English", "Farsi", "French", "German","Hindi", "Polish", "Russian", "Spanish");   
    langChoiceBoxTwo.getItems().addAll
        ("Dutch", "English", "Farsi", "French", "German", "Hindi", "Polish", "Russian", "Spanish");

        Button calcSimButton = new Button("Calculate Lexical Similarity");
        calcSimButton.setFont(font2);
        calcSimButton.setStyle("-fx-text-fill: purple;");
        
        HBox lexSimFields = new HBox(5);
        lexSimFields.setAlignment(Pos.CENTER);

        Label l1Field = new Label ("Select Language One:");
        l1Field.setFont(font3);
        l1Field.setStyle("-fx-text-fill: white;");
        
        Label l2Field = new Label ("Select Language Two:");
        l2Field.setFont(font3);
        l2Field.setStyle("-fx-text-fill: white;");
        
        lexSimFields.getChildren().addAll
        (l1Field, langChoiceBoxOne, l2Field, langChoiceBoxTwo, calcSimButton);
        
        VBox lexSimLayout = new VBox(5);
lexSimLayout.setAlignment(Pos.CENTER);

// This section creates the labels and text String for showing results
Label simResultsLabel = new Label("Results of Lexical Similarity:");
simResultsLabel.setFont(font1);
simResultsLabel.setStyle("-fx-text-fill: white;");

Text simResultsText = new Text();
simResultsText.setFont(font1);
simResultsText.setWrappingWidth(600);
simResultsText.setStyle("-fx-fill: white;");

lexSimLayout.getChildren().addAll(simResultsLabel, simResultsText, lexSimFields);

calcSimButton.setOnAction(e -> {
    String langOne = langChoiceBoxOne.getValue();
    String langTwo = langChoiceBoxTwo.getValue();
    
    if (langOne != null && langTwo != null) {
        // Calls the calculateLexicalSimilarity method and get the result
        Text resultText = calculateLexicalSimilarity(langOne, langTwo);
        
        // Sets the result text in the simResultsText Text String
        simResultsText.setText(resultText.getText());
    } else {
        simResultsText.setText("Please select a language from both fields.");
    }
});

// This section puts all of the different items as VBoxes into one big VBox,
// and sets the stage using a pane containing the main VBox
VBox mainLayout = new VBox(15);
mainLayout.setStyle("-fx-background-color: black; -fx-padding: 10;");
mainLayout.getChildren().addAll(picWithLabel, catButtonsLayout, lexSimLayout);
        pane.getChildren().add(mainLayout);   

        Scene scene = new Scene(pane, 710, 735);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The P.I.E Program");
        primaryStage.show();
    }
    
//This method creates the buttons for the word categories, and sets the design
//of the VBox they rest within.    
    public VBox createCategoryButtons(Font font2) {
        
    Button nounButton = new Button("Noun");
    nounButton.setFont(font2);
    nounButton.setStyle("-fx-background-color: lavender; ");
    nounButton.setStyle("-fx-text-fill: black;");
    
    Button verbButton = new Button("Verb");
    verbButton.setFont(font2);
    verbButton.setStyle("-fx-background-color: lavender; ");
    verbButton.setStyle("-fx-text-fill: black;");
    
    Button adjButton = new Button("Adjective");
    adjButton.setFont(font2);
    adjButton.setStyle("-fx-background-color: lavender; ");
    adjButton.setStyle("-fx-text-fill: black;");
    
    Button prepButton = new Button("Preposition");
    prepButton.setFont(font2);
    prepButton.setStyle("-fx-background-color: lavender; ");
    prepButton.setStyle("-fx-text-fill: black;");
    
    Button detButton = new Button("Determiner");
    detButton.setFont(font2);
    detButton.setStyle("-fx-background-color: lavender; ");
    detButton.setStyle("-fx-text-fill: black;");

    VBox categoryButtons = new VBox(10);
    categoryButtons.setStyle("-fx-background-color: pink; -fx-padding: 10;");
    categoryButtons.getChildren().addAll
                (nounButton, verbButton, adjButton, prepButton, detButton);

    // This section defines the action of pressing each button by assigning it
    // to a method declared later on in the class.
    nounButton.setOnAction(e -> showNounSubcategories());
    verbButton.setOnAction(e -> showVerbSubcategories());
    adjButton.setOnAction(e -> showAdjSubcategories());
    prepButton.setOnAction(e -> showPrepSubcategories());
    detButton.setOnAction(e -> showDetSubcategories());
    return categoryButtons;
}
    
    //This is the method that creates a vbox of the noun subtypes
    //and references the general method for bringing up the word list under
    //each respective noun subcategory
    private void showNounSubcategories() {
        Map<String, List<String>> nounSubcategories = 
                                        DictionaryData.getSubcategories("Noun");

        VBox nounCategoryLayout = new VBox(10);
        nounCategoryLayout.setStyle("-fx-background-color: pink; -fx-padding: 5;");
        for (String subcategory : nounSubcategories.keySet()) {
            Button subcategoryButton = new Button(subcategory);
            subcategoryButton.setStyle("-fx-background-color: lavender; ");
            subcategoryButton.setOnAction
        (e -> showWordsInSubcategory("Noun", subcategory));
            nounCategoryLayout.getChildren().add(subcategoryButton);
        }
        
        Scene scene = new Scene(nounCategoryLayout, 175, 150);
        Stage subcategoryStage = new Stage();
        subcategoryStage.setX(575);
        subcategoryStage.setY(450);
        subcategoryStage.setScene(scene);
        subcategoryStage.show();
    }

    //This is the method that creates a vbox of the verb subtypes
    //and references the general method for bringing up the word list under
    //each respective verb subcategory
    private void showVerbSubcategories() {
        Map<String, List<String>> verbSubcategories = 
                                        DictionaryData.getSubcategories("Verb");

        VBox verbCategoryLayout = new VBox(10);
        verbCategoryLayout.setStyle("-fx-background-color: pink; -fx-padding: 5;");
        for (String subcategory : verbSubcategories.keySet()) {
            Button subcategoryButton = new Button(subcategory);
            subcategoryButton.setStyle("-fx-background-color: lavender; ");
            subcategoryButton.setOnAction(e -> 
                                    showWordsInSubcategory("Verb", subcategory));
            verbCategoryLayout.getChildren().add(subcategoryButton);
        }
        
        Scene scene = new Scene(verbCategoryLayout, 175, 150);
        Stage subcategoryStage = new Stage();
        subcategoryStage.setX(575);
        subcategoryStage.setY(450);
        subcategoryStage.setScene(scene);
        subcategoryStage.show();
    }
        
    //This is the method that creates a vbox of the adjective subtypes
    //and references the general method for bringing up the word list under
    //each respective adjective subcategory
    private void showAdjSubcategories() {
        Map<String, List<String>> adjSubcategories = 
                                    DictionaryData.getSubcategories("Adjective");

        VBox adjCategoryLayout = new VBox(10);
        adjCategoryLayout.setStyle("-fx-background-color: pink; -fx-padding: 5;");
        for (String subcategory : adjSubcategories.keySet()) {
            Button subcategoryButton = new Button(subcategory);
            subcategoryButton.setStyle("-fx-background-color: lavender; ");
            subcategoryButton.setOnAction(e -> 
                                showWordsInSubcategory("Adjective", subcategory));
            adjCategoryLayout.getChildren().add(subcategoryButton);
        }
       
        Scene scene = new Scene(adjCategoryLayout, 175, 150);
        Stage subcategoryStage = new Stage();
        subcategoryStage.setX(575);
        subcategoryStage.setY(450);
        subcategoryStage.setScene(scene);
        subcategoryStage.show();
    }
    
    //This is the method that creates a vbox of the preposition subtypes
    //and references the general method for bringing up the word list under
    //each respective preposition subcategory
    private void showPrepSubcategories() {
        Map<String, List<String>> prepSubcategories = 
                DictionaryData.getSubcategories("Preposition");
        
        VBox prepCategoryLayout = new VBox(10);
        prepCategoryLayout.setStyle("-fx-background-color: pink; -fx-padding: 5;");
        for (String subcategory : prepSubcategories.keySet()) {
            Button subcategoryButton = new Button(subcategory);
            subcategoryButton.setStyle("-fx-background-color: lavender; ");
            subcategoryButton.setOnAction(e -> 
                    showWordsInSubcategory("Preposition", subcategory));
            prepCategoryLayout.getChildren().add(subcategoryButton);
        }
        
        Scene scene = new Scene(prepCategoryLayout, 175, 150);
        Stage subcategoryStage = new Stage();
        subcategoryStage.setX(575);
        subcategoryStage.setY(450);
        subcategoryStage.setScene(scene);
        subcategoryStage.show();
    }
    
    //This is the method that creates a vbox of the determiner subtypes
    //and references the general method for bringing up the word list under
    //each respective determiner subcategory
    private void showDetSubcategories() {
        Map<String, List<String>> detSubcategories = 
                                    DictionaryData.getSubcategories("Determiner");
        
        VBox detCategoryLayout = new VBox(10);
        detCategoryLayout.setStyle("-fx-background-color: pink; -fx-padding: 5;");
        for (String subcategory : detSubcategories.keySet()) {
            Button subcategoryButton = new Button(subcategory);
            subcategoryButton.setStyle("-fx-background-color: lavender; ");
            subcategoryButton.setOnAction(e -> 
                    showWordsInSubcategory("Determiner", subcategory));
            detCategoryLayout.getChildren().add(subcategoryButton);
        }
        
        Scene scene = new Scene(detCategoryLayout, 175, 150);
        Stage subcategoryStage = new Stage();
        subcategoryStage.setX(575);
        subcategoryStage.setY(450);
        subcategoryStage.setScene(scene);
        subcategoryStage.show();
    }
    
    
    // This is the method for setting the actions of the subcategory buttons,
    // including a reference for the method that pulls up
    // the eight translations as an alert to the user.
    private void showWordsInSubcategory(String category, String subcategory) {
        List<String> words = DictionaryData.getWords(category, subcategory);

        VBox wordsLayout = new VBox(5);
        wordsLayout.setStyle("-fx-background-color: pink; -fx-padding: 5;");
        for (String word : words) {
            Button wordButton = new Button(word);
            wordButton.setStyle("-fx-background-color: lavender; ");
            wordButton.setOnAction(e -> showWordTranslations(word));
            wordsLayout.getChildren().add(wordButton);
        }
        
        
        // This section creates a scroll pane for the words to be displayed
        // within, fit to the height and width of the window containing
        // all the word buttons. 
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(wordsLayout);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        
        Scene scene = new Scene(scrollPane, 150, 100);
        Stage wordsStage = new Stage();
        wordsStage.setX(775);
        wordsStage.setY(450);
        wordsStage.setScene(scene);
        wordsStage.show();
    }

    public void showWordTranslations(String word) {
       
        //// This section refers to the data used by the translator, which is
        /////held in a separate class called TranslationData that contains
        /////the method for assigning words to each language
        Map<String, String> translations = 
                                TranslationData.getTranslationsForWord(word);

        // This sectiom creates the translation message
        StringBuilder message = new StringBuilder();
        for (Map.Entry<String, String> entry : translations.entrySet()) {
            message.append(entry.getKey()).append(": ")
                                        .append(entry.getValue()).append("\n");
        }

         VBox translationsLayout = new VBox(10);
    translationsLayout.setStyle("-fx-background-color: black; -fx-padding: 5;");

    // Add the translations as Text nodes to the VBox
    Text headerText = new Text("Translations in 8 languages for " + word + ":");
    headerText.setFont(Font.font("Elephant", 18));
    headerText.setStyle("-fx-fill: white;");
    translationsLayout.getChildren().add(headerText);

    // Create a Text node for each translation and add to VBox
    for (Map.Entry<String, String> entry : translations.entrySet()) {
        Text translationText = new Text(entry.getKey() + ": " + entry.getValue());
        translationText.setFont(Font.font("Verdana", 14));
        translationText.setStyle("-fx-fill: white;");
        translationsLayout.getChildren().add(translationText);
    }

    // Create a ScrollPane to make sure the content is scrollable if there are many translations
    ScrollPane scrollPane = new ScrollPane();
    scrollPane.setContent(translationsLayout);
    scrollPane.setFitToHeight(true);
    scrollPane.setFitToWidth(true);

    // Create a new Scene for the translations window
    Scene scene = new Scene(scrollPane, 600, 260);
    Stage translationsStage = new Stage();
    translationsStage.setScene(scene);
    translationsStage.setTitle("Translations for " + word);
    translationsStage.setX(450);
    translationsStage.setY(415);
    translationsStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }
}