package model.demand;

public class DemandRepositoryInMemory implements DemandRepository{
    @Override
    public void setStatusToInProgress(Demand demand){}

    @Override
    public void setStatusToComplete(Demand demand){}

    @Override
    public void setStatusToAvailable(Demand demand){}

    @Override
    public void add(Demand demand) {}
}
