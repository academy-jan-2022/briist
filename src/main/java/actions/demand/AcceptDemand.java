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
        accept(demand);
    }

    public void markVanAsBusy(){
        VanService.setToBusy(iceCreamVan);
    }

    public void notifyUser() {
        NotificationService.notify(demand.customerName(), "your request has been accepted");
    }
}