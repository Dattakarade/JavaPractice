package practice.java;

public class stringReverse {

public void revStr(){
  String original="Datta";
  String Rev;
    char[] ch = original.toCharArray();

    for(int i=ch.length-1;i>=0;i--)
    {
      //String abc=ch[i];
      System.out.println(ch[i]);

      if(ch[i]==original)
      {
        System.out.println("Palindrome");
      }
      else {
        System.out.println("Not Palindrome");
      }
    }

    String org=String.valueOf(ch);

  System.out.println("Original Sting "+org);

    }


    public static void main(String[] args){

      stringReverse s=new stringReverse();
      s.revStr();
//        if(num==num1)
//
//    {
//        System.out.println("number is palindrom");
//    }
//        else{
//            System.out.println("Number is not Palindrom");
//    }
// String reverse
//original string is equals to reverse string
//if equals = prlindrome
//else = not palindrome
}}
