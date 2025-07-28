package com.solid_onion_proj1.controller;
import java.util.List;

import com.solid_onion_proj1.entity.Bug;
import com.solid_onion_proj1.service.BugService;

public class BugController {
    public void ins(Bug bgs){
            if (bgs.getTitle().isEmpty() || bgs.getDescription().isEmpty() || bgs.getStatus().isEmpty()) {
                System.out.println("Title, Description, and Status cannot be empty");
                return; 
            }
            BugService bs=new BugService();
            bs.insert(bgs);
    
    }
    public List<Bug> bdetails(){
            BugService bser=new BugService();
            if(bser.details().isEmpty()){
                System.out.println("No bugs found");
                return null;
            }
        return bser.details();
    }
  

}