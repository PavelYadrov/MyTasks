package com.exercises.ex11;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface IFilePath  {


    //Eleventh exercise
    static File[] allPathes(String directory,FileFilter fileFilter){
        return new File(directory).listFiles(fileFilter);
    }
    static File[] allPathes(File file,FileFilter fileFilter){
        return file.listFiles(fileFilter);
    }



    //Twelfth exercise
    static File[] allNames(String dir, FilenameFilter fnf){
        String[] pathes = new File(dir).list(fnf);
        int i=0;
        assert pathes != null;
        File[] files = new File[pathes.length];
            for(String path:pathes){
                files[i]=new File(path);
                i++;
            }
        return files;
    }

    //Thirteenth exercise
    static List<File> mySort(List<File> fs, Comparator<File> comparator){
        fs.sort(comparator);
        return fs;
    }

    //Fourteenth exercise
    static Runnable methodRun(Runnable... runnables){
        return () -> Arrays.stream(runnables).forEach(Runnable::run);
    }


}
