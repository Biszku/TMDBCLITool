package com.TMDBCLITool;

public class CLICommandController {
    private static byte commandSize;

    public static void setArgumentsSize(byte size) {
        commandSize = size;
    }

    public static boolean isNumberOfArgumentsValid(int length) {
        return length == commandSize;
    }

    public static String getMoviesType(String[] args) {
        if (!args[0].equals("--type") || args[1].isEmpty()) {
            return null;
        }

        return args[1];
    }
}