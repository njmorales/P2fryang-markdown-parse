import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;import static org.junit.Assert.*;
import org.junit.*;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("./test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile3() throws IOException {
        String contents= Files.readString(Path.of("./test-file3.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile4() throws IOException {
        String contents= Files.readString(Path.of("./test-file4.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile5() throws IOException {
        String contents= Files.readString(Path.of("./test-file5.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile6() throws IOException {
        String contents= Files.readString(Path.of("./test-file6.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile7() throws IOException {
        String contents= Files.readString(Path.of("./test-file7.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile8() throws IOException {
        String contents= Files.readString(Path.of("./test-file8.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile9() throws IOException {
        String contents= Files.readString(Path.of("./test-file9.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile10() throws IOException {
        String contents= Files.readString(Path.of("./test-file10.md"));
        List<String> expect = List.of("https://google.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile11() throws IOException {
        String contents= Files.readString(Path.of("./test-file11.md"));
        List<String> expect = List.of("a-link.html");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile12() throws IOException {
        String contents= Files.readString(Path.of("./test-file12.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile13() throws IOException {
	String contents= "[](new-test-link.com)";
	List<String> expect = List.of("new-test-link.com");
	assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    HashMap<String, ArrayList<String>> fileMap;
    
    @Before
    public void setupMap() {
        fileMap = new HashMap<>();
        fileMap.put("test-file1.md", new ArrayList<String>(Arrays.asList("https://something.com", "some-page.html")));
        fileMap.put("test-file2.md", new ArrayList<String>(Arrays.asList()));
        fileMap.put("test-file3.md", new ArrayList<String>(Arrays.asList()));
        fileMap.put("test-file4.md", new ArrayList<String>(Arrays.asList()));
        fileMap.put("snippet1.md", new ArrayList<String>(Arrays.asList("`google.com", "google.com", "ucsd.edu")));
        fileMap.put("snippet2.md", new ArrayList<String>(Arrays.asList("a.com", "a.com(())", "example.com")));
        fileMap.put("snippet3.md", new ArrayList<String>(Arrays.asList("https://ucsd-cse15l-w22.github.io/")));
    }

    @Test
    public void testSnippet1() throws Exception {
        assertEquals(fileMap.get("snippet1.md"), MarkdownParse.getLinks(Files.readString(Path.of("snippet1.md"))));
    }

    @Test
    public void testSnippet2() throws Exception {
        assertEquals(fileMap.get("snippet2.md"), MarkdownParse.getLinks(Files.readString(Path.of("snippet2.md"))));
    }

    @Test
    public void testSnippet3() throws Exception {
        assertEquals(fileMap.get("snippet3.md"), MarkdownParse.getLinks(Files.readString(Path.of("snippet3.md"))));
    }
}
