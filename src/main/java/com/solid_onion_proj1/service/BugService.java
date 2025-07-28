package com.solid_onion_proj1.service;

import java.util.List;

import com.solid_onion_proj1.entity.Bug;
import com.solid_onion_proj1.repository.BugRepositoryImpl;

public class BugService{
   BugRepositoryImpl b=new BugRepositoryImpl();
     public void insert(Bug bug){
       if(Businessrule(bug)==false){
            System.out.println("Status must be either open or closed");
            return;
       }
        b.insertBug(bug);
     }
     public List<Bug> details(){
        return b.getAllBugs();
     }
     public boolean Businessrule(Bug bg){
       if(bg.getStatus().equals("open")||bg.getStatus().equals("closed")){
            return true;
       }
       else{
       return false;
       }

     }
    
}