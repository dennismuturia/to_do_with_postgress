import java.util.List;
import java.util.ArrayList;

public class Category {
  private String name;
  private int id;
  

  public Category(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static ArrayList<Category> all() {

  }

 public static void clear() {

 }

  public int getId() {
    return id;
  }

  public static Category find(int id) {

 }

  public void addTask(Task task) {
    mTasks.add(task);
  }

}
