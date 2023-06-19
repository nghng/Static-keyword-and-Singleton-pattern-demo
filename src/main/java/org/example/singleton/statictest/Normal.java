package org.example.singleton.statictest;

public class Normal {
    int x = 3;

  public InnerClass innerClass(){
      return new InnerClass();
  }

    private class InnerClass {
        static int vc;
        int a = 2;
    }


}
