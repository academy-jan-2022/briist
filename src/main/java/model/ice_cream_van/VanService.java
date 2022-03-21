package model.ice_cream_van;

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
        List<IceCreamVan> allIceCreamVans = vanRepository.getAllVans();
        return allIceCreamVans.stream().filter(van -> van.location() == currentLocation).collect(Collectors.toList());
    }

    public static void setToBusy(IceCreamVan iceCreamVan) {
        vanRepository.setVanToBusy(iceCreamVan);
    }
}
