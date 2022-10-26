class strings_vowel
  {
    public static void main(String args[])
    {
      String st1="Pavan";
        int i,vowel=0,con=0;
      char ch;

      for(i=0;i<st1.length();i++)
        {
          ch=st1.charAt(i);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            vowel++;
          else
            con++;
        }
      System.out.println("vowel:"+vowel);
       System.out.println("consonents:"+con);
    }
  }