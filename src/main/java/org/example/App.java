/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {
    public static void main(String[] args) {
        String noun, verb, adjective, adverb;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        noun = s.nextLine();
        System.out.print("Enter a verb: ");
        verb = s.nextLine();
        System.out.print("Enter an adjective: ");
        adjective = s.nextLine();
        System.out.print("Enter an adverb: ");
        adverb = s.nextLine();

        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "?" + " That's hilarious!" );
    }
}