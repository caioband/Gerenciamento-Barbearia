/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package uproject;

import java.util.HashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Caio
 */
public class ProjectsHandlerTest {
    
    public ProjectsHandlerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of createProject method, of class ProjectsHandler.
     */
    @Test
    public void testCreateProject() {
        System.out.println("createProject");
        ProjectsHandler instance = new ProjectsHandler();
        ProjectsHandler.Project expResult = null;
        ProjectsHandler.Project result = instance.createProject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentProjectName method, of class ProjectsHandler.
     */
    @Test
    public void testGetCurrentProjectName() {
        System.out.println("getCurrentProjectName");
        ProjectsHandler instance = new ProjectsHandler();
        String expResult = "";
        String result = instance.getCurrentProjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProjects method, of class ProjectsHandler.
     */
    @Test
    public void testGetProjects() {
        System.out.println("getProjects");
        ProjectsHandler instance = new ProjectsHandler();
        HashMap expResult = null;
        HashMap result = instance.getProjects();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
