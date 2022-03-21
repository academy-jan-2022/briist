package actions;

import model.NotificationService;
import model.demand.Demand;
import model.demand.DemandService;
import model.ice_cream_van.IceCreamVan;
import model.ice_cream_van.VanService;

public class AcceptDemand {
    Demand demand;
    IceCreamVan iceCreamVan;

    public void markDemandAsInProgress(){
        DemandService.accept(demand);
    }

    public void markVanAsBusy(){
        VanService.setToBusy(iceCreamVan);
    }

    public void notifyUser() {
        NotificationService.notify(demand.customerName(), "your request has been accepted");
    }
}
