/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encrypt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Encrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      int MAX_SIZE=100;
      int i=0;
      char mingwen[]=new char[MAX_SIZE];
      char miwen[]=new char[MAX_SIZE];
      int char2num[]=new int[MAX_SIZE];
      char miyao[]=new char[MAX_SIZE/2];
      System.out.println("请输入明文。");
      BufferedReader cin = new BufferedReader(new InputStreamReader( System.in ) );
      cin.read(mingwen);
        while(mingwen.length>i)
      {
          switch(mingwen[i])
          {
              case 'a':char2num[i]=0;break;
              case 'b':char2num[i]=1;break;
              case 'c':char2num[i]=2;break;
              case 'd':char2num[i]=3;break;
              case 'e':char2num[i]=4;break;
              case 'f':char2num[i]=5;break;
              case 'g':char2num[i]=6;break;
              case 'h':char2num[i]=7;break;
              case 'i':char2num[i]=8;break;
              case 'j':char2num[i]=9;break;
              case 'k':char2num[i]=10;break;
              case 'l':char2num[i]=11;break;
              case 'm':char2num[i]=12;break;
              case 'n':char2num[i]=13;break;
              case 'o':char2num[i]=14;break;
              case 'p':char2num[i]=15;break;
              case 'q':char2num[i]=16;break;
              case 'r':char2num[i]=17;break;
              case 's':char2num[i]=18;break;
              case 't':char2num[i]=19;break;
              case 'u':char2num[i]=20;break;
              case 'v':char2num[i]=21;break;
              case 'w':char2num[i]=22;break;
              case 'x':char2num[i]=23;break;
              case 'y':char2num[i]=24;break;
              case 'z':char2num[i]=25;break;
              default: char2num[i]=-1; break; 
          }
          i=i+1;
      }
     System.out.println("请输入m,注意必须是整数。");
     Scanner x=new Scanner(System.in);
     int m=x.nextInt();
     System.out.println("请输入秘钥，注意字母个数为m，不留空格。");
     BufferedReader k = new BufferedReader(new InputStreamReader( System.in ) );
      k.read(miyao);
      int j=0;
      int p=0;
      while((char2num[j]!=-1)||(char2num[j+1]!=-1))
      {
          
          if(char2num[j]!=-1)
          {
              char2num[j]=char2num[j]+miyao[p]-19;
              while(char2num[j]>25)
              {
                  char2num[j]=char2num[j]-26;
              }
              p=p+1;
              if(p==m)
                  p=p-m;
          }
          j=j+1;
      } 
      for(p=0;p<j;p++)
      {
          switch(char2num[p])
          {
              case 0:System.out.print('a');break;
              case 1:System.out.print('b');break;
              case 2:System.out.print('c');break;
              case 3:System.out.print('d');break;
              case 4:System.out.print('e');break;
              case 5:System.out.print('f');break;
              case 6:System.out.print('g');break;
              case 7:System.out.print('h');break;
              case 8:System.out.print('i');break;
              case 9:System.out.print('j');break;
              case 10:System.out.print('k');break;
              case 11:System.out.print('l');break;
              case 12:System.out.print('m');break;
              case 13:System.out.print('n');break;
              case 14:System.out.print('o');break;
              case 15:System.out.print('p');break;
              case 16:System.out.print('q');break;
              case 17:System.out.print('r');break;
              case 18:System.out.print('s');break;
              case 19:System.out.print('t');break;
              case 20:System.out.print('u');break;
              case 21:System.out.print('v');break;
              case 22:System.out.print('w');break;
              case 23:System.out.print('x');break;
              case 24:System.out.print('y');break;
              case 25:System.out.print('z');break;
              default: break; 
          }
      }
      }
    
}
