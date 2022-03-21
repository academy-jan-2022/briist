package model.demand;

public interface DemandRepository {
    public void setStatusToInProgress(Demand demand);
    public void setStatusToComplete(Demand demand);
    public void setStatusToAvailable(Demand demand);
    void add(Demand demand);
}
