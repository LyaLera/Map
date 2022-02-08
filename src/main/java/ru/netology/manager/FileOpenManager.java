package ru.netology.manager;

import java.util.*;

public class FileOpenManager {

    Map<String, String> files = new HashMap<>();

    public Map<String, String> getFiles() {
        return files;
    }

    public boolean setFiles() {
        this.files = files;
        return true;
    }


    public String register(String fileExtension, String fileName) {
        return files.put(fileExtension, fileName);
    }

    public String getValueForDefiniteKey(String fileExtension) {
        return files.get(fileExtension);
    }

    public void removeKeyIfExist(String fileExtension) {
        files.remove(fileExtension);
    }

    public List<String> getListOfAllKeysWithValues() {
        List<String> list = new ArrayList<>(files.keySet());
        Collections.sort(list);
        return list;
    }

    public Set<String> getListOfAllValuesWithKeys() {
        List<String> list = new ArrayList<>(files.values());
        Set<String> set = new HashSet<>(list);
        return set;
    }


}
