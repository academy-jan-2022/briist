package model.ice_cream_van;

import java.util.List;

public interface VanRepository {
    List<Van> getAllVans();
    List<Van> getVansWithinRange(Location currentLocation);
}
