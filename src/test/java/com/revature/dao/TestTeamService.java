package com.revature.dao;
import com.revature.models.Employee;
import com.revature.models.Team;
import com.revature.services.TeamService;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.*;

public class TestTeamService {
    static TeamService teamService;
    //BeforeClass will run some method before the entire test class
//    @BeforeClass
//    public static void setupBeforeClass() throws Exception{
//        System.out.println("This runs before any test once");
//        teamService = new TeamService();
//    }
//
//    @AfterClass
//    public static void tearDownAfterClass() throws Exception {
//        System.out.println("This runs after the entire class is done");
//    }
//
//    @Before
//    public void setup() throws Exception {
//        //We can use MockitoAnnotations.openMocks() to essentially allow mocking in our test class
//        System.out.println("This ones before every test method");
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        System.out.println("This runs after every test");
//    }

    @Test
    public void positiveGetTeamNameTest(){
        //assertEquals(String message, expected, actual)

    }

    @Test
    public void negativeGetTeamNameTest(){
        //assertNotEquals(4, teamService.getTeamName());
        Set<String> teams = teamService.getTeamName();
        List<String> teamSorted = new ArrayList(Arrays.asList(teams.toArray()));
        teamSorted.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        String[] expectedStrings =  {"Team Operation", "Team Human Hunter","Team accounting fighter",
                "Team Java Lagged","Team Dark Web Crusaders","Team Quality fighter"};
        int counter = 0;
        for (String team:teams) {
            Assert.assertEquals(team, expectedStrings[counter]);
        }
    }
    @Mock
    TeamService mockedTeamS;

    @Test
    public void mockedGetTeamNameTest(){
        Set<String> teams = teamService.getTeamName();
        List<String> teamSorted = new ArrayList(Arrays.asList(teams.toArray()));
        teamSorted.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        String[] expectedStrings =  {"Team Operation", "Team Human Hunter","Team accounting fighter",
                "Team Java Lagged","Team Dark Web Crusaders","Team Quality fighter"};
        int counter = 0;
        for (String team:teams) {
            Mockito.when(mockedTeamS.getTeamName()).thenReturn(teams);
            assertEquals(team, mockedTeamS.getTeamName());
        }
    }

}
