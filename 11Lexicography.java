class Dictionary
{
  public static void main(String args[]) 
  {

    String[] dict = { "ear", "Ball", "Cat", "Ant", "Dog" };
    

    for(int i = 0; i < 4; ++i) 
    {
     
      for (int j = i + 1; j < 5; ++j) 
      {
         
        if (dict[i].compareTo(dict[j]) > 0) 
        {
          String temp = dict[i];
          dict[i] = dict[j];
          dict[j] = temp;
        }
      }
    }

    System.out.println("In lexicographical order:");
    
    for(int i = 0; i < 5; i++) {
      System.out.println(dict[i]);
    }
  }
}
