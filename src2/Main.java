import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();


        items.add(new Item(1, "Item A"));
        items.add(new Item(2, "Item B"));
        items.add(new Item(3, "Item C"));
        items.add(new Item(4, "Item D"));
        items.add(new Item(5, "Item E"));


        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }


        Map<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }


        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
