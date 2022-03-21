package services;

import model.demand.Demand;
import model.demand.DemandRepository;
import model.ice_cream_van.IceCreamVan;

import java.util.List;

public class DemandService {

    private static DemandRepository demandRepository;

    public DemandService(DemandRepository demandRepository) {
        this.demandRepository = demandRepository;
    }

    public static void process(List<IceCreamVan> iceCreamVans, Demand demand) {
        addDemandToRepository(demand);
        notifyFleet(iceCreamVans);
    }


    private static void notifyFleet(List<IceCreamVan> iceCreamVans) {
        for (IceCreamVan iceCreamVan : iceCreamVans) {
            NotificationService.notify(iceCreamVan.driverName(), "New demand in your area");
        }
    }

    private static void addDemandToRepository(Demand demand){
        demandRepository.add(demand);
    }

    public static void accept(Demand demand) {
        demandRepository.setStatusToInProgress(demand);
    }

    public static void fulfill(Demand demand) {
        demandRepository.setStatusToComplete(demand);
    }
}