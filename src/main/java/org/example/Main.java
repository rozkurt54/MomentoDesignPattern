package org.example;

import org.example.momento.CareTaker;
import org.example.momento.Originator;

public class Main {
  public static void main(String[] args) {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    originator.setState("State #1");
    careTaker.add(originator.saveStateToMomento());

    originator.setState("State #2");
    careTaker.add(originator.saveStateToMomento());

    originator.setState("State #3");
    careTaker.add(originator.saveStateToMomento());

    originator.setState(("State #4"));
    System.out.println("Get last state: " + originator.getState());

    originator.getStateFromMoments(careTaker.get(0));
    System.out.println("State 1: "+originator.getState());

    originator.getStateFromMoments(careTaker.get(1));
    System.out.println("State 2: "+originator.getState());





  }
}