package actions.demand;

import services.NotificationService;
import model.demand.Demand;
import model.ice_cream_van.IceCreamVan;
import services.VanService;

import static services.DemandService.accept;

public class AcceptDemand {
    Demand demand;
    IceCreamVan iceCreamVan;

    public void markDemandAsInProgress(){
        throw new UnsupportedOperationException("not yet implemented");
    }

    public void markVanAsBusy(){
        throw new UnsupportedOperationException("not yet implemented");
    }

    public void notifyUser() {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
