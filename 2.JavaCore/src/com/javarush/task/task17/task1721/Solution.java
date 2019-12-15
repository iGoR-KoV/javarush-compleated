package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        try (BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(file1)))) {
            while (readerFile.ready()) {
                allLines.add(readerFile.readLine());
            }
        } catch (IOException e) {
        }


        try (BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(file2)))) {
            while (readerFile.ready()) {
                forRemoveLines.add(readerFile.readLine());
            }
        } catch (IOException e) {
        }

        Solution solution = new Solution();
        solution.joinData();

        reader.close();
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
