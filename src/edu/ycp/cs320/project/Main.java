package edu.ycp.cs320.project;

import java.util.Scanner;

public class Main {


public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What type of citiation do you want?");
    String citation = keyboard.next();           
    citation=citation.toLowerCase();
   
    
    if (citation == "book"){
    	
    
        System.out.println("What is the Author's last name? ");
        String author = keyboard.next();  
    	
        System.out.println("What is the Author's first initial? ");
        String authorInitial = keyboard.next();
        
        System.out.println("What is the Book title? ");
        String bookTitle = keyboard.next();
        
        System.out.println("What is the publication date? ");
        String pubDate = keyboard.next();
    	
        System.out.println("What is the publication city? ");
        String pushcity = keyboard.next();
        
        System.out.println("What is the publication company? ");
        String company = keyboard.next();
        
        
        
    	
    }else if(citation == "periodical"){
    	
    	
        
        System.out.println("What is the Author's last name? ");
        String author = keyboard.next();  
    	
        System.out.println("What is the Author's first initial? ");
        String authorInitial = keyboard.next();
        
        System.out.println("What is the Article title? ");
        String articleTitle = keyboard.next();
        
        System.out.println("What is the Periodical title? ");
        String periodicalTitle = keyboard.next();
        
        System.out.println("What is the publication date? ");
        String pubDate = keyboard.next();
    	
        System.out.println("What is the voulme number? ");
        int volume = keyboard.nextInt();
        
        System.out.println("What is the issue number? ");
        int issue = keyboard.nextInt();
    	
        System.out.println("What is the issue number? ");
        int pagenum = keyboard.nextInt();
    	
    }else if (citation == "website"){
    	
    }else if(citation == "encyclopedia"){
    	
    }else{
    	System.out.println("Not valid type of citation");
    }
  
  }
	
	
	
	
	
}
