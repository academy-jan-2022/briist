package actions;

import model.demand.Demand;
import model.demand.DemandService;
import model.demand.DemandStatus;
import model.ice_cream_van.*;


import java.util.List;

public class CreateDemand {
    Demand newDemand;

    public CreateDemand(Location currentLocation, String userName, int numberOfPeople, String dietaryRequirements) {
        this.newDemand = new Demand(userName, numberOfPeople, dietaryRequirements, currentLocation, DemandStatus.AVAILABLE);
    }

    private List<IceCreamVan> getVansWithinRange(){
        return VanService.getVansWithinRange(newDemand.location());
    }

    public void process() {
        var vans = getVansWithinRange();
        DemandService.process(vans, newDemand);
    }

}
