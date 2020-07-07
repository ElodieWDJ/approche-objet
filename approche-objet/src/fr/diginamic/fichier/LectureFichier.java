package fr.diginamic.fichier;

import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import java.io.IOException;

public class LectureFichier {

	public static void main(String[] args) {
		try {
			File file = newFile("C:/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			for (String ligne : lignes) {
				System.out.println(ligne);
			}
			System.out.println("Nombre de lignes :" + lignes.size());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	private static File newFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
