package com.example.javacourse2.mutithreading;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger exchanger = new Exchanger<>();
        List<Action> friend1act = new ArrayList<>();
        friend1act.add(Action.SCISSORS);
        friend1act.add(Action.PAPER);
        friend1act.add(Action.SCISSORS);
        List<Action> friend2act = new ArrayList<>();
        friend2act.add(Action.PAPER);
        friend2act.add(Action.STONE);
        friend2act.add(Action.STONE);
        new BestFriend("Lol", friend1act, exchanger).start();
        new BestFriend("Kek", friend2act, exchanger).start();


    }
}

enum Action {
    STONE, SCISSORS, PAPER
}

@AllArgsConstructor
class BestFriend extends Thread {
    private String name;
    private List<Action> myActs;
    private Exchanger<Action> exchanger;

    private void winner(Action myAct, Action frinedAct) {
        if ((myAct == Action.STONE && frinedAct == Action.SCISSORS)
                || (myAct == Action.SCISSORS && frinedAct == Action.PAPER)
                || (myAct == Action.PAPER && frinedAct == Action.STONE)) {
            System.out.println(name + " is a winner!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActs) {
            try {
                reply = exchanger.exchange(action);
                winner(action, reply);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

