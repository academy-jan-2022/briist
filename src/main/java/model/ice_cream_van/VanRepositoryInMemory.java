package model.ice_cream_van;

import java.util.List;

public class VanRepositoryInMemory implements VanRepository{
    @Override
    public List<IceCreamVan> getAllVans() {
        return null;
    }

    @Override
    public List<IceCreamVan> getVansWithinRange(Location currentLocation) {
        return null;
    }

    @Override
    public void setVanToBusy(IceCreamVan iceCreamVan) {

    }
}
