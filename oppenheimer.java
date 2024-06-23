import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Oppenheimer {
    private static int points = 0;
    private static boolean gameFinished = false;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            playBackgroundMusic();
        }
        try {
            startGame();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static void playBackgroundMusic() {
        try {
            File audioFile = new File("Trinity.wav"); // Assuming "audio" is the folder containing the audio file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void startGame() throws InterruptedException {
        System.out.println("Welcome to the Oppenheimer Timeline Adventure Game!");
        Thread.sleep(1000);
        System.out.println("Embark on a journey through the life of J. Robert Oppenheimer.");
        Thread.sleep(1000);
        System.out.println("Let's begin...");
        Thread.sleep(1000);
        System.out.println("⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣭⣉⣉⠉⠉⠉⢹⡏⢹⠁");
        Thread.sleep(500);
        System.out.println("⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣇⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⠶⣤⣤⣴⣶⣾⣿⣿⣿⣿⣽⣻⣿⣿⣿⣿⣿⣒⣾⡿⠟⠿⢿⣿⣿⣿⣿⡇⠀⠀⠀");
        Thread.sleep(500);
        System.out.println("⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣤⣄⣈⡙⣉⡛⠩⡗⢲⠢⡤⢤⣄⣠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⡇⡟⢿⣿⣿⣿⣿⣿⣿⠀⠁⣿⣿⣿⣿⡿⠊⢹⣻⡿⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢐⣿⣷⣷⡐⠉⡑⡀⣿⣿⡇⠀⠀⡈⠻⡉⠁⡠⠄⢸⣥⡇⠀⠀");
        Thread.sleep(500);
        System.out.println("⠘⢻⣿⣿⣿⡌⠀⢧⣿⣿⡀⠀⠠⢠⡀⠀⠀⠀⢀⡿⢣⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣽⣿⣿⣠⢚⡟⣿⠷⠔⠒⠀⠻⡆⠀⠀⢸⣴⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣷⣺⣿⣥⣀⣡⡀⠀⠀⠑⠀⠀⢸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣯⣡⣿⣿⣻⡿⠷⠿⡿⠓⠀⠀⢀⡎⠀⠀⠀⠀⠀");
        Thread.sleep(500);
        System.out.println("⣰⣿⣿⣿⣿⣽⣿⢹⠛⡋⠖⠀⠀⠀⢠⣎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣾⣿⣿⣿⢻⣿⣿⣿⣘⠆⡚⠀⢀⠤⠊⡽⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢀⣀⣤⣤⣤⣤⣤⣤⣶⣾⣿⣿⣿⣿⣿⡏⢿⣆⢻⡏⢻⠋⠉⠉⠉⠁⢀⡜⠀⣿⣿⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢠⡙⠙⢿⡈⡇⠀⠀⢀⡴⠋⠀⠀⣿⣿⣽⣿⣿⣿⣿⣿⣷⣶⣶⣦⣤⣄⣀⡀");
        Thread.sleep(500);
        System.out.println("⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠱⡀⠀⠉⢳⣤⡖⠉⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣿⡘⣄⠑⠀⣤⣿⡇⢙⣄⠀⠀⠀⠀⢸⣿⣿⣿⡽⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣧⠘⡇⠘⢾⣾⣿⣿⡗⡞⢻⣆⡀⠀⠀⠘⣿⣿⢻⣿⣿⣿⣿⣍⢿⣯⠛⣿⡙⣿⠿⢿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀");

        studyPhysicsAtCambridge();
        friendsWithChevalier();
        meetHeisenbergStudyingAbroad();
        teachAtBerkeley();
        beginRelationshipsWithJeanAndKitty();
        buildLosAlamos();
        workOnManhattanProject();
        jeanTatlockDies();
        trinityTest();
        russianInfiltrator();
        bombDropped();
        hiroshimaAndNagasakiBombings();
        meetWithPresidentTruman();
        recruitToPrinceton();
        embarrassStraussAtCongressionalHearing();
        aecMeetingAfterSovietBombTest();
        approveHydrogenBombDevelopment();
        submitLetterAgainstOppenheimer();
        securityClearanceHearing();
        straussSenateHearing();
        receiveAwardFromPresidentJohnson();
        shakeRabisHand();

        totalPoints(points);
    }

    private static int getUserChoice(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < min || choice > max);


        return choice;

    }

    private static void studyPhysicsAtCambridge() throws InterruptedException {
        System.out.println("\033[1m1924:\033[0m You are studying physics at Cambridge, after majoring in Chemistry for 3 years at Harvard.");
        Thread.sleep(1000);
        System.out.println("You realize that chemistry isn't as interesting to you as physics, and you believe it has a higher potential for you.");
        Thread.sleep(1000);
        System.out.println("                                               /\\      /\\\n" +
                "                                               ||______||\n" +
                "                                               || ^  ^ ||\n" +
                "                                               \\| |  | |/\n" +
                "                                                |______|\n" +
                "              __                                |  __  |\n" +
                "             /  \\       ________________________|_/  \\_|__\n" +
                "            / ^^ \\     /=========================/ ^^ \\===|\n" +
                "           /  []  \\   /=========================/  []  \\==|\n" +
                "          /________\\ /=========================/________\\=|\n" +
                "       *  |        |/==========================|        |=|\n" +
                "      *** | ^^  ^^ |---------------------------| ^^  ^^ |--\n" +
                "     *****| []  [] |           _____           | []  [] | |\n" +
                "    *******        |          /_____\\          |      * | |\n" +
                "   *********^^  ^^ |  ^^  ^^  |  |  |  ^^  ^^  |     ***| |\n" +
                "  ***********]  [] |  []  []  |  |  |  []  []  | ===***** |\n" +
                " *************     |         @|__|__|@         |/ |*******|\n" +
                "***************   ***********--=====--**********| *********\n" +
                "***************___*********** |=====| **********|***********\n" +
                " *************     ********* /=======\\ ******** | *********");
        Thread.sleep(1000);
        System.out.println("However, you must take traditional laboratory classes at Cambridge.");
        Thread.sleep(1000);
        System.out.println(" You find these classes challenging and somewhat tedious, as they don't align with your deep interest in theoretical physics.");
        Thread.sleep(1000);
        System.out.println("Uh oh! You messed up in the lab, breaking the dishes, and on the same day, there is a lecture on particles!");
        Thread.sleep(1000);
        System.out.println("Your teacher, JJ Thomson, a Nobel Prize winner, forces you to stay inside, clean up, and miss the lecture.");
        Thread.sleep(1000);
        System.out.println("What will you do?");
        Thread.sleep(1000);
        System.out.println("1. Stay inside and miss the lecture. ");
        Thread.sleep(1000);
        System.out.println("2. Sneak out to the lecture on particles.");
        Thread.sleep(1000);
        System.out.println("3. Get frustrated and attempt to poison Mr. Thomson with cyanide in his apple, then go to the lecture.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You recognize the importance of laboratory skills and miss out on Niels Bohr's lecture on particles.");
                System.out.println("With their help, you gradually improve your proficiency in experimental techniques.");
                points += 5;
                break;
            case 2:
                System.out.println("You are drawn to the theoretical aspects of physics and spend most of your time attending lectures by prominent physicists like Ernest Rutherford and Niels Bohr.");
                System.out.println("Your deep insights into theoretical physics earn you recognition among your peers.");
                points += 10;
                break;

            case 3:
                System.out.println("You understand the importance between theory and experimentation, attending lectures by renowned physicists while also dedicating time to improving your laboratory skills.");
                System.out.println("Your efforts lead to a well-rounded understanding of physics and earn you respect in the academic community.");
                points += 7;
                break;
        }
    }

    private static void friendsWithChevalier() throws InterruptedException {
        System.out.println("\033[1m1924:\033[0m You meet a fellow student, Haakon Chevailer.");
        Thread.sleep(1000);
        System.out.println("He is also very interested in theoretical physics, just like you. However, he is affiliated with the Communist Party!");
        Thread.sleep(1000);
        System.out.println("Do you want to become friends with him?");
        Thread.sleep(1000);
        System.out.println("1. Yes, you do not care about the political affiliations.");
        System.out.println("2. No, you are worried due to the current political climate.");
        System.out.println("3. You become friends, but maintain a clear distance from him (this might anger him!).");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You decide to become friends with Haakon Chevalier, despite his political affiliations.");
                points += 5; // Increase points for deepening theoretical understanding
                break;
            case 2:
                System.out.println("You choose not to become friends with Haakon Chevalier due to concerns about his political affiliations.");
                points -= 2; // Increase points for maintaining focus on individual studies
                break;
            case 3:
                System.out.println("You decide to maintain a friendly relationship with Haakon Chevalier but keep a clear distance due to his political affiliations.");
                points += 7;
                break;
        }
    }

    private static void meetHeisenbergStudyingAbroad() throws InterruptedException {
        System.out.println("\033[1m1926:\033[0m While studying abroad, you meet Werner Heisenberg, a famous physicist known for his work in quantum mechanics.");
        Thread.sleep(1000);
        System.out.println("   .       . \n" +
                " +  :      .\n" +
                "           :       _\n" +
                "       .   !   '  (_)\n" +
                "          ,|.' \n" +
                "-  -- ---(-O-`--- --  -\n" +
                "         ,`|'`.\n" +
                "       ,   !    .\n" +
                "           :       :  \" \n" +
                "           .     --+--\n" +
                " .:        .       !");
        Thread.sleep(1000);
        System.out.println("He's interested in your ideas and suggests working together.");
        Thread.sleep(1000);
        System.out.println("What will you do?");
        Thread.sleep(1000);
        System.out.println("1. Accept, thinking it could lead to exciting discoveries.");
        Thread.sleep(1000);
        System.out.println("2. Say no, worried about working with a German scientist given the political situation.");
        Thread.sleep(1000);
        System.out.println("3. Say no, since the Nazis are already developing a bomb, and Heisenberg leads Germany's nuclear research.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You agree, seeing it as a chance for progress in your research.");
                System.out.println("Your collaboration brings new insights and advances in physics.");
                points += 10;
                break;

            case 2:
                System.out.println("You decline, concerned about political tensions.");
                System.out.println("Though you regret not working together, you prioritize safety.");
                points += 5;
                break;

            case 3:
                System.out.println("You seek advice and decide not to collaborate.");
                System.out.println("You value caution and ethics in your decision-making.");
                points += 7;
                break;
        }
    }


    private static void teachAtBerkeley() throws InterruptedException {
        System.out.println("\033[1m1929:\033[0m You've been offered a prestigious position as a physics professor at the University of California, Berkeley.");
        Thread.sleep(1000);
        System.out.println("                                    +              #####\n" +
                "                                   / \\\n" +
                " _____        _____     __________/ o \\/\\_________      _________\n" +
                "|o o o|_______|    |___|               | | # # #  |____|o o o o  | /\\\n" +
                "|o o o|  * * *|: ::|. .|               |o| # # #  |. . |o o o o  |//\\\\\n" +
                "|o o o|* * *  |::  |. .| []  []  []  []|o| # # #  |. . |o o o o  |((|))\n" +
                "|o o o|**  ** |:  :|. .| []  []  []    |o| # # #  |. . |o o o o  |((|))\n" +
                "|_[]__|__[]___|_||_|__<|____________;;_|_|___/\\___|_.|_|____[]___|  |");
        Thread.sleep(1000);
        System.out.println("What will you do?");
        Thread.sleep(1000);
        System.out.println("1. Accept the position, seeing it as an opportunity to contribute positively to academia.");
        Thread.sleep(1000);
        System.out.println("2. Decline the offer, concerned about the potential misuse of your scientific knowledge in times of conflict.");
        Thread.sleep(1000);
        System.out.println("3. Postpone your decision, wanting to gather more information about the current world situation before committing.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You accept the position, hoping to inspire and educate future generations of physicists.");
                points += 10;
                break;
            case 2:
                System.out.println("You decline the offer, prioritizing ethical concerns and the potential consequences of your work.");
                points -= 5;
                break;
            case 3:
                System.out.println("You postpone your decision, recognizing the need for a deeper understanding of the global situation before making a commitment.");
                points -= 2;
                break;
        }
    }


    private static void beginRelationshipsWithJeanAndKitty() throws InterruptedException {
        System.out.println("\033[1m1936:\033[0m You meet Jean Tatlock and Kitty Harrison, two remarkable women at Berkeley.");

        Thread.sleep(1000);
        System.out.println("You meet Jean at a Communist fundraising party, thrown by your landlady, Mary Ellen Washburn.");
        Thread.sleep(1000);
        System.out.println("    .:::::::.\n" +
                "      .'     ':::\n" +
                "      :        ::.\n" +
                "      :-  --   ' :\n" +
                "      :        ..:\n" +
                "      :.--    .'::;\n" +
                "      ::.__ .'  ':;_\n" +
                "      ::/\"\"\".    .' \"\"-._\n" +
                "      ::\\   |   :        :\n" +
                "     .:::  .'..'          '\n" +
                "    . :'  .         '     ':\n" +
                "    : '  .:        .     . .\n" +
                "    :'   .:        :    .:  \"--__\n" +
                "   /'   .::        :   .\n" +
                "  _: . ::::        '   .\n" +
                ".'    '-----------:   .\n" +
                " :                    '---''--'--\n" +
                " '--'\"\"\"\"\"----------'' ");
        System.out.println("\033[1m1939:\033[0mYou meet Kitty at a garden party in Caltech.");
        Thread.sleep(1000);
        System.out.println("Jean is a psychiatrist interested in politics, while Kitty studies literature at Caltech.");
        Thread.sleep(1000);
        System.out.println("They offer companionship and support, each with their own challenges.");
        Thread.sleep(1000);


        System.out.println("What will you do?");
        Thread.sleep(1000);
        System.out.println("1. Start a romantic relationship with Jean, drawn to her intellect and shared political views.");
        Thread.sleep(1000);
        System.out.println("2. Form a close friendship with Kitty, valuing her companionship without romance.");
        Thread.sleep(1000);
        System.out.println("3. Keep a professional distance from both, focusing on your career.");


        int choice = getUserChoice(1, 3);


        switch (choice) {
            case 1:
                System.out.println("You start a romance with Jean, sharing interests and political activism.");
                points -= 10;
                break;


            case 2:
                System.out.println("You become close friends with Kitty, enjoying her support without romance.");
                points += 10;
                break;


            case 3:
                System.out.println("You keep a professional distance, focusing on your career without getting involved.");
                points += 5;
                break;
        }
    }


    private static void buildLosAlamos() throws InterruptedException {
        System.out.println("\033[1m1942-1943:\033[0m During World War II, you're chosen to lead the construction of the Los Alamos Laboratory, a key part of the Manhattan Project.");
        Thread.sleep(1000);
        System.out.println("      `'::::.\n" +
                "        _____A_\n" +
                "       /      /\\\n" +
                "    __/__/\\__/  \\___\n" +
                "---/__|\" '' \"| /___/\\----\n" +
                "   |''|\"'||'\"| |' '||\n" +
                "   `\"\"`\"\"))\"\"`\"`\"\"\"\"`");
        Thread.sleep(1000);
        System.out.println("This secret site is vital for developing the atomic bomb, a project of immense importance and secrecy.");
        Thread.sleep(1000);


        System.out.println("What will you do first?");
        Thread.sleep(1000);
        System.out.println("1. Recruit top scientists and engineers for the Manhattan Project, ensuring the right skills and manpower.");
        Thread.sleep(1000);
        System.out.println("2. Secure funding and resources for building the Los Alamos Laboratory, setting up the facilities for atomic research.");
        Thread.sleep(1000);
        System.out.println("3. Implement strict security and maintain secrecy to protect the project from enemies.");


        int choice = getUserChoice(1, 3);


        switch (choice) {
            case 1:
                System.out.println("You gather the best minds for the Manhattan Project, seeing atomic weapons as vital to ending the war.");
                points += 10;
                break;


            case 2:
                System.out.println("You focus on getting the funds and resources to build the Los Alamos Lab, laying the groundwork for atomic research.");
                points += 5;
                break;


            case 3:
                System.out.println("You prioritize tight security and secrecy to safeguard the project from adversaries.");
                points += 3;
                break;
        }
    }




    private static void workOnManhattanProject() throws InterruptedException {
        System.out.println("\033[1m1942-1943:\033[0m During World War II, you play a crucial role in the Manhattan Project, a secret research and development project that produced the first nuclear weapons.");
        Thread.sleep(1000);
        System.out.println("Three years prior, Hitler invaded Poland. You feel like someone must stop him.");

        Thread.sleep(1000);
        System.out.println("What will you focus on?");
        Thread.sleep(1000);
        System.out.println("1. Lead theoretical research at Los Alamos, collaborating with physicists like Hans Bethe and Edward Teller.");
        Thread.sleep(1000);
        System.out.println("2. Oversee experimental work, including building and testing atomic bomb prototypes at the Trinity Test site in New Mexico.");
        Thread.sleep(1000);
        System.out.println("3. Manage administrative tasks, coordinating with government, military, and industry partners in places like Oak Ridge, Tennessee, and Hanford, Washington.");


        int choice = getUserChoice(1, 3);


        switch (choice) {
            case 1:
                System.out.println("You lead theoretical research at Los Alamos, working with scientists to develop models and simulations that lay the foundation for atomic bomb design.");
                points += 10; // Gain points for theoretical research
                break;


            case 2:
                System.out.println("You oversee experimental work, including building and testing atomic bomb prototypes at the Trinity Test site in July 1945, marking the first detonation of a nuclear weapon.");
                points += 10; // Gain points for experimental work, including Trinity Test
                break;


            case 3:
                System.out.println("You manage administrative tasks, coordinating with government, military, and industry partners to ensure the project's smooth operation, including the massive industrial-scale production of fissile materials.");
                points += 10; // Gain points for managing administrative tasks
                break;
        }
    }


    private static void jeanTatlockDies() throws InterruptedException {
        System.out.println("\033[1m1944:\033[0m Tragically, you receive news of the death of Jean Tatlock, a close friend and confidante.");

        Thread.sleep(1000);
        System.out.println("Her passing deeply affects you, raising questions about the toll of your involvement in the Manhattan Project and the ethical implications of your work.");


        System.out.println("What will be your immediate response?");
        Thread.sleep(1000);
        System.out.println("1. Devote yourself even more intensely to your work on the Manhattan Project, seeking solace in scientific pursuits and the pursuit of victory in World War II.");
        Thread.sleep(1000);
        System.out.println("2. Take time to grieve and reflect on the personal and ethical dimensions of your involvement in the project, contemplating the human cost of scientific progress.");
        Thread.sleep(1000);
        System.out.println("3. Distance yourself emotionally from the situation, focusing solely on the practical demands of your role as the project's leader.");


        int choice = getUserChoice(1, 3);


        switch (choice) {
            case 1:
                System.out.println("You throw yourself even more fervently into your work on the Manhattan Project, using scientific pursuits as a distraction from personal grief.");
                points += 5;
                break;


            case 2:
                System.out.println("You take time to grieve and reflect on the personal and ethical dimensions of your involvement in the project, grappling with the human cost of scientific progress.");
                points += 10;
                break;


            case 3:
                System.out.println("You distance yourself emotionally from the situation, compartmentalizing your personal grief and focusing solely on the practical demands of your role as the project's leader.");
                points -= 5;
                break;
        }
    }


    private static void trinityTest() throws InterruptedException {
        System.out.println("\033[1mJuly 16, 1945:\033[0m As the Trinity Test approaches, you face crucial decisions to ensure its success.");
        Thread.sleep(1000);
        System.out.println("          _ ._  _ , _ ._\n" +
                "        (_ ' ( `  )_  .__)\n" +
                "      ( (  (    )   `)  ) _)\n" +
                "     (__ (_   (_ . _) _) ,__)\n" +
                "         `~~`\\ ' . /`~~`\n" +
                "              ;   ;\n" +
                "              /   \\\n" +
                "_____________/_ __ \\_____________\n");

        Thread.sleep(1000);


        System.out.println("What will you prioritize?");
        Thread.sleep(1000);
        System.out.println("1. Organize transportation logistics with General Leslie Groves, ensuring timely delivery of materials and personnel to the test site.");
        Thread.sleep(1000);
        System.out.println("2. Collaborate with physicists like Edward Teller and Richard Feynman to verify bomb calculations and troubleshoot design issues.");
        Thread.sleep(1000);
        System.out.println("3. Coordinate security measures with military personnel to safeguard the test site from unauthorized access and ensure safety.");


        int choice = getUserChoice(1, 3);


        switch (choice) {
            case 1:
                System.out.println("You work closely with General Leslie Groves to finalize transportation logistics, ensuring all necessary materials and personnel arrive at the test site on schedule.");
                points += 8; // Gain points for organizing logistics
                break;


            case 2:
                System.out.println("You collaborate with physicists like Edward Teller and Richard Feynman to meticulously verify bomb calculations and address any technical challenges, ensuring the bomb's functionality.");
                points += 7; // Gain points for collaborating on technical aspects
                break;


            case 3:
                System.out.println("You liaise with military personnel to implement rigorous security measures at the test site, preventing unauthorized access and maintaining the confidentiality of the project.");
                points += 2; // Gain points for ensuring security measures
                break;
        }
    }

    private static void bombDropped() throws InterruptedException {
        System.out.println("⠀⠀⣀⡤⢦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣼⢫⠁⡞⡗⡟⢩⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢀⠴⡶⡻⢋⣑⣿⠟⠋⣉⢻⢿⣿⡻⡿⣳⣄⡀⠀⠀");
        Thread.sleep(500);
        System.out.println("⠀⡴⠚⣉⡾⠷⠛⡟⠁⠐⠀⣀⠀⡾⡋⡘⢿⣷⣾⢿⣿⣶⣆⡀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢠⢶⣎⠉⡽⠁⢬⡸⣷⢰⠴⠀⠀⢉⣼⠒⣳⢺⣷⡜⠛⢻⣿⣿⣶⡄⠀⠀⠀\n" +
                "⠀⠀⠀⢐⣫⣇⡤⡟⠰⣏⠀⡹⢿⡀⣂⣶⠚⠿⣿⣿⣽⠿⢃⠆⣿⣿⣿⣿⡅⠀");
        Thread.sleep(500);
        System.out.println("⠰⡿⠋⣀⠙⣿⣷⣿⣾⣾⣻⣿⣿⣿⣶⣾⣿⣿⣿⣷⣷⣿⣿⣿⣿⣿⡟⠁⠀⠀\n" +
                "⠀⠀⠀⢱⣈⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠙⠛⠛⢿⣿⡿⠿⠿⠿⣛⣤⣏⣿⣿⢿⣿⣿⡿⢟⠋⠉⠉⠀⠀⠀⠀⠀⠀");
        Thread.sleep(500);
        System.out.println("⠐⠋⠛⠂⠀⠀⠀⠀⠀⠂⠘⠋⡙⡿⣿⣿⣿⡖⣂⡀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠂⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠒⠄⠀⠀⠀⠀⣩⣼⢷⡷⣿⣿⢐⠀⠀⠀⠀⠀⠀⠶⠆⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⣤⣤⣤⠀⠀⠀⠀⠀⢲⣾⣷⣻⢿⣿⣾⣧⠠⠤⠄⢀⣀⣠⣤⣤⣄⣀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⡀⠀⢸⡄⣴⣋⣿⣼⣽⣿⣷⣿⣿⣤⣰⣰⣀⡆⠀⠀⠀⠀⠀⠀⠀");
        Thread.sleep(500);
        System.out.println("⣤⣤⣤⣤⣤⡤⢤⢿⣿⣟⣛⡛⢻⠻⠿⠿⠿⠿⠿⠿⣿⡿⣿⣼⣿⣤⣤⣤⣤⣤⣤⡄\n" +
                "⠀⠚⠛⢛⣛⣿⣿⣿⣿⣿⣿⣯⣭⣀⣠⣤⣤⣵⣶⣶⣷⣾⣿⣿⣾⣿⡟⠛⠋⠗⠂⠀");
    }

    private static void hiroshimaAndNagasakiBombings() throws InterruptedException {
        System.out.println("\033[1mAug 6 and 9, 1945:\033[0m As a key figure in the Manhattan Project, you face a monumental decision regarding the use of the atomic bomb against Japan.");
        Thread.sleep(1000);
        System.out.println("What will you do?");
        Thread.sleep(1000);
        System.out.println("1. Support the bombings of Hiroshima and Nagasaki, believing it's necessary to swiftly end the war, even if it means civilian casualties.");
        Thread.sleep(1000);
        ;
        System.out.println("2. Avoid exploring diplomatic solutions instead of resorting to atomic bombings, considering the devastating impact on civilians.");
        Thread.sleep(1000);
        System.out.println("3. Try convincing President Truman to change the location of the bombings.");


        int choice = getUserChoice(1, 3);


        switch (choice) {
            case 1:
                System.out.println("You do not back the bombings, not seeing them as crucial to end the war quickly, despite knowing they'll cause civilian deaths.");
                points += 20; // Deduct points for accepting civilian casualties
                break;


            case 2:
                System.out.println("You don't push for diplomatic solutions, aware of the immense human cost and hoping to find an alternative to the atomic bombings.");
                points -= 5; // Award points for seeking diplomatic options
                break;


            case 3:
                System.out.println("Unfortunately, Truman does not listen to you. The bombs have been dropped.");
                points -= 10; // Award points for showing restraint and ethical consideration
                break;
        }
    }


    private static void meetWithPresidentTruman() throws InterruptedException {
        System.out.println("\033[1mOctober 25, 1945:\033[0m After Hiroshima and Nagasaki, President Truman seeks your advice on the world stage.");
        Thread.sleep(1000);
        System.out.println("============;===========;()\n" +
                "            # # # #::::::\n" +
                "            # # # #::::::\n" +
                "            # # # #::::::\n" +
                "            # # # #::::::\n" +
                "            # # # # # # #\n" +
                "            # # # # # # #\n" +
                "            # # # # # # #\n" +
                "            # # # # # # #\n" +
                "            # # # # # # #\n" +
                "            # # # # # # #");
        Thread.sleep(1000);
        System.out.println("How do you proceed?");
        Thread.sleep(1000);
        System.out.println("1. Push for talking with Japan to avoid more harm and keep peace with the Soviets.");
        Thread.sleep(1000);
        System.out.println("2. Offer Japan a deal to surrender with conditions, to save lives and strengthen America's role in Asia.");
        Thread.sleep(1000);
        System.out.println("3. Mention worries about angering others and starting more arms races, suggesting caution and more diplomacy.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You recommend talking with Japan to prevent more harm and keep peace with the Soviets.");
                points += 20;
                break;

            case 2:
                System.out.println("You propose giving Japan terms to surrender, to save lives and boost America's influence in Asia.");
                points += 15;
                break;

            case 3:
                System.out.println("You express concerns about upsetting others and sparking more arms races, calling for caution and more diplomacy.");
                points -= 10;
                break;
        }
    }


    private static void recruitToPrinceton() throws InterruptedException {
        System.out.println("\033[1m1947:\033[0m After World War II, with the help of Lewis Strauss, Princeton University invites you to join its faculty.");
        Thread.sleep(1000);
        System.out.println("How do you respond?");
        Thread.sleep(1000);
        System.out.println("1. Accept and contribute to research and teaching, advancing scientific pursuits in academia.");
        Thread.sleep(1000);
        System.out.println("2. Decline, exploring government-related projects or independent research.");
        Thread.sleep(1000);
        System.out.println("3. Negotiate terms to balance government work and academic freedom.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You accept Princeton's offer, making significant academic contributions and pursuing your research interests.");
                points += 15;
                break;

            case 2:
                System.out.println("You decline, opting for government projects or independent research outside academia.");
                points -= 10;
                break;

            case 3:
                System.out.println("You negotiate terms to balance government work and academic freedom at Princeton.");
                points += 10;
                break;
        }
    }

    private static void embarrassStraussAtCongressionalHearing() throws InterruptedException {
        System.out.println("\033[1m1949:\033[0m You testify before the Joint Committee on Atomic Energy in Washington D.C. about your role in the Manhattan Project.");
        Thread.sleep(1000);
        System.out.println("You seem to have embarassed Strauss by mocking him as a meddler.");
        Thread.sleep(1000);
        System.out.println("You also mock his opposition to exporting radioisotopes for medical purposes after war.");
        Thread.sleep(1000);
        System.out.println("How do you respond to Senators McMahon and Hickenlooper?");
        Thread.sleep(1000);
        System.out.println("1. Defend the Manhattan Project's necessity for winning World War II and deterring future aggression, despite Senator McMahon's scrutiny.");
        Thread.sleep(1000);
        System.out.println("2. Acknowledge oversight shortcomings and express cooperation with security measures, addressing concerns from Senator Hickenlooper.");
        Thread.sleep(1000);
        System.out.println("3. Refuse to disclose classified details, citing national security, but face criticism from both Senators.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You defend the Manhattan Project's necessity, highlighting its role in winning World War II and deterring aggression, despite Senator McMahon's scrutiny.");
                points += 10;
                break;

            case 2:
                System.out.println("You acknowledge oversight shortcomings and express cooperation with security measures, addressing Senator Hickenlooper's concerns.");
                points += 5;
                break;

            case 3:
                System.out.println("You refuse to disclose classified details, citing national security, but face criticism from both Senators.");
                points -= 10;
                break;
        }
    }

    private static void russianInfiltrator() throws InterruptedException {
        System.out.println("\033[1mJanuary 1950:\033[0m WARNING!!!!!: Reports indicate increased Russian spying activity at Los Alamos. Urgent steps are needed.");

        Thread.sleep(1000);


        System.out.println("What will you do?");
        Thread.sleep(1000);
        System.out.println("1. Alert senior officials and start a detailed investigation with trusted security personnel.");
        Thread.sleep(1000);
        System.out.println("2. Boost surveillance and question suspected individuals.");
        Thread.sleep(1000);
        System.out.println("3. Hold a secret meeting with key players to plan a response.");


        int choice = getUserChoice(1, 3);


        switch (choice) {
            case 1:
                System.out.println("You quickly inform top brass and launch a thorough probe led by reliable security teams.");
                points -= 5; // Deduct points for potential delay in action
                break;


            case 2:
                System.out.println("You ramp up surveillance and grill suspected persons to uncover any ties to Russian spies.");
                points += 5; // Gain points for proactive measures against espionage
                break;


            case 3:
                System.out.println("You gather key figures in secrecy to devise a plan against Russian infiltration.");
                points += 10; // Gain points for strategic collaboration and preemptive action
                break;
        }
    }


    private static void aecMeetingAfterSovietBombTest() throws InterruptedException {
        System.out.println("\033[1mSeptember 1949:\033[0m The Atomic Energy Commission (AEC) holds an emergency meeting at the Pentagon after the Soviet Union successfully tests an atomic bomb in Kazakhstan.");
        Thread.sleep(1000);
        System.out.println("     _.-^^---....,,--       \n" +
                " _--                  --_  \n" +
                "<                        >)\n" +
                "|                         | \n" +
                " \\._                   _./  \n" +
                "    ```--. . , ; .--'''       \n" +
                "          | |   |             \n" +
                "       .-=||  | |=-.   \n" +
                "       `-=#$%&%$#=-'   \n" +
                "          | ;  :|     \n" +
                " _____.,-#%&$@%#&#~,._____");
        System.out.println("What strategy will you advocate?");
        Thread.sleep(1000);
        System.out.println("1. Push for faster development of advanced nuclear weapons to stay ahead militarily.");
        Thread.sleep(1000);
        System.out.println("2. Propose international agreements to stop more countries from getting atomic bombs.");
        Thread.sleep(1000);
        System.out.println("3. Recommend more money for civil defense to protect people from nuclear attacks, following President Truman's orders.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You argue for speeding up development of advanced nuclear weapons to keep ahead militarily.");
                points -= 10;
                break;

            case 2:
                System.out.println("You suggest international agreements to stop more countries from getting atomic bombs.");
                points += 10;
                break;

            case 3:
                System.out.println("You propose more money for civil defense to protect people from nuclear attacks, following President Truman's orders.");
                points += 5;
                break;
        }
    }


    private static void approveHydrogenBombDevelopment() throws InterruptedException {
        System.out.println("\033[1m1950:\033[0m President Truman is considering developing a hydrogen bomb, a much more powerful nuclear weapon, in response to the Russians. ");
        Thread.sleep(1000);
        System.out.println("     _.-^^---....,,--       \n" +
                " _--                  --_  \n" +
                "<                        >)\n" +
                "|                         | \n" +
                " \\._                   _./  \n" +
                "    ```--. . , ; .--'''       \n" +
                "          | |   |             \n" +
                "       .-=||  | |=-.   \n" +
                "       `-=#$%&%$#=-'   \n" +
                "          | ;  :|     \n" +
                " _____.,-#%&$@%#&#~,._____");
        Thread.sleep(1000);
        System.out.println("What's your stance on proceeding with the hydrogen bomb project?");
        Thread.sleep(1000);
        System.out.println("1. Push for immediate initiation of the hydrogen bomb project with Secretary of Defense Louis A. Johnson and General Omar Bradley.");
        Thread.sleep(1000);
        System.out.println("2. Oppose the idea directly, discussing with Secretary of State Dean Acheson and Senator Richard Russell.");
        Thread.sleep(1000);
        System.out.println("3. Call for more scientific research to assess the feasibility and strategic implications, seeking guidance from physicist Edward Teller.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You push for immediate initiation of the hydrogen bomb project with Secretary of Defense Louis A. Johnson and General Omar Bradley.");
                points -= 15;
                break;
            case 2:
                System.out.println("You express concerns about the humanitarian consequences and potential arms race escalation, discussing with Secretary of State Dean Acheson and Senator Richard Russell.");
                points += 10;
                break;
            case 3:
                System.out.println("You call for more scientific research to assess the feasibility and strategic implications, seeking guidance from physicist Edward Teller.");
                points += 5;
                break;
        }
    }

    private static void submitLetterAgainstOppenheimer() throws InterruptedException {
        System.out.println("\033[1mNovember 7, 1953:\033[0m A group of your colleagues, including Edward Teller and Lewis Strauss, drafts a letter expressing concerns about your Communist affiliations and security clearances.");
        Thread.sleep(1000);
        System.out.println("(\\ \n" +
                "\\'\\ \n" +
                " \\'\\     __________  \n" +
                " / '|   ()_________)\n" +
                " \\ '/    \\ ~~~~~~~~ \\\n" +
                "   \\       \\ ~~~~~~   \\\n" +
                "   ==).      \\__________\\\n" +
                "  (__)       ()__________)");
        Thread.sleep(1000);
        System.out.println("How will you address these accusations during a closed door meeting with General Leslie Groves and AEC Commissioner Thomas Murray?");
        Thread.sleep(1000);
        System.out.println("1. Provide a detailed rebuttal to each allegation, demonstrating your commitment to national security and seeking General Groves' support.");
        Thread.sleep(1000);
        System.out.println("2. Dismiss the letter as a politically motivated smear campaign, emphasizing your loyalty to the United States and requesting Commissioner Murray's intervention.");
        Thread.sleep(1000);
        System.out.println("3. Refrain from publicly addressing the accusations to avoid further controversy, focusing on your work and seeking guidance from attorney Lloyd Garrison.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You provide a detailed argument against each allegation, demonstrating your commitment to national security and seeking General Groves' support.");
                points += 10;
                break;
            case 2:
                System.out.println("You dismiss the letter as a politically motivated smear campaign, emphasizing your loyalty to the United States and requesting Commissioner Murray's intervention.");
                points -= 15;
                break;
            case 3:
                System.out.println("You refrain from publicly addressing the accusations to avoid further controversy, focusing on your work and seeking guidance from attorney Lloyd Garrison.");
                points -= 5;
                break;
        }
    }


    private static void securityClearanceHearing() throws InterruptedException {
        System.out.println("\033[1m1954\033[0m: Your security clearance is under review by the House Un-American Activities Committee (HUAC) due to allegations of communist sympathies and security breaches.");
        Thread.sleep(1000);
        System.out.println("What approach will you take during the hearing in Washington D.C., chaired by Representative Karl Mundt?");
        Thread.sleep(1000);
        System.out.println("1. Present evidence of your loyalty and patriotism, including testimonials from colleagues and military officials, while facing questioning from Representative Richard Nixon.");
        Thread.sleep(1000);
        System.out.println("2. Invoke your constitutional rights and refuse to testify about your political beliefs, asserting your innocence under the guidance of attorney Lloyd Garrison.");
        Thread.sleep(1000);
        System.out.println("3. Cooperate fully with the investigation, providing transparent access to relevant documents and information, seeking guidance from attorney Lloyd Garrison.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You present evidence of your loyalty and patriotism, including testimonials from colleagues and military officials, while facing questioning from Representative Richard Nixon.");
                points += 10;
                break;
            case 2:
                System.out.println("You invoke your constitutional rights and refuse to testify about your political beliefs, asserting your innocence under the guidance of attorney Lloyd Garrison.");
                points -= 15;
                break;
            case 3:
                System.out.println("You cooperate fully with the investigation, providing transparent access to relevant documents and information, seeking guidance from attorney Lloyd Garrison.");
                points -= 5;
                break;
        }
    }


    private static void straussSenateHearing() throws InterruptedException {
        System.out.println("\033[1m1954\033[0m: You are summoned to testify before the Senate Subcommittee on Internal Security, chaired by Senator Joseph McCarthy, regarding your role in the development of atomic weapons and your interactions with Soviet scientists.");
        Thread.sleep(1000);
        System.out.println("How will you navigate the Senate hearing in Washington D.C.?");
        Thread.sleep(1000);
        System.out.println("1. Answer the Senate's questions truthfully and provide insights into the scientific and strategic aspects of atomic research, facing scrutiny from Senator Lyndon B. Johnson.");
        Thread.sleep(1000);
        System.out.println("2. Assert your priviledge to keep classified information and protect sensitive national security interests, with guidance from attorney Lloyd Garrison.");
        Thread.sleep(1000);
        System.out.println("3. Decline to testify, citing your rights under the Fifth Amendment and concerns about political stances, risking big time charges from Senator Joseph McCarthy.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You answer the Senate's questions truthfully and provide insights into the scientific and strategic aspects of atomic research, facing scrutiny from Senator Lyndon B. Johnson.");
                points += 10;
                break;
            case 2:
                System.out.println("You assert executive privilege to withhold classified information and protect sensitive national security interests, with guidance from attorney Lloyd Garrison.");
                points -= 15;
                break;
            case 3:
                System.out.println("You decline to testify, citing your rights under the Fifth Amendment.");
                points -= 20;
                break;
        }
    }


    private static void receiveAwardFromPresidentJohnson() throws InterruptedException {
        System.out.println("\033[1m1963\033[0m: President Lyndon B. Johnson presents you with the Medal of Freedom at a ceremony in the White House, recognizing your contributions to national security and scientific advancement.");
        Thread.sleep(1000);
        System.out.println("How will you respond to this honor, surrounded by members of your family and key government officials?");
        Thread.sleep(1000);
        System.out.println("1. Accept the award with gratitude, highlighting the collaborative efforts of your colleagues and the importance of scientific innovation in achieving global peace.");
        Thread.sleep(1000);
        System.out.println("2. Decline the award to avoid further scrutiny and controversy surrounding your reputation and political affiliations, prompting disappointment from President Johnson.");
        Thread.sleep(1000);
        System.out.println("3. Use the platform provided by the award to advocate for international cooperation and nuclear disarmament, addressing the audience with a passionate plea for peace.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You accept the award with gratitude, highlighting the collaborative efforts of your colleagues and the importance of scientific innovation in achieving global peace.");
                points += 15;
                break;
            case 2:
                System.out.println("You decline the award to avoid further scrutiny and controversy surrounding your reputation and political affiliations, prompting disappointment from President Johnson.");
                points -= 10;
                break;
            case 3:
                System.out.println("You use the platform provided by the award to advocate for international cooperation and nuclear disarmament, addressing the audience with a passionate plea for peace.");
                points += 20;
                break;
        }
    }


    private static void shakeRabisHand() throws InterruptedException {
        System.out.println("\033[1mScientific Conference\033[0m: The AEC has revoked your security clearance! You then encounter Rabi at the end of the conference. Keep in mind, he is one of the people who filed against you.");
        Thread.sleep(1000);
        System.out.println("He approaches you and extends his hand for a handshake, acknowledging your contributions to science, after all you have been through with him.");
        Thread.sleep(1000);
        System.out.println("How will you respond?");
        Thread.sleep(1000);
        System.out.println("1. Shake his hand warmly, appreciating the recognition and expressing gratitude for his work.");
        Thread.sleep(1000);
        System.out.println("2. Politely decline the handshake, citing past disagreements or conflicts.");
        Thread.sleep(1000);
        System.out.println("3. Ignore his gesture and walk away, avoiding any interaction with him.");

        int choice = getUserChoice(1, 3);

        switch (choice) {
            case 1:
                System.out.println("You shake Rabi's hand warmly, appreciating the recognition and expressing gratitude for his work.");
                points += 10;
                break;
            case 2:
                System.out.println("You politely decline the handshake, citing past disagreements or conflicts.");
                points -= 5;
                break;
            case 3:
                System.out.println("You ignore his gesture and walk away, avoiding any interaction with him.");
                points -= 10;
                break;
        }
    }


    private static void totalPoints(int points) {
        if (!gameFinished) {
            try {
                // Delayed output
                Thread.sleep(1000); // Adjust the delay time as needed

                // Add a heading for total points
                System.out.println("\n\033[1mTotal Points\033[0m");

                if (points >= 50) {
                    System.out.println("You ended with: " + points);
                    System.out.println("Congratulations! Your decisions have led to a completely safe future.");
                } else if (points >= 40) {
                    System.out.println("You ended with: " + points);
                    System.out.println("Great job, your decisions have brought a relatively safe future.");
                } else {
                    System.out.println("You ended with: " + points);
                    System.out.println("Trouble will unfold in the future. The world is not safe.");
                }

                // Delayed output
                Thread.sleep(1000); // Adjust the delay time as needed

                System.out.println("Thank you for playing the Oppenheimer Simulator!");

                // Delayed output
                Thread.sleep(1000); // Adjust the delay time as needed

                System.out.println("Created by Phanikrishna Jandhyala");

                Thread.sleep(1000);

                System.out.println("Sources and references:");

                // Delayed output
                Thread.sleep(1000);

                System.out.println("1. Bui, Vivien. “Oppenheimer: Then & Now.” Energy.gov, 24 July 2023, www.energy.gov/articles/oppenheimer-then-now.");
                Thread.sleep(200);
                System.out.println("2. De Witte, Melissa, and Stanford University. “Oppenheimer and the Pursuit of Nuclear Disarmament.” Stanford News, 26 July 2023, news.stanford.edu/2023/07/26/oppenheimer-pursuit-nuclear-disarmament/.");
                System.out.println("3. Institute for Advanced Study. “J. Robert Oppenheimer: Life, Work, and Legacy.” Institute for Advanced Study, Institute for Advanced Study, 2019, www.ias.edu/oppenheimer-legacy.");
                System.out.println("4. Perfas, Samantha Laine. “Oppenheimer, a Complicated Man.” Harvard Gazette, 19 July 2023, news.harvard.edu/gazette/story/2023/07/closer-look-at-father-of-atomic-bomb/.");
                System.out.println("5. Rouzé, Michel. “J. Robert Oppenheimer | Biography.” Encyclopædia Britannica, 7 Dec. 2018, www.britannica.com/biography/J-Robert-Oppenheimer.");
                System.out.println("6. Vergun, David. “Army General and Physicist Helped Usher in the Atomic Age.” U.S. Department of Defense, 20 July 2023, www.defense.gov/News/Feature-Stories/Story/Article/3464967/army-general-and-physicist-helped-usher-in-the-atomic-age/.");

                gameFinished = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


