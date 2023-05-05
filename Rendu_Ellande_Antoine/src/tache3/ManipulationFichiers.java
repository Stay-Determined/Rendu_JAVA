package tache3;

import java.io.File;
import java.io.FilenameFilter;

public class ManipulationFichiers {
    public static void printFiles(File dir, String startChain) {

        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(startChain);
            }
        });

        if (files == null) {
            System.out.println("Répertoire vide");
            return;
        }
        System.out.println("Contenu du du lien " + dir.getAbsolutePath() + " :");
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Dossier : " + file.getName());
            } else {
                System.out.println("Fichier : " + file.getName());
            }
        }
    }

    public static long totalSizeOfFiles(File dir){
        long size = 0;
        File[] files = dir.listFiles();
        for (File file : files){
            if (!file.isDirectory()){
                size = size + file.getTotalSpace();
            }
        }

        return size;
    }

    public static File mostRecentFile(File dir) {
        File[] files = dir.listFiles();
        long lastTimeModif = 0;
        File recent = null;
        for (File file : files) {
            if (file.lastModified() > lastTimeModif) {
                lastTimeModif = file.lastModified();
                recent = file;
            }
        }
        return recent;
    }
}
