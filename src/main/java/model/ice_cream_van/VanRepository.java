package model.ice_cream_van;

import java.util.List;

public interface VanRepository {
    List<IceCreamVan> getAllVans();
    List<IceCreamVan> getVansWithinRange(Location currentLocation);

    void setVanToBusy(IceCreamVan iceCreamVan);
}

