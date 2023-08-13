import java.util.Scanner;
public class Main {

    static int sum(int n1,int n2) //dynamic return  func
    {
        return n1+n2;
    }
    static void sub(int n1,int n2) //dynamic void func
    {
        System.out.println("sub = "+(n1-n2));
    }


    public static void main(String[] args) {
        System.out.println("Hello world!"); //sout +tab
        //String[] args -> is segniture مسئول عن معلومات البرنامج الرئسيسة

        ////////////// escape sequance//////////////////////
        // \n
        System.out.print("eslam\nsameh\n");
        System.out.println("eslam sameh");
        // \t
        System.out.println("eslam\tsameh");
        // \b
        System.out.println("eslam\b"); //بتمسح اخر حرف
        // \"
        System.out.println("eslam : \"  is a progammer \" ");
        // \'
        System.out.println("eslam '  is a progammer ' ");
        // \\
        System.out.println("eslam \\  is a progammer \\ ");
        // \r
        // زمان كانت ليها غرض بانها بتاخد الكلمه اللي بعديها وتغيرها بدل الكلمه الموجوده
        // اما الأن فهي  بتحذف الكلمه اللي بعديها او تعمل زي n\
        System.out.println("eslam \r is a progammer");
        //////////////////////////////////////////////////////////////
        //////  data type /////////
        // byte x= -128 -> 127    8 bit
        byte x1 = 5;
        System.out.println(x1);
        //short x2=-32768 -> 32767     16 bit
        short x2 = 327;
        System.out.println("x2 = " + x2);
        // int x3 = -2147483648 -> 2147483647
        System.out.println(Double.MIN_VALUE); // size of data type
        // float x4 = 1.4E-45 -> 3.4028235E38
        //double x5= 4.9E-324 -> 1.7976931348623157E308
        //char x6 ='e';
        // boolean x7 = false;
        // string x8="fsdfsdfsd";
        /////////////////////////////////////////////////////////////
        // operators //
        // areithmatic  +  -  *  %  ++  --
        // الاولويه لل postfix ثم prefix

        int x = 4, y = 8;
        System.out.println((float) x / y); // widening primitive conversation  من داتاطيب اقل الي اكبر
        float b = 4, d = 8;
        System.out.println((int) b / d); // narrowing primitive conversation  من داتاطيب اكبر الي اقل
        ++x; // 5       postfix
        System.out.println(x);
        x++; // 6       prefix
        System.out.println(x);
        System.out.println(++x); // 7
        System.out.println(x++); // 7 ثم هتزيد ل 8
        System.out.println(x); // 8
        //System.out.println(x++ + ++x  + x);
        System.out.println(x++ + " " + ++x + " " + " " + x); //8 10 10

        // assignment   =  ==  +=  -=  /=  *=  <<=   >>=
        int k = 5;
        k += 10;   //= k=k+10;
        System.out.println(k);
        ////////////////////////////////////////////////////////////////
        //  input //
        //import java.util.Scanner;    library input
        /*

       Scanner in =new Scanner (System.in);
        System.out.print(" enter id ");
       int f=in.nextInt() ;
        System.out.println("your id is "+f);

        System.out.print("enter your first num :");
        float z1=in.nextInt();
        System.out.print("enter your first num :");
        float z2=in.nextInt();
        System.out.println("num1 = " + z1 + "  num2 = " + z2);
        System.out.printf("num1 = %d  num2 = %d ",z1,z2);
          */
        //    Formatting Output with printf   //
       /*
           %n   newline
           %f   float and double
           %d    int , byte,short,long
           %s,S    string
           %c,C    char
           ///   وفي كتير جدا من ال format ابحث عنهاف الموقع ده  https://www.baeldung.com/java-printstream-printf
       */


        //////////////////////////////////////////control statement//////////
        // selection statement  if / switch
        //repetaion statement   for / while / do-while

        ///////////////////////////////// if else /////////////////////////////////
        // Relation operator :  ==  >=   <= !=  <  >
        Scanner in = new Scanner(System.in);
        int n1 = 45454, n2 = 56565;
        if (n1 >= n2) {
            System.out.println(n1 + "is pig");

        } else {
            System.out.println(n2 + " is big");
        }

        System.out.println("enter your gade");
        /*
        for (int i=1;i<6;i++)
        {
                int grade=in.nextInt();

            System.out.println(i);

            if (grade>90)
            {
                System.out.println("A");
            }
            else if (grade>80)
            {
                System.out.println("B");
            }
            else if (grade>70)
            {
                System.out.println("C");
            }
            else
            {
                System.out.println("Fail");
            }

        }
       */
        ///////////////////////// switch case ////////
        /*
        for (int i=1;i<6;i++)
        {
            int grade=in.nextInt();
            switch (grade)
            {
                case 90: {
                    System.out.println("A");
                    break;
                }
                case 80: {
                    System.out.println("B");
                    break;
                }
                case 70: {
                    System.out.println("c");
                    break;
                }

                case 60: {
                    System.out.println("d");
                    break;
                }
                default:
                    System.out.println("f");


            }

        }
        */
        ////////////////////// While loop //////////////
        /*
        int count=0; //count loop
        while(count<=7)
        {
            System.out.println("hi");
            count++;
        }

        char letter='x'; //
        while(letter!='q') //sentinel loop
        {
            //letter= in.next().charAt(0);
            count++;
        }

        boolean flag= true; //
        while(flag) //flag loop
        {
           // letter= in.next().charAt(0);
            count++;
            if (letter=='q')
            {
                flag=false;
            }
        }
        */
        /////////////////////// do while///////////////////////
        int count = 1;
        do {
            System.out.println(count);
            count++;


        }
        while (count < 10);
//////////////////////////// for loop //////////////////////////
        for (int i = 0, j = 7; i < 4 && j > 0; i++, j--) {

            System.out.println("i = " + i + "\t" + "j= " + j);


        }

///////////////////////////////////// branching statement///////////////////
        // unlabeled break : cause immediate exit from control structure
        //unlabeled continue : Skip remaining statement in loop body

        for (int i = 0; i < 7; i++) {
            System.out.println("i = " + i);

            if (i==5)
            {
                break;
               // continue;
            }


        }

        ///////// labeled break
        //////// labeled continue
        test:{
            if (5 <= 6) {
                break test;


            }

            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
        }
        System.out.println("6");



////////////////////////////////////////// nested loop//////////////////
        for (int r=0;r<3;r++)
        {
            System.out.println("    outer loop "+r);
            for (int c = 0; c < 5; c++)
            {
                System.out.println("inner loop "+c);
            }
        }
        
///////////////////////////////////// function /////////////////////
        //  static return data type + name ()
        // static void + name ()

        int s1=sum(4,7);
        System.out.println("sum = "+ s1);
         sub(10,7);























    }
}