package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements iModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangedObserver[] changeObservers;

    public ModelStore(iModelChangedObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.models =new ArrayList<PoligonalModel>();
        this.scenes =new ArrayList<Scene>();
        this.flashes =new ArrayList<Flash>();
        this.cameras =new ArrayList<Camera>();
        
    }

    @Override
    public void notifyChange(iModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }

    public Scene getScene(int id){
        return scenes.get(id);
    }
    
}
