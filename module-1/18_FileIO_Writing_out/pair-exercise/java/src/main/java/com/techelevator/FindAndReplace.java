package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {
//Write a program that can be used to replace all occurrences of one word with another word.  
//
//The program should prompt the user for the following values:

//* The search word
//* The word to replace the search word with
//* The source file  *This must be an existing file.  If the user enters an invalid source file, the program will indicate this and exit.*
//* The destination file.  *The program will create a copy of the source file with the requested replacements at this location.  If the file already exists, it should be overwritten. If the user enters an invalid destination file, the program will indicate this and exit.*
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String searchFor;
		String replaceWith;
		File sourceFile;
		File destinationFile;
		boolean caseSensitive = false;
		boolean fileOverwriteConfirmation = false;
		
		do {
			System.out.print("What word do you want to replace? ");
			searchFor = inputScanner.nextLine();
			
			if( searchFor.equals("") ) {
				System.out.println("Search cannot be empty.");
			}
		} while( searchFor.equals("") );
		
		System.out.print("What do you want to replace \""+searchFor+"\" with? " );
		replaceWith = inputScanner.nextLine();
		
		boolean validCaseSensitive = false;
		do {
			System.out.print("Should the search be case sensitive? (Y/N) ");
			String response = inputScanner.nextLine().toLowerCase();
			
			if( !response.equals("y") && !response.equals("n") ) {
				System.out.println("Unknown response. Expecting a Y or N.");
			} else {
				validCaseSensitive = true;
				caseSensitive = response.equals("y");
			}
		} while( !validCaseSensitive );
		
		boolean fileExists = false;
		System.out.println("What file do you want to be read?");
		do {
			sourceFile = new File(inputScanner.nextLine());
			
			if( !sourceFile.exists() ) {
				System.out.println("\nFile \""+sourceFile.getName()+"\" does not exist. Please choose a new file: ");
			} else {
				fileExists = true;
			}
		} while( !fileExists );
		
		do {
			System.out.println("What would you like to name the new file?");
			destinationFile = new File(inputScanner.nextLine());
			
			if( destinationFile.exists() ) {
				boolean validInput = false;
				String input;
				do {
					System.err.println("FILE \""+destinationFile.getName()+"\" ALREADY EXISTS. DO YOU WISH TO OVERWRITE? (Y/N)");
					input = inputScanner.nextLine().toLowerCase();
					if( !input.equals("y") && !input.equals("n") ) {
						System.out.println("Unknown response.");
					} else {
						validInput = true;
					}
				} while( !validInput );
				
				if( input.equals("y") ) {
					fileOverwriteConfirmation = true;
				}
			} else {
				fileOverwriteConfirmation = true; // file doesn't exist, set to true
				try {
					destinationFile.createNewFile();
				} catch (IOException e) {
					System.out.println("Failed to write to file \""+destinationFile.getName()+"\".");
					continue;
				}
			}
			
			// try to open file for writing
			try(PrintWriter fileWriter = new PrintWriter(new FileWriter(destinationFile, false))) {
				try(Scanner fileScanner = new Scanner(sourceFile)) {
					while( fileScanner.hasNextLine() ) {
						String line = fileScanner.nextLine();
						
						line = line.replaceAll( (caseSensitive?"":"(?i)") + searchFor, replaceWith);
						
						fileWriter.println(line);
					}
					
					System.out.println("\n\nCongratulations! Your new file has been written.\n\nPlease wait while it opens.");
					ProcessBuilder pb = new ProcessBuilder();
					pb.command("open", destinationFile.getAbsolutePath());
					pb.start();
					System.out.println();
				} catch( IOException e ) {
					System.out.println("Failed to open file \""+sourceFile.getName()+"\".");
					inputScanner.close();
					System.exit(1);
				}
			} catch (IOException e2) {
				System.out.println("Failed to open file \""+destinationFile.getName()+"\" for writing.");
				fileOverwriteConfirmation = false; // to continue looping
			}
		} while( !destinationFile.exists() || !fileOverwriteConfirmation );
		
		inputScanner.close();
	}

}
