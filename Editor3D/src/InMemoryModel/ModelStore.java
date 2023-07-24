package InMemoryModel;

public class ModelStore {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<iModelChangedObserver> changeObservers;
    
}
