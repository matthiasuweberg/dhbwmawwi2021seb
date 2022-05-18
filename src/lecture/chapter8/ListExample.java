package lecture.chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

  public static void main(String[] args) {

    List<String> nameList = new ArrayList<String>();

    nameList.add("Klaus");
    nameList.add("Gabi");
    nameList.add("Gertrude");
    nameList.add("Zeus");
    //nameList.add(50);

    System.out.println("Anzahl an Namen: " + nameList.size());
    System.out.println("Element am 2. Index: " + nameList.get(2));

    System.out.println("Enthält Zeus: " + nameList.contains("Zeus"));
    System.out.println("Enthält Fred: " + nameList.contains("Fred"));

    System.out.println("Zeus löschen: " + nameList.remove("Zeus"));
    System.out.println("Zeus löschen: " + nameList.remove("Zeus"));

    for(int i = 0; i < nameList.size(); i++){
      System.out.println("index " + i + ": " + nameList.get(i));
    }

    for(String name : nameList){
      System.out.println(name);
      /*
      if(name.equals("Gertrude")){
        nameList.remove("Gertrude"); --> keine externen Modificationen auf Containern während einer Iterration
      }
       */
    }

    Iterator<String> nameListIterator = nameList.iterator();
    while(nameListIterator.hasNext()){
      String name = nameListIterator.next();
      System.out.println(name);
      if(name.equals("Gertrude")){
        nameListIterator.remove();
        //nameList.add("Hans");
      }
    }
    System.out.println("Anzahl Namen: " + nameList.size());



    List<Integer> numbers = new ArrayList();

    numbers.add(50); // Auto Boxing --> Elementarer Datentyp in Objekt
    numbers.add(10);
    numbers.add(100);

    for(int number : numbers){ // --> Auto Unboxing Objekt in elementaren Datetyp
      System.out.println(number + 6);
    }


  }
}
