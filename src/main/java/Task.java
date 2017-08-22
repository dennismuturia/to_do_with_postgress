import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
  private String description;
  private boolean completed;
  private LocalDateTime createdAt;
  private int id;

  public Task(String description) {
    this.description = description;
    completed = false;
    createdAt = LocalDateTime.now();
  }

  public String getDescription() {
    return description;
  }

  public boolean isCompleted() {
    return completed;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public int getId() {
   return id;
 }

 public static Task find(int id){

 }
 public static List<Task> all(){
   String sql = "SELECT id , description FROM tasks";
   try(Connection con = DB.sql2o.open()){
     return con.createQuery(sql).executeAndTetch(Task.class);
   }
 }

 public void save() {
  try(Connection con = DB.sql2o.open()) {
    String sql = "INSERT INTO tasks(description) VALUES (:description)";
    this.id = (int) con.createQuery(sql, true)
      .addParameter("description", this.description)
      .executeUpdate()
      .getKey();
  }
}
}
