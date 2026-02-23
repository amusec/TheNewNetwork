package com.vivek.network;
import java.io.*; // handling dataflow
import java.net.*; // Sockets
import java.security.*; // Hashing
import java.util.*; // utiliity


public class ListenerServer{
    public static void main(String... ar){
        IdentityHandler idHandler = new IdentityHandler();
        UUID uuid = idHandler.getUUID();
        System.out.println(idHandler.getSha26UUID(uuid));
    }
}