package com.example.joke;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Joke {

    private List<String> mJokesList = asList(
            "A snail walks into a bar and the barman tells him there's a strict policy about having snails in the bar and so kicks him out. A year later the same snail re-enters the bar and asks the barman \"What did you do that for?\" ",
            "Mother: \"Did you enjoy your first day at school?\" \n" +
                    "Girl: \"First day? Do you mean I have to go back tomorrow? ",
            "\"I was born in California.\" \n" +
                    "\"Which part?\" \n" +
                    "\"All of me.\"",
            "\"Excuse me. Do you know the way to the zoo?\" \n" +
                    "\"No, I'm sorry I don't.\" \n" +
                    "\"Well, it's two blocks this way, then one block to the left.\"",
            "Patient: Doctor, I have a pain in my eye whenever I drink tea. \n" +
                    "Doctor: Take the spoon out of the mug before you drink. ",
            "Teacher: Do you have trouble making decisions? \n" +
                    "Student: Well...yes and no.",
            "Patient: Doctor! You've got to help me! Nobody ever listens to me. No one ever pays any attention to what I have to say.\n" +
                    "Doctor: Next please! ");

    public String getJoke() {
        Random random = new Random();
        return mJokesList.get(random.nextInt(mJokesList.size()));
    }

}