import java.util.List;
import java.util.ArrayList;
import org.sql2o.*;

public class Category {
  private String name;
  private int id;
  

  public Category(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static List<Category> all() {
    String sql = "SELECT id, name FROM categories";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).executeAndFetch(Category.class);
    }
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
