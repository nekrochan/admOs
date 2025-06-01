public class Car {
    private Long id;
    private String model;
    private Long ownerId;

    public Car() {}
    
    public Car(Long id, String model, Long ownerId) {
        this.id = id;
        this.model = model;
        this.ownerId = ownerId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public Long getOwnerId() { return ownerId; }
    public void setOwnerId(Long ownerId) { this.ownerId = ownerId; }
}
