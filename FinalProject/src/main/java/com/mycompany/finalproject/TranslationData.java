/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jacks
 */


public class TranslationData {

    public static Map<String, String> getTranslationsForWord(String word) {
        Map<String, String> translations = new HashMap<>();
        
        
        //-----------MASTER INDEX-----------
        //(organized by lines of code)
        
        //  Common Nouns = 53 to 302
        //  Proper Nouns = 305 to 512
        //  Abstract Nouns = 515 to 788
        //  Collective Nouns = 791 to 1097
        
        //  Action Verbs = 1100 to 1455
        //  Stative Verbs = 1457 to 2056
        //  Transitive Verbs = 2058 to 2297
        //  Linking Verbs = 2301 to 2500
        
        //  Compound Adjectives = 2506 to 2768
        //  Demonstrative Adjectives = 2739 to 2768
        //  Interrogative Adjectives = 2771 to 2800
        //  Possessive Adjectives = 2803 to 2872
        
        //  Manner Prepositions = 2877 to 2956
        //  Movement Prepositions = 2960 to 3229
        //  Place Prepositions = 3233 to 3392
        //  Time Prepositions = 3396 to 3555
        
        //  Article Determiners = 3561 to 3590
        //  Demonstrative Determiners = 3593 to 3622
        //  Possessive Determiners = 3625 to 3694
        //  Quantifier Determiners = 3698 to 3960
        

            //COMMON NOUNS SECTION
        if (word.equals("person")) {
            translations.put("Spanish", "persona");
            translations.put("French", "personne");
            translations.put("Dutch", "persoon");
            translations.put("German", "Person");
            translations.put("Polish", "osoba");
            translations.put("Russian", "человек");
            translations.put("Hindi", "व्यक्ति");
            translations.put("Farsi", "شخص ");
        }
        if (word.equals("dog")) {
            translations.put("Spanish", "perro");
            translations.put("French", "chien");
            translations.put("Dutch", "hond");
            translations.put("German", "Hund");
            translations.put("Polish", "pies");
            translations.put("Russian", "собака");
            translations.put("Hindi", "कुत्ता");
            translations.put("Farsi", "سگ ");
        }
        if (word.equals("ear")) {
            translations.put("Spanish", "oreja");
            translations.put("French", "oreille");
            translations.put("Dutch", "oor");
            translations.put("German", "Ohr");
            translations.put("Polish", "ucho");
            translations.put("Russian", "ухо");
            translations.put("Hindi", "कान");
            translations.put("Farsi", "گوش ");
        }
        if (word.equals("mouth")) {
            translations.put("Spanish", "boca");
            translations.put("French", "bouche");
            translations.put("Dutch", "mond");
            translations.put("German", "Mund");
            translations.put("Polish", "usta");
            translations.put("Russian", "рот ");
            translations.put("Hindi", "मुंह ");
            translations.put("Farsi", "دهان ");
        }
        if (word.equals("phone")) {
            translations.put("Spanish", "teléfono");
            translations.put("French", "téléphone");
            translations.put("Dutch", "telefoon");
            translations.put("German", "Telefon");
            translations.put("Polish", "telefon");
            translations.put("Russian", "телефон ");
            translations.put("Hindi", "फोन");
            translations.put("Farsi", "تلفن ");
        }
        if (word.equals("man")) {
            translations.put("Spanish", "hombre");
            translations.put("French", "homme");
            translations.put("Dutch", "man");
            translations.put("German", "Mann");
            translations.put("Polish", "mężczyzna");
            translations.put("Russian", "мужчина");
            translations.put("Hindi", "आदमी ");
            translations.put("Farsi", "مرد ");
        }
        if (word.equals("cat")) {
            translations.put("Spanish", "gato");
            translations.put("French", "chat");
            translations.put("Dutch", "kat");
            translations.put("German", "Katze");
            translations.put("Polish", "kot");
            translations.put("Russian", "кот");
            translations.put("Hindi", "बिल्ली");
            translations.put("Farsi", "گربه");
        }
        if (word.equals("nose")) {
            translations.put("Spanish", "nariz");
            translations.put("French", "nez");
            translations.put("Dutch", "neus");
            translations.put("German", "Nase");
            translations.put("Polish", "nos");
            translations.put("Russian", "нос");
            translations.put("Hindi", "नाक");
            translations.put("Farsi", "بینی");
        }
        if (word.equals("program")) {
            translations.put("Spanish", "programa");
            translations.put("French", "programme");
            translations.put("Dutch", "programma");
            translations.put("German", "Programm");
            translations.put("Polish", "program");
            translations.put("Russian", "программа");
            translations.put("Hindi", "कार्यक्रम");
            translations.put("Farsi", "برنامه");
        }
        if (word.equals("computer")) {
            translations.put("Spanish", "computadora");
            translations.put("French", "ordinateur");
            translations.put("Dutch", "computer");
            translations.put("German", "Computer");
            translations.put("Polish", "komputer");
            translations.put("Russian", "компьютер");
            translations.put("Hindi", "कंप्यूटर");
            translations.put("Farsi", "رایانه");
        }
        if (word.equals("woman")) {
            translations.put("Spanish", "mujer");
            translations.put("French", "femme");
            translations.put("Dutch", "vrouw");
            translations.put("German", "Frau");
            translations.put("Polish", "kobieta");
            translations.put("Russian", "женщина");
            translations.put("Hindi", "महिला");
            translations.put("Farsi", "زن");
        }
        if (word.equals("family")) {
            translations.put("Spanish", "familia");
            translations.put("French", "famille");
            translations.put("Dutch", "familie");
            translations.put("German", "Familie");
            translations.put("Polish", "rodzina");
            translations.put("Russian", "семья");
            translations.put("Hindi", "पारिवारिक");
            translations.put("Farsi", "خانواده");
        }
        if (word.equals("eye")) {
            translations.put("Spanish", "ojo");
            translations.put("French", "œil");
            translations.put("Dutch", "oog");
            translations.put("German", "Auge");
            translations.put("Polish", "oko");
            translations.put("Russian", "глаз");
            translations.put("Hindi", "आँख");
            translations.put("Farsi", "چشم");
        }
        if (word.equals("system")) {
            translations.put("Spanish", "sistema");
            translations.put("French", "système");
            translations.put("Dutch", "systeem");
            translations.put("German", "System");
            translations.put("Polish", "system");
            translations.put("Russian", "система");
            translations.put("Hindi", "सिस्टम");
            translations.put("Farsi", "سیستم");
        }
        if (word.equals("text")) {
            translations.put("Spanish", "texto");
            translations.put("French", "texte");
            translations.put("Dutch", "tekst");
            translations.put("German", "Text");
            translations.put("Polish", "tekst");
            translations.put("Russian", "текст");
            translations.put("Hindi", "पाठ");
            translations.put("Farsi", "متن");
        }
        if (word.equals("child")) {
            translations.put("Spanish", "niño");
            translations.put("French", "enfant");
            translations.put("Dutch", "kind");
            translations.put("German", "Kind");
            translations.put("Polish", "dziecko");
            translations.put("Russian", "ребёнок");
            translations.put("Hindi", "बच्चा");
            translations.put("Farsi", "کودک");
        }
        if (word.equals("group")) {
            translations.put("Spanish", "grupo");
            translations.put("French", "groupe");
            translations.put("Dutch", "groep");
            translations.put("German", "Gruppe");
            translations.put("Polish", "grupa");
            translations.put("Russian", "группа");
            translations.put("Hindi", "समूह");
            translations.put("Farsi", "گروه");
        }
        if (word.equals("head")) {
            translations.put("Spanish", "cabeza");
            translations.put("French", "tête");
            translations.put("Dutch", "hoofd");
            translations.put("German", "Kopf");
            translations.put("Polish", "głowa");
            translations.put("Russian", "голова");
            translations.put("Hindi", "सिर");
            translations.put("Farsi", "سر");
        }
        if (word.equals("friend")) {
            translations.put("Spanish", "amigo");
            translations.put("French", "ami");
            translations.put("Dutch", "vriend");
            translations.put("German", "Freund");
            translations.put("Polish", "przyjaciel");
            translations.put("Russian", "друг");
            translations.put("Hindi", "मित्र");
            translations.put("Farsi", "دوست");
        }
        if (word.equals("screen")) {
            translations.put("Spanish", "pantalla");
            translations.put("French", "écran");
            translations.put("Dutch", "scherm");
            translations.put("German", "Bildschirm");
            translations.put("Polish", "ekran");
            translations.put("Russian", "экран");
            translations.put("Hindi", "स्क्रीन");
            translations.put("Farsi", "صفحه نمایش");
        }
        if (word.equals("parent")) {
            translations.put("Spanish", "padre");
            translations.put("French", "parent");
            translations.put("Dutch", "ouder");
            translations.put("German", "Eltern");
            translations.put("Polish", "rodzic");
            translations.put("Russian", "родитель");
            translations.put("Hindi", "माता-पिता");
            translations.put("Farsi", "والدین");
        }
        if (word.equals("number")) {
            translations.put("Spanish", "número");
            translations.put("French", "numéro");
            translations.put("Dutch", "nummer");
            translations.put("German", "Nummer");
            translations.put("Polish", "numer");
            translations.put("Russian", "номер");
            translations.put("Hindi", "संख्या");
            translations.put("Farsi", "شماره");
        }
        if (word.equals("foot")) {
            translations.put("Spanish", "pie");
            translations.put("French", "pied");
            translations.put("Dutch", "voet");
            translations.put("German", "Fuß");
            translations.put("Polish", "stopa");
            translations.put("Russian", "нога");
            translations.put("Hindi", "पैर");
            translations.put("Farsi", "پا");
        }
        if (word.equals("enemy")) {
            translations.put("Spanish", "enemigo");
            translations.put("French", "ennemi");
            translations.put("Dutch", "vijand");
            translations.put("German", "Feind");
            translations.put("Polish", "wróg");
            translations.put("Russian", "враг");
            translations.put("Hindi", "दुश्मन");
            translations.put("Farsi", "دشمن");
        }
        if (word.equals("keyboard")) {
            translations.put("Spanish", "teclado");
            translations.put("French", "clavier");
            translations.put("Dutch", "toetsenbord");
            translations.put("German", "Tastatur");
            translations.put("Polish", "klawiatura");
            translations.put("Russian", "клавиатура");
            translations.put("Hindi", "कीबोर्ड");
            translations.put("Farsi", "صفحه کلید");
        }
            if (word.equals("mother")) {
        translations.put("Spanish", "madre");
        translations.put("French", "mère");
        translations.put("Dutch", "moeder");
        translations.put("German", "Mutter");
        translations.put("Polish", "matka");
        translations.put("Russian", "мать");
        translations.put("Hindi", "माँ");
        translations.put("Farsi", "مادر");
    }

    if (word.equals("thing")) {
        translations.put("Spanish", "cosa");
        translations.put("French", "chose");
        translations.put("Dutch", "ding");
        translations.put("German", "Ding");
        translations.put("Polish", "rzecz");
        translations.put("Russian", "вещь");
        translations.put("Hindi", "चीज");
        translations.put("Farsi", "چیز");
    }

    if (word.equals("leg")) {
        translations.put("Spanish", "pierna");
        translations.put("French", "jambe");
        translations.put("Dutch", "been");
        translations.put("German", "Bein");
        translations.put("Polish", "noga");
        translations.put("Russian", "нога");
        translations.put("Hindi", "पैर");
        translations.put("Farsi", "پا");
    }

    if (word.equals("question")) {
        translations.put("Spanish", "pregunta");
        translations.put("French", "question");
        translations.put("Dutch", "vraag");
        translations.put("German", "Frage");
        translations.put("Polish", "pytanie");
        translations.put("Russian", "вопрос");
        translations.put("Hindi", "सवाल");
        translations.put("Farsi", "سوال");
    }

    if (word.equals("message")) {
        translations.put("Spanish", "mensaje");
        translations.put("French", "message");
        translations.put("Dutch", "bericht");
        translations.put("German", "Nachricht");
        translations.put("Polish", "wiadomość");
        translations.put("Russian", "сообщение");
        translations.put("Hindi", "संदेश");
        translations.put("Farsi", "پیام");
    }

    if (word.equals("father")) {
        translations.put("Spanish", "padre");
        translations.put("French", "père");
        translations.put("Dutch", "vader");
        translations.put("German", "Vater");
        translations.put("Polish", "ojciec");
        translations.put("Russian", "отец");
        translations.put("Hindi", "पिता");
        translations.put("Farsi", "پدر");
    }

    if (word.equals("student")) {
        translations.put("Spanish", "estudiante");
        translations.put("French", "étudiant");
        translations.put("Dutch", "student");
        translations.put("German", "Student");
        translations.put("Polish", "uczeń");
        translations.put("Russian", "студент");
        translations.put("Hindi", "छात्र");
        translations.put("Farsi", "دانش‌آموز");
    }

    if (word.equals("arm")) {
        translations.put("Spanish", "brazo");
        translations.put("French", "bras");
        translations.put("Dutch", "arm");
        translations.put("German", "Arm");
        translations.put("Polish", "ręka");
        translations.put("Russian", "рука");
        translations.put("Hindi", "बाँह");
        translations.put("Farsi", "بازو");
    }

    if (word.equals("answer")) {
        translations.put("Spanish", "respuesta");
        translations.put("French", "réponse");
        translations.put("Dutch", "antwoord");
        translations.put("German", "Antwort");
        translations.put("Polish", "odpowiedź");
        translations.put("Russian", "ответ");
        translations.put("Hindi", "उत्तर");
        translations.put("Farsi", "پاسخ");
    }

    if (word.equals("partner")) {
        translations.put("Spanish", "pareja");
        translations.put("French", "partenaire");
        translations.put("Dutch", "partner");
        translations.put("German", "Partner");
        translations.put("Polish", "partner");
        translations.put("Russian", "партнер");
        translations.put("Hindi", "साथी");
        translations.put("Farsi", "همکار");
    }

    if (word.equals("day")) {
        translations.put("Spanish", "día");
        translations.put("French", "jour");
        translations.put("Dutch", "dag");
        translations.put("German", "Tag");
        translations.put("Polish", "dzień");
        translations.put("Russian", "день");
        translations.put("Hindi", "दिन");
        translations.put("Farsi", "روز");
    }

    if (word.equals("country")) {
        translations.put("Spanish", "país");
        translations.put("French", "pays");
        translations.put("Dutch", "land");
        translations.put("German", "Land");
        translations.put("Polish", "kraj");
        translations.put("Russian", "страна");
        translations.put("Hindi", "देश");
        translations.put("Farsi", "کشور");
    }

    if (word.equals("hand")) {
        translations.put("Spanish", "mano");
        translations.put("French", "main");
        translations.put("Dutch", "hand");
        translations.put("German", "Hand");
        translations.put("Polish", "ręka");
        translations.put("Russian", "рука");
        translations.put("Hindi", "हाथ");
        translations.put("Farsi", "دست");
    }

    if (word.equals("work")) {
        translations.put("Spanish", "trabajo");
        translations.put("French", "travail");
        translations.put("Dutch", "werk");
        translations.put("German", "Arbeit");
        translations.put("Polish", "praca");
        translations.put("Russian", "работа");
        translations.put("Hindi", "काम");
        translations.put("Farsi", "کار");
    }

    if (word.equals("husband")) {
        translations.put("Spanish", "esposo");
        translations.put("French", "mari");
        translations.put("Dutch", "man");
        translations.put("German", "Ehemann");
        translations.put("Polish", "mąż");
        translations.put("Russian", "муж");
        translations.put("Hindi", "पति");
        translations.put("Farsi", "شوهر");
    }

    if (word.equals("star")) {
        translations.put("Spanish", "estrella");
        translations.put("French", "étoile");
        translations.put("Dutch", "ster");
        translations.put("German", "Stern");
        translations.put("Polish", "gwiazda");
        translations.put("Russian", "звезда");
        translations.put("Hindi", "तारा");
        translations.put("Farsi", "ستاره");
    }

    if (word.equals("problem")) {
        translations.put("Spanish", "problema");
        translations.put("French", "problème");
        translations.put("Dutch", "probleem");
        translations.put("German", "Problem");
        translations.put("Polish", "problem");
        translations.put("Russian", "проблема");
        translations.put("Hindi", "समस्या");
        translations.put("Farsi", "مشکل");
    }

    if (word.equals("machine")) {
        translations.put("Spanish", "máquina");
        translations.put("French", "machine");
        translations.put("Dutch", "machine");
        translations.put("German", "Maschine");
        translations.put("Polish", "maszyna");
        translations.put("Russian", "машина");
        translations.put("Hindi", "मशीन");
        translations.put("Farsi", "دستگاه");
    }

    if (word.equals("home")) {
        translations.put("Spanish", "casa");
        translations.put("French", "maison");
        translations.put("Dutch", "huis");
        translations.put("German", "Haus");
        translations.put("Polish", "dom");
        translations.put("Russian", "дом");
        translations.put("Hindi", "घर");
        translations.put("Farsi", "خانه");
    }

    if (word.equals("wife")) {
        translations.put("Spanish", "esposa");
        translations.put("French", "femme");
        translations.put("Dutch", "vrouw");
        translations.put("German", "Ehefrau");
        translations.put("Polish", "żona");
        translations.put("Russian", "жена");
        translations.put("Hindi", "पत्नी");
        translations.put("Farsi", "همسر");
    }

    if (word.equals("morning")) {
        translations.put("Spanish", "mañana");
        translations.put("French", "matin");
        translations.put("Dutch", "ochtend");
        translations.put("German", "Morgen");
        translations.put("Polish", "rano");
        translations.put("Russian", "утро");
        translations.put("Hindi", "सुबह");
        translations.put("Farsi", "صبح");
    }

    if (word.equals("part")) {
        translations.put("Spanish", "parte");
        translations.put("French", "partie");
        translations.put("Dutch", "deel");
        translations.put("German", "Teil");
        translations.put("Polish", "część");
        translations.put("Russian", "часть");
        translations.put("Hindi", "भाग");
        translations.put("Farsi", "قسمت");
    }
     if (word.equals("solution")) {
        translations.put("Spanish", "solución");
        translations.put("French", "solution");
        translations.put("Dutch", "oplossing");
        translations.put("German", "Lösung");
        translations.put("Polish", "rozwiązanie");
        translations.put("Russian", "решение");
        translations.put("Hindi", "समाधान");
        translations.put("Farsi", "راه حل");
    }

    if (word.equals("clothing")) {
        translations.put("Spanish", "ropa");
        translations.put("French", "vêtements");
        translations.put("Dutch", "kleding");
        translations.put("German", "Kleidung");
        translations.put("Polish", "odzież");
        translations.put("Russian", "одежда");
        translations.put("Hindi", "कपड़े");
        translations.put("Farsi", "لباس");
    }

    if (word.equals("boyfriend")) {
        translations.put("Spanish", "novio");
        translations.put("French", "petit ami");
        translations.put("Dutch", "vriend");
        translations.put("German", "Freund");
        translations.put("Polish", "chłopak");
        translations.put("Russian", "парень");
        translations.put("Hindi", "प्रेमी");
        translations.put("Farsi", "دوست پسر");
    }

    if (word.equals("noon")) {
        translations.put("Spanish", "mediodía");
        translations.put("French", "midi");
        translations.put("Dutch", "midden van de dag");
        translations.put("German", "Mittag");
        translations.put("Polish", "południe");
        translations.put("Russian", "полдень");
        translations.put("Hindi", "दोपहर");
        translations.put("Farsi", "ظهر");
    }

    if (word.equals("place")) {
        translations.put("Spanish", "lugar");
        translations.put("French", "endroit");
        translations.put("Dutch", "plaats");
        translations.put("German", "Ort");
        translations.put("Polish", "miejsce");
        translations.put("Russian", "место");
        translations.put("Hindi", "जगह");
        translations.put("Farsi", "محل");
    }

    if (word.equals("year")) {
        translations.put("Spanish", "año");
        translations.put("French", "année");
        translations.put("Dutch", "jaar");
        translations.put("German", "Jahr");
        translations.put("Polish", "rok");
        translations.put("Russian", "год");
        translations.put("Hindi", "साल");
        translations.put("Farsi", "سال");
    }

    if (word.equals("food")) {
        translations.put("Spanish", "comida");
        translations.put("French", "nourriture");
        translations.put("Dutch", "eten");
        translations.put("German", "Essen");
        translations.put("Polish", "jedzenie");
        translations.put("Russian", "еда");
        translations.put("Hindi", "खाना");
        translations.put("Farsi", "غذا");
    }

    if (word.equals("girlfriend")) {
        translations.put("Spanish", "novia");
        translations.put("French", "petite amie");
        translations.put("Dutch", "vriendin");
        translations.put("German", "Freundin");
        translations.put("Polish", "dziewczyna");
        translations.put("Russian", "девушка");
        translations.put("Hindi", "प्रेमिका");
        translations.put("Farsi", "دوست دختر");
    }

    if (word.equals("afternoon")) {
        translations.put("Spanish", "tarde");
        translations.put("French", "après-midi");
        translations.put("Dutch", "middag");
        translations.put("German", "Nachmittag");
        translations.put("Polish", "popołudnie");
        translations.put("Russian", "после полудня");
        translations.put("Hindi", "दोपहर");
        translations.put("Farsi", "عصر");
    }

    if (word.equals("case")) {
        translations.put("Spanish", "caso");
        translations.put("French", "cas");
        translations.put("Dutch", "zaak");
        translations.put("German", "Fall");
        translations.put("Polish", "sprawa");
        translations.put("Russian", "случай");
        translations.put("Hindi", "मामला");
        translations.put("Farsi", "مورد");
    }

    if (word.equals("month")) {
        translations.put("Spanish", "mes");
        translations.put("French", "mois");
        translations.put("Dutch", "maand");
        translations.put("German", "Monat");
        translations.put("Polish", "miesiąc");
        translations.put("Russian", "месяц");
        translations.put("Hindi", "महिना");
        translations.put("Farsi", "ماه");
    }

    if (word.equals("water")) {
        translations.put("Spanish", "agua");
        translations.put("French", "eau");
        translations.put("Dutch", "water");
        translations.put("German", "Wasser");
        translations.put("Polish", "woda");
        translations.put("Russian", "вода");
        translations.put("Hindi", "पानी");
        translations.put("Farsi", "آب");
    }

    if (word.equals("north")) {
        translations.put("Spanish", "norte");
        translations.put("French", "nord");
        translations.put("Dutch", "noord");
        translations.put("German", "Norden");
        translations.put("Polish", "północ");
        translations.put("Russian", "север");
        translations.put("Hindi", "उत्तर");
        translations.put("Farsi", "شمال");
    }

    if (word.equals("evening")) {
        translations.put("Spanish", "tarde");
        translations.put("French", "soir");
        translations.put("Dutch", "avond");
        translations.put("German", "Abend");
        translations.put("Polish", "wieczór");
        translations.put("Russian", "вечер");
        translations.put("Hindi", "शाम");
        translations.put("Farsi", "عصر");
    }

    if (word.equals("week")) {
        translations.put("Spanish", "semana");
        translations.put("French", "semaine");
        translations.put("Dutch", "week");
        translations.put("German", "Woche");
        translations.put("Polish", "tydzień");
        translations.put("Russian", "неделя");
        translations.put("Hindi", "सप्ताह");
        translations.put("Farsi", "هفته");
    }

    if (word.equals("decade")) {
        translations.put("Spanish", "década");
        translations.put("French", "décennie");
        translations.put("Dutch", "decennium");
        translations.put("German", "Jahrzehnt");
        translations.put("Polish", "dekada");
        translations.put("Russian", "десятилетие");
        translations.put("Hindi", "दशक");
        translations.put("Farsi", "دهه");
    }

    if (word.equals("money")) {
        translations.put("Spanish", "dinero");
        translations.put("French", "argent");
        translations.put("Dutch", "geld");
        translations.put("German", "Geld");
        translations.put("Polish", "pieniądze");
        translations.put("Russian", "деньги");
        translations.put("Hindi", "पैसे");
        translations.put("Farsi", "پول");
    }

    if (word.equals("south")) {
        translations.put("Spanish", "sur");
        translations.put("French", "sud");
        translations.put("Dutch", "zuid");
        translations.put("German", "Süden");
        translations.put("Polish", "południe");
        translations.put("Russian", "юг");
        translations.put("Hindi", "दक्षिण");
        translations.put("Farsi", "جنوب");
    }

    if (word.equals("night")) {
        translations.put("Spanish", "noche");
        translations.put("French", "nuit");
        translations.put("Dutch", "nacht");
        translations.put("German", "Nacht");
        translations.put("Polish", "noc");
        translations.put("Russian", "ночь");
        translations.put("Hindi", "रात");
        translations.put("Farsi", "شب");
    }

    if (word.equals("community")) {
        translations.put("Spanish", "comunidad");
        translations.put("French", "communauté");
        translations.put("Dutch", "gemeente");
        translations.put("German", "Gemeinschaft");
        translations.put("Polish", "społeczność");
        translations.put("Russian", "сообщество");
        translations.put("Hindi", "समुदाय");
        translations.put("Farsi", "جامعه");
    }

    if (word.equals("company")) {
        translations.put("Spanish", "compañía");
        translations.put("French", "entreprise");
        translations.put("Dutch", "bedrijf");
        translations.put("German", "Unternehmen");
        translations.put("Polish", "firma");
        translations.put("Russian", "компания");
        translations.put("Hindi", "कंपनी");
        translations.put("Farsi", "شرکت");
    }

    if (word.equals("government")) {
        translations.put("Spanish", "gobierno");
        translations.put("French", "gouvernement");
        translations.put("Dutch", "regering");
        translations.put("German", "Regierung");
        translations.put("Polish", "rząd");
        translations.put("Russian", "правительство");
        translations.put("Hindi", "सरकार");
        translations.put("Farsi", "دولت");
    }

    if (word.equals("east")) {
        translations.put("Spanish", "este");
        translations.put("French", "est");
        translations.put("Dutch", "oost");
        translations.put("German", "Osten");
        translations.put("Polish", "wschód");
        translations.put("Russian", "восток");
        translations.put("Hindi", "पूरब");
        translations.put("Farsi", "شرق");
    }

    if (word.equals("midnight")) {
        translations.put("Spanish", "medianoche");
        translations.put("French", "minuit");
        translations.put("Dutch", "middernacht");
        translations.put("German", "Mitternacht");
        translations.put("Polish", "północ");
        translations.put("Russian", "полночь");
        translations.put("Hindi", "आधी रात");
        translations.put("Farsi", "نیمه شب");
    }

    if (word.equals("neighbor")) {
        translations.put("Spanish", "vecino");
        translations.put("French", "voisin");
        translations.put("Dutch", "buurman");
        translations.put("German", "Nachbar");
        translations.put("Polish", "sąsiad");
        translations.put("Russian", "сосед");
        translations.put("Hindi", "पड़ोसी");
        translations.put("Farsi", "همسایه");
    }

    if (word.equals("employee")) {
        translations.put("Spanish", "empleado");
        translations.put("French", "employé");
        translations.put("Dutch", "werknemer");
        translations.put("German", "Angestellter");
        translations.put("Polish", "pracownik");
        translations.put("Russian", "сотрудник");
        translations.put("Hindi", "कर्मचारी");
        translations.put("Farsi", "کارمند");
    }

    if (word.equals("country")) {
        translations.put("Spanish", "país");
        translations.put("French", "pays");
        translations.put("Dutch", "land");
        translations.put("German", "Land");
        translations.put("Polish", "kraj");
        translations.put("Russian", "страна");
        translations.put("Hindi", "देश");
        translations.put("Farsi", "کشور");
    }

    if (word.equals("west")) {
        translations.put("Spanish", "oeste");
        translations.put("French", "ouest");
        translations.put("Dutch", "west");
        translations.put("German", "Westen");
        translations.put("Polish", "zachód");
        translations.put("Russian", "запад");
        translations.put("Hindi", "पश्चिम");
        translations.put("Farsi", "غرب");
    }

    if (word.equals("city")) {
        translations.put("Spanish", "ciudad");
        translations.put("French", "ville");
        translations.put("Dutch", "stad");
        translations.put("German", "Stadt");
        translations.put("Polish", "miasto");
        translations.put("Russian", "город");
        translations.put("Hindi", "शहर");
        translations.put("Farsi", "شهر");
    }

    if (word.equals("language")) {
        translations.put("Spanish", "idioma");
        translations.put("French", "langue");
        translations.put("Dutch", "taal");
        translations.put("German", "Sprache");
        translations.put("Polish", "język");
        translations.put("Russian", "язык");
        translations.put("Hindi", "भाषा");
        translations.put("Farsi", "زبان");
    }

    if (word.equals("dictionary")) {
        translations.put("Spanish", "diccionario");
        translations.put("French", "dictionnaire");
        translations.put("Dutch", "woordenboek");
        translations.put("German", "Wörterbuch");
        translations.put("Polish", "słownik");
        translations.put("Russian", "словарь");
        translations.put("Hindi", "शब्दकोश");
        translations.put("Farsi", "فرهنگ لغت");
    }

    if (word.equals("car")) {
        translations.put("Spanish", "coche");
        translations.put("French", "voiture");
        translations.put("Dutch", "auto");
        translations.put("German", "Auto");
        translations.put("Polish", "samochód");
        translations.put("Russian", "машина");
        translations.put("Hindi", "कार");
        translations.put("Farsi", "ماشین");
    }

    if (word.equals("airplane")) {
        translations.put("Spanish", "avión");
        translations.put("French", "avion");
        translations.put("Dutch", "vliegtuig");
        translations.put("German", "Flugzeug");
        translations.put("Polish", "samolot");
        translations.put("Russian", "самолёт");
        translations.put("Hindi", "विमान");
        translations.put("Farsi", "هواپیما");
    }

            //PROPER NOUNS SECTION
        if (word.equals("January")) {
            translations.put("Spanish", "enero");
            translations.put("French", "janvier");
            translations.put("Dutch", "januari");
            translations.put("German", "Januar");
            translations.put("Polish", "styczeń");
            translations.put("Russian", "январь");
            translations.put("Hindi", "जनवरी");
            translations.put("Farsi", "ژانویه");
        }

        if (word.equals("February")) {
            translations.put("Spanish", "febrero");
            translations.put("French", "février");
            translations.put("Dutch", "februari");
            translations.put("German", "Februar");
            translations.put("Polish", "luty");
            translations.put("Russian", "февраль");
            translations.put("Hindi", "फ़रवरी");
            translations.put("Farsi", "فوریه");
        }

        if (word.equals("March")) {
            translations.put("Spanish", "marzo");
            translations.put("French", "mars");
            translations.put("Dutch", "maart");
            translations.put("German", "März");
            translations.put("Polish", "marzec");
            translations.put("Russian", "март");
            translations.put("Hindi", "मार्च");
            translations.put("Farsi", "مارس");
        }

        if (word.equals("April")) {
            translations.put("Spanish", "abril");
            translations.put("French", "avril");
            translations.put("Dutch", "april");
            translations.put("German", "April");
            translations.put("Polish", "kwiecień");
            translations.put("Russian", "апрель");
            translations.put("Hindi", "अप्रैल");
            translations.put("Farsi", "آوریل");
        }

        if (word.equals("May")) {
            translations.put("Spanish", "mayo");
            translations.put("French", "mai");
            translations.put("Dutch", "mei");
            translations.put("German", "Mai");
            translations.put("Polish", "maj");
            translations.put("Russian", "май");
            translations.put("Hindi", "मई");
            translations.put("Farsi", "مه");
        }

        if (word.equals("June")) {
            translations.put("Spanish", "junio");
            translations.put("French", "juin");
            translations.put("Dutch", "juni");
            translations.put("German", "Juni");
            translations.put("Polish", "czerwiec");
            translations.put("Russian", "июнь");
            translations.put("Hindi", "जून");
            translations.put("Farsi", "ژوئن");
        }

        if (word.equals("July")) {
            translations.put("Spanish", "julio");
            translations.put("French", "juillet");
            translations.put("Dutch", "juli");
            translations.put("German", "Juli");
            translations.put("Polish", "lipiec");
            translations.put("Russian", "июль");
            translations.put("Hindi", "जुलाई");
            translations.put("Farsi", "جولای");
        }

        if (word.equals("August")) {
            translations.put("Spanish", "agosto");
            translations.put("French", "août");
            translations.put("Dutch", "augustus");
            translations.put("German", "August");
            translations.put("Polish", "sierpień");
            translations.put("Russian", "август");
            translations.put("Hindi", "अगस्त");
            translations.put("Farsi", "اوت");
        }

        if (word.equals("September")) {
            translations.put("Spanish", "septiembre");
            translations.put("French", "septembre");
            translations.put("Dutch", "september");
            translations.put("German", "September");
            translations.put("Polish", "wrzesień");
            translations.put("Russian", "сентябрь");
            translations.put("Hindi", "सितंबर");
            translations.put("Farsi", "سپتامبر");
        }

        if (word.equals("October")) {
            translations.put("Spanish", "octubre");
            translations.put("French", "octobre");
            translations.put("Dutch", "oktober");
            translations.put("German", "Oktober");
            translations.put("Polish", "październik");
            translations.put("Russian", "октябрь");
            translations.put("Hindi", "अक्टूबर");
            translations.put("Farsi", "اکتبر");
        }

        if (word.equals("November")) {
            translations.put("Spanish", "noviembre");
            translations.put("French", "novembre");
            translations.put("Dutch", "november");
            translations.put("German", "November");
            translations.put("Polish", "listopad");
            translations.put("Russian", "ноябрь");
            translations.put("Hindi", "नवंबर");
            translations.put("Farsi", "نوامبر");
        }

        if (word.equals("December")) {
            translations.put("Spanish", "diciembre");
            translations.put("French", "décembre");
            translations.put("Dutch", "december");
            translations.put("German", "Dezember");
            translations.put("Polish", "grudzień");
            translations.put("Russian", "декабрь");
            translations.put("Hindi", "दिसंबर");
            translations.put("Farsi", "دسامبر");
        }

        if (word.equals("Sunday")) {
            translations.put("Spanish", "domingo");
            translations.put("French", "dimanche");
            translations.put("Dutch", "zondag");
            translations.put("German", "Sonntag");
            translations.put("Polish", "niedziela");
            translations.put("Russian", "воскресенье");
            translations.put("Hindi", "रविवार");
            translations.put("Farsi", "یکشنبه");
        }

        if (word.equals("Monday")) {
            translations.put("Spanish", "lunes");
            translations.put("French", "lundi");
            translations.put("Dutch", "maandag");
            translations.put("German", "Montag");
            translations.put("Polish", "poniedziałek");
            translations.put("Russian", "понедельник");
            translations.put("Hindi", "सोमवार");
            translations.put("Farsi", "دوشنبه");
        }

        if (word.equals("Tuesday")) {
            translations.put("Spanish", "martes");
            translations.put("French", "mardi");
            translations.put("Dutch", "dinsdag");
            translations.put("German", "Dienstag");
            translations.put("Polish", "wtorek");
            translations.put("Russian", "вторник");
            translations.put("Hindi", "मंगलवार");
            translations.put("Farsi", "سه‌شنبه");
        }

        if (word.equals("Wednesday")) {
            translations.put("Spanish", "miércoles");
            translations.put("French", "mercredi");
            translations.put("Dutch", "woensdag");
            translations.put("German", "Mittwoch");
            translations.put("Polish", "środa");
            translations.put("Russian", "среда");
            translations.put("Hindi", "बुधवार");
            translations.put("Farsi", "چهارشنبه");
        }

        if (word.equals("Thursday")) {
            translations.put("Spanish", "jueves");
            translations.put("French", "jeudi");
            translations.put("Dutch", "donderdag");
            translations.put("German", "Donnerstag");
            translations.put("Polish", "czwartek");
            translations.put("Russian", "четверг");
            translations.put("Hindi", "गुरुवार");
            translations.put("Farsi", "پنج‌شنبه");
        }

        if (word.equals("Friday")) {
            translations.put("Spanish", "viernes");
            translations.put("French", "vendredi");
            translations.put("Dutch", "vrijdag");
            translations.put("German", "Freitag");
            translations.put("Polish", "piątek");
            translations.put("Russian", "пятница");
            translations.put("Hindi", "शुक्रवार");
            translations.put("Farsi", "جمعه");
        }

        if (word.equals("Saturday")) {
            translations.put("Spanish", "sábado");
            translations.put("French", "samedi");
            translations.put("Dutch", "zaterdag");
            translations.put("German", "Samstag");
            translations.put("Polish", "sobota");
            translations.put("Russian", "суббота");
            translations.put("Hindi", "शनिवार");
            translations.put("Farsi", "شنبه");
        }

            //ABSTRACT NOUNS SECTION
        if (word.equals("love")) {
            translations.put("Spanish", "amor");
            translations.put("French", "amour");
            translations.put("Dutch", "liefde");
            translations.put("German", "Liebe");
            translations.put("Polish", "miłość");
            translations.put("Russian", "любовь");
            translations.put("Hindi", "प्रेम");
            translations.put("Farsi", "عشق");
        }

        if (word.equals("anger")) {
            translations.put("Spanish", "ira");
            translations.put("French", "colère");
            translations.put("Dutch", "woede");
            translations.put("German", "Wut");
            translations.put("Polish", "gniew");
            translations.put("Russian", "гнев");
            translations.put("Hindi", "गुस्सा");
            translations.put("Farsi", "خشم");
        }

        if (word.equals("joy")) {
            translations.put("Spanish", "alegría");
            translations.put("French", "joie");
            translations.put("Dutch", "vreugde");
            translations.put("German", "Freude");
            translations.put("Polish", "radość");
            translations.put("Russian", "радость");
            translations.put("Hindi", "आनंद");
            translations.put("Farsi", "شادمانی");
        }

        if (word.equals("fear")) {
            translations.put("Spanish", "miedo");
            translations.put("French", "peur");
            translations.put("Dutch", "angst");
            translations.put("German", "Angst");
            translations.put("Polish", "strach");
            translations.put("Russian", "страх");
            translations.put("Hindi", "डर");
            translations.put("Farsi", "ترس");
        }

        if (word.equals("hate")) {
            translations.put("Spanish", "odio");
            translations.put("French", "haine");
            translations.put("Dutch", "haat");
            translations.put("German", "Hass");
            translations.put("Polish", "nienawiść");
            translations.put("Russian", "ненависть");
            translations.put("Hindi", "नफरत");
            translations.put("Farsi", "نفرت");
        }

        if (word.equals("happiness")) {
            translations.put("Spanish", "felicidad");
            translations.put("French", "bonheur");
            translations.put("Dutch", "geluk");
            translations.put("German", "Glück");
            translations.put("Polish", "szczęście");
            translations.put("Russian", "счастье");
            translations.put("Hindi", "खुशी");
            translations.put("Farsi", "خوشبختی");
        }

        if (word.equals("sadness")) {
            translations.put("Spanish", "tristeza");
            translations.put("French", "tristesse");
            translations.put("Dutch", "verdriet");
            translations.put("German", "Trauer");
            translations.put("Polish", "smutek");
            translations.put("Russian", "печаль");
            translations.put("Hindi", "उदासी");
            translations.put("Farsi", "غم");
        }

        if (word.equals("courage")) {
            translations.put("Spanish", "valentía");
            translations.put("French", "courage");
            translations.put("Dutch", "moed");
            translations.put("German", "Mut");
            translations.put("Polish", "odwaga");
            translations.put("Russian", "храбрость");
            translations.put("Hindi", "साहस");
            translations.put("Farsi", "شجاعت");
        }

        if (word.equals("peace")) {
            translations.put("Spanish", "paz");
            translations.put("French", "paix");
            translations.put("Dutch", "vrede");
            translations.put("German", "Frieden");
            translations.put("Polish", "pokój");
            translations.put("Russian", "мир");
            translations.put("Hindi", "शांति");
            translations.put("Farsi", "صلح");
        }

        if (word.equals("hope")) {
            translations.put("Spanish", "esperanza");
            translations.put("French", "espoir");
            translations.put("Dutch", "hoop");
            translations.put("German", "Hoffnung");
            translations.put("Polish", "nadzieja");
            translations.put("Russian", "надежда");
            translations.put("Hindi", "आशा");
            translations.put("Farsi", "امید");
        }

        if (word.equals("honesty")) {
            translations.put("Spanish", "honestidad");
            translations.put("French", "honnêteté");
            translations.put("Dutch", "eerlijkheid");
            translations.put("German", "Ehrlichkeit");
            translations.put("Polish", "uczciwość");
            translations.put("Russian", "честность");
            translations.put("Hindi", "ईमानदारी");
            translations.put("Farsi", "صداقت");
        }

        if (word.equals("wisdom")) {
            translations.put("Spanish", "sabiduría");
            translations.put("French", "sagesse");
            translations.put("Dutch", "wijsheid");
            translations.put("German", "Weisheit");
            translations.put("Polish", "mądrość");
            translations.put("Russian", "мудрость");
            translations.put("Hindi", "बुद्धिमत्ता");
            translations.put("Farsi", "حکمت");
        }

        if (word.equals("generosity")) {
            translations.put("Spanish", "generosidad");
            translations.put("French", "générosité");
            translations.put("Dutch", "vrijgevigheid");
            translations.put("German", "Großzügigkeit");
            translations.put("Polish", "hojność");
            translations.put("Russian", "щедрость");
            translations.put("Hindi", "उदारता");
            translations.put("Farsi", "بخشش");
        }

        if (word.equals("beauty")) {
            translations.put("Spanish", "belleza");
            translations.put("French", "beauté");
            translations.put("Dutch", "schoonheid");
            translations.put("German", "Schönheit");
            translations.put("Polish", "piękno");
            translations.put("Russian", "красота");
            translations.put("Hindi", "सुंदरता");
            translations.put("Farsi", "زیبایی");
        }

        if (word.equals("empathy")) {
            translations.put("Spanish", "empatía");
            translations.put("French", "empathie");
            translations.put("Dutch", "empathie");
            translations.put("German", "Empathie");
            translations.put("Polish", "empatia");
            translations.put("Russian", "эмпатия");
            translations.put("Hindi", "सहानुभूति");
            translations.put("Farsi", "همدلی");
        }

        if (word.equals("sympathy")) {
            translations.put("Spanish", "simpatía");
            translations.put("French", "sympathie");
            translations.put("Dutch", "sympathie");
            translations.put("German", "Sympathie");
            translations.put("Polish", "sympatia");
            translations.put("Russian", "симпатия");
            translations.put("Hindi", "सहानुभूति");
            translations.put("Farsi", "همدردی");
        }

        if (word.equals("apathy")) {
            translations.put("Spanish", "apatía");
            translations.put("French", "apathie");
            translations.put("Dutch", "apathie");
            translations.put("German", "Apathie");
            translations.put("Polish", "apatia");
            translations.put("Russian", "апатия");
            translations.put("Hindi", "निराशा");
            translations.put("Farsi", "بی‌تفاوتی");
        }

        if (word.equals("respect")) {
            translations.put("Spanish", "respeto");
            translations.put("French", "respect");
            translations.put("Dutch", "respect");
            translations.put("German", "Respekt");
            translations.put("Polish", "szacunek");
            translations.put("Russian", "уважение");
            translations.put("Hindi", "आदर");
            translations.put("Farsi", "احترام");
        }

        if (word.equals("strength")) {
            translations.put("Spanish", "fuerza");
            translations.put("French", "force");
            translations.put("Dutch", "kracht");
            translations.put("German", "Kraft");
            translations.put("Polish", "siła");
            translations.put("Russian", "сила");
            translations.put("Hindi", "शक्ति");
            translations.put("Farsi", "قدرت");
        }

        if (word.equals("truth")) {
            translations.put("Spanish", "verdad");
            translations.put("French", "vérité");
            translations.put("Dutch", "waarheid");
            translations.put("German", "Wahrheit");
            translations.put("Polish", "prawda");
            translations.put("Russian", "правда");
            translations.put("Hindi", "सच");
            translations.put("Farsi", "حقیقت");
        }

        if (word.equals("trust")) {
            translations.put("Spanish", "confianza");
            translations.put("French", "confiance");
            translations.put("Dutch", "vertrouwen");
            translations.put("German", "Vertrauen");
            translations.put("Polish", "zaufanie");
            translations.put("Russian", "доверие");
            translations.put("Hindi", "विश्वास");
            translations.put("Farsi", "اعتماد");
        }

        if (word.equals("pride")) {
            translations.put("Spanish", "orgullo");
            translations.put("French", "fierté");
            translations.put("Dutch", "trots");
            translations.put("German", "Stolz");
            translations.put("Polish", "duma");
            translations.put("Russian", "гордость");
            translations.put("Hindi", "गर्व");
            translations.put("Farsi", "افتخار");
        }

        if (word.equals("jealousy")) {
            translations.put("Spanish", "celos");
            translations.put("French", "jalousie");
            translations.put("Dutch", "jaloezie");
            translations.put("German", "Eifersucht");
            translations.put("Polish", "zazdrość");
            translations.put("Russian", "ревность");
            translations.put("Hindi", "ईर्ष्या");
            translations.put("Farsi", "حسادت");
        }

        if (word.equals("life")) {
            translations.put("Spanish", "vida");
            translations.put("French", "vie");
            translations.put("Dutch", "leven");
            translations.put("German", "Leben");
            translations.put("Polish", "życie");
            translations.put("Russian", "жизнь");
            translations.put("Hindi", "जीवन");
            translations.put("Farsi", "زندگی");
        }

        if (word.equals("death")) {
            translations.put("Spanish", "muerte");
            translations.put("French", "mort");
            translations.put("Dutch", "dood");
            translations.put("German", "Tod");
            translations.put("Polish", "śmierć");
            translations.put("Russian", "смерть");
            translations.put("Hindi", "मृत्यु");
            translations.put("Farsi", "مرگ");
        }

            //COLLECTIVE NOUNS SECTION
        if (word.equals("quiver")) {
            translations.put("Spanish", "aljaba");
            translations.put("French", "carquois");
            translations.put("Dutch", "koker");
            translations.put("German", "Köcher");
            translations.put("Polish", "kołczan");
            translations.put("Russian", "колчан");
            translations.put("Hindi", " ");
            translations.put("Farsi", " ");
        }

        if (word.equals("body")) {
            translations.put("Spanish", "cuerpo");
            translations.put("French", "corps");
            translations.put("Dutch", "lichaam");
            translations.put("German", "Körper");
            translations.put("Polish", "ciało");
            translations.put("Russian", "тело");
            translations.put("Hindi", "शरीर");
            translations.put("Farsi", "بدن");
        }

        if (word.equals("regiment")) {
            translations.put("Spanish", "regimiento");
            translations.put("French", "régiment");
            translations.put("Dutch", "regiment");
            translations.put("German", "Regiment");
            translations.put("Polish", "pułk");
            translations.put("Russian", "полк");
            translations.put("Hindi", "रेजिमेंट");
            translations.put("Farsi", "تیپ");
        }

        if (word.equals("cluster")) {
            translations.put("Spanish", "racimo");
            translations.put("French", "grappe");
            translations.put("Dutch", "cluster");
            translations.put("German", "Cluster");
            translations.put("Polish", "kłębek");
            translations.put("Russian", "скопление");
            translations.put("Hindi", "झुंड");
            translations.put("Farsi", "گروه");
        }

        if (word.equals("range")) {
            translations.put("Spanish", "rango");
            translations.put("French", "plage");
            translations.put("Dutch", "bereik");
            translations.put("German", "Reichweite");
            translations.put("Polish", "zakres");
            translations.put("Russian", "диапазон");
            translations.put("Hindi", "रेंज");
            translations.put("Farsi", "محدوده");
        }

        if (word.equals("crew")) {
            translations.put("Spanish", "tripulación");
            translations.put("French", "équipage");
            translations.put("Dutch", "bemanning");
            translations.put("German", "Besatzung");
            translations.put("Polish", "załoga");
            translations.put("Russian", "экипаж");
            translations.put("Hindi", "क्रू");
            translations.put("Farsi", "خدمه");
        }

        if (word.equals("dynasty")) {
            translations.put("Spanish", "dinastía");
            translations.put("French", "dynastie");
            translations.put("Dutch", "dynastie");
            translations.put("German", "Dynastie");
            translations.put("Polish", "dynastia");
            translations.put("Russian", "династия");
            translations.put("Hindi", "वंश");
            translations.put("Farsi", "پادشاهی");
        }

        if (word.equals("class")) {
            translations.put("Spanish", "clase");
            translations.put("French", "classe");
            translations.put("Dutch", "klas");
            translations.put("German", "Klasse");
            translations.put("Polish", "klasa");
            translations.put("Russian", "класс");
            translations.put("Hindi", "कक्षा");
            translations.put("Farsi", "کلاس");
        }

        if (word.equals("ream")) {
            translations.put("Spanish", "resma");
            translations.put("French", "rame");
            translations.put("Dutch", "pak");
            translations.put("German", "Stapel");
            translations.put("Polish", "ryza");
            translations.put("Russian", " ");
            translations.put("Hindi", " ");
            translations.put("Farsi", " ");
        }

        if (word.equals("collection")) {
            translations.put("Spanish", "colección");
            translations.put("French", "collection");
            translations.put("Dutch", "verzameling");
            translations.put("German", "Sammlung");
            translations.put("Polish", "kolekcja");
            translations.put("Russian", "коллекция");
            translations.put("Hindi", "संग्रह");
            translations.put("Farsi", "مجموعه");
        }

        if (word.equals("squad")) {
            translations.put("Spanish", "escuadra");
            translations.put("French", "escouade");
            translations.put("Dutch", "team");
            translations.put("German", "Trupp");
            translations.put("Polish", "drużyna");
            translations.put("Russian", "отряд");
            translations.put("Hindi", "स्क्वाड");
            translations.put("Farsi", "گروه");
        }

        if (word.equals("company")) {
            translations.put("Spanish", "compañía");
            translations.put("French", "entreprise");
            translations.put("Dutch", "bedrijf");
            translations.put("German", "Firma");
            translations.put("Polish", "firma");
            translations.put("Russian", "компания");
            translations.put("Hindi", "कंपनी");
            translations.put("Farsi", "شرکت");
        }

        if (word.equals("set")) {
            translations.put("Spanish", "conjunto");
            translations.put("French", "ensemble");
            translations.put("Dutch", "set");
            translations.put("German", "Set");
            translations.put("Polish", "zestaw");
            translations.put("Russian", "набор");
            translations.put("Hindi", "सेट");
            translations.put("Farsi", "مجموعه");
        }

        if (word.equals("bevy")) {
            translations.put("Spanish", "bando");
            translations.put("French", "troupe");
            translations.put("Dutch", "groep");
            translations.put("German", "Schwarm");
            translations.put("Polish", "stado");
            translations.put("Russian", "стадо");
            translations.put("Hindi", "झुंड");
            translations.put("Farsi", "گروه");
        }

        if (word.equals("staff")) {
            translations.put("Spanish", "personal");
            translations.put("French", "personnel");
            translations.put("Dutch", "personeel");
            translations.put("German", "Personal");
            translations.put("Polish", "personel");
            translations.put("Russian", "персонал");
            translations.put("Hindi", "कर्मचारी");
            translations.put("Farsi", "کارکنان");
        }

        if (word.equals("haul")) {
            translations.put("Spanish", "carga");
            translations.put("French", "charge");
            translations.put("Dutch", "lading");
            translations.put("German", "Last");
            translations.put("Polish", "ładunek");
            translations.put("Russian", "груз");
            translations.put("Hindi", "लोड");
            translations.put("Farsi", "بار");
        }

        if (word.equals("sheaf")) {
            translations.put("Spanish", "haz");
            translations.put("French", "gerbe");
            translations.put("Dutch", "bos");
            translations.put("German", "Bündel");
            translations.put("Polish", "wiązka");
            translations.put("Russian", "пучок");
            translations.put("Hindi", "गट्ठा");
            translations.put("Farsi", "گندم");
        }

        if (word.equals("string")) {
            translations.put("Spanish", "cordón");
            translations.put("French", "fil");
            translations.put("Dutch", "draad");
            translations.put("German", "Schnur");
            translations.put("Polish", "sznurek");
            translations.put("Russian", "нить");
            translations.put("Hindi", "धागा");
            translations.put("Farsi", "نخ");
        }

        if (word.equals("fling")) {
            translations.put("Spanish", "lanzamiento");
            translations.put("French", "lancer");
            translations.put("Dutch", "gooien");
            translations.put("German", "werfen");
            translations.put("Polish", "rzut");
            translations.put("Russian", "бросок");
            translations.put("Hindi", "फेंकना");
            translations.put("Farsi", "پرتاب");
        }

        if (word.equals("shower")) {
            translations.put("Spanish", "ducha");
            translations.put("French", "douche");
            translations.put("Dutch", "douche");
            translations.put("German", "Dusche");
            translations.put("Polish", "prysznic");
            translations.put("Russian", "душ");
            translations.put("Hindi", "शावर");
            translations.put("Farsi", "دوش");
        }

        if (word.equals("flight")) {
            translations.put("Spanish", "vuelo");
            translations.put("French", "vol");
            translations.put("Dutch", "vlucht");
            translations.put("German", "Flug");
            translations.put("Polish", "lot");
            translations.put("Russian", "полет");
            translations.put("Hindi", "उड़ान");
            translations.put("Farsi", "پرواز");
        }

        if (word.equals("stud")) {
            translations.put("Spanish", "perno");
            translations.put("French", "stud");
            translations.put("Dutch", "stud");
            translations.put("German", "Pferd");
            translations.put("Polish", "ogier");
            translations.put("Russian", "конь");
            translations.put("Hindi", "घोड़ा");
            translations.put("Farsi", "اسب");
        }

        if (word.equals("stack")) {
            translations.put("Spanish", "pila");
            translations.put("French", "pile");
            translations.put("Dutch", "stapel");
            translations.put("German", "Stapel");
            translations.put("Polish", "sterta");
            translations.put("Russian", "стопка");
            translations.put("Hindi", "ढेर");
            translations.put("Farsi", "توده");
        }

        if (word.equals("line")) {
            translations.put("Spanish", "línea");
            translations.put("French", "ligne");
            translations.put("Dutch", "lijn");
            translations.put("German", "Linie");
            translations.put("Polish", "linia");
            translations.put("Russian", "линия");
            translations.put("Hindi", "रेखा");
            translations.put("Farsi", "خط");
        }

        if (word.equals("block")) {
            translations.put("Spanish", "bloque");
            translations.put("French", "bloc");
            translations.put("Dutch", "blok");
            translations.put("German", "Block");
            translations.put("Polish", "blok");
            translations.put("Russian", "блок");
            translations.put("Hindi", "ब्लॉक");
            translations.put("Farsi", "بلوک");
        }

        if (word.equals("gang")) {
            translations.put("Spanish", "banda");
            translations.put("French", "gang");
            translations.put("Dutch", "bende");
            translations.put("German", "Bande");
            translations.put("Polish", "banda");
            translations.put("Russian", "банда");
            translations.put("Hindi", "गैंग");
            translations.put("Farsi", "گروه");
        }

        if (word.equals("chest")) {
            translations.put("Spanish", "pecho");
            translations.put("French", "poitrine");
            translations.put("Dutch", "borst");
            translations.put("German", "Brust");
            translations.put("Polish", "klatka piersiowa");
            translations.put("Russian", "грудь");
            translations.put("Hindi", "छाती");
            translations.put("Farsi", "سینه");
        }

        if (word.equals("cloud")) {
            translations.put("Spanish", "nube");
            translations.put("French", "nuage");
            translations.put("Dutch", "wolk");
            translations.put("German", "Wolke");
            translations.put("Polish", "chmura");
            translations.put("Russian", "облако");
            translations.put("Hindi", "बादल");
            translations.put("Farsi", "اب");
        }
        
        //ACTION VERBS SECTION
           if (word.equals("walk")) {
            translations.put("Spanish", "caminar");
            translations.put("French", "marcher");
            translations.put("Dutch", "wandelen");
            translations.put("German", "gehen");
            translations.put("Polish", "chodzić");
            translations.put("Russian", "идти");
            translations.put("Hindi", "चलना");
            translations.put("Farsi", "راه رفتن");
        } if (word.equals("listen")) {
            translations.put("Spanish", "escuchar");
            translations.put("French", "écouter");
            translations.put("Dutch", "luisteren");
            translations.put("German", "hören");
            translations.put("Polish", "słuchać");
            translations.put("Russian", "слушать");
            translations.put("Hindi", "सुनना");
            translations.put("Farsi", "گوش دادن");
        }if (word.equals("write")) {
            translations.put("Spanish", "escribir");
            translations.put("French", "écrire");
            translations.put("Dutch", "schrijven");
            translations.put("German", "schreiben");
            translations.put("Polish", "pisać");
            translations.put("Russian", "писать");
            translations.put("Hindi", "लिखना");
            translations.put("Farsi", "نوشتن");
        }if (word.equals("eat")) {
            translations.put("Spanish", "comer");
            translations.put("French", "manger");
            translations.put("Dutch", "eten");
            translations.put("German", "essen");
            translations.put("Polish", "jeść");
            translations.put("Russian", "есть");
            translations.put("Hindi", "खाना");
            translations.put("Farsi", "خوردن");
        }if (word.equals("run")) {
            translations.put("Spanish", "correr");
            translations.put("French", "courir");
            translations.put("Dutch", "rennen");
            translations.put("German", "laufen");
            translations.put("Polish", "biegać");
            translations.put("Russian", "бежать");
            translations.put("Hindi", "दौड़ना");
            translations.put("Farsi", "دویدن");
        }
                if (word.equals("cry")) {
            translations.put("Spanish", "llorar");
            translations.put("French", "pleurer");
            translations.put("Dutch", "huilen");
            translations.put("German", "weinen");
            translations.put("Polish", "płakać");
            translations.put("Russian", "плакать");
            translations.put("Hindi", "रोना");
            translations.put("Farsi", "گریه کردن");
        }
        if (word.equals("open")) {
            translations.put("Spanish", "abrir");
            translations.put("French", "ouvrir");
            translations.put("Dutch", "openen");
            translations.put("German", "öffnen");
            translations.put("Polish", "otworzyć");
            translations.put("Russian", "открыть");
            translations.put("Hindi", "खोलना");
            translations.put("Farsi", "باز کردن");
        }
        if (word.equals("drink")) {
            translations.put("Spanish", "beber");
            translations.put("French", "boire");
            translations.put("Dutch", "drinken");
            translations.put("German", "trinken");
            translations.put("Polish", "pić");
            translations.put("Russian", "пить");
            translations.put("Hindi", "पीना");
            translations.put("Farsi", "نوشیدن");
        }
        if (word.equals("ride")) {
            translations.put("Spanish", "montar");
            translations.put("French", "monter");
            translations.put("Dutch", "rijden");
            translations.put("German", "fahren");
            translations.put("Polish", "jechać");
            translations.put("Russian", "ездить");
            translations.put("Hindi", "सवारी करना");
            translations.put("Farsi", "سوار شدن");
        }
        if (word.equals("think")) {
            translations.put("Spanish", "pensar");
            translations.put("French", "penser");
            translations.put("Dutch", "denken");
            translations.put("German", "denken");
            translations.put("Polish", "myśleć");
            translations.put("Russian", "думать");
            translations.put("Hindi", "सोचना");
            translations.put("Farsi", "فکر کردن");
        }
        if (word.equals("close")) {
            translations.put("Spanish", "cerrar");
            translations.put("French", "fermer");
            translations.put("Dutch", "sluiten");
            translations.put("German", "schließen");
            translations.put("Polish", "zamknąć");
            translations.put("Russian", "закрыть");
            translations.put("Hindi", "बंद करना");
            translations.put("Farsi", "بستن");
        }
        if (word.equals("cook")) {
            translations.put("Spanish", "cocinar");
            translations.put("French", "cuisiner");
            translations.put("Dutch", "koken");
            translations.put("German", "kochen");
            translations.put("Polish", "gotować");
            translations.put("Russian", "готовить");
            translations.put("Hindi", "पकाना");
            translations.put("Farsi", "پختن");
        }
        if (word.equals("sit")) {
            translations.put("Spanish", "sentarse");
            translations.put("French", "s'asseoir");
            translations.put("Dutch", "zitten");
            translations.put("German", "sitzen");
            translations.put("Polish", "siedzieć");
            translations.put("Russian", "сидеть");
            translations.put("Hindi", "बैठना");
            translations.put("Farsi", "نشستن");
        }
        if (word.equals("sing")) {
            translations.put("Spanish", "cantar");
            translations.put("French", "chanter");
            translations.put("Dutch", "zingen");
            translations.put("German", "singen");
            translations.put("Polish", "śpiewać");
            translations.put("Russian", "петь");
            translations.put("Hindi", "गाना");
            translations.put("Farsi", "خواندن");
        }
        if (word.equals("sleep")) {
            translations.put("Spanish", "dormir");
            translations.put("French", "dormir");
            translations.put("Dutch", "slapen");
            translations.put("German", "schlafen");
            translations.put("Polish", "spać");
            translations.put("Russian", "спать");
            translations.put("Hindi", "सोना");
            translations.put("Farsi", "خوابیدن");
        }
        if (word.equals("wash")) {
            translations.put("Spanish", "lavar");
            translations.put("French", "laver");
            translations.put("Dutch", "wassen");
            translations.put("German", "waschen");
            translations.put("Polish", "myć");
            translations.put("Russian", "мыть");
            translations.put("Hindi", "धोना");
            translations.put("Farsi", "شستن");
        }
        if (word.equals("stand")) {
            translations.put("Spanish", "estar de pie");
            translations.put("French", "se tenir debout");
            translations.put("Dutch", "staan");
            translations.put("German", "stehen");
            translations.put("Polish", "stać");
            translations.put("Russian", "стоять");
            translations.put("Hindi", "खड़ा होना");
            translations.put("Farsi", "ایستادن");
        }
        if (word.equals("watch")) {
            translations.put("Spanish", "ver");
            translations.put("French", "regarder");
            translations.put("Dutch", "kijken");
            translations.put("German", "sehen");
            translations.put("Polish", "oglądać");
            translations.put("Russian", "смотреть");
            translations.put("Hindi", "देखना");
            translations.put("Farsi", "تماشا کردن");
        }
        if (word.equals("throw")) {
            translations.put("Spanish", "tirar");
            translations.put("French", "jeter");
            translations.put("Dutch", "werpen");
            translations.put("German", "werfen");
            translations.put("Polish", "rzucać");
            translations.put("Russian", "бросать");
            translations.put("Hindi", "फेंकना");
            translations.put("Farsi", "پرتاب کردن");
        }
        if (word.equals("talk")) {
            translations.put("Spanish", "hablar");
            translations.put("French", "parler");
            translations.put("Dutch", "praten");
            translations.put("German", "sprechen");
            translations.put("Polish", "mówić");
            translations.put("Russian", "говорить");
            translations.put("Hindi", "बात करना");
            translations.put("Farsi", "صحبت کردن");
        }
        if (word.equals("fight")) {
            translations.put("Spanish", "pelear");
            translations.put("French", "se battre");
            translations.put("Dutch", "vechten");
            translations.put("German", "kämpfen");
            translations.put("Polish", "walczyć");
            translations.put("Russian", "сражаться");
            translations.put("Hindi", "लड़ना");
            translations.put("Farsi", "جنگیدن");
        }
        if (word.equals("dance")) {
            translations.put("Spanish", "bailar");
            translations.put("French", "danser");
            translations.put("Dutch", "dansen");
            translations.put("German", "tanzen");
            translations.put("Polish", "tańczyć");
            translations.put("Russian", "танцевать");
            translations.put("Hindi", "नाचना");
            translations.put("Farsi", "رقصیدن");
        }
        if (word.equals("cut")) {
            translations.put("Spanish", "cortar");
            translations.put("French", "couper");
            translations.put("Dutch", "snijden");
            translations.put("German", "schneiden");
            translations.put("Polish", "ciąć");
            translations.put("Russian", "резать");
            translations.put("Hindi", "काटना");
            translations.put("Farsi", "برش زدن");
        }
        if (word.equals("push")) {
            translations.put("Spanish", "empujar");
            translations.put("French", "pousser");
            translations.put("Dutch", "duwen");
            translations.put("German", "schieben");
            translations.put("Polish", "pchać");
            translations.put("Russian", "толкать");
            translations.put("Hindi", "धक्का देना");
            translations.put("Farsi", "هل دادن");
        }
        if (word.equals("laugh")) {
            translations.put("Spanish", "reír");
            translations.put("French", "rire");
            translations.put("Dutch", "lachen");
            translations.put("German", "lachen");
            translations.put("Polish", "śmiać się");
            translations.put("Russian", "смеяться");
            translations.put("Hindi", "हंसी करना");
            translations.put("Farsi", "خندیدن");
        }
        if (word.equals("crawl")) {
            translations.put("Spanish", "arrastrarse");
            translations.put("French", "ramper");
            translations.put("Dutch", "kruipen");
            translations.put("German", "kriechen");
            translations.put("Polish", "pełzać");
            translations.put("Russian", "ползти");
            translations.put("Hindi", "लुकना");
            translations.put("Farsi", "حشرات زدن");
        }
        if (word.equals("fly")) {
            translations.put("Spanish", "volar");
            translations.put("French", "voler");
            translations.put("Dutch", "vliegen");
            translations.put("German", "fliegen");
            translations.put("Polish", "latać");
            translations.put("Russian", "летать");
            translations.put("Hindi", "उड़ना");
            translations.put("Farsi", "پرواز کردن");
        }
        if (word.equals("pull")) {
            translations.put("Spanish", "tirar");
            translations.put("French", "tirer");
            translations.put("Dutch", "trekken");
            translations.put("German", "ziehen");
            translations.put("Polish", "ciągnąć");
            translations.put("Russian", "тянуть");
            translations.put("Hindi", "खींचना");
            translations.put("Farsi", "کشیدن");
        }
        if (word.equals("read")) {
            translations.put("Spanish", "leer");
            translations.put("French", "lire");
            translations.put("Dutch", "leiden");
            translations.put("German", "lesen");
            translations.put("Polish", "czytać");
            translations.put("Russian", "читать");
            translations.put("Hindi", "पढ़ना");
            translations.put("Farsi", "خواندن");
        }
        if (word.equals("slide")) {
            translations.put("Spanish", "deslizar");
            translations.put("French", "glisser");
            translations.put("Dutch", "glijden");
            translations.put("German", "rutschen");
            translations.put("Polish", "ślizgać się");
            translations.put("Russian", "скользить");
            translations.put("Hindi", "फिसलना");
            translations.put("Farsi", "سر خوردن");
        }
        if (word.equals("give")) {
            translations.put("Spanish", "dar");
            translations.put("French", "donner");
            translations.put("Dutch", "geven");
            translations.put("German", "geben");
            translations.put("Polish", "dawać");
            translations.put("Russian", "давать");
            translations.put("Hindi", "देना");
            translations.put("Farsi", "دادن");
        }
        if (word.equals("climb")) {
            translations.put("Spanish", "escalar");
            translations.put("French", "grimper");
            translations.put("Dutch", "klimmen");
            translations.put("German", "klettern");
            translations.put("Polish", "wspinać się");
            translations.put("Russian", "лазить");
            translations.put("Hindi", "चढ़ना");
            translations.put("Farsi", "صعود کردن");
        }
        if (word.equals("play")) {
            translations.put("Spanish", "jugar");
            translations.put("French", "jouer");
            translations.put("Dutch", "spelen");
            translations.put("German", "spielen");
            translations.put("Polish", "grać");
            translations.put("Russian", "играть");
            translations.put("Hindi", "खेलना");
            translations.put("Farsi", "بازی کردن");
        }
        if (word.equals("win")) {
            translations.put("Spanish", "ganar");
            translations.put("French", "gagner");
            translations.put("Dutch", "winnen");
            translations.put("German", "gewinnen");
            translations.put("Polish", "wygrać");
            translations.put("Russian", "выиграть");
            translations.put("Hindi", "जीतना");
            translations.put("Farsi", "بردن");
        }
        if (word.equals("jump")) {
            translations.put("Spanish", "saltar");
            translations.put("French", "sauter");
            translations.put("Dutch", "springen");
            translations.put("German", "springen");
            translations.put("Polish", "skakać");
            translations.put("Russian", "прыгать");
            translations.put("Hindi", "कूदना");
            translations.put("Farsi", "پرشیدن");
        }
        if (word.equals("wait")) {
            translations.put("Spanish", "esperar");
            translations.put("French", "attendre");
            translations.put("Dutch", "wachten");
            translations.put("German", "warten");
            translations.put("Polish", "czekać");
            translations.put("Russian", "ждать");
            translations.put("Hindi", "इंतजार करना");
            translations.put("Farsi", "انتظار کردن");
        }
        //STATIVE VERBS SECTION
        if (word.equals("have")) {
        translations.put("Spanish", "tener");
        translations.put("French", "avoir");
        translations.put("Dutch", "hebben");
        translations.put("German", "haben");
        translations.put("Polish", "mieć");
        translations.put("Russian", "иметь");
        translations.put("Hindi", "रखना");
        translations.put("Farsi", "داشتن");
        }
        if (word.equals("sound")) {
            translations.put("Spanish", "sonido");
            translations.put("French", "son");
            translations.put("Dutch", "geluid");
            translations.put("German", "Ton");
            translations.put("Polish", "dźwięk");
            translations.put("Russian", "звук");
            translations.put("Hindi", "ध्वनि");
            translations.put("Farsi", "صدا");
        }
        if (word.equals("love")) {
            translations.put("Spanish", "amar");
            translations.put("French", "aimer");
            translations.put("Dutch", "houden van");
            translations.put("German", "lieben");
            translations.put("Polish", "kochać");
            translations.put("Russian", "любить");
            translations.put("Hindi", "प्रेम करना");
            translations.put("Farsi", "دوست داشتن");
        }
        if (word.equals("need")) {
            translations.put("Spanish", "necesitar");
            translations.put("French", "avoir besoin de");
            translations.put("Dutch", "nodig hebben");
            translations.put("German", "brauchen");
            translations.put("Polish", "potrzebować");
            translations.put("Russian", "нуждаться");
            translations.put("Hindi", "जरूरत होना");
            translations.put("Farsi", "نیاز داشتن");
        }
        if (word.equals("know")) {
            translations.put("Spanish", "saber");
            translations.put("French", "savoir");
            translations.put("Dutch", "weten");
            translations.put("German", "wissen");
            translations.put("Polish", "wiedzieć");
            translations.put("Russian", "знать");
            translations.put("Hindi", "जानना");
            translations.put("Farsi", "دانستن");
        }
        if (word.equals("disagree")) {
            translations.put("Spanish", "no estar de acuerdo");
            translations.put("French", "désapprouver");
            translations.put("Dutch", "het oneens zijn");
            translations.put("German", "nicht zustimmen");
            translations.put("Polish", "nie zgadzać się");
            translations.put("Russian", "не соглашаться");
            translations.put("Hindi", "असहमत होना");
            translations.put("Farsi", "مخالفت کردن");
        }
        if (word.equals("cost")) {
            translations.put("Spanish", "costar");
            translations.put("French", "coûter");
            translations.put("Dutch", "kosten");
            translations.put("German", "kosten");
            translations.put("Polish", "kosztować");
            translations.put("Russian", "стоить");
            translations.put("Hindi", "कीमत होना");
            translations.put("Farsi", "هزینه داشتن");
        }
        if (word.equals("own")) {
            translations.put("Spanish", "poseer");
            translations.put("French", "posséder");
            translations.put("Dutch", "bezitten");
            translations.put("German", "besitzen");
            translations.put("Polish", "posiadać");
            translations.put("Russian", "владеть");
            translations.put("Hindi", "मालिक होना");
            translations.put("Farsi", "داشتن");
        }
        if (word.equals("hear")) {
            translations.put("Spanish", "oír");
            translations.put("French", "entendre");
            translations.put("Dutch", "horen");
            translations.put("German", "hören");
            translations.put("Polish", "słyszeć");
            translations.put("Russian", "слышать");
            translations.put("Hindi", "सुनना");
            translations.put("Farsi", "شنیدن");
        }
        if (word.equals("like")) {
            translations.put("Spanish", "gustar");
            translations.put("French", "aimer");
            translations.put("Dutch", "leiden");
            translations.put("German", "mögen");
            translations.put("Polish", "lubić");
            translations.put("Russian", "нравиться");
            translations.put("Hindi", "पसंद करना");
            translations.put("Farsi", "دوست داشتن");
        }
        if (word.equals("desire")) {
            translations.put("Spanish", "desear");
            translations.put("French", "désirer");
            translations.put("Dutch", "verlangen");
            translations.put("German", "verlangen");
            translations.put("Polish", "pragnąć");
            translations.put("Russian", "желать");
            translations.put("Hindi", "इच्छा करना");
            translations.put("Farsi", "خواستن");
        }
        if (word.equals("believe")) {
            translations.put("Spanish", "creer");
            translations.put("French", "croire");
            translations.put("Dutch", "geloven");
            translations.put("German", "glauben");
            translations.put("Polish", "wierzyć");
            translations.put("Russian", "верить");
            translations.put("Hindi", "विश्वास करना");
            translations.put("Farsi", "باور کردن");
        }
        if (word.equals("deny")) {
            translations.put("Spanish", "negar");
            translations.put("French", "nier");
            translations.put("Dutch", "ontkennen");
            translations.put("German", "leugnen");
            translations.put("Polish", "zaprzeczać");
            translations.put("Russian", "отрицать");
            translations.put("Hindi", "नकारना");
            translations.put("Farsi", "انکار کردن");
        }
        if (word.equals("measure")) {
            translations.put("Spanish", "medir");
            translations.put("French", "mesurer");
            translations.put("Dutch", "meten");
            translations.put("German", "messen");
            translations.put("Polish", "mierzyć");
            translations.put("Russian", "измерять");
            translations.put("Hindi", "मापना");
            translations.put("Farsi", "اندازه گرفتن");
        }
        if (word.equals("possess")) {
            translations.put("Spanish", "poseer");
            translations.put("French", "posséder");
            translations.put("Dutch", "bezitten");
            translations.put("German", "besitzen");
            translations.put("Polish", "posiadać");
            translations.put("Russian", "обладать");
            translations.put("Hindi", "धारण करना");
            translations.put("Farsi", "داشتن");
        }
        if (word.equals("smell")) {
            translations.put("Spanish", "oler");
            translations.put("French", "sentir");
            translations.put("Dutch", "ruiken");
            translations.put("German", "riechen");
            translations.put("Polish", "pachnieć");
            translations.put("Russian", "пахнуть");
            translations.put("Hindi", "सुगंध आना");
            translations.put("Farsi", "بو کردن");
        }
        if (word.equals("dislike")) {
            translations.put("Spanish", "desagradar");
            translations.put("French", "détester");
            translations.put("Dutch", "niet leuk vinden");
            translations.put("German", "nicht mögen");
            translations.put("Polish", "nie lubić");
            translations.put("Russian", "не любить");
            translations.put("Hindi", "नफरत करना");
            translations.put("Farsi", "نفرت داشتن");
        }
        if (word.equals("wish")) {
            translations.put("Spanish", "desear");
            translations.put("French", "souhaiter");
            translations.put("Dutch", "wensen");
            translations.put("German", "wünschen");
            translations.put("Polish", "życzyć");
            translations.put("Russian", "желать");
            translations.put("Hindi", "इच्छा करना");
            translations.put("Farsi", "آرزو کردن");
        }
        if (word.equals("doubt")) {
            translations.put("Spanish", "dudar");
            translations.put("French", "douter");
            translations.put("Dutch", "twijfelen");
            translations.put("German", "zweifeln");
            translations.put("Polish", "wątpić");
            translations.put("Russian", "сомневаться");
            translations.put("Hindi", "संदेह करना");
            translations.put("Farsi", "شک کردن");
        }
        if (word.equals("promise")) {
            translations.put("Spanish", "prometer");
            translations.put("French", "promettre");
            translations.put("Dutch", "beloven");
            translations.put("German", "versprechen");
            translations.put("Polish", "obiecać");
            translations.put("Russian", "обещать");
            translations.put("Hindi", "वादा करना");
            translations.put("Farsi", "قول دادن");
        }
        if (word.equals("weigh")) {
            translations.put("Spanish", "pesar");
            translations.put("French", "peser");
            translations.put("Dutch", "wegen");
            translations.put("German", "wiegen");
            translations.put("Polish", "ważyć");
            translations.put("Russian", "вешать");
            translations.put("Hindi", "तोलना");
            translations.put("Farsi", "وزن کردن");
        }
        if (word.equals("pack")) {
            translations.put("Spanish", "empaquetar");
            translations.put("French", "emballer");
            translations.put("Dutch", "inpakken");
            translations.put("German", "packen");
            translations.put("Polish", "pakować");
            translations.put("Russian", "упаковывать");
            translations.put("Hindi", "पैक करना");
            translations.put("Farsi", "بسته بندی کردن");
        }
        if (word.equals("see")) {
            translations.put("Spanish", "ver");
            translations.put("French", "voir");
            translations.put("Dutch", "zien");
            translations.put("German", "sehen");
            translations.put("Polish", "widzieć");
            translations.put("Russian", "видеть");
            translations.put("Hindi", "देखना");
            translations.put("Farsi", "دیدن");
        }
        if (word.equals("hate")) {
            translations.put("Spanish", "odiar");
            translations.put("French", "haïr");
            translations.put("Dutch", "haten");
            translations.put("German", "hassen");
            translations.put("Polish", "nienawidzić");
            translations.put("Russian", "ненавидеть");
            translations.put("Hindi", "घृणा करना");
            translations.put("Farsi", "نفرت داشتن");
        }
        if (word.equals("hope")) {
            translations.put("Spanish", "esperar");
            translations.put("French", "espérer");
            translations.put("Dutch", "hopen");
            translations.put("German", "hoffen");
            translations.put("Polish", "mieć nadzieję");
            translations.put("Russian", "надеяться");
            translations.put("Hindi", "आशा करना");
            translations.put("Farsi", "امید داشتن");
        }
        if (word.equals("think")) {
            translations.put("Spanish", "pensar");
            translations.put("French", "penser");
            translations.put("Dutch", "denken");
            translations.put("German", "denken");
            translations.put("Polish", "myśleć");
            translations.put("Russian", "думать");
            translations.put("Hindi", "सोचना");
            translations.put("Farsi", "فکر کردن");
        }
        if (word.equals("satisfy")) {
            translations.put("Spanish", "satisfacer");
            translations.put("French", "satisfaire");
            translations.put("Dutch", "voldoen");
            translations.put("German", "befriedigen");
            translations.put("Polish", "zadowolić");
            translations.put("Russian", "удовлетворять");
            translations.put("Hindi", "संतुष्ट करना");
            translations.put("Farsi", "راضی کردن");
        }
        if (word.equals("owe")) {
            translations.put("Spanish", "deber");
            translations.put("French", "devoir");
            translations.put("Dutch", "schulden");
            translations.put("German", "schulden");
            translations.put("Polish", "być winny");
            translations.put("Russian", "быть должным");
            translations.put("Hindi", "उधार होना");
            translations.put("Farsi", "بدهکار بودن");
        }
        if (word.equals("consist")) {
            translations.put("Spanish", "consistir");
            translations.put("French", "consister");
            translations.put("Dutch", "bestaan uit");
            translations.put("German", "bestehen aus");
            translations.put("Polish", "składać się z");
            translations.put("Russian", "состоять из");
            translations.put("Hindi", "गठित होना");
            translations.put("Farsi", "تشکیل شدن");
        }
        if (word.equals("look")) {
            translations.put("Spanish", "mirar");
            translations.put("French", "regarder");
            translations.put("Dutch", "kijken");
            translations.put("German", "sehen");
            translations.put("Polish", "patrzeć");
            translations.put("Russian", "смотреть");
            translations.put("Hindi", "देखना");
            translations.put("Farsi", "نگاه کردن");
        }
        if (word.equals("adore")) {
            translations.put("Spanish", "adorar");
            translations.put("French", "adorer");
            translations.put("Dutch", "vereren");
            translations.put("German", "vergöttern");
            translations.put("Polish", "uwielbiać");
            translations.put("Russian", "обожать");
            translations.put("Hindi", "प्रेम करना");
            translations.put("Farsi", "پرستش کردن");
        }
        if (word.equals("value")) {
            translations.put("Spanish", "valorar");
            translations.put("French", "valeur");
            translations.put("Dutch", "waarde");
            translations.put("German", "wert");
            translations.put("Polish", "wartość");
            translations.put("Russian", "стоимость");
            translations.put("Hindi", "मूल्य");
            translations.put("Farsi", "ارزش");
        }
        if (word.equals("suppose")) {
            translations.put("Spanish", "suponer");
            translations.put("French", "supposer");
            translations.put("Dutch", "veronderstellen");
            translations.put("German", "annehmen");
            translations.put("Polish", "zakładać");
            translations.put("Russian", "предполагать");
            translations.put("Hindi", "मानना");
            translations.put("Farsi", "فرض کردن");
        }
        if (word.equals("realize")) {
            translations.put("Spanish", "darse cuenta");
            translations.put("French", "réaliser");
            translations.put("Dutch", "realiseren");
            translations.put("German", "realisieren");
            translations.put("Polish", "zdać sobie sprawę");
            translations.put("Russian", "осознать");
            translations.put("Hindi", "समझना");
            translations.put("Farsi", "درک کردن");
        }
        if (word.equals("seem")) {
            translations.put("Spanish", "parecer");
            translations.put("French", "sembler");
            translations.put("Dutch", "lijken");
            translations.put("German", "scheinen");
            translations.put("Polish", "wydawać się");
            translations.put("Russian", "казаться");
            translations.put("Hindi", "लगना");
            translations.put("Farsi", "به نظر رسیدن");
        }
        if (word.equals("involve")) {
            translations.put("Spanish", "involucrar");
            translations.put("French", "impliquer");
            translations.put("Dutch", "betrekken");
            translations.put("German", "beteiligen");
            translations.put("Polish", "angażować");
            translations.put("Russian", "вовлекать");
            translations.put("Hindi", "शामिल करना");
            translations.put("Farsi", "درگیر کردن");
        }
        if (word.equals("taste")) {
            translations.put("Spanish", "sabor");
            translations.put("French", "goût");
            translations.put("Dutch", "smaak");
            translations.put("German", "geschmack");
            translations.put("Polish", "smak");
            translations.put("Russian", "вкус");
            translations.put("Hindi", "स्वाद");
            translations.put("Farsi", "طعم");
        }
        if (word.equals("prefer")) {
            translations.put("Spanish", "preferir");
            translations.put("French", "préférer");
            translations.put("Dutch", "verkiezen");
            translations.put("German", "bevorzugen");
            translations.put("Polish", "wolać");
            translations.put("Russian", "предпочитать");
            translations.put("Hindi", "पसंद करना");
            translations.put("Farsi", "ترجیح دادن");
        }
        if (word.equals("recognize")) {
            translations.put("Spanish", "reconocer");
            translations.put("French", "reconnaître");
            translations.put("Dutch", "herkennen");
            translations.put("German", "erkennen");
            translations.put("Polish", "rozpoznać");
            translations.put("Russian", "узнавать");
            translations.put("Hindi", "पहचानना");
            translations.put("Farsi", "شناسایی کردن");
        }
        if (word.equals("appear")) {
            translations.put("Spanish", "aparecer");
            translations.put("French", "apparaître");
            translations.put("Dutch", "verschijnen");
            translations.put("German", "erscheinen");
            translations.put("Polish", "pojawić się");
            translations.put("Russian", "появляться");
            translations.put("Hindi", "दिखना");
            translations.put("Farsi", "ظاهر شدن");
        }
        if (word.equals("fit")) {
            translations.put("Spanish", "ajustar");
            translations.put("French", "adapter");
            translations.put("Dutch", "passen");
            translations.put("German", "passen");
            translations.put("Polish", "pasować");
            translations.put("Russian", "подходить");
            translations.put("Hindi", "फिट होना");
            translations.put("Farsi", "مناسب بودن");
        }
        if (word.equals("include")) {
            translations.put("Spanish", "incluir");
            translations.put("French", "inclure");
            translations.put("Dutch", "includeren");
            translations.put("German", "einbeziehen");
            translations.put("Polish", "zawierać");
            translations.put("Russian", "включать");
            translations.put("Hindi", "शामिल करना");
            translations.put("Farsi", "شامل کردن");
        }
        if (word.equals("touch")) {
            translations.put("Spanish", "tocar");
            translations.put("French", "toucher");
            translations.put("Dutch", "aanraken");
            translations.put("German", "berühren");
            translations.put("Polish", "dotknąć");
            translations.put("Russian", "касаться");
            translations.put("Hindi", "छूना");
            translations.put("Farsi", "لمس کردن");
        }
        if (word.equals("care")) {
            translations.put("Spanish", "cuidar");
            translations.put("French", "soigner");
            translations.put("Dutch", "zorgen");
            translations.put("German", "pflegen");
            translations.put("Polish", "troszczyć się");
            translations.put("Russian", "заботиться");
            translations.put("Hindi", "देखभाल करना");
            translations.put("Farsi", "مراقبت کردن");
        }
        if (word.equals("forget")) {
            translations.put("Spanish", "olvidar");
            translations.put("French", "oublier");
            translations.put("Dutch", "vergeten");
            translations.put("German", "vergessen");
            translations.put("Polish", "zapomnieć");
            translations.put("Russian", "забыть");
            translations.put("Hindi", "भूलना");
            translations.put("Farsi", "فراموش کردن");
        }
        if (word.equals("astonish")) {
            translations.put("Spanish", "asombrar");
            translations.put("French", "étonner");
            translations.put("Dutch", "verbazen");
            translations.put("German", "erstaunen");
            translations.put("Polish", "zadziwić");
            translations.put("Russian", "удивлять");
            translations.put("Hindi", "आश्चर्यचकित करना");
            translations.put("Farsi", "شگفت زده کردن");
        }
        if (word.equals("depend")) {
            translations.put("Spanish", "depender");
            translations.put("French", "dépendre");
            translations.put("Dutch", "afhangen");
            translations.put("German", "abhängen");
            translations.put("Polish", "zależeć");
            translations.put("Russian", "зависеть");
            translations.put("Hindi", "निर्भर होना");
            translations.put("Farsi", "بسته بودن");
        }
        if (word.equals("contain")) {
            translations.put("Spanish", "contener");
            translations.put("French", "contenir");
            translations.put("Dutch", "bevatten");
            translations.put("German", "beinhalten");
            translations.put("Polish", "zawierać");
            translations.put("Russian", "содержать");
            translations.put("Hindi", "सामिल होना");
            translations.put("Farsi", "در برداشتن");
        }
        if (word.equals("feel")) {
            translations.put("Spanish", "sentir");
            translations.put("French", "sentir");
            translations.put("Dutch", "voelen");
            translations.put("German", "fühlen");
            translations.put("Polish", "czuć");
            translations.put("Russian", "чувствовать");
            translations.put("Hindi", "महसूस करना");
            translations.put("Farsi", "احساس کردن");
        }
        if (word.equals("mind")) {
            translations.put("Spanish", "mente");
            translations.put("French", "esprit");
            translations.put("Dutch", "geest");
            translations.put("German", "geist");
            translations.put("Polish", "umysł");
            translations.put("Russian", "ум");
            translations.put("Hindi", "मन");
            translations.put("Farsi", "ذهن");
        }
        if (word.equals("remember")) {
            translations.put("Spanish", "recordar");
            translations.put("French", "se souvenir");
            translations.put("Dutch", "herinneren");
            translations.put("German", "erinnern");
            translations.put("Polish", "pamiętać");
            translations.put("Russian", "помнить");
            translations.put("Hindi", "याद रखना");
            translations.put("Farsi", "یاد آوردن");
        }
        if (word.equals("please")) {
            translations.put("Spanish", "por favor");
            translations.put("French", "s'il vous plaît");
            translations.put("Dutch", "alstublieft");
            translations.put("German", "bitte");
            translations.put("Polish", "proszę");
            translations.put("Russian", "пожалуйста");
            translations.put("Hindi", "कृपया");
            translations.put("Farsi", "لطفا");
        }
        if (word.equals("matter")) {
            translations.put("Spanish", "importar");
            translations.put("French", "importer");
            translations.put("Dutch", "aandoen");
            translations.put("German", "angelegenheit");
            translations.put("Polish", "sprawa");
            translations.put("Russian", "дело");
            translations.put("Hindi", "मामला");
            translations.put("Farsi", "مهم بودن");
        }
        if (word.equals("want")) {
            translations.put("Spanish", "querer");
            translations.put("French", "vouloir");
            translations.put("Dutch", "willen");
            translations.put("German", "wollen");
            translations.put("Polish", "chcieć");
            translations.put("Russian", "хотеть");
            translations.put("Hindi", "चाहना");
            translations.put("Farsi", "خواستن");
        }
        if (word.equals("appreciate")) {
            translations.put("Spanish", "apreciar");
            translations.put("French", "apprécier");
            translations.put("Dutch", "apprecieren");
            translations.put("German", "schätzen");
            translations.put("Polish", "doceniać");
            translations.put("Russian", "ценить");
            translations.put("Hindi", "आदर करना");
            translations.put("Farsi", "قدردانی کردن");
        }
        if (word.equals("mean")) {
            translations.put("Spanish", "significar");
            translations.put("French", "signifier");
            translations.put("Dutch", "betekenen");
            translations.put("German", "bedeuten");
            translations.put("Polish", "znaczyć");
            translations.put("Russian", "значить");
            translations.put("Hindi", "मतलब होना");
            translations.put("Farsi", "معنی دادن");
        }
        if (word.equals("surprise")) {
            translations.put("Spanish", "sorprender");
            translations.put("French", "surprendre");
            translations.put("Dutch", "verrassen");
            translations.put("German", "überraschen");
            translations.put("Polish", "zaskoczyć");
            translations.put("Russian", "удивить");
            translations.put("Hindi", "आश्चर्यचकित करना");
            translations.put("Farsi", "شگفت زده کردن");
        }
        if (word.equals("agree")) {
            translations.put("Spanish", "estar de acuerdo");
            translations.put("French", "être d'accord");
            translations.put("Dutch", "het eens zijn");
            translations.put("German", "einverstanden sein");
            translations.put("Polish", "zgadzać się");
            translations.put("Russian", "согласиться");
            translations.put("Hindi", "सहमत होना");
            translations.put("Farsi", "موافقت کردن");
        }
        if (word.equals("concern")) {
            translations.put("Spanish", "preocupación");
            translations.put("French", "préoccupation");
            translations.put("Dutch", "bezorgdheid");
            translations.put("German", "besorgnis");
            translations.put("Polish", "zmartwienie");
            translations.put("Russian", "беспокойство");
            translations.put("Hindi", "चिंता");
            translations.put("Farsi", "نگرانی");
        }
        if (word.equals("understand")) {
            translations.put("Spanish", "entender");
            translations.put("French", "comprendre");
            translations.put("Dutch", "begrijpen");
            translations.put("German", "verstehen");
            translations.put("Polish", "rozumieć");
            translations.put("Russian", "понимать");
            translations.put("Hindi", "समझना");
            translations.put("Farsi", "فهمیدن");
        }
        //TRANSITIVE VERBS SECTION
                if (word.equals("praise")) {
            translations.put("Spanish", "alabar");
            translations.put("French", "louer");
            translations.put("Dutch", "prijzen");
            translations.put("German", "loben");
            translations.put("Polish", "chwalić");
            translations.put("Russian", "хвалить");
            translations.put("Hindi", "प्रशंसा करना");
            translations.put("Farsi", "ستایش کردن");
        }
        if (word.equals("summon")) {
            translations.put("Spanish", "invocar");
            translations.put("French", "invoquer");
            translations.put("Dutch", "oproepen");
            translations.put("German", "beschwören");
            translations.put("Polish", "wezwanie");
            translations.put("Russian", "призывать");
            translations.put("Hindi", "आमंत्रित करना");
            translations.put("Farsi", "احضار کردن");
        }
        if (word.equals("strengthen")) {
            translations.put("Spanish", "fortalecer");
            translations.put("French", "renforcer");
            translations.put("Dutch", "versterken");
            translations.put("German", "stärken");
            translations.put("Polish", "wzmacniać");
            translations.put("Russian", "укрепить");
            translations.put("Hindi", "मजबूत करना");
            translations.put("Farsi", "تقویت کردن");
        }
        if (word.equals("tempt")) {
            translations.put("Spanish", "tentar");
            translations.put("French", "tenter");
            translations.put("Dutch", "verleiden");
            translations.put("German", "verführen");
            translations.put("Polish", "kusić");
            translations.put("Russian", "искушать");
            translations.put("Hindi", "प्रलोभित करना");
            translations.put("Farsi", "وسوسه کردن");
        }
        if (word.equals("reassure")) {
            translations.put("Spanish", "tranquilizar");
            translations.put("French", "rassurer");
            translations.put("Dutch", "geruststellen");
            translations.put("German", "beruhigen");
            translations.put("Polish", "uspokoić");
            translations.put("Russian", "успокаивать");
            translations.put("Hindi", "आश्वस्त करना");
            translations.put("Farsi", "اطمینان دادن");
        }
        if (word.equals("befriend")) {
            translations.put("Spanish", "hacerse amigo");
            translations.put("French", "devenir ami");
            translations.put("Dutch", "vriend worden");
            translations.put("German", "befreunden");
            translations.put("Polish", "zaprzyjaźnić się");
            translations.put("Russian", "подружиться");
            translations.put("Hindi", "मित्र बनाना");
            translations.put("Farsi", "دوست شدن");
        }
        if (word.equals("soothe")) {
            translations.put("Spanish", "calmar");
            translations.put("French", "apaiser");
            translations.put("Dutch", "verzachten");
            translations.put("German", "beruhigen");
            translations.put("Polish", "uspokoić");
            translations.put("Russian", "успокаивать");
            translations.put("Hindi", "शांत करना");
            translations.put("Farsi", "آرام کردن");
        }
        if (word.equals("soak")) {
            translations.put("Spanish", "remojar");
            translations.put("French", "tremper");
            translations.put("Dutch", "inweken");
            translations.put("German", "einweichen");
            translations.put("Polish", "moczyć");
            translations.put("Russian", "промокать");
            translations.put("Hindi", "भिगोना");
            translations.put("Farsi", "خیس کردن");
        }
        if (word.equals("enlist")) {
            translations.put("Spanish", "alistar");
            translations.put("French", "engager");
            translations.put("Dutch", "inschrijven");
            translations.put("German", "einberufen");
            translations.put("Polish", "zapisować");
            translations.put("Russian", "записываться");
            translations.put("Hindi", "भरती करना");
            translations.put("Farsi", "نام نویسی کردن");
        }
        if (word.equals("love")) {
            translations.put("Spanish", "amar");
            translations.put("French", "aimer");
            translations.put("Dutch", "liefhebben");
            translations.put("German", "lieben");
            translations.put("Polish", "kochać");
            translations.put("Russian", "любить");
            translations.put("Hindi", "प्रेम करना");
            translations.put("Farsi", "دوست داشتن");
        }
        if (word.equals("draw")) {
            translations.put("Spanish", "dibujar");
            translations.put("French", "dessiner");
            translations.put("Dutch", "tekenen");
            translations.put("German", "zeichnen");
            translations.put("Polish", "rysować");
            translations.put("Russian", "рисовать");
            translations.put("Hindi", "आकृति बनाना");
            translations.put("Farsi", "قرعه کشی");
        }
        if (word.equals("lead")) {
            translations.put("Spanish", "dirigir");
            translations.put("French", "diriger");
            translations.put("Dutch", "leiden");
            translations.put("German", "führen");
            translations.put("Polish", "prowadzić");
            translations.put("Russian", "вести");
            translations.put("Hindi", "नेतृत्व करना");
            translations.put("Farsi", "رهبری کردن");
        }
        if (word.equals("turn on")) {
            translations.put("Spanish", "encender");
            translations.put("French", "allumer");
            translations.put("Dutch", "aanzetten");
            translations.put("German", "einschalten");
            translations.put("Polish", "włączyć");
            translations.put("Russian", "включить");
            translations.put("Hindi", "चालू करना");
            translations.put("Farsi", "روشن کردن");
        }
        if (word.equals("grab")) {
            translations.put("Spanish", "agarrar");
            translations.put("French", "attraper");
            translations.put("Dutch", "grijpen");
            translations.put("German", "greifen");
            translations.put("Polish", "złapać");
            translations.put("Russian", "схватить");
            translations.put("Hindi", "पकड़ना");
            translations.put("Farsi", "چنگ زدن");
        }
        if (word.equals("ignite")) {
            translations.put("Spanish", "encender");
            translations.put("French", "enflammer");
            translations.put("Dutch", "aansteken");
            translations.put("German", "entzünden");
            translations.put("Polish", "zapalić");
            translations.put("Russian", "зажигать");
            translations.put("Hindi", "आग लगाना");
            translations.put("Farsi", "اشتعال کردن");
        }
        if (word.equals("impress")) {
            translations.put("Spanish", "impresionar");
            translations.put("French", "impressionner");
            translations.put("Dutch", "imponeren");
            translations.put("German", "beeindrucken");
            translations.put("Polish", "imponować");
            translations.put("Russian", "впечатлять");
            translations.put("Hindi", "प्रभावित करना");
            translations.put("Farsi", "تحت تأثیر قرار دادن");
        }
        if (word.equals("inflate")) {
            translations.put("Spanish", "inflar");
            translations.put("French", "gonfler");
            translations.put("Dutch", "oppompen");
            translations.put("German", "aufblasen");
            translations.put("Polish", "nadmuchać");
            translations.put("Russian", "надувать");
            translations.put("Hindi", "फूलाना");
            translations.put("Farsi", "باد کردن");
        }
        if (word.equals("turn off")) {
            translations.put("Spanish", "apagar");
            translations.put("French", "éteindre");
            translations.put("Dutch", "uitzetten");
            translations.put("German", "ausschalten");
            translations.put("Polish", "wyłączyć");
            translations.put("Russian", "выключить");
            translations.put("Hindi", "बंद करना");
            translations.put("Farsi", "خاموش کردن");
        }
        if (word.equals("push")) {
            translations.put("Spanish", "empujar");
            translations.put("French", "pousser");
            translations.put("Dutch", "duwen");
            translations.put("German", "schieben");
            translations.put("Polish", "pchać");
            translations.put("Russian", "толкать");
            translations.put("Hindi", "धकेलना");
            translations.put("Farsi", "فشار دادن");
        }
        if (word.equals("preach")) {
            translations.put("Spanish", "predicar");
            translations.put("French", "prêcher");
            translations.put("Dutch", "preken");
            translations.put("German", "predigen");
            translations.put("Polish", "głosić");
            translations.put("Russian", "проповедовать");
            translations.put("Hindi", "धर्म उपदेश देना");
            translations.put("Farsi", "موعظه کردن");
        }
        if (word.equals("worship")) {
            translations.put("Spanish", "adorar");
            translations.put("French", "adorer");
            translations.put("Dutch", "aanbidden");
            translations.put("German", "anbeten");
            translations.put("Polish", "czcić");
            translations.put("Russian", "поклоняться");
            translations.put("Hindi", "पूजा करना");
            translations.put("Farsi", "عبادت");
        }
        if (word.equals("embrace")) {
            translations.put("Spanish", "abrazar");
            translations.put("French", "embrasser");
            translations.put("Dutch", "omarmen");
            translations.put("German", "umarmen");
            translations.put("Polish", "objąć");
            translations.put("Russian", "обнимать");
            translations.put("Hindi", "आलिंगन करना");
            translations.put("Farsi", "در آغوش گرفتن");
        }
        if (word.equals("modify")) {
            translations.put("Spanish", "modificar");
            translations.put("French", "modifier");
            translations.put("Dutch", "wijzigen");
            translations.put("German", "ändern");
            translations.put("Polish", "zmieniać");
            translations.put("Russian", "модифицировать");
            translations.put("Hindi", "संशोधित करना");
            translations.put("Farsi", " ");
        }
        if (word.equals("reduce")) {
            translations.put("Spanish", "reducir");
            translations.put("French", "réduire");
            translations.put("Dutch", "verminderen");
            translations.put("German", "reduzieren");
            translations.put("Polish", "zmniejszać");
            translations.put("Russian", "уменьшать");
            translations.put("Hindi", "घटाना");
            translations.put("Farsi", "کاهش دادن");
        }
        
        
        //LINKING VERBS SECTION
                if (word.equals("appear")) {
            translations.put("Spanish", "aparecer");
            translations.put("French", "apparaître");
            translations.put("Dutch", "verschijnen");
            translations.put("German", "erscheinen");
            translations.put("Polish", "pojawić się");
            translations.put("Russian", "появиться");
            translations.put("Hindi", "दिखाई देना");
            translations.put("Farsi", "ظاهر شدن");
        }
        if (word.equals("be")) {
            translations.put("Spanish", "ser");
            translations.put("French", "être");
            translations.put("Dutch", "zijn");
            translations.put("German", "sein");
            translations.put("Polish", "być");
            translations.put("Russian", "быть");
            translations.put("Hindi", "हونا");
            translations.put("Farsi", "بودن");
        }
        if (word.equals("look")) {
            translations.put("Spanish", "mirar");
            translations.put("French", "regarder");
            translations.put("Dutch", "kijken");
            translations.put("German", "sehen");
            translations.put("Polish", "patrzeć");
            translations.put("Russian", "смотреть");
            translations.put("Hindi", "देखना");
            translations.put("Farsi", "نگاه کردن");
        }
        if (word.equals("prove")) {
            translations.put("Spanish", "probar");
            translations.put("French", "prouver");
            translations.put("Dutch", "bewijzen");
            translations.put("German", "beweisen");
            translations.put("Polish", "udowodnić");
            translations.put("Russian", "доказывать");
            translations.put("Hindi", "सिद्ध करना");
            translations.put("Farsi", "اثبات کردن");
        }
        if (word.equals("become")) {
            translations.put("Spanish", "convertirse");
            translations.put("French", "devenir");
            translations.put("Dutch", "worden");
            translations.put("German", "werden");
            translations.put("Polish", "stać się");
            translations.put("Russian", "стать");
            translations.put("Hindi", "बनना");
            translations.put("Farsi", "شدن");
        }
        if (word.equals("remain")) {
            translations.put("Spanish", "quedar");
            translations.put("French", "rester");
            translations.put("Dutch", "blijven");
            translations.put("German", "bleiben");
            translations.put("Polish", "pozostać");
            translations.put("Russian", "оставаться");
            translations.put("Hindi", "रहना");
            translations.put("Farsi", "ماندن");
        }
        if (word.equals("did")) {
            translations.put("Spanish", "hizo");
            translations.put("French", "a fait");
            translations.put("Dutch", "deed");
            translations.put("German", "tat");
            translations.put("Polish", "zrobił");
            translations.put("Russian", "сделал");
            translations.put("Hindi", "किया");
            translations.put("Farsi", "کرد");
        }
        if (word.equals("seem")) {
            translations.put("Spanish", "parecer");
            translations.put("French", "sembler");
            translations.put("Dutch", "lijken");
            translations.put("German", "scheinen");
            translations.put("Polish", "wydawać się");
            translations.put("Russian", "казаться");
            translations.put("Hindi", "लगना");
            translations.put("Farsi", "به نظر رسیدن");
        }
        if (word.equals("smell")) {
            translations.put("Spanish", "oler");
            translations.put("French", "sentir");
            translations.put("Dutch", "ruiken");
            translations.put("German", "riechen");
            translations.put("Polish", "pachnieć");
            translations.put("Russian", "пахнуть");
            translations.put("Hindi", "सूंघना");
            translations.put("Farsi", "بوییدن");
        }
        if (word.equals("does")) {
            translations.put("Spanish", "hace");
            translations.put("French", "fait");
            translations.put("Dutch", "doet");
            translations.put("German", "tut");
            translations.put("Polish", "robi");
            translations.put("Russian", "делает");
            translations.put("Hindi", "करता है");
            translations.put("Farsi", "میکند");
        }
        if (word.equals("sound")) {
            translations.put("Spanish", "sonido");
            translations.put("French", "son");
            translations.put("Dutch", "geluid");
            translations.put("German", "Klang");
            translations.put("Polish", "dźwięk");
            translations.put("Russian", "звук");
            translations.put("Hindi", "आवाज़");
            translations.put("Farsi", "صدا");
        }
        if (word.equals("feel")) {
            translations.put("Spanish", "sentir");
            translations.put("French", "sentir");
            translations.put("Dutch", "voelen");
            translations.put("German", "fühlen");
            translations.put("Polish", "czuć");
            translations.put("Russian", "чувствовать");
            translations.put("Hindi", "महसूस करना");
            translations.put("Farsi", "حس کردن");
        }
        if (word.equals("stay")) {
            translations.put("Spanish", "quedarse");
            translations.put("French", "rester");
            translations.put("Dutch", "blijven");
            translations.put("German", "bleiben");
            translations.put("Polish", "zostać");
            translations.put("Russian", "оставаться");
            translations.put("Hindi", "ठहरना");
            translations.put("Farsi", "ماندن");
        }
        if (word.equals("taste")) {
            translations.put("Spanish", "saborear");
            translations.put("French", "goûter");
            translations.put("Dutch", "proeven");
            translations.put("German", "schmecken");
            translations.put("Polish", "smakować");
            translations.put("Russian", "пробовать");
            translations.put("Hindi", "स्वाद लेना");
            translations.put("Farsi", "چشیدن");
        }
        if (word.equals("grow")) {
            translations.put("Spanish", "crecer");
            translations.put("French", "grandir");
            translations.put("Dutch", "groeien");
            translations.put("German", "wachsen");
            translations.put("Polish", "rosnąć");
            translations.put("Russian", "расти");
            translations.put("Hindi", "बढ़ना");
            translations.put("Farsi", "رشد کردن");
        }
        if (word.equals("had")) {
            translations.put("Spanish", "tuvo");
            translations.put("French", "avait");
            translations.put("Dutch", "had");
            translations.put("German", "hatte");
            translations.put("Polish", "miał");
            translations.put("Russian", "имел");
            translations.put("Hindi", "था");
            translations.put("Farsi", "داشت");
        }
        if (word.equals("turn")) {
            translations.put("Spanish", "girar");
            translations.put("French", "tourner");
            translations.put("Dutch", "draaien");
            translations.put("German", "drehen");
            translations.put("Polish", "obracać");
            translations.put("Russian", "повернуть");
            translations.put("Hindi", "घुमाना");
            translations.put("Farsi", "چرخاندن");
        }
        if (word.equals("has")) {
            translations.put("Spanish", "tiene");
            translations.put("French", "a");
            translations.put("Dutch", "heeft");
            translations.put("German", "hat");
            translations.put("Polish", "ma");
            translations.put("Russian", "имеет");
            translations.put("Hindi", "है");
            translations.put("Farsi", "دارد");
        }
        if (word.equals("will")) {
            translations.put("Spanish", "voluntad");
            translations.put("French", "volonté");
            translations.put("Dutch", "wil");
            translations.put("German", "wird");
            translations.put("Polish", "będzie");
            translations.put("Russian", "будет");
            translations.put("Hindi", "will");
            translations.put("Farsi", "خواهد");
        }
        if (word.equals("would")) {
            translations.put("Spanish", "haría");
            translations.put("French", "ferait");
            translations.put("Dutch", "zou");
            translations.put("German", "würde");
            translations.put("Polish", "by");
            translations.put("Russian", "бы");
            translations.put("Hindi", "would");
            translations.put("Farsi", "خواهد");
        }

        
        
        //COMPOUND ADJECTIVES SECTION
        
        if (word.equals("hard-working")) {
            translations.put("Spanish", "trabajador");
            translations.put("French", "travailleur");
            translations.put("Dutch", "hardwerkend");
            translations.put("German", "hart arbeitend");
            translations.put("Polish", "pracowity");
            translations.put("Russian", "трудолюбивый");
            translations.put("Hindi", "मेहनती");
            translations.put("Farsi", "سخت کوش");
        }
        if (word.equals("high-tech")) {
            translations.put("Spanish", "alta tecnología");
            translations.put("French", "haute technologie");
            translations.put("Dutch", "hightech");
            translations.put("German", "hochtechnologisch");
            translations.put("Polish", "wysokiej technologii");
            translations.put("Russian", "высокие технологии");
            translations.put("Hindi", "उच्च तकनीकी");
            translations.put("Farsi", "فناوری پیشرفته");
        }
        if (word.equals("long-term")) {
            translations.put("Spanish", "a largo plazo");
            translations.put("French", "à long terme");
            translations.put("Dutch", "langetermijn");
            translations.put("German", "langfristig");
            translations.put("Polish", "długoterminowy");
            translations.put("Russian", "долгосрочный");
            translations.put("Hindi", "दीर्घकालिक");
            translations.put("Farsi", "بلند مدت");
        }
        if (word.equals("low-budget")) {
            translations.put("Spanish", "bajo presupuesto");
            translations.put("French", "à petit budget");
            translations.put("Dutch", "low-budget");
            translations.put("German", "geringes Budget");
            translations.put("Polish", "niski budżet");
            translations.put("Russian", "низкобюджетный");
            translations.put("Hindi", "कम बजट");
            translations.put("Farsi", "کم بودجه");
        }
        if (word.equals("old-fashioned")) {
            translations.put("Spanish", "pasado de moda");
            translations.put("French", "démodé");
            translations.put("Dutch", "ouderwets");
            translations.put("German", "altmodisch");
            translations.put("Polish", "staromodny");
            translations.put("Russian", "старомодный");
            translations.put("Hindi", "पुराना तरीका");
            translations.put("Farsi", "قدیمی");
        }
        if (word.equals("open-minded")) {
            translations.put("Spanish", "mente abierta");
            translations.put("French", "ouvert d'esprit");
            translations.put("Dutch", "open-minded");
            translations.put("German", "aufgeschlossen");
            translations.put("Polish", "otwarty umysł");
            translations.put("Russian", "широкий кругозор");
            translations.put("Hindi", "खुला दिमाग");
            translations.put("Farsi", "باز ذهن");
        }
        if (word.equals("right-handed")) {
            translations.put("Spanish", "diestro");
            translations.put("French", "droitier");
            translations.put("Dutch", "rechtshandig");
            translations.put("German", "rechtshändig");
            translations.put("Polish", "praworęczny");
            translations.put("Russian", "правша");
            translations.put("Hindi", "दायां हाथी");
            translations.put("Farsi", "راست دست");
        }
        if (word.equals("left-handed")) {
            translations.put("Spanish", "zurdo");
            translations.put("French", "gaucher");
            translations.put("Dutch", "linkshandig");
            translations.put("German", "linkshändig");
            translations.put("Polish", "leworeczny");
            translations.put("Russian", "левша");
            translations.put("Hindi", "बाएं हाथी");
            translations.put("Farsi", "چپ دست");
        }
        if (word.equals("well-known")) {
            translations.put("Spanish", "bien conocido");
            translations.put("French", "bien connu");
            translations.put("Dutch", "beroemd");
            translations.put("German", "bekannt");
            translations.put("Polish", "dobrze znany");
            translations.put("Russian", "известный");
            translations.put("Hindi", "प्रसिद्ध");
            translations.put("Farsi", "معروف");
        }
        if (word.equals("well-dressed")) {
            translations.put("Spanish", "bien vestido");
            translations.put("French", "bien habillé");
            translations.put("Dutch", "goed gekleed");
            translations.put("German", "gut gekleidet");
            translations.put("Polish", "dobrze ubrany");
            translations.put("Russian", "хорошо одетый");
            translations.put("Hindi", "अच्छे से पोशाक पहना हुआ");
            translations.put("Farsi", "خوب لباس پوشیده");
        }
        if (word.equals("blue-collar")) {
            translations.put("Spanish", "trabajador manual");
            translations.put("French", "col bleu");
            translations.put("Dutch", "blauwe boorden");
            translations.put("German", "Blaukragen");
            translations.put("Polish", "pracownik fizyczny");
            translations.put("Russian", "рабочий");
            translations.put("Hindi", "मजदूरी वर्ग");
            translations.put("Farsi", "کارگر");
        }
        if (word.equals("white-collar")) {
            translations.put("Spanish", "trabajador de oficina");
            translations.put("French", "col blanc");
            translations.put("Dutch", "witte boorden");
            translations.put("German", "Weißkragen");
            translations.put("Polish", "pracownik biurowy");
            translations.put("Russian", "белый воротничок");
            translations.put("Hindi", "श्वेत कॉलर");
            translations.put("Farsi", "کارمند اداری");
        }
        if (word.equals("wide-eyed")) {
            translations.put("Spanish", "ojos muy abiertos");
            translations.put("French", "yeux écarquillés");
            translations.put("Dutch", "grote ogen");
            translations.put("German", "große Augen");
            translations.put("Polish", "oczy szeroko otwarte");
            translations.put("Russian", "с широко раскрытыми глазами");
            translations.put("Hindi", "चौड़ी आँखें");
            translations.put("Farsi", "چشم‌های بزرگ");
        }
        if (word.equals("well-read")) {
            translations.put("Spanish", "bien leído");
            translations.put("French", "bien lu");
            translations.put("Dutch", "goed gelezen");
            translations.put("German", "gut gelesen");
            translations.put("Polish", "dobrze przeczytany");
            translations.put("Russian", "начитанный");
            translations.put("Hindi", "अच्छी तरह से पढ़ा हुआ");
            translations.put("Farsi", "خوب خوانده شده");
        }
        if (word.equals("well-received")) {
            translations.put("Spanish", "bien recibido");
            translations.put("French", "bien accueilli");
            translations.put("Dutch", "goed ontvangen");
            translations.put("German", "gut aufgenommen");
            translations.put("Polish", "dobrze przyjęty");
            translations.put("Russian", "хорошо воспринятый");
            translations.put("Hindi", "अच्छे से स्वागत किया गया");
            translations.put("Farsi", "خوب دریافت شده");
        }
        if (word.equals("high-end")) {
            translations.put("Spanish", "alta gama");
            translations.put("French", "haut de gamme");
            translations.put("Dutch", "hoogwaardig");
            translations.put("German", "hochwertig");
            translations.put("Polish", "wysokiej klasy");
            translations.put("Russian", "высококачественный");
            translations.put("Hindi", "उच्च अंत");
            translations.put("Farsi", "بالا پایان");
        }
        if (word.equals("low-key")) {
            translations.put("Spanish", "bajo perfil");
            translations.put("French", "discret");
            translations.put("Dutch", "low-key");
            translations.put("German", "low-key");
            translations.put("Polish", "niskoprofilowy");
            translations.put("Russian", "сдержанный");
            translations.put("Hindi", "नम्र");
            translations.put("Farsi", "ساده");
        }
        if (word.equals("close-knit")) {
            translations.put("Spanish", "estrechamente unido");
            translations.put("French", "très soudé");
            translations.put("Dutch", "hecht");
            translations.put("German", "eng verbunden");
            translations.put("Polish", "blisko związany");
            translations.put("Russian", "сплоченный");
            translations.put("Hindi", "करीब से जुड़ा हुआ");
            translations.put("Farsi", "دقیقاً مرتبط");
        }
        if (word.equals("high-energy")) {
            translations.put("Spanish", "alta energía");
            translations.put("French", "énergie élevée");
            translations.put("Dutch", "hoge energie");
            translations.put("German", "hochenergetisch");
            translations.put("Polish", "wysoka energia");
            translations.put("Russian", "высокая энергия");
            translations.put("Hindi", "उच्च ऊर्जा");
            translations.put("Farsi", "انرژی بالا");
        }
        if (word.equals("hard-hitting")) {
            translations.put("Spanish", "contundente");
            translations.put("French", "percutant");
            translations.put("Dutch", "scherp");
            translations.put("German", "harte Schläge");
            translations.put("Polish", "silny");
            translations.put("Russian", "сильный");
            translations.put("Hindi", "कठोर");
            translations.put("Farsi", "سخت گیر");
        }
        if (word.equals("fast-paced")) {
            translations.put("Spanish", "de ritmo rápido");
            translations.put("French", "rythme rapide");
            translations.put("Dutch", "snel tempo");
            translations.put("German", "schnelles Tempo");
            translations.put("Polish", "szybkie tempo");
            translations.put("Russian", "быстрый темп");
            translations.put("Hindi", "तेज़ गति");
            translations.put("Farsi", "سرعت بالا");
        }
        if (word.equals("strong-willed")) {
            translations.put("Spanish", "de voluntad fuerte");
            translations.put("French", "volonté forte");
            translations.put("Dutch", "sterkwillig");
            translations.put("German", "stur");
            translations.put("Polish", "silnie zdecydowany");
            translations.put("Russian", "сильная воля");
            translations.put("Hindi", "मजबूत इच्छाशक्ति");
            translations.put("Farsi", "اراده قوی");
        }
        
        if (word.equals("this")) {
            translations.put("Spanish", "esto");
            translations.put("French", "ce");
            translations.put("Dutch", "dit");
            translations.put("German", "dies");
            translations.put("Polish", "to");
            translations.put("Russian", "это");
            translations.put("Hindi", "यह");
            translations.put("Farsi", "این");
        }
        
        //DEMONSTRATIVE ADJECTIVES SECTION
        if (word.equals("that")) {
            translations.put("Spanish", "eso");
            translations.put("French", "cela");
            translations.put("Dutch", "dat");
            translations.put("German", "das");
            translations.put("Polish", "to");
            translations.put("Russian", "то");
            translations.put("Hindi", "वह");
            translations.put("Farsi", "آن");
        }
        if (word.equals("these")) {
            translations.put("Spanish", "estos");
            translations.put("French", "ces");
            translations.put("Dutch", "deze");
            translations.put("German", "diese");
            translations.put("Polish", "te");
            translations.put("Russian", "эти");
            translations.put("Hindi", "ये");
            translations.put("Farsi", "اینها");
        }
        if (word.equals("those")) {
            translations.put("Spanish", "esos");
            translations.put("French", "ceux");
            translations.put("Dutch", "die");
            translations.put("German", "jene");
            translations.put("Polish", "tamte");
            translations.put("Russian", "те");
            translations.put("Hindi", "वह (बहुत दूर)");
            translations.put("Farsi", "آنها");
        }
        
        //INTERROGATIVE ADJECTIVES SECTION
        if (word.equals("what")) {
            translations.put("Spanish", "qué");
            translations.put("French", "quoi");
            translations.put("Dutch", "wat");
            translations.put("German", "was");
            translations.put("Polish", "co");
            translations.put("Russian", "что");
            translations.put("Hindi", "क्या");
            translations.put("Farsi", "چه");
        }
        if (word.equals("which")) {
            translations.put("Spanish", "cuál");
            translations.put("French", "lequel");
            translations.put("Dutch", "welk");
            translations.put("German", "welches");
            translations.put("Polish", "który");
            translations.put("Russian", "какой");
            translations.put("Hindi", "कौन सा");
            translations.put("Farsi", "کدام");
        }
        if (word.equals("whose")) {
            translations.put("Spanish", "de quién");
            translations.put("French", "de qui");
            translations.put("Dutch", "wiens");
            translations.put("German", "wessen");
            translations.put("Polish", "czyj");
            translations.put("Russian", "чей");
            translations.put("Hindi", "किसका");
            translations.put("Farsi", "مالِ کی");
        }
        
        //POSSESSIVE ADJECTIVES SECTION
         if (word.equals("my")) {
            translations.put("Spanish", "mi");
            translations.put("French", "mon");
            translations.put("Dutch", "mijn");
            translations.put("German", "mein");
            translations.put("Polish", "mój");
            translations.put("Russian", "мой");
            translations.put("Hindi", "मेरा");
            translations.put("Farsi", "من");
        }
        if (word.equals("your")) {
            translations.put("Spanish", "tu");
            translations.put("French", "ton");
            translations.put("Dutch", "jouw");
            translations.put("German", "dein");
            translations.put("Polish", "twój");
            translations.put("Russian", "твой");
            translations.put("Hindi", "तुम्हारा");
            translations.put("Farsi", "تو");
        }
        if (word.equals("his")) {
            translations.put("Spanish", "su");
            translations.put("French", "son");
            translations.put("Dutch", "zijn");
            translations.put("German", "sein");
            translations.put("Polish", "jego");
            translations.put("Russian", "его");
            translations.put("Hindi", "उसका");
            translations.put("Farsi", "او");
        }
        if (word.equals("her")) {
            translations.put("Spanish", "su");
            translations.put("French", "sa");
            translations.put("Dutch", "haar");
            translations.put("German", "ihr");
            translations.put("Polish", "jej");
            translations.put("Russian", "её");
            translations.put("Hindi", "उसका (महिला)");
            translations.put("Farsi", "او");
        }
        if (word.equals("their")) {
            translations.put("Spanish", "suyo");
            translations.put("French", "leur");
            translations.put("Dutch", "hun");
            translations.put("German", "ihr");
            translations.put("Polish", "ich");
            translations.put("Russian", "их");
            translations.put("Hindi", "उनका");
            translations.put("Farsi", "آنها");
        }
        if (word.equals("its")) {
            translations.put("Spanish", "su");
            translations.put("French", "son");
            translations.put("Dutch", "zijn");
            translations.put("German", "sein");
            translations.put("Polish", "jego");
            translations.put("Russian", "его");
            translations.put("Hindi", "इसका");
            translations.put("Farsi", "آن");
        }
        if (word.equals("our")) {
            translations.put("Spanish", "nuestro");
            translations.put("French", "notre");
            translations.put("Dutch", "onze");
            translations.put("German", "unser");
            translations.put("Polish", "nasz");
            translations.put("Russian", "наш");
            translations.put("Hindi", "हमारा");
            translations.put("Farsi", "ما");
        }
        
        
        
        //PREPOSITIONS OF MANNER SECTION
         if (word.equals("with")) {
            translations.put("Spanish", "con");
            translations.put("French", "avec");
            translations.put("Dutch", "met");
            translations.put("German", "mit");
            translations.put("Polish", "z");
            translations.put("Russian", "с");
            translations.put("Hindi", "के साथ");
            translations.put("Farsi", "با");
        }
        if (word.equals("for")) {
            translations.put("Spanish", "para");
            translations.put("French", "pour");
            translations.put("Dutch", "voor");
            translations.put("German", "für");
            translations.put("Polish", "dla");
            translations.put("Russian", "для");
            translations.put("Hindi", "के लिए");
            translations.put("Farsi", "برای");
        }
        if (word.equals("of")) {
            translations.put("Spanish", "de");
            translations.put("French", "de");
            translations.put("Dutch", "van");
            translations.put("German", "von");
            translations.put("Polish", "z");
            translations.put("Russian", "из");
            translations.put("Hindi", "का");
            translations.put("Farsi", "از");
        }
        if (word.equals("by")) {
            translations.put("Spanish", "por");
            translations.put("French", "par");
            translations.put("Dutch", "door");
            translations.put("German", "von");
            translations.put("Polish", "przez");
            translations.put("Russian", "по");
            translations.put("Hindi", "द्वारा");
            translations.put("Farsi", "توسط");
        }
        if (word.equals("like")) {
            translations.put("Spanish", "como");
            translations.put("French", "comme");
            translations.put("Dutch", "zoals");
            translations.put("German", "wie");
            translations.put("Polish", "jak");
            translations.put("Russian", "как");
            translations.put("Hindi", "जैसा");
            translations.put("Farsi", "مانند");
        }
        if (word.equals("as")) {
            translations.put("Spanish", "como");
            translations.put("French", "comme");
            translations.put("Dutch", "als");
            translations.put("German", "wie");
            translations.put("Polish", "jak");
            translations.put("Russian", "как");
            translations.put("Hindi", "जैसा");
            translations.put("Farsi", "به عنوان");
        }
        if (word.equals("in")) {
            translations.put("Spanish", "en");
            translations.put("French", "dans");
            translations.put("Dutch", "in");
            translations.put("German", "in");
            translations.put("Polish", "w");
            translations.put("Russian", "в");
            translations.put("Hindi", "में");
            translations.put("Farsi", "در");
        }
        if (word.equals("on")) {
            translations.put("Spanish", "en");
            translations.put("French", "sur");
            translations.put("Dutch", "op");
            translations.put("German", "auf");
            translations.put("Polish", "na");
            translations.put("Russian", "на");
            translations.put("Hindi", "पर");
            translations.put("Farsi", "روی");
        }
        
        
        //PREPOSITIONS OF MOVEMENT SECTION
        if (word.equals("up")) {
            translations.put("Spanish", "arriba");
            translations.put("French", "haut");
            translations.put("Dutch", "omhoog");
            translations.put("German", "oben");
            translations.put("Polish", "w górę");
            translations.put("Russian", "вверх");
            translations.put("Hindi", "ऊपर");
            translations.put("Farsi", "بالا");
        }
        if (word.equals("down")) {
            translations.put("Spanish", "abajo");
            translations.put("French", "bas");
            translations.put("Dutch", "omlaag");
            translations.put("German", "unten");
            translations.put("Polish", "na dół");
            translations.put("Russian", "вниз");
            translations.put("Hindi", "नीचे");
            translations.put("Farsi", "پایین");
        }
        if (word.equals("out of")) {
            translations.put("Spanish", "fuera de");
            translations.put("French", "hors de");
            translations.put("Dutch", "uit");
            translations.put("German", "aus");
            translations.put("Polish", "poza");
            translations.put("Russian", "из");
            translations.put("Hindi", "से बाहर");
            translations.put("Farsi", "از");
        }
        if (word.equals("into")) {
            translations.put("Spanish", "en");
            translations.put("French", "dans");
            translations.put("Dutch", "in");
            translations.put("German", "in");
            translations.put("Polish", "do");
            translations.put("Russian", "в");
            translations.put("Hindi", "में");
            translations.put("Farsi", "به داخل");
        }
        if (word.equals("in")) {
            translations.put("Spanish", "en");
            translations.put("French", "dans");
            translations.put("Dutch", "in");
            translations.put("German", "in");
            translations.put("Polish", "w");
            translations.put("Russian", "в");
            translations.put("Hindi", "में");
            translations.put("Farsi", "در");
        }
        if (word.equals("out")) {
            translations.put("Spanish", "fuera");
            translations.put("French", "dehors");
            translations.put("Dutch", "buiten");
            translations.put("German", "draußen");
            translations.put("Polish", "na zewnątrz");
            translations.put("Russian", "наружу");
            translations.put("Hindi", "बाहर");
            translations.put("Farsi", "بیرون");
        }
        if (word.equals("under")) {
            translations.put("Spanish", "debajo");
            translations.put("French", "sous");
            translations.put("Dutch", "onder");
            translations.put("German", "unter");
            translations.put("Polish", "pod");
            translations.put("Russian", "под");
            translations.put("Hindi", "नीचे");
            translations.put("Farsi", "زیر");
        }
        if (word.equals("above")) {
            translations.put("Spanish", "encima de");
            translations.put("French", "au-dessus de");
            translations.put("Dutch", "boven");
            translations.put("German", "über");
            translations.put("Polish", "ponad");
            translations.put("Russian", "над");
            translations.put("Hindi", "ऊपर");
            translations.put("Farsi", "بالا");
        }
        if (word.equals("next to")) {
            translations.put("Spanish", "al lado de");
            translations.put("French", "à côté de");
            translations.put("Dutch", "naast");
            translations.put("German", "neben");
            translations.put("Polish", "obok");
            translations.put("Russian", "рядом с");
            translations.put("Hindi", "के पास");
            translations.put("Farsi", "کنار");
        }
        if (word.equals("toward")) {
            translations.put("Spanish", "hacia");
            translations.put("French", "vers");
            translations.put("Dutch", "richting");
            translations.put("German", "zu");
            translations.put("Polish", "w kierunku");
            translations.put("Russian", "к");
            translations.put("Hindi", "की ओर");
            translations.put("Farsi", "به سوی");
        }
        if (word.equals("away")) {
            translations.put("Spanish", "lejos");
            translations.put("French", "loin");
            translations.put("Dutch", "weg");
            translations.put("German", "weg");
            translations.put("Polish", "daleko");
            translations.put("Russian", "подальше");
            translations.put("Hindi", "दूर");
            translations.put("Farsi", "دور");
        }
        if (word.equals("past")) {
            translations.put("Spanish", "pasado");
            translations.put("French", "passé");
            translations.put("Dutch", "voorbij");
            translations.put("German", "vorbei");
            translations.put("Polish", "przeszły");
            translations.put("Russian", "мимо");
            translations.put("Hindi", "गुज़रना");
            translations.put("Farsi", "گذشته");
        }
        if (word.equals("over")) {
            translations.put("Spanish", "sobre");
            translations.put("French", "sur");
            translations.put("Dutch", "over");
            translations.put("German", "über");
            translations.put("Polish", "nad");
            translations.put("Russian", "над");
            translations.put("Hindi", "ऊपर");
            translations.put("Farsi", "روی");
        }
        if (word.equals("between")) {
            translations.put("Spanish", "entre");
            translations.put("French", "entre");
            translations.put("Dutch", "tussen");
            translations.put("German", "zwischen");
            translations.put("Polish", "między");
            translations.put("Russian", "между");
            translations.put("Hindi", "के बीच");
            translations.put("Farsi", "بین");
        }
        if (word.equals("among")) {
            translations.put("Spanish", "entre");
            translations.put("French", "parmi");
            translations.put("Dutch", "onder");
            translations.put("German", "unter");
            translations.put("Polish", "wśród");
            translations.put("Russian", "среди");
            translations.put("Hindi", "के बीच");
            translations.put("Farsi", "بین");
        }
        if (word.equals("in front of")) {
            translations.put("Spanish", "delante de");
            translations.put("French", "devant");
            translations.put("Dutch", "voor");
            translations.put("German", "vor");
            translations.put("Polish", "przed");
            translations.put("Russian", "перед");
            translations.put("Hindi", "के सामने");
            translations.put("Farsi", "جلو");
        }
        if (word.equals("behind")) {
            translations.put("Spanish", "detrás");
            translations.put("French", "derrière");
            translations.put("Dutch", "achter");
            translations.put("German", "hinter");
            translations.put("Polish", "za");
            translations.put("Russian", "за");
            translations.put("Hindi", "पीछे");
            translations.put("Farsi", "پشت");
        }
        if (word.equals("onto")) {
            translations.put("Spanish", "sobre");
            translations.put("French", "sur");
            translations.put("Dutch", "op");
            translations.put("German", "auf");
            translations.put("Polish", "na");
            translations.put("Russian", "на");
            translations.put("Hindi", "पर");
            translations.put("Farsi", "روی");
        }
        if (word.equals("off")) {
            translations.put("Spanish", "fuera");
            translations.put("French", "hors");
            translations.put("Dutch", "af");
            translations.put("German", "aus");
            translations.put("Polish", "z");
            translations.put("Russian", "с");
            translations.put("Hindi", "से");
            translations.put("Farsi", "خاموش");
        }
        if (word.equals("around")) {
            translations.put("Spanish", "alrededor de");
            translations.put("French", "autour de");
            translations.put("Dutch", "rond");
            translations.put("German", "um");
            translations.put("Polish", "wokół");
            translations.put("Russian", "вокруг");
            translations.put("Hindi", "के चारों ओर");
            translations.put("Farsi", "دور");
        }
        if (word.equals("under")) {
            translations.put("Spanish", "debajo");
            translations.put("French", "sous");
            translations.put("Dutch", "onder");
            translations.put("German", "unter");
            translations.put("Polish", "pod");
            translations.put("Russian", "под");
            translations.put("Hindi", "नीचे");
            translations.put("Farsi", "زیر");
        }
        if (word.equals("below")) {
            translations.put("Spanish", "debajo de");
            translations.put("French", "en dessous de");
            translations.put("Dutch", "onder");
            translations.put("German", "unter");
            translations.put("Polish", "poniżej");
            translations.put("Russian", "ниже");
            translations.put("Hindi", "नीचे");
            translations.put("Farsi", "زیر");
        }
        if (word.equals("near")) {
            translations.put("Spanish", "cerca de");
            translations.put("French", "près de");
            translations.put("Dutch", "dichtbij");
            translations.put("German", "nahe");
            translations.put("Polish", "blisko");
            translations.put("Russian", "близко");
            translations.put("Hindi", "पास");
            translations.put("Farsi", "نزدیک");
        }
        if (word.equals("far from")) {
            translations.put("Spanish", "lejos de");
            translations.put("French", "loin de");
            translations.put("Dutch", "ver weg");
            translations.put("German", "weit von");
            translations.put("Polish", "daleko od");
            translations.put("Russian", "далеко от");
            translations.put("Hindi", "से दूर");
            translations.put("Farsi", "دور از");
        }
        if (word.equals("along")) {
            translations.put("Spanish", "a lo largo de");
            translations.put("French", "le long de");
            translations.put("Dutch", "langs");
            translations.put("German", "entlang");
            translations.put("Polish", "wzdłuż");
            translations.put("Russian", "вдоль");
            translations.put("Hindi", "के साथ");
            translations.put("Farsi", "در امتداد");
        }
        if (word.equals("across")) {
            translations.put("Spanish", "a través de");
            translations.put("French", "à travers");
            translations.put("Dutch", "door");
            translations.put("German", "über");
            translations.put("Polish", "przez");
            translations.put("Russian", "через");
            translations.put("Hindi", "के पार");
            translations.put("Farsi", "از آن طرف");
        }
        if (word.equals("through")) {
            translations.put("Spanish", "a través de");
            translations.put("French", "à travers");
            translations.put("Dutch", "door");
            translations.put("German", "durch");
            translations.put("Polish", "przez");
            translations.put("Russian", "через");
            translations.put("Hindi", "के माध्यम से");
            translations.put("Farsi", "از طریق");
        }

        
        //PREPOSITIONS OF PLACE
                if (word.equals("in")) {
            translations.put("Spanish", "en");
            translations.put("French", "dans");
            translations.put("Dutch", "in");
            translations.put("German", "in");
            translations.put("Polish", "w");
            translations.put("Russian", "в");
            translations.put("Hindi", "में");
            translations.put("Farsi", "در");
        }
        if (word.equals("on")) {
            translations.put("Spanish", "en");
            translations.put("French", "sur");
            translations.put("Dutch", "op");
            translations.put("German", "auf");
            translations.put("Polish", "na");
            translations.put("Russian", "на");
            translations.put("Hindi", "पर");
            translations.put("Farsi", "روی");
        }
        if (word.equals("beside")) {
            translations.put("Spanish", "al lado de");
            translations.put("French", "à côté de");
            translations.put("Dutch", "naast");
            translations.put("German", "neben");
            translations.put("Polish", "obok");
            translations.put("Russian", "рядом с");
            translations.put("Hindi", "के पास");
            translations.put("Farsi", "کنار");
        }
        if (word.equals("at")) {
            translations.put("Spanish", "en");
            translations.put("French", "à");
            translations.put("Dutch", "bij");
            translations.put("German", "bei");
            translations.put("Polish", "u");
            translations.put("Russian", "в");
            translations.put("Hindi", "पर");
            translations.put("Farsi", "در");
        }
        if (word.equals("between")) {
            translations.put("Spanish", "entre");
            translations.put("French", "entre");
            translations.put("Dutch", "tussen");
            translations.put("German", "zwischen");
            translations.put("Polish", "między");
            translations.put("Russian", "между");
            translations.put("Hindi", "के बीच");
            translations.put("Farsi", "بین");
        }
        if (word.equals("under")) {
            translations.put("Spanish", "debajo");
            translations.put("French", "sous");
            translations.put("Dutch", "onder");
            translations.put("German", "unter");
            translations.put("Polish", "pod");
            translations.put("Russian", "под");
            translations.put("Hindi", "नीचे");
            translations.put("Farsi", "زیر");
        }
        if (word.equals("behind")) {
            translations.put("Spanish", "detrás");
            translations.put("French", "derrière");
            translations.put("Dutch", "achter");
            translations.put("German", "hinter");
            translations.put("Polish", "za");
            translations.put("Russian", "за");
            translations.put("Hindi", "पीछे");
            translations.put("Farsi", "پشت");
        }
        if (word.equals("in front of")) {
            translations.put("Spanish", "delante de");
            translations.put("French", "devant");
            translations.put("Dutch", "voor");
            translations.put("German", "vor");
            translations.put("Polish", "przed");
            translations.put("Russian", "перед");
            translations.put("Hindi", "के सामने");
            translations.put("Farsi", "جلو");
        }
        if (word.equals("above")) {
            translations.put("Spanish", "encima de");
            translations.put("French", "au-dessus de");
            translations.put("Dutch", "boven");
            translations.put("German", "über");
            translations.put("Polish", "ponad");
            translations.put("Russian", "над");
            translations.put("Hindi", "ऊपर");
            translations.put("Farsi", "بالا");
        }
        if (word.equals("opposite")) {
            translations.put("Spanish", "opuesto");
            translations.put("French", "en face de");
            translations.put("Dutch", "tegenover");
            translations.put("German", "gegenüber");
            translations.put("Polish", "naprzeciw");
            translations.put("Russian", "напротив");
            translations.put("Hindi", "के सामने");
            translations.put("Farsi", "مقابل");
        }
        if (word.equals("perpendicular")) {
            translations.put("Spanish", "perpendicular");
            translations.put("French", "perpendiculaire");
            translations.put("Dutch", "loodrecht");
            translations.put("German", "senkrecht");
            translations.put("Polish", "prostopadły");
            translations.put("Russian", "перпендикуляр");
            translations.put("Hindi", "लंबवत");
            translations.put("Farsi", "عمودی");
        }
        if (word.equals("parallel")) {
            translations.put("Spanish", "paralelo");
            translations.put("French", "parallèle");
            translations.put("Dutch", "parallel");
            translations.put("German", "parallel");
            translations.put("Polish", "równoległy");
            translations.put("Russian", "параллельный");
            translations.put("Hindi", "समानांतर");
            translations.put("Farsi", "موازی");
        }
        if (word.equals("among")) {
            translations.put("Spanish", "entre");
            translations.put("French", "parmi");
            translations.put("Dutch", "onder");
            translations.put("German", "unter");
            translations.put("Polish", "wśród");
            translations.put("Russian", "среди");
            translations.put("Hindi", "के बीच");
            translations.put("Farsi", "بین");
        }
        if (word.equals("on top of")) {
            translations.put("Spanish", "encima de");
            translations.put("French", "au-dessus de");
            translations.put("Dutch", "bovenop");
            translations.put("German", "auf");
            translations.put("Polish", "na szczycie");
            translations.put("Russian", "на вершине");
            translations.put("Hindi", "ऊपर");
            translations.put("Farsi", "بالا");
        }
        if (word.equals("near")) {
            translations.put("Spanish", "cerca de");
            translations.put("French", "près de");
            translations.put("Dutch", "dichtbij");
            translations.put("German", "nahe");
            translations.put("Polish", "blisko");
            translations.put("Russian", "близко");
            translations.put("Hindi", "पास");
            translations.put("Farsi", "نزدیک");
        }
        if (word.equals("far")) {
            translations.put("Spanish", "lejos");
            translations.put("French", "loin");
            translations.put("Dutch", "ver");
            translations.put("German", "weit");
            translations.put("Polish", "daleko");
            translations.put("Russian", "далеко");
            translations.put("Hindi", "दूर");
            translations.put("Farsi", "دور");
        }
        
        
        //PREPOSITIONS OF TIME
                if (word.equals("in")) {
            translations.put("Spanish", "en");
            translations.put("French", "dans");
            translations.put("Dutch", "in");
            translations.put("German", "in");
            translations.put("Polish", "w");
            translations.put("Russian", "в");
            translations.put("Hindi", "में");
            translations.put("Farsi", "در");
        }
        if (word.equals("at")) {
            translations.put("Spanish", "en");
            translations.put("French", "à");
            translations.put("Dutch", "bij");
            translations.put("German", "bei");
            translations.put("Polish", "u");
            translations.put("Russian", "в");
            translations.put("Hindi", "पर");
            translations.put("Farsi", "در");
        }
        if (word.equals("on")) {
            translations.put("Spanish", "en");
            translations.put("French", "sur");
            translations.put("Dutch", "op");
            translations.put("German", "auf");
            translations.put("Polish", "na");
            translations.put("Russian", "на");
            translations.put("Hindi", "पर");
            translations.put("Farsi", "روی");
        }
        if (word.equals("during")) {
            translations.put("Spanish", "durante");
            translations.put("French", "pendant");
            translations.put("Dutch", "gedurende");
            translations.put("German", "während");
            translations.put("Polish", "podczas");
            translations.put("Russian", "во время");
            translations.put("Hindi", "के दौरान");
            translations.put("Farsi", "در طول");
        }
        if (word.equals("for")) {
            translations.put("Spanish", "para");
            translations.put("French", "pour");
            translations.put("Dutch", "voor");
            translations.put("German", "für");
            translations.put("Polish", "dla");
            translations.put("Russian", "для");
            translations.put("Hindi", "के लिए");
            translations.put("Farsi", "برای");
        }
        if (word.equals("until")) {
            translations.put("Spanish", "hasta");
            translations.put("French", "jusqu'à");
            translations.put("Dutch", "tot");
            translations.put("German", "bis");
            translations.put("Polish", "do");
            translations.put("Russian", "до");
            translations.put("Hindi", "तक");
            translations.put("Farsi", "تا");
        }
        if (word.equals("since")) {
            translations.put("Spanish", "desde");
            translations.put("French", "depuis");
            translations.put("Dutch", "sinds");
            translations.put("German", "seit");
            translations.put("Polish", "od");
            translations.put("Russian", "с");
            translations.put("Hindi", "से");
            translations.put("Farsi", "از");
        }
        if (word.equals("from")) {
            translations.put("Spanish", "de");
            translations.put("French", "de");
            translations.put("Dutch", "van");
            translations.put("German", "von");
            translations.put("Polish", "z");
            translations.put("Russian", "от");
            translations.put("Hindi", "से");
            translations.put("Farsi", "از");
        }
        if (word.equals("to")) {
            translations.put("Spanish", "a");
            translations.put("French", "à");
            translations.put("Dutch", "naar");
            translations.put("German", "zu");
            translations.put("Polish", "do");
            translations.put("Russian", "к");
            translations.put("Hindi", "को");
            translations.put("Farsi", "به");
        }
        if (word.equals("ago")) {
            translations.put("Spanish", "hace");
            translations.put("French", "il y a");
            translations.put("Dutch", "geleden");
            translations.put("German", "vor");
            translations.put("Polish", "temu");
            translations.put("Russian", "назад");
            translations.put("Hindi", "पहले");
            translations.put("Farsi", "پیش");
        }
        if (word.equals("before")) {
            translations.put("Spanish", "antes de");
            translations.put("French", "avant");
            translations.put("Dutch", "voor");
            translations.put("German", "vor");
            translations.put("Polish", "przed");
            translations.put("Russian", "до");
            translations.put("Hindi", "पहले");
            translations.put("Farsi", "قبل از");
        }
        if (word.equals("by")) {
            translations.put("Spanish", "por");
            translations.put("French", "par");
            translations.put("Dutch", "door");
            translations.put("German", "von");
            translations.put("Polish", "przez");
            translations.put("Russian", "по");
            translations.put("Hindi", "द्वारा");
            translations.put("Farsi", "توسط");
        }
        if (word.equals("after")) {
            translations.put("Spanish", "después de");
            translations.put("French", "après");
            translations.put("Dutch", "na");
            translations.put("German", "nach");
            translations.put("Polish", "po");
            translations.put("Russian", "после");
            translations.put("Hindi", "के बाद");
            translations.put("Farsi", "بعد از");
        }
        if (word.equals("past")) {
            translations.put("Spanish", "pasado");
            translations.put("French", "passé");
            translations.put("Dutch", "voorbij");
            translations.put("German", "vorbei");
            translations.put("Polish", "przeszły");
            translations.put("Russian", "прошлый");
            translations.put("Hindi", "पिछला");
            translations.put("Farsi", "گذشته");
        }
        if (word.equals("between")) {
            translations.put("Spanish", "entre");
            translations.put("French", "entre");
            translations.put("Dutch", "tussen");
            translations.put("German", "zwischen");
            translations.put("Polish", "między");
            translations.put("Russian", "между");
            translations.put("Hindi", "के बीच");
            translations.put("Farsi", "بین");
        }
        if (word.equals("within")) {
            translations.put("Spanish", "dentro de");
            translations.put("French", "à l'intérieur de");
            translations.put("Dutch", "binnen");
            translations.put("German", "innerhalb");
            translations.put("Polish", "wewnątrz");
            translations.put("Russian", "в пределах");
            translations.put("Hindi", "के भीतर");
            translations.put("Farsi", "درون");
        }
        
        
        
        
        //ARTICLES OF DETERMINERS SECTIONS
        if (word.equals("a")) {
            translations.put("Spanish", "un");
            translations.put("French", "un");
            translations.put("Dutch", "een");
            translations.put("German", "ein");
            translations.put("Polish", "jeden");
            translations.put("Russian", "один");
            translations.put("Hindi", "एक");
            translations.put("Farsi", "یک");
        }
        if (word.equals("an")) {
            translations.put("Spanish", "un");
            translations.put("French", "un");
            translations.put("Dutch", "een");
            translations.put("German", "ein");
            translations.put("Polish", "jeden");
            translations.put("Russian", "один");
            translations.put("Hindi", "एक");
            translations.put("Farsi", "یک");
        }
        if (word.equals("the")) {
            translations.put("Spanish", "el");
            translations.put("French", "le");
            translations.put("Dutch", "de");
            translations.put("German", "der");
            translations.put("Polish", "ten");
            translations.put("Russian", "этот");
            translations.put("Hindi", "वह");
            translations.put("Farsi", "آن");
        }
        
        //DEMONSTRATIVES OF DETERMINERS/ADJECTIVES SECTION
                if (word.equals("that")) {
            translations.put("Spanish", "eso");
            translations.put("French", "cela");
            translations.put("Dutch", "dat");
            translations.put("German", "das");
            translations.put("Polish", "to");
            translations.put("Russian", "то");
            translations.put("Hindi", "वह");
            translations.put("Farsi", "آن");
        }
        if (word.equals("these")) {
            translations.put("Spanish", "estos");
            translations.put("French", "ces");
            translations.put("Dutch", "deze");
            translations.put("German", "diese");
            translations.put("Polish", "te");
            translations.put("Russian", "эти");
            translations.put("Hindi", "ये");
            translations.put("Farsi", "اینها");
        }
        if (word.equals("those")) {
            translations.put("Spanish", "esos");
            translations.put("French", "ceux");
            translations.put("Dutch", "die");
            translations.put("German", "jene");
            translations.put("Polish", "tamte");
            translations.put("Russian", "те");
            translations.put("Hindi", "वह (बहुत दूर)");
            translations.put("Farsi", "آنها");
        }
        
        //POSSESSIVES OF ADJECTIVES/DETERMINERS SECTION
                 if (word.equals("My")) {
            translations.put("Spanish", "mi");
            translations.put("French", "mon");
            translations.put("Dutch", "mijn");
            translations.put("German", "mein");
            translations.put("Polish", "mój");
            translations.put("Russian", "мой");
            translations.put("Hindi", "मेरा");
            translations.put("Farsi", "من");
        }
        if (word.equals("Your")) {
            translations.put("Spanish", "tu");
            translations.put("French", "ton");
            translations.put("Dutch", "jouw");
            translations.put("German", "dein");
            translations.put("Polish", "twój");
            translations.put("Russian", "твой");
            translations.put("Hindi", "तुम्हारा");
            translations.put("Farsi", "تو");
        }
        if (word.equals("His")) {
            translations.put("Spanish", "su");
            translations.put("French", "son");
            translations.put("Dutch", "zijn");
            translations.put("German", "sein");
            translations.put("Polish", "jego");
            translations.put("Russian", "его");
            translations.put("Hindi", "उसका");
            translations.put("Farsi", "او");
        }
        if (word.equals("Her")) {
            translations.put("Spanish", "su");
            translations.put("French", "sa");
            translations.put("Dutch", "haar");
            translations.put("German", "ihr");
            translations.put("Polish", "jej");
            translations.put("Russian", "её");
            translations.put("Hindi", "उसका (महिला)");
            translations.put("Farsi", "او");
        }
        if (word.equals("Theirs")) {
            translations.put("Spanish", "suyo");
            translations.put("French", "leur");
            translations.put("Dutch", "hun");
            translations.put("German", "ihr");
            translations.put("Polish", "ich");
            translations.put("Russian", "их");
            translations.put("Hindi", "उनका");
            translations.put("Farsi", "آنها");
        }
        if (word.equals("Its")) {
            translations.put("Spanish", "su");
            translations.put("French", "son");
            translations.put("Dutch", "zijn");
            translations.put("German", "sein");
            translations.put("Polish", "jego");
            translations.put("Russian", "его");
            translations.put("Hindi", "इसका");
            translations.put("Farsi", "آن");
        }
        if (word.equals("Our")) {
            translations.put("Spanish", "nuestro");
            translations.put("French", "notre");
            translations.put("Dutch", "onze");
            translations.put("German", "unser");
            translations.put("Polish", "nasz");
            translations.put("Russian", "наш");
            translations.put("Hindi", "हमारा");
            translations.put("Farsi", "ما");
        }
        
        
        //QUANTIFIERS OF DETERMINERS SECTION
                if (word.equals("all")) {
            translations.put("Spanish", "todo");
            translations.put("French", "tout");
            translations.put("Dutch", "alles");
            translations.put("German", "alle");
            translations.put("Polish", "wszystko");
            translations.put("Russian", "все");
            translations.put("Hindi", "सब");
            translations.put("Farsi", "همه");
        }
        
        if (word.equals("every")) {
            translations.put("Spanish", "cada");
            translations.put("French", "chaque");
            translations.put("Dutch", "elke");
            translations.put("German", "jede");
            translations.put("Polish", "każdy");
            translations.put("Russian", "каждый");
            translations.put("Hindi", "हर");
            translations.put("Farsi", "هر");
        }
        
        if (word.equals("most")) {
            translations.put("Spanish", "la mayoría");
            translations.put("French", "la plupart");
            translations.put("Dutch", "meeste");
            translations.put("German", "die meisten");
            translations.put("Polish", "większość");
            translations.put("Russian", "большинство");
            translations.put("Hindi", "अधिकांश");
            translations.put("Farsi", "بیشتر");
        }
        
        if (word.equals("many")) {
            translations.put("Spanish", "muchos");
            translations.put("French", "beaucoup");
            translations.put("Dutch", "veel");
            translations.put("German", "viele");
            translations.put("Polish", "wielu");
            translations.put("Russian", "многие");
            translations.put("Hindi", "कई");
            translations.put("Farsi", "بسیاری");
        }

        if (word.equals("some")) {
            translations.put("Spanish", "algunos");
            translations.put("French", "quelques");
            translations.put("Dutch", "enkele");
            translations.put("German", "einige");
            translations.put("Polish", "niektóre");
            translations.put("Russian", "некоторые");
            translations.put("Hindi", "कुछ");
            translations.put("Farsi", "برخی");
        }

        if (word.equals("a few")) {
            translations.put("Spanish", "algunos pocos");
            translations.put("French", "quelques-uns");
            translations.put("Dutch", "een paar");
            translations.put("German", "ein paar");
            translations.put("Polish", "kilka");
            translations.put("Russian", "несколько");
            translations.put("Hindi", "कुछ");
            translations.put("Farsi", "چند");
        }

        if (word.equals("any")) {
            translations.put("Spanish", "cualquiera");
            translations.put("French", "n'importe quel");
            translations.put("Dutch", "enig");
            translations.put("German", "irgendein");
            translations.put("Polish", "jakikolwiek");
            translations.put("Russian", "любой");
            translations.put("Hindi", "कोई");
            translations.put("Farsi", "هر");
        }

        if (word.equals("no")) {
            translations.put("Spanish", "no");
            translations.put("French", "non");
            translations.put("Dutch", "nee");
            translations.put("German", "nein");
            translations.put("Polish", "nie");
            translations.put("Russian", "нет");
            translations.put("Hindi", "नहीं");
            translations.put("Farsi", "نه");
        }

        if (word.equals("much")) {
            translations.put("Spanish", "mucho");
            translations.put("French", "beaucoup");
            translations.put("Dutch", "veel");
            translations.put("German", "viel");
            translations.put("Polish", "dużo");
            translations.put("Russian", "много");
            translations.put("Hindi", "बहुत");
            translations.put("Farsi", "زیاد");
        }

        if (word.equals("a little")) {
            translations.put("Spanish", "un poco");
            translations.put("French", "un peu");
            translations.put("Dutch", "een beetje");
            translations.put("German", "ein wenig");
            translations.put("Polish", "trochę");
            translations.put("Russian", "немного");
            translations.put("Hindi", "थोड़ा");
            translations.put("Farsi", "کمی");
        }

        if (word.equals("several")) {
            translations.put("Spanish", "varios");
            translations.put("French", "plusieurs");
            translations.put("Dutch", "verschillende");
            translations.put("German", "mehrere");
            translations.put("Polish", "kilka");
            translations.put("Russian", "несколько");
            translations.put("Hindi", "कई");
            translations.put("Farsi", "چند");
        }

        if (word.equals("dozen")) {
            translations.put("Spanish", "docena");
            translations.put("French", "douzaine");
            translations.put("Dutch", "dozijn");
            translations.put("German", "Dutzend");
            translations.put("Polish", "tuzin");
            translations.put("Russian", "десяток");
            translations.put("Hindi", "दर्जन");
            translations.put("Farsi", "دوجین");
        }

        if (word.equals("hundred")) {
            translations.put("Spanish", "cien");
            translations.put("French", "cent");
            translations.put("Dutch", "honderd");
            translations.put("German", "hundert");
            translations.put("Polish", "sto");
            translations.put("Russian", "сто");
            translations.put("Hindi", "सौ");
            translations.put("Farsi", "صد");
        }

        if (word.equals("thousand")) {
            translations.put("Spanish", "mil");
            translations.put("French", "mille");
            translations.put("Dutch", "duizend");
            translations.put("German", "tausend");
            translations.put("Polish", "tysiąc");
            translations.put("Russian", "тысяча");
            translations.put("Hindi", "हजार");
            translations.put("Farsi", "هزار");
        }

        if (word.equals("million")) {
            translations.put("Spanish", "millón");
            translations.put("French", "million");
            translations.put("Dutch", "miljoen");
            translations.put("German", "Million");
            translations.put("Polish", "milion");
            translations.put("Russian", "миллион");
            translations.put("Hindi", "मिलियन");
            translations.put("Farsi", "میلیون");
        }

        if (word.equals("billion")) {
            translations.put("Spanish", "mil millones");
            translations.put("French", "milliard");
            translations.put("Dutch", "miljard");
            translations.put("German", "Milliarde");
            translations.put("Polish", "miliard");
            translations.put("Russian", "миллиард");
            translations.put("Hindi", "बिलियन");
            translations.put("Farsi", "میلیارد");
        }

        if (word.equals("none")) {
            translations.put("Spanish", "ninguno");
            translations.put("French", "aucun");
            translations.put("Dutch", "geen");
            translations.put("German", "kein");
            translations.put("Polish", "żaden");
            translations.put("Russian", "ни один");
            translations.put("Hindi", "कोई नहीं");
            translations.put("Farsi", "هیچ");
        }

        if (word.equals("some of")) {
            translations.put("Spanish", "algunos de");
            translations.put("French", "certains de");
            translations.put("Dutch", "sommige van");
            translations.put("German", "einige von");
            translations.put("Polish", "niektóre z");
            translations.put("Russian", "некоторые из");
            translations.put("Hindi", "कुछ का");
            translations.put("Farsi", "برخی از");
        }

        if (word.equals("plenty")) {
            translations.put("Spanish", "abundancia");
            translations.put("French", "pléthore");
            translations.put("Dutch", "overvloed");
            translations.put("German", "Fülle");
            translations.put("Polish", "mnóstwo");
            translations.put("Russian", "множество");
            translations.put("Hindi", "पर्याप्त");
            translations.put("Farsi", "فراوان");
        }

        if (word.equals("more")) {
            translations.put("Spanish", "más");
            translations.put("French", "plus");
            translations.put("Dutch", "meer");
            translations.put("German", "mehr");
            translations.put("Polish", "więcej");
            translations.put("Russian", "больше");
            translations.put("Hindi", "अधिक");
            translations.put("Farsi", "بیشتر");
        }

        if (word.equals("less")) {
            translations.put("Spanish", "menos");
            translations.put("French", "moins");
            translations.put("Dutch", "minder");
            translations.put("German", "weniger");
            translations.put("Polish", "mniej");
            translations.put("Russian", "меньше");
            translations.put("Hindi", "कम");
            translations.put("Farsi", "کمتر");
        }

        if (word.equals("least")) {
            translations.put("Spanish", "menos");
            translations.put("French", "le moins");
            translations.put("Dutch", "minst");
            translations.put("German", "am wenigsten");
            translations.put("Polish", "najmniej");
            translations.put("Russian", "наименее");
            translations.put("Hindi", "कम से कम");
            translations.put("Farsi", "کمترین");
        }

        if (word.equals("a")) {
            translations.put("Spanish", "un");
            translations.put("French", "un");
            translations.put("Dutch", "een");
            translations.put("German", "ein");
            translations.put("Polish", "jeden");
            translations.put("Russian", "один");
            translations.put("Hindi", "एक");
            translations.put("Farsi", "یک");
        }
  
        if (word.equals("an")) {
            translations.put("Spanish", "un");
            translations.put("French", "un");
            translations.put("Dutch", "een");
            translations.put("German", "ein");
            translations.put("Polish", "jeden");
            translations.put("Russian", "один");
            translations.put("Hindi", "एक");
            translations.put("Farsi", "یک");
        }

                      return translations;
            }
        
    
}


