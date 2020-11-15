import java.util.HashMap;

public class HashMapGuide {

  public static void main(String[] args) {

//    int a = 10;
//    int b = 3;
//    int c = 88;
//
//    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
//    hashMap.put("a", 10);
//    hashMap.put("b", 3);
//    hashMap.put("c", 88);
//
//    System.out.println(hashMap);
//    System.out.println(hashMap.get("c"));

    HashMap<String, String> hashMap2 = new HashMap<String, String>();
    hashMap2.put("bobbyJoe1996", "FluffyPonies");
    hashMap2.put("helloKittyFan21", "AloeVera?");
    hashMap2.put("coolguyswag", "password123");

    System.out.println(hashMap2);
    //hashmaps don't really have an order so the order above might be different than what is printed
    //to the console.
    System.out.println(hashMap2.size());
    System.out.println(hashMap2.replace("bobbyJoe1996", "DifferenTpassWoRd"));
    System.out.println(hashMap2);
    System.out.println(hashMap2.containsValue("password123"));
    System.out.println(hashMap2.containsValue("passwor"));
    System.out.println(hashMap2.containsKey("coolguyswag"));
    System.out.println(hashMap2.remove("helloKittyFan21"));
    System.out.println(hashMap2);
    System.out.println(hashMap2.keySet());

  }

}
