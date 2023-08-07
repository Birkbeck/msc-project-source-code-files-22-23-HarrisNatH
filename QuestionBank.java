/**
 * This class represents all of the Questions
 */
public class QuestionBank {

    //constructor
    Questions questions = new Questions();

    /**
     * This method uses Questions class' methods to present every questions to players
     */
    public void Process(){
        //EI  Q1
        String narative = "\nYou wake up, and see your reflection in mirror, do you see yourself as:\n1. A leader for your party\n2. A lone adventurer";
        String choiceA = "   \"You are a good leader\"";
        String choiceB = "   \"You are very shy, aren't you?\"";
        questions.QuestionEI(narative, choiceA, choiceB);
        
        //EI  Q2
        String narative2 = "\nYou check your adventurer ID, your job is listed here as:\n1. Magic Knight(you like to work with party members)\n2. Shadow(you prefer work on your own)";
        String choiceA2 = "   \"You really care your people\"";
        String choiceB2 = "   \"Kind of gloomy but gets the job done neatly\"";
        questions.QuestionEI(narative2, choiceA2, choiceB2);

        //EI  Q3
        String narative3 = "\nYou wear clothes that suits your job class, you like your attire to be:\n1. Really unique for you alone\n2. Same as others, follow trends";
        String choiceA3 = "   \"You really proud of yourself\"";
        String choiceB3 = "   \"You know this can camouflage your identity\"";
        questions.QuestionEI(narative3, choiceA3, choiceB3);

        //IE Q4
        String narative4 = "\nBefore going to the guild, you read newspapers and always focus on:\n1. News about your fame\n2. Other famous/popular adventurers";
        String choiceA4 = "   \"You stand out from the rest!\"";
        String choiceB4 = "   \"They can motivate you to be better\"";
        questions.QuestionIE(narative4, choiceA4, choiceB4);

        //OP Q5
        String narative5 = "\nOne day in the guild hall, you saw your crush, holding 2 tickets and is walking towards you, in your mind:\n1. Is she gonna ask me out?\n2. It's not me! no way\n3. Assume my crush already asked friends but they are busy";
        String choiceA5 = "   \"She gave out a ticket to you while blushing. You accepted and agrees to go with her\"";
        String choiceB5 = "   \"it was friends behind me. You get hurt in feeling, but still hopefully next time!\"";
        String choiceC5 = "   \"She gave one to you, you get hurt in feeling but grateful for a ticket\"";
        questions.QuestionOP(narative5, choiceA5, choiceB5, choiceC5);

        //IE Q6
        String narative6 = "\nYou head home late night, before heading for bed there is a diary on the desk:\n1. Writing a diary is helpful\n2. You don't really need diary";
        String choiceA6 ="   \"You want to record meaningful encounters\"";
        String choiceB6 = "   \"All of precious memories are in your head, that's enough\"";
        questions.QuestionIE(narative6, choiceA6, choiceB6);

        //IE Q7
        String narative7 = "\nReminiscing, you take out your phone brought with you from Earth, look through gallery and it's mostly filled:\n1. Family and friends photos\n2. Your selfies photos";
        String choiceA7 = "   \"You begin to miss them...\"";
        String choiceB7 = "   \"You do like to look good in others eyes...\"";
        questions.QuestionIE(narative7, choiceA7, choiceB7);

        //IE Q8
        String narative8 = "\nIt was time to sleep, you cast a fairy dust for immediate sleep effect, as you fall asleep and dreams:\n1. Building your dream house\n2. You are on vacation at capital city";
        String choiceA8 = "   \"For you and your crush in the future, maybe!\"";
        String choiceB8 = "   \"It's nice to have a break from work\"";
        questions.QuestionIE(narative8, choiceA8, choiceB8);

        //OP Q9
        String narative9 = "\nThe day has come, you asked your crush out for a date dinner. However the day is too good to be true without any problem, do you:\n1. Wear casual but secretly bring your combat suit in your magic pouch\n2. Wear casual to impress your date\n3. Still in combat suit, disguised as casual with magic";
        String choiceA9 = "   \"Hey who knows there will be an emergency. And there is, bandits crashing a restaurant\"";
        String choiceB9 = "   \"Finally no heavy equipment. However bandits show up, you subjugated using cutlery\"";
        String choiceC9 = "   \"Well, never hurt to be careful. The instant bandits show up, you immediately subjugated them\"";
        questions.QuestionOP(narative9, choiceA9, choiceB9, choiceC9);

        //OP Q10
        String narative10 = "\nRewinding back minutes before the incident, you arrive and is going to your reserved table, you expect:\n1. Your crush already there waiting for you\n2. The table is empty, and your crush arrives a bit late\n3. You soon get emergency transmission, your crush can't come";
        String choiceA10 = "   \"She waves at you, and you waves back\"";
        String choiceB10 = "   \"You waves at your crush, noticed back\"";
        String choiceC10 = "   \"You're sad but understand the situation, You then eat alone\"";
        questions.QuestionOP(narative10, choiceA10, choiceB10, choiceC10);
    
        //OP Q11
        String narative11 = "\nYou have been in relationship until your crush disappears with no contact, you assume:\n1. Your crush have an emergency?\n2. Your crush will come back, no worries\n3. Your crush left you for someone else";
        String choiceA11 = "   \"You worry, so you track her whereabouts. Turns out your crush was on secret mission\"";
        String choiceB11 = "   \"You know your crush better, and you are right\"";
        String choiceC11 = "   \"Calm down, your jealousy is showing up. There, look your crush come back\"";
        questions.QuestionOP(narative11, choiceA11, choiceB11, choiceC11);

        //EI Q12
        String narative12 = "\nAfter completing a delivery request, you decide to have a coffee in the guild hall. According to you, a break is:\n1. A chance to expand network with others\n2. Just a relax time so can have an efficient work later";
        String choiceA12 = "   \"You never miss for any rumors\"";
        String choiceB12 = "   \"You release all the pent up stress\"";
        questions.QuestionEI(narative12, choiceA12, choiceB12);

        //EI Q13
        String narative13 = "\nWhile in the guild hub, usually do you..\n1. join other table, strike any conversation\n2. You like your own corner table";
        String choiceA13 = "   \"Never hurt to have friends\"";
        String choiceB13 = "   \"You dislike being in crowd, understandable.. \"";
        questions.QuestionEI(narative13, choiceA13, choiceB13);

        //OP Q14
        String narative14 = "\nNew day, you and your crush are up for an adventure, you looked at the request board and she picked up an escort job to faraway region that you dislike:\n1. You decide doing it only once! \n2. Try out, who knows you will change mind\n3. Comply with whatever she picked and agree doing it";
        String choiceA14 = "   \"You feel chills from your crush's gaze. She frowns and you two don't talk a word for a day\"";
        String choiceB14 = "   \"Wow, never knew this job is so fun. Why have you been so against it?\"";
        String choiceC14 = "   \"She is happy and that makes you happy, that's enough\"";
        questions.QuestionOP(narative14, choiceA14, choiceB14, choiceC14);

        //OP Q15
        String narative15 = "\nOne day Your crush wants you to follow for a private conversation, you think:\n1. Your crush wants to give you a surprise gift \n2. Something wrong but you keep calm, it's not serious\n3. You will be in for a heated argument";
        String choiceA15 = "   \"She praised you for all you have done to her\"";
        String choiceB15 = "   \"It's a gift, your crush thanks you\"";
        String choiceC15 = "   \"You're overthinking, it's a gift..\"";
        questions.QuestionOP(narative15, choiceA15, choiceB15, choiceC15);

        //OP Q16
        String narative16 = "\nYou were called for a B class monster subjugation request, however you have a date plan with your crush, so you ask your adventurer friends, assuming:\n1. They will agree to substitute you \n2. Only about 50% chance they can help you?\n3. They can't help you";
        String choiceA16 = "   \"You thank your friend and promise a meal\"";
        String choiceB16 ="   \"Thankfully there is someone agrees to help you\"";
        String choiceC16 = "   \"your crush understood your predicament, and decides to help you. Well this counts as a date plan\"";
        questions.QuestionOP(narative16, choiceA16, choiceB16, choiceC16);

        //OP Q17
        String narative17 = "\nYour crush caught strange disease however thankfully your Earth knowledge, it's just a flu: \n1. You visit and takes care of your crush\n2. Only visit after your crush gets better\n3. You leave her alone";
        String choiceA17 = "   \"You assure it's not serious and is being thanked for your attention\"";
        String choiceB17 = "   \"Your cursh is at least grateful for your visit\"";
        String choiceC17 = "   \"Your crush is kind of sad..\"";
        questions.QuestionOP(narative17, choiceA17, choiceB17, choiceC17);

        //OP Q18
        String narative18 = "\nThe guildmaster calls you to his office, for a private matter: \n1. You expect a rank promotion\n2. You ask curiously, what's the matter \n3. You think \"Is there something bad happened?\"";
        String choiceA18 = "   \"You are very optimist. It was a promotion you have desired\"";
        String choiceB18 = "   \"He laughs at your nervousness. He gave out the S-rank badge, it is a promotion!\"";
        String choiceC18 = "   \"He looks at your expression, assures you it is a promotion\"";
        questions.QuestionOP(narative18, choiceA18, choiceB18, choiceC18);

        //OP Q19
        String narative19 = "\nOnce you tried to apply for a rank promotion but was rejected, you thought the reason being:\n1. You were too overqualified\n2. Your skills were not sufficient yet \n3. It is too soon for you, said them";
        String choiceA19 = "   \"You are strong, you havent contributed enough\"";
        String choiceB19 = "   \"Your abilities are still average\"";
        String choiceC19 = "   \"They are right, it's not time for you\"";
        questions.QuestionOP(narative19, choiceA19, choiceB19, choiceC19);

        //EI Q20
        String narative20 = "\nAfter a long journey, and now of old age, you feel sleepy and the next time you opens your eyes, suddenly you are back in real world. \nIt seems you fell asleep during the music concert. At same time the song is over and there is a standing ovation:\n1. You start clapping until you are last of the few to stop clapping\n2. You just clap and then stop soon after";
        String choiceA20 = "   \"You tears up, that dream felt so real\"";
        String choiceB20 = "   \"Back on your seat, you smiles and quotes: What an adventure\"";
        questions.QuestionEI(narative20, choiceA20, choiceB20);
    }
}