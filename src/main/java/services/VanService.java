package services;

import model.ice_cream_van.IceCreamVan;
import model.ice_cream_van.Location;
import model.ice_cream_van.VanRepository;

import java.util.List;
import java.util.stream.Collectors;

public class VanService {
    static VanRepository vanRepository;

    public VanService(VanRepository vanRepository) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static void markAsAvailable(IceCreamVan iceCreamVan) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static List<IceCreamVan> getVansWithinRange(Location currentLocation) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static void setToBusy(IceCreamVan iceCreamVan) {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
