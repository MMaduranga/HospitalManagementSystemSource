/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Minushi
 */
public class ReceivedPostalMail {
    private String fromName;
    private String fromAddress;
    private String toName;
   
    
    //getters
    
    public String getFromName(){
        return this.fromName;
    }
    
    public String getFromAddress(){
        return this.fromAddress;
    }
    
    public String getToName(){
        return this.toName;
    }
    
    //setters
    public void setFromName(String fromName){
        this.fromName=fromName;
    }
    
    public void setFromAddress(String fromAddress){
        this.fromAddress=fromAddress;
    }
    public void setToName(String toName){
        this.toName=toName;
    }
}
