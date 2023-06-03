package com.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StairCase {
    public String generate(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = n; i > 0; i--) {
            sb = sb.append(String.format("%1$" + n + "s", "#".repeat(n-i+1))).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String output = new StairCase().generate(n);
        System.out.println(output);

        bufferedReader.close();
    }
}
