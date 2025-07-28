package com.solid_onion_proj1.repository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.solid_onion_proj1.entity.Bug;
import com.solid_onion_proj1.util.dbUtil;
public class BugRepositoryImpl implements BugRepository{
    public void insertBug(Bug b){
        Connection con=dbUtil.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("INSERT INTO Bugtable(title,description,status) VALUES(?,?,?)");
            ps.setString(1, b.getTitle());
            ps.setString(2,b.getDescription());
            ps.setString(3,b.getStatus());
            ps.executeUpdate();
            System.out.println("Bug inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Bug> getAllBugs(){
        List<Bug> l=new ArrayList<>();
        Connection con=dbUtil.getConnection();
        try {
            PreparedStatement st=con.prepareStatement("SELECT * FROM Bugtable");
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Bug bg=new Bug();
                bg.setId(rs.getInt("id"));
                bg.setTitle(rs.getString("title"));
                bg.setDescription(rs.getString("description"));
                bg.setStatus(rs.getString("status"));
                l.add(bg);
                l.sort((b1,b2) -> Integer.compare(b1.getId(), b2.getId()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


         return l;
    }
}


