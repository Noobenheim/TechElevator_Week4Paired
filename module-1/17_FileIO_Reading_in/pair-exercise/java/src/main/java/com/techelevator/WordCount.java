package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		System.out.println("What is the path for the file you wish to count?");
		Scanner inputScanner = new Scanner(System.in);
		String filePath = inputScanner.nextLine();
		File file = new File(filePath);
		
		try( Scanner fileScanner = new Scanner(file) ) {
			int countWords = 0;
			int countSentences = 0;
			
			while( fileScanner.hasNextLine() ) {
				String line = fileScanner.nextLine().trim();
				
				if( !line.isEmpty() ) {
					String[] split = line.split(" ");
					int newWords=0;
					for( String s : split ) {
						if( !s.isEmpty() ) {
							newWords++;
						}
					}
					
					if( line.endsWith("-") ) {
						// We would add this to account for hyphenated words at the end of a sentence, but you don't!
						//newWords--;
					}

					countWords += newWords;
					
					if( line.contains(".") || line.contains("?") || line.contains("!") ) {
						int newSentences = line.split("[.?!] ").length;
						
						char c = line.charAt(line.length()-1);
						
						if( c != '.' && c != '!' && c != '?' ) {
							newSentences--;
						}
						
						countSentences += newSentences;
					}
				}
			}
			
			System.out.println("Word Count: "+countWords);
			System.out.println("Sentence Count: "+countSentences);
		} catch (FileNotFoundException e) {
			System.out.println(filePath+" is not a valid file");
		}
	}
}
