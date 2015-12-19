package me.prince.junit.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;

import static org.hamcrest.core.Is.*
;/**
 * @author yhjhoo
 * @since 1.0
 * date : 19 Dec, 2015
 *
 */

public class RuleTests {

	
	@Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void fileCreatedAndWrittenSuccessfully()  throws IOException {
        File file = tempFolder.newFile("sample1.txt");
        FileUtils.writeStringToFile(file, "JUnit Rocks!");

        String line = FileUtils.readFileToString(file);
        assertThat(line, is("JUnit Rocks!"));
        
    }
    
    
    @Rule
    public TestName name = new TestName();
    @Test
    public void methodNameShouldBePrinted() {
        System.out.println("Test method name: " + name.getMethodName());
    }
    
    
    
    
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    @Test
    public void statementsCollectedSuccessfully() {
        String s = null;
        collector.checkThat("Value should not be null", null, is(s));

        s = "";
        collector.checkThat("Value should have the length of 1", s.length(), is(1));

        s = "Junit!";
        collector.checkThat("Value should have the length of 10",s.length(), is(10));
    }
    
    
}
