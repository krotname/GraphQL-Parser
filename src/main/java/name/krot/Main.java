package name.krot;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import name.krot.parser.Parser;
import name.krot.parser.ParserImplementation;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Parser graphQLParser = new ParserImplementation();
        ArrayList<Map<String, String>> maps = graphQLParser.stringToMap("{data={product=[{name=Василиск, color=Белый, created_at=2020-02-02T00:00:00+00:00, secret=false}, {name=Falcon Heavy, color=Белый, created_at=2021-02-02T00:00:00+00:00, secret=false}]}}");

        Gson gson = new Gson();
        ArrayList<TestEntity> testEntities = new ArrayList<>();

        for (Map<String, String> m:maps
             ) {
            JsonElement jsonElement = gson.toJsonTree(m);
            TestEntity testEntity = gson.fromJson(jsonElement, TestEntity.class);
            testEntities.add(testEntity);
        }

        for (TestEntity t:testEntities
             ) {
            System.out.printf("%s %s %s%n", t.getName(), t.getColor(), t.getCreated_at());

        }

    }
}
