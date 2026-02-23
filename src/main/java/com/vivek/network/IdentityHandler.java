package com.vivek.network;
import java.util.UUID;
import java.security.MessageDigest;

public class IdentityHandler{
    
    public UUID getUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
    } 
    
    public String getSha26UUID(UUID uuid){
        String inputUUID = uuid.toString();
        StringBuilder hex = new StringBuilder();
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashByte = md.digest(inputUUID.getBytes());
            for(byte b: hashByte){
                hex.append(String.format("%02x",b));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return hex.toString();
    }
}