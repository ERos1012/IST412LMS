package Model;


public class Assignment {
    private String name;
    private String description;
    private String dueDate;

    public Assignment(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }
}