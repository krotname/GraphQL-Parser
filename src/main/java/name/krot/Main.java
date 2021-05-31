package name.krot;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import name.krot.parser.Parser;
import name.krot.parser.ParserImplementation;
import org.mountcloud.graphql.GraphqlClient;
import org.mountcloud.graphql.request.query.DefaultGraphqlQuery;
import org.mountcloud.graphql.request.query.GraphqlQuery;
import org.mountcloud.graphql.response.GraphqlResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        GraphqlClient client = GraphqlClient.buildGraphqlClient("http://localhost:8080/v1/graphql");
        GraphqlQuery query = new DefaultGraphqlQuery("employee");
        query.addResultAttributes("lastname", "name");
        GraphqlResponse response = client.doQuery(query);
        Map data = response.getData();

        Parser graphQLParser = new ParserImplementation();
        ArrayList<Map<String, String>> maps = graphQLParser.stringToMap(data.toString());

        Gson gson = new Gson();
        ArrayList<Employee> employees = new ArrayList<>();

        for (Map<String, String> m:maps
             ) {
            JsonElement jsonElement = gson.toJsonTree(m);
            Employee employee = gson.fromJson(jsonElement, Employee.class);
            employees.add(employee);
        }

        for (Employee t:employees
             ) {
            System.out.printf("%s %s%n", t.getName(), t.getLastname());

        }

    }
}
