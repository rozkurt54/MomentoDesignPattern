package org.example.momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

  private final List<Momento> momentoList = new ArrayList<>();

  public void add(Momento state){
    momentoList.add(state);
  }

  public Momento get(int index){
    return momentoList.get(index);
  }

}
