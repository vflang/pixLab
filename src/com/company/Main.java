package com.company;
/* String Anagram
- Use a for loop
- make a counter for each letter???
- output if the word is an anagram
- Scanner Class
- find out the amounts of each letter, set them to variables, and then compare the amounts to both words
- Output true if the amounts are the same, and false if not.
- Use substring!!! somehow <--ended up using char at
- String to character array

I feel like there's a way more efficient method to execute this but hey, at least the plan's solid i think
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("This program will determine if the your inputs are anagrams of each other" +
                "\nInput original word");

        Scanner userInput = new Scanner(System.in);

        String origWord = userInput.nextLine().toLowerCase();


        System.out.println("Input Anagram");
        String anaWord = userInput.nextLine().toLowerCase();


        //The alphabet for the orig word
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;

        //The alphabet for the anagram
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        int d1 = 0;
        int e1 = 0;
        int f1 = 0;
        int g1 = 0;
        int h1 = 0;
        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        int l1 = 0;
        int m1 = 0;
        int n1 = 0;
        int o1 = 0;
        int p1 = 0;
        int q1 = 0;
        int r1 = 0;
        int s1 = 0;
        int t1 = 0;
        int u1 = 0;
        int v1 = 0;
        int w1 = 0;
        int x1 = 0;
        int y1 = 0;
        int z1 = 0;


        for (int ii = 0; ii < origWord.length(); ii++) { //repeat for the amount of the length of the string?
            if (origWord.charAt(ii) == 'a') {

                a++;
            } else if (origWord.charAt(ii) == 'b') {
                b++;
            } else if (origWord.charAt(ii) == 'c') {
                c++;
            } else if (origWord.charAt(ii) == 'd') {
                d++;
            } else if (origWord.charAt(ii) == 'e') {
                e++;
            } else if (origWord.charAt(ii) == 'f') {
                f++;
            } else if (origWord.charAt(ii) == 'g') {
                g++;
            } else if (origWord.charAt(ii) == 'h') {
                h++;
            } else if (origWord.charAt(ii) == 'i') {
                i++;
            } else if (origWord.charAt(ii) == 'j') {
                j++;
            } else if (origWord.charAt(ii) == 'k') {
                k++;
            } else if (origWord.charAt(ii) == 'l') {
                l++;
            } else if (origWord.charAt(ii) == 'm') {
                m++;
            } else if (origWord.charAt(ii) == 'n') {
                n++;
            } else if (origWord.charAt(ii) == 'o') {
                o++;
            } else if (origWord.charAt(ii) == 'p') {
                p++;
            } else if (origWord.charAt(ii) == 'q') {
                q++;
            } else if (origWord.charAt(ii) == 'r') {
                r++;
            } else if (origWord.charAt(ii) == 's') {
                s++;
            } else if (origWord.charAt(ii) == 't') {
                t++;
            } else if (origWord.charAt(ii) == 'u') {
                u++;
            } else if (origWord.charAt(ii) == 'v') {
                v++;
            } else if (origWord.charAt(ii) == 'w') {
                w++;
            } else if (origWord.charAt(ii) == 'x') {
                x++;
            } else if (origWord.charAt(ii) == 'y') {
                y++;
            } else if (origWord.charAt(ii) == 'z') {
                z++;

                //System.out.println("a = " + a); these were just for testing whether or not if these worked
                //System.out.println("b = " + b);

            }
        }

        for (int ii = 0; ii < anaWord.length(); ii++) { //repeat for the amount of the length of the string?
            if (anaWord.charAt(ii) == 'a') {

                a1++;
            } else if (anaWord.charAt(ii) == 'b') {
                b1++;
            } else if (anaWord.charAt(ii) == 'c') {
                c1++;
            } else if (anaWord.charAt(ii) == 'd') {
                d1++;
            } else if (anaWord.charAt(ii) == 'e') {
                e1++;
            } else if (anaWord.charAt(ii) == 'f') {
                f1++;
            } else if (anaWord.charAt(ii) == 'g') {
                g1++;
            } else if (anaWord.charAt(ii) == 'h') {
                h1++;
            } else if (anaWord.charAt(ii) == 'i') {
                i1++;
            } else if (anaWord.charAt(ii) == 'j') {
                j1++;
            } else if (anaWord.charAt(ii) == 'k') {
                k1++;
            } else if (anaWord.charAt(ii) == 'l') {
                l1++;
            } else if (anaWord.charAt(ii) == 'm') {
                m1++;
            } else if (anaWord.charAt(ii) == 'n') {
                n1++;
            } else if (anaWord.charAt(ii) == 'o') {
                o1++;
            } else if (anaWord.charAt(ii) == 'p') {
                p1++;
            } else if (anaWord.charAt(ii) == 'q') {
                q1++;
            } else if (anaWord.charAt(ii) == 'r') {
                r1++;
            } else if (anaWord.charAt(ii) == 's') {
                s1++;
            } else if (anaWord.charAt(ii) == 't') {
                t1++;
            } else if (anaWord.charAt(ii) == 'u') {
                u1++;
            } else if (anaWord.charAt(ii) == 'v') {
                v1++;
            } else if (anaWord.charAt(ii) == 'w') {
                w1++;
            } else if (anaWord.charAt(ii) == 'x') {
                x1++;
            } else if (anaWord.charAt(ii) == 'y') {
                y1++;
            } else if (anaWord.charAt(ii) == 'z') {
                z1++;
            }
        }

        if (a==a1 && b==b1 && c==c1 && d==d1 && e==e1 && f==f1 && g==g1 && h==h1 && i==i1 && j==j1 && k==k1 && l==l1 &&
                m==m1 && n==n1 && o==o1 && p==p1 && q==q1 && r==r1 && s==s1 && t==t1 && u==u1 && v==v1 && w==w1 && x==x1
                && y==y1 && z==z1){

            System.out.println("True");

        }else{
            System.out.println("False");
        }
    }
}
