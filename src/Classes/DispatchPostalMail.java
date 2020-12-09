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


public class DispatchPostalMail {
    private String toName;
    private String toAddress;
    private String fromName;
    
    //getters 

    public String getToName(){
        return this.toName;
    }
    
    public String getToAddress(){
        return this.toAddress;
        
    }
    
    public String getFromName(){
        return this.fromName;
    }
    
    //setters
    
    public void setToName(String toName){
        this.toName=toName;
    }
    
    public void setToAddress(String toAddress){
        this.toAddress=toAddress;
    }
    
    public void setFromName(String fromName){
        this.fromName=fromName;
    }
    

    public DispatchPostalMail(){
        this.setToAddress("");
        this.setToName("");
        this.setFromName("");
    }
    
    public DispatchPostalMail(String toAddress){
        this.setToAddress(toAddress);
        this.setFromName("");
        this.setToName("");
    }
    
    public DispatchPostalMail(String toAddress , String fromName){
        this.setToAddress(toAddress);
        this.setFromName(fromName);
        this.setToName("");
    }
    
    public DispatchPostalMail(String toAddress, String fromName, String toName ){
        this.setToAddress(toAddress);
        this.setFromName(fromName);
        this.setToName(toName);
    }
    public String toString(){
        return this.getFromName() +"\n" +this.getToAddress() + "\n"+ this.getToName();
    }
    
    
    
    
    
    
}
