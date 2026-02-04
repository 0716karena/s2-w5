import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>(){
      {
        add("vivacious");
        add("weigh");
        add("planes");
        add("art");
        add("sugar");
        add("waggish");
        add("instinctive");
        add("shrug");
        add("clip");
        add("lovely");
        add("mind");
        add("offbeat");
      }
    };
    //we will play with compareTo here
    char c = 'a';
    int ascii = (int)c;

    String s="Dog";
    String s1="dogb";
    String s2="dogg";
    int res = s1.compareTo(s2);
    System.out.println(res);
  }
}