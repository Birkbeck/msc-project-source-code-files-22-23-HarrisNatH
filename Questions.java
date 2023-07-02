// import java.util.Scanner;

public class Questions {
    public int input;

    public void addInput(int input){
        this.input = input;
    }

    //constructor
    Tally tally = new Tally(0, 0, 0, 0, 0);

    public int getInput(){
        return input;
    }
    //scanner method
    public void scanUser(){
        // Scanner sc = new Scanner(System.in);
        // int userInput = sc.nextInt();
        // addInput(userInput);
        // sc.close();
        int userInput = Integer.parseInt(System.console().readLine());
        addInput(userInput);
    }

    public void choice1(){
        System.out.println("Narrator: From there onwards, please choose one number that is relatable for you");
        System.out.println("You wake up, and see your reflection in mirror, do you see yourself as:\n1. A leader for your party\n2. A lone adventurer");
        scanUser();
        if (getInput() == 1){
            System.out.println("   \"You are a good leader\"");
            tally.addCountExt();;
        } else if (getInput() == 2){
            System.out.println("   \"You are very shy, aren't you?\"");
            tally.addCountInt();
        } else {
            System.out.println("Invalid number");
        } 
    }

    public void choice2(){
        System.out.println("\nYou check your adventurer ID, your job is listed here as:\n1. Magic Knight(you like to work with party members)\n2. Shadow(you prefer work on your own)");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"You really care your people\"");
                tally.addCountExt();
            } else{
                System.out.println("   \"Kind of gloomy but gets the job done neatly\"");
                tally.addCountInt();
            }
        } System.out.println("Invalid number");
    }

    public void choice3(){
        System.out.println("\nYou wear clothes that suits your job class, you like your attire to be:\n1. Really unique for you alone\n2. Same as others, follow trends");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"You stand out from the rest!\"");
                tally.addCountExt();
            } else{
                System.out.println("   \"You know this can camouflage your identity\"");
                tally.addCountInt();
            }
        } System.out.println("Invalid number");
    }

    public void choice4(){
        System.out.println("\nBefore going to the guild, you read newspapers and always focus on:\n1. News about your fame\n2. Other famous/popular adventurers");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"You really proud of yourself\"");
                tally.addCountInt();
            } else{
                System.out.println("   \"They can motivate you to be better\"");
                tally.addCountExt();
            }
        } System.out.println("Invalid number");
    }

    public void choice5(){
        System.out.println("\nOne day in the guild hall, you saw your crush, holding 2 tickets and is walking towards you, in your mind:\n1. Is she gonna ask me out?\n2. It's not me! no way\n3. Assume my crush already asked friends but they are busy");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"She gave out a ticket to you while blushing\"\n   \"You accepted and agrees to go with her\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"it was friends behind me\"\n   \"You get hurt in feeling, but still hopefully next time!\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"She gave one to you\"\n   \"You get hurt in feeling, but grateful for a ticket\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice6(){
        System.out.println("\nYou head home late night, before heading for bed there is a diary on the desk:\n1. Writing a diary is helpful\n2. You don't really need diary");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"You want to record meaningful encounters\"");
                tally.addCountInt();
            } else{
                System.out.println("   \"All of precious memories are in your head, that's enough\"");
                tally.addCountExt();
            }
        } System.out.println("Invalid number");
    }

    public void choice7(){
        System.out.println("\nReminiscing, you take out your phone brought with you from Earth, look through gallery and it's mostly filled:\n1. Family and friends photos\n2. Your selfies photos");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"You begin to miss them...\"");
                tally.addCountInt();
            } else{
                System.out.println("   \"You do like to look good in others eyes...\"");
                tally.addCountExt();
            }
        } System.out.println("Invalid number");
    }

    public void choice8(){
        System.out.println("\nIt was time to sleep, you cast a fairy dust for immediate sleep effect, as you fall asleep and dreams:\n1. Building your dream house\n2. You are on vacation at capital city");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"For you and your crush\"");
                tally.addCountInt();
            } else{
                System.out.println("   \"It's nice to have a break from work\"");
                tally.addCountExt();
            }
        } System.out.println("Invalid number");
    }

    public void choice9(){
        System.out.println("\nThe day has come, you asked your crush out for a date dinner. However the day is too good to be true without any problem, do you:\n1. Wear casual but secretly bring your combat suit in your magic pouch\n2. Wear casual to impress your date\n3. Still in combat suit, disguised as casual with magic");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"Hey who knows there will be an emergency\"\n   \"And there is, bandits crashing a restaurant\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"Finally no heavy equipment\"\n   \"However bandits show up, you subjugated using cutlery\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"Well, never hurt to be careful\"\n   \"The instant bandits show up, you immediately subjugated them\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice10(){
        System.out.println("\nRewinding back minutes before the incident, you arrive and is going to your reserved table, you expect:\n1. Your crush already there waiting for you\n2. The table is empty, and your crush arrives a bit late\n3. You soon get emergency transmission, your crush can't come");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"She waves at you, and you waves back\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"You waves at your crush, noticed back\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"You're sad but understand the situation\"\n   \"You then eat alone\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice11(){
        System.out.println("\nYou have been in relationship until your crush disappears with no contact, you assume:\n1. Your crush have an emergency?\n2. Your crush will come back, no worries\n3. Your crush left you for someone else");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"You worry, so you track her whereabouts\"\n   \"Turns out your crush was on secret mission\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"You know your crush better, and you are right\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"Calm down, your jealousy is showing up\"\n   \"There, look your crush come back\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice12(){
        System.out.println("\nAfter completing a delivery request, you decide to have a coffee in the guild hall. According to you, a break is:\n1. A chance to expand network with others\n2. Just a relax time so can have an efficient work later");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"You never miss for any rumors\"");
                tally.addCountExt();
            } else{
                System.out.println("   \"You release all the pent up stress\"");
                tally.addCountInt();
            }
        } System.out.println("Invalid number");
    }

    public void choice13(){
        System.out.println("\nWhile in the guild hub, usually do you..\n1. join other table, strike any conversation\n2. You like your own corner table");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"Never hurt to have friends\"");
                tally.addCountExt();
            } else{
                System.out.println("   \"You dislike being in crowd, understandable.. \"");
                tally.addCountInt();
            }
        } System.out.println("Invalid number");
    }

    public void choice14(){
        System.out.println("\nNew day, you and your crush are up for an adventure, you looked at the request board and she picked up an escort job to faraway region that you dislike:\n1. You decide doing it only once! \n2. Try out, who knows you will change mind\n3. Comply with whatever she picked and agree doing it");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"You feel chills from your crush's gaze\"\n   \"She frowns and you two don't talk a word for a day\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"Wow, never knew this job is so fun.\"\n   \"Why have you been so against it?\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"She is happy and that makes you happy, that's enough\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice15(){
        System.out.println("\nOne day Your crush wants you to follow for a private conversation, you think:\n1. Your crush wants to give you a surprise gift \n2. Something wrong but you keep calm, it's not serious\n3. You will be in for a heated argument");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"She praised you for all you have done to her\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"It's a gift, your crush thanks you\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"You're overthinking, it's a gift..\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice16(){
        System.out.println("\nYou were called for a B class monster subjugation request, however you have a date plan with your crush, so you ask your adventurer friends, assuming:\n1. They will agree to substitute you \n2. Only about 50% chance they can help you?\n3. They can't help you");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"You thank your friend and promise a meal\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"Thankfully there is someone agrees to help you\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"your crush understood your predicament, and decides to help you\"\n   \"well this counts as a date plan\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice17(){
        System.out.println("\nYour crush caught strange disease however thankfully your Earth knowledge, it's just a flu: \n1. You visit and takes care of your crush\n2. Only visit after your crush gets better\n3. You leave her alone");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"You assure it's not serious and is being thanked for your attention\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"Your cursh is at least grateful for your visit\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"Your crush is kind of sad..\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice18(){
        System.out.println("\nThe guildmaster calls you to his office, for a private matter: \n1. You expect a rank promotion\n2. You ask curiously, what's the matter \n3. You think \"Is there something bad happened?\"");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"You are very optimist\"\n   \"It was a promotion you have desired\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"He laughs at your nervousness\"\n   \"He gave out the S-rank badge, it is a promotion!\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"He looks at your expression, assures you it is a promotion\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice19(){
        System.out.println("\nOnce you tried to apply for a rank promotion but was rejected, you thought the reason being:\n1. You were too overqualified\n2. Your skills were not sufficient yet \n3. It is too soon for you, said them");
        scanUser();
        while(getInput()==1 || getInput()==2 || getInput()==3){
            if (getInput() == 1){
                System.out.println("   \"You are strong, you havent contributed enough\"");
                tally.addCountOpt();
            } else if (getInput() == 2){
                System.out.println("   \"Your abilities are still average\"");
                tally.addCountMid();
            } else{
                System.out.println("   \"They are right, it's not time for you\"");
                tally.addCountPess();
            }
        } System.out.println("Invalid number");
    }

    public void choice20(){
        System.out.println("\nThe next time you opens your eyes, suddenly you are back in real world. it seems you fell asleep during the music concert. At same time the song is over and there is a standing ovation:\n1. You start clapping until you are last of the few to stop clapping\n2. You just clap and then stop soon after");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"You tears up, that dream felt so real\"");
                tally.addCountExt();
            } else{
                System.out.println("   \"Back on your seat, you smiles and quotes: What an adventure\"");
                tally.addCountInt();
            }
        } System.out.println("Invalid number");
    }
}
