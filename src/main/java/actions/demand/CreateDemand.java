package actions.demand;

import model.demand.Demand;
import services.DemandService;
import model.demand.DemandStatus;
import model.ice_cream_van.*;
import services.VanService;

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
