package com.solid_onion_proj1.controller;

import java.util.List;
import java.util.Scanner;

import com.solid_onion_proj1.entity.Bug;

public class BugUi {
    BugController bg=null;
    public BugUi(){
        bg=new BugController();
    }
    public void start(){
    System.out.println("Welcome");
    Scanner s =new Scanner(System.in);
    while(true){
        System.out.println("1.Insert Bug");
        System.out.println("2.Bug Details");
        System.out.println("3.Exit");
        System.out.println("Enter choice");
        int n=s.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter title");
                String tit=s.next();
                System.out.println("Enter Desc");
                String desc=s.next();
                System.out.println("Enter Status");
                String stat=s.next();
                Bug b=new Bug(tit,desc,stat);
                bg.ins(b);    
                break;
            case 2:
                System.out.println("Printing the Bugs");
                List<Bug> l=bg.bdetails();
                for(Bug ent:l){
                    System.out.println("id: "+ent.getId());
                    System.out.println("Title: "+ent.getTitle());
                    System.out.println("Description: "+ent.getDescription());
                    System.out.println("Status: "+ent.getStatus());
                     System.out.println("-----------------------------------------------------------------");
                }
                break;
            case 3:
                System.out.println("Exit");
                return;

            default:
                System.out.println("Enter correct choice");
        }


    }

     }
}
