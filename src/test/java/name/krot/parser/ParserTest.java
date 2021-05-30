package name.krot.parser;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void stringToMap() {

        Parser graphQLParser = new ParserImplementation();
        ArrayList<Map<String, String>> maps = graphQLParser.stringToMap("{data={product=[{name=Василиск, color=Белый, created_at=2020-02-02T00:00:00+00:00, secret=false}, {name=Falcon Heavy, color=Белый, created_at=2021-02-02T00:00:00+00:00, secret=false}]}}");
        assertEquals("Белый", maps.get(0).get("color"));
        assertEquals("Falcon Heavy", maps.get(1).get("name"));
    }
}