package model.ice_cream_van;

import java.util.List;

public class VanRepositoryInMemory implements VanRepository{
    @Override
    public List<IceCreamVan> getAllVans() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    public List<IceCreamVan> getVansWithinRange(Location currentLocation) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    public void setVanToBusy(IceCreamVan iceCreamVan) {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
