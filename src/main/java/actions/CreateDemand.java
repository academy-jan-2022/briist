package actions;

import model.demand.Demand;
import model.demand.DemandService;
import model.demand.DemandStatus;
import model.ice_cream_van.Location;
import model.ice_cream_van.Van;
import model.ice_cream_van.VanRepository;
import model.ice_cream_van.VanRepositoryInMemory;


import java.util.List;

public class CreateDemand {
    Demand newDemand;
    VanRepository vanRepository;

    public CreateDemand(Location currentLocation, int numberOfPeople, String dietaryRequirements,VanRepositoryInMemory vanRepository) {
        this.newDemand = new Demand(numberOfPeople, dietaryRequirements, currentLocation, DemandStatus.AVAILABLE);
        this.vanRepository = vanRepository;
    }

    private List<Van> getVansWithinRange(){
        // get a list of vans that are within range based on their settings

        return vanRepository.getVansWithinRange(newDemand.location());
    }

    public void sendDemandToVansAndRepo() {
        var vans = getVansWithinRange();
        DemandService.notifyFleet(vans);
    }

}
