/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanthread_edgine;
import static java.lang.Thread.sleep;
/**
 *
 * @author USER
 */
public class CobaThread {
    
    public static void main(String[] args) {
        Thread t1=new Posisi0();
        Thread t2=new Posisi1();
        Thread t3=new Posisi2();
        Thread t4=new Posisi3();
        Thread t5=new Posisi4();
        Thread t6=new Posisi5();
        Thread t7=new Posisi6();
        Thread t8=new Posisi7();
        Thread t9=new Posisi8();
        Thread t10=new Posisi9();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        
    }
}

class Posisi0 extends Thread{
    public void run(){
        try{
        sleep(400);
        }catch(InterruptedException e){
        e.printStackTrace();}
        System.out.println("Thread Celana-1:Posisi0");
    }
   }

class Posisi1 extends Thread{
    public void run(){
        System.out.println("Thread Celana-2:Posisi0");
    }
    
}
        

class Posisi2 extends Thread{
    public void run(){
        try{
        sleep(500);
        }catch(InterruptedException e){
        e.printStackTrace();}
        System.out.println("Thread Celana-2:Posisi1");
    }
   }

class Posisi3 extends Thread{
    public void run(){
        try{
        sleep(450);
        }catch(InterruptedException e){
        e.printStackTrace();}
        System.out.println("Thread Celana-1:Posisi1");
    }
    
}

class Posisi4 extends Thread{
    public void run(){
        try{
        sleep(550);
        }catch(InterruptedException e){
        e.printStackTrace();}
        System.out.println("Thread Celana-1:Posisi2");
    }
    
}

class Posisi5 extends Thread{
    public void run(){
        try{
        sleep(650);
        }catch(InterruptedException e){
        e.printStackTrace();}
        System.out.println("Thread Celana-2:Posisi2");
    }
    
}

class Posisi6 extends Thread{
    public void run(){
        try{
        sleep(700);
        }catch(InterruptedException e){
        e.printStackTrace();}
        System.out.println("Thread Celana-2:Posisi3");
    }
    
}

class Posisi7 extends Thread{
    public void run(){
        try{
        sleep(750);
        }catch(InterruptedException e){
        e.printStackTrace();}
        System.out.println("Thread Celana-1:Posisi3");
    }
    
}

class Posisi8 extends Thread{
    public void run(){
        try{
        sleep(800);
        }catch(InterruptedException e){
        e.printStackTrace();}
        System.out.println("Thread Celana-2:Posisi4");
    }
    
}

class Posisi9 extends Thread{
    public void run(){
        try{
        sleep(850);
        }catch(InterruptedException e){
        e.printStackTrace();}
        System.out.println("Thread Celana-1:Posisi4");
    }
    
}