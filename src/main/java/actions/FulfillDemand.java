package actions;

import model.NotificationService;
import model.demand.Demand;
import model.demand.DemandService;
import model.ice_cream_van.IceCreamVan;
import model.ice_cream_van.VanService;

public class FulfillDemand {
    Demand demand;
    IceCreamVan iceCreamVan;

    public void markDemandAsComplete() {
        DemandService.fulfill(demand);
    }

    public void markVanAsAvailable() {
        VanService.markAsAvailable(iceCreamVan);
    }

    public void notifyVanDriver() {
        NotificationService.notify(iceCreamVan.driverName(), "this request has now been fulfilled");
    }
}

