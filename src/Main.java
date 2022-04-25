import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
/*    public static void main (String[] args) {
        Human human = new Human(1231, "sasadffgd", "fdfgdfg");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
        //    System.out.println(objectMapper.writeValueAsString(human));
            String jsonValue = objectMapper.writeValueAsString(human);
            Human human1 = objectMapper.readValue(jsonValue, Human.class);
            System.out.println("Возраст" + human1.getAge());
            System.out.println("Имя" + human1.getFirstName());
            System.out.println("Фамилия" + human1.getLastName());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/
        public static void main (String[] args) throws JsonProcessingException {
        Human human = new Human(1231, "sasadffgd", "fdfgdfg");
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(human));
    }
}
