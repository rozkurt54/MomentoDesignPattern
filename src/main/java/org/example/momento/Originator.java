package org.example.momento;

public class Originator {

  private String state;

  public void setState(String state) {
    this.state = state;
  }
  public String getState(){
    return state;
  }

  public Momento saveStateToMomento(){
    return new Momento(state);
  }

  public void getStateFromMoments(Momento momento){
    state = momento.getState();
  }
}
