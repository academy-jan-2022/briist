package services;

import model.ice_cream_van.IceCreamVan;
import model.ice_cream_van.Location;
import model.ice_cream_van.VanRepository;

import java.util.List;
import java.util.stream.Collectors;

public class VanService {
    static VanRepository vanRepository;

    public VanService(VanRepository vanRepository) {
        this.vanRepository = vanRepository;
    }

    public static void markAsAvailable(IceCreamVan iceCreamVan) {

    }

    public static List<IceCreamVan> getVansWithinRange(Location currentLocation) {
        return vanRepository.getVansWithinRange(currentLocation);
    }

    public static void setToBusy(IceCreamVan iceCreamVan) {
        vanRepository.setVanToBusy(iceCreamVan);
    }
}
