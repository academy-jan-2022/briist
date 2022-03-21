package model.ice_cream_van;

import java.util.List;
import java.util.stream.Collectors;

public class VanService {
    VanRepository vanRepository;

    public static List<Van> getVansWithinRange(Location currentLocation) {
        List<Van> allVans = vanRepository.getAllVans();
        return allVans.stream().filter(van -> van.location() == currentLocation).collect(Collectors.toList());
    }

}
