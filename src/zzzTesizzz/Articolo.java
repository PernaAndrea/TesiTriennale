package zzzTesizzz;

public class Articolo {
	int numeroArticolo;
	String nomeArticolo;
	String autori;
	String sito;
	int anno;
	// KPI ordine csv 
	boolean Throughput;
	boolean Areaoccupation;
	boolean Receptivity;
	boolean CapacityFlexibility;
	boolean TravelDistance;
	boolean ResourceUtilization;
	boolean ShelfOccupation;
	boolean CriticalWIP;
	boolean MachineCollision;
	boolean UnoccupiedSpace;
	boolean VehicleCapacity;
	boolean InventoryTurnover;
	boolean ObjectMisplacement;
	boolean Selectivity;
	boolean PositioningAccuracy;
	boolean NumberofFailures;
	boolean BottleneckRate;
	boolean PeakUtilization;
	boolean UnprocessedOrder;
	boolean PickingAccuracy;
	boolean StockBalance;
	boolean WarehouseExposition;
	boolean CycleTime;
	boolean PickingTime;
	boolean OrderElaborTime;
	boolean TravelTime;
	boolean QueueWaitingTime;
	boolean TaskTime;
	boolean PlanningTime;
	boolean StorageTime;
	boolean RetrievalTime;
	boolean InventoryTime;
	boolean LeadTime;
	boolean Makespan;
	boolean ChargingPlatformAv;
	boolean PackingTime;
	boolean WarehouseAv;
	boolean ChargingTime;
	boolean ManagementCost;
	boolean StorageCost;
	boolean RetrievalCost;
	boolean InventoryCost;
	boolean HoldingCost;
	boolean DirectLabourCost;
	boolean IndirectLabourCost;
	boolean MaintenanceCost;
	boolean SpaceCost;
	boolean ImageRecSpeed;
	boolean AlgorithmReliability;
	boolean ResponseLatency;
	boolean SolverIterations;
	boolean QRCodeReliability;
	boolean EnergyConsumption;
	boolean EnergyRecovery;
	boolean PollutantEmission;
	boolean PassiveConsumption;
	boolean VehicleAutonomy;
	boolean Temperature;
	boolean BarometricPressure;
	boolean Humidity;
	boolean RoofTemperature;
	boolean PollutantDirtyConc;
	boolean HumanUtilization;
	boolean HumanError;
	boolean WorkSafety;
	boolean HumanActivityTime;
	boolean MachineSafety;
	boolean Noise;
	boolean ActivityAutomation;
	boolean OperatorsperArea;
	
	public Articolo(int numeroArticolo, String nomeArticolo, String autori, String sito,int anno) {
		super();
		this.numeroArticolo = numeroArticolo;
		this.nomeArticolo = nomeArticolo;
		this.autori = autori;
		this.sito = sito;
		this.anno = anno;
		
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}
	
}
