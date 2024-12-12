package com.TMDBCLITool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CLICommandControllerTest {

    @Test
    void testIsNumberOfArgumentsValid() {
        CLICommandController.setArgumentsSize((byte) 2);
        assertTrue(CLICommandController.isNumberOfArgumentsValid(2));
        assertFalse(CLICommandController.isNumberOfArgumentsValid(3));
    }

    @Test
    void testGetMoviesType() {
        String[] args = {"--type", "popular"};
        assertEquals("popular", CLICommandController.getMoviesType(args));
        args = new String[]{"--type", "top"};
        assertEquals("top", CLICommandController.getMoviesType(args));
        args = new String[]{"--type", "upcoming"};
        assertEquals("upcoming", CLICommandController.getMoviesType(args));
        args = new String[]{"--type", "playing"};
        assertEquals("playing", CLICommandController.getMoviesType(args));
    }

    @Test
    void testGetMoviesTypeWithInvalidArguments() {
        String[] args = {"--type", ""};
        assertNull(CLICommandController.getMoviesType(args));
        args = new String[]{"--type", " "};
        assertNull(CLICommandController.getMoviesType(args));
        args = new String[]{"type", "playing"};
        assertNull(CLICommandController.getMoviesType(args));
        args = new String[]{"--type", null};
        assertNull(CLICommandController.getMoviesType(args));
        args = new String[]{null, null};
        assertNull(CLICommandController.getMoviesType(args));
    }
}