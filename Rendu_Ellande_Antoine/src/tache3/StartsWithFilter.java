package tache3;

import java.io.File;
import java.io.FilenameFilter;

public class StartsWithFilter implements FilenameFilter {

    private String startChain;

    public StartsWithFilter(String startChain) {
        this.startChain = startChain;
    }


    @Override
    public boolean accept(File dir, String name) {
        return name.startsWith(startChain);
    }
}
