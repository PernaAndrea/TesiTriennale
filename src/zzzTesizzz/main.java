package zzzTesizzz;

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> mappaTitoli= new TreeMap<Integer,String>();
		//String[] riga = new String[100];
		String riga[] = { "Throughput","Area.occupation","Receptivity","Capacity.Flexibility","Travel.Distance","Resource.Utilization","Shelf.Occupation","Critical.WIP","Machine.Collision","Unoccupied.Space","Vehicle.Capacity","Inventory.Turnover","Object.Misplacement","Selectivity","Positioning.Accuracy","Number.of.Failures","Bottleneck.Rate","Peak.Utilization","Unprocessed.Order","Picking.Accuracy","Stock.Balance","Warehouse.Exposition","Cycle.Time","Picking.Time","Order.Elabor.Time","Travel.Time","Queue.Waiting.Time","Task.Time","Planning.Time","Storage.Time","Retrieval.Time","Inventory.Time","Lead.Time","Makespan","Charging.Platform.Av.","Packing.Time","Warehouse.Av.","Charging.Time","Management.Cost","Storage.Cost","Retrieval.Cost","Inventory.Cost","Holding.Cost","Direct.Labour.Cost","Indirect.Labour.Cost","Maintenance.Cost","Space.Cost","Image.Rec..Speed","Algorithm.Reliability","Response.Latency","Solver.Iterations","QR.Code.Reliability","Energy.Consumption","Energy.Recovery","Pollutant.Emission","Passive.Consumption","Vehicle.Autonomy","Temperature","Barometric.Pressure","Humidity","Roof.Temperature","Pollutant.Dirty.Conc.","Human.Utilization","Human.Error","Work.Safety","Human.Activity.Time","Machine.Safety","Noise","Activity.Automation","Operators.per.Area"};
		ArrayList<Articolo> listaArticoli = new ArrayList<Articolo>();
  		
		//primi 35 articoli
  		listaArticoli.add((new Articolo(38,"Non-instantaneous deterioration effect in ordering decisions for a two-warehouse inventory system under advance payment and backlogging","Khan M.A.-A., Shaikh A.A., Panda G.C., Bhunia A.K., Konstantaras I.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85082812441&doi=10.1007%2fs10479-020-03568-x&partnerID=40&md5=c1e5a5f9559b37d224a3bc84a08fb7b7",2020)));
  		listaArticoli.add((new Articolo(94,"An integrated design approach for class-based block stacked warehouse","Venkitasubramony R., Adil G.K.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85063322657&doi=10.1108%2fF-04-2018-0056&partnerID=40&md5=9ffd2ba951491e777489b097e8e03b86",2019)));
  		listaArticoli.add((new Articolo(98,"Space-efficient layouts for block stacking warehouses","Derhami S., Smith J.S., Gue K.R.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85064012171&doi=10.1080%2f24725854.2018.1539280&partnerID=40&md5=9bec75f1ffcbfecfc807fba17740ac54",2019)));
  		listaArticoli.add((new Articolo(118,"Investigation of diversity and dominance of fungal biota in stored wheat grains from governmental warehouses in West Bengal, India","Kumari R., Jayachandran L.E., Ghosh A.K.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85061450741&doi=10.1002%2fjsfa.9568&partnerID=40&md5=5adc27a4bc57fcbf2c0307e48609bc1c",2019)));
  		listaArticoli.add((new Articolo(188,"Multi-objective optimization of electronic product goods location assignment in stereoscopic warehouse based on adaptive genetic algorithm","Yan B., Yan C., Long F., Tan X.-C.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84948949683&doi=10.1007%2fs10845-015-1177-7&partnerID=40&md5=700d24a8cdcc47582d54b4d93772183f",2015)));
  		listaArticoli.add((new Articolo(196,"An adapted ant colony optimization algorithm for the minimization of the travel distance of pickers in manual warehouses","De Santis R., Montanari R., Vignali G., Bottani E.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85041335027&doi=10.1016%2fj.ejor.2017.11.017&partnerID=40&md5=229f5be7c3c1626d50d25e4a0bdbd9eb",2018)));
  		listaArticoli.add((new Articolo(219,"Utilizing individual picker skills to improve order batching in a warehouse","Matusiak M., de Koster R., Saarinen J.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85019848494&doi=10.1016%2fj.ejor.2017.05.002&partnerID=40&md5=3ac3008b2075f9c4169ae5534d973b7b",2017)));
  		listaArticoli.add((new Articolo(227,"Optimising space utilisation in block stacking warehouses","Derhami S., Smith J.S., Gue K.R.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84961198001&doi=10.1080%2f00207543.2016.1154216&partnerID=40&md5=2f0efec247210ea8a5f58a480e1e4ceb",2017)));
  		listaArticoli.add((new Articolo(245,"An effective zero-inventory-ordering policy for a single-warehouse multiple retailer problem with a modified all-unit discount","Chang C.-T.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85019161398&doi=10.1016%2fj.cie.2017.05.005&partnerID=40&md5=6aa41a92a7aab86f415454fc6804fc81",2017)));
  		listaArticoli.add((new Articolo(256,"Group heterogeneity in multi member decision making model with an application to warehouse location selection in a supply chain","Dey B., Bairagi B., Sarkar B., Sanyal S.K.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85009107964&doi=10.1016%2fj.cie.2016.12.025&partnerID=40&md5=dad57040b980323879ae551ac8a7a8a7",2017)));
  		listaArticoli.add((new Articolo(311,"Diagonal cross-aisles in unit load warehouses to increase handling performance","Bortolini M., Faccio M., Gamberi M., Manzini R.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84983585706&doi=10.1016%2fj.ijpe.2015.07.009&partnerID=40&md5=763b8a5318bfe9975215a1a80218e1a7",2015)));
  		listaArticoli.add((new Articolo(313,"A cooperative demand response scheme using punishment mechanism and application to industrial refrigerated warehouses","Ma K., Hu G., Spanos C.J.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84959223809&doi=10.1109%2fTII.2015.2431219&partnerID=40&md5=30f123418e0d9fa6956cf98cd5da9d02",2015)));
  	    listaArticoli.add((new Articolo(318,"Developing design guidelines for a case-picking warehouse","Thomas L.M., Meller R.D.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84924662819&doi=10.1016%2fj.ijpe.2015.02.011&partnerID=40&md5=5552845cd52657f49ef7538bc095d1ba",2015)));
  		listaArticoli.add((new Articolo(343,"Optimizing the allocation of cuboidal boxes to cuboidal compartments for storage in a warehouse","Murthy G.S.R., Murthy A.L.N., Murty K.G.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84955262438&doi=10.1007%2f978-1-4939-1007-6_12&partnerID=40&md5=98b2065527a789d8b60635480fb57603",2015)));
  		listaArticoli.add((new Articolo(351,"A framework for infrastructure-free warehouse navigation","Gadd M., Newman P.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84938265671&doi=10.1109%2fICRA.2015.7139650&partnerID=40&md5=c18979541659de688a120ff4f35539d7",2015)));
  		listaArticoli.add((new Articolo(357,"A bi-directional flow-rack automated storage and retrieval system for unit-load warehouses","Chen Z., Li X., Gupta J.N.D.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84929953775&doi=10.1080%2f00207543.2014.980459&partnerID=40&md5=79c65950dff9b2348db523c7f19c5873",2015)));
  		listaArticoli.add((new Articolo(359,"Analyzing the impact of in-rack sprinklers in a warehouse fire: A demonstration of the role optimization has in mitigating damage","Trapp A.C., Rangwala A.S.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84924873031&doi=10.1016%2fj.firesaf.2015.03.002&partnerID=40&md5=2e2b9b5e51aab65b1b81402ca519d3b6",2015)));
  		listaArticoli.add((new Articolo(366,"The warehouse-inventory-transportation problem for supply chains","Sainathuni B., Parikh P.J., Zhang X., Kong N.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84899412115&doi=10.1016%2fj.ejor.2014.02.007&partnerID=40&md5=2263fbf9d7eb9b97a69c2c3635c1804a",2014)));
  		listaArticoli.add((new Articolo(394,"Blocking effects in warehouse systems with autonomous vehicles","Roy D., Krishnamurthy A., Heragu S.S., Malmborg C.J.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84898800305&doi=10.1109%2fTASE.2013.2243910&partnerID=40&md5=bb85b945265af1026476f9c21681ee24",2014)));
  		listaArticoli.add((new Articolo(410,"Two-warehouse production policy for different demands under volume flexibility","Sharma S., Singh S.R., Dem H.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84881182500&doi=10.5267%2fj.ijiec.2013.06.005&partnerID=40&md5=d3804fdc01132d3b625fc01b68793a9d",2013)));
  		listaArticoli.add((new Articolo(436,"Performance analysis and design trade-offs in warehouses with autonomous vehicle technology","Roy D., Krishnamurthy A., Heragu S.S., Malmborg C.J.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84866629413&doi=10.1080%2f0740817X.2012.665201&partnerID=40&md5=d846581fb0075d5243e0d06f8b2c2ee6",2012)));
  		listaArticoli.add((new Articolo(480,"Scalable photonic interconnection network with multiple-layer configuration for warehouse-scale networks","Sakano T., Yamamoto S.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-80052823273&doi=10.1364%2fJOCN.3.000A12&partnerID=40&md5=9a55f07301fdd841d018ef98bfb4b88a",2011)));
  		listaArticoli.add((new Articolo(525,"A power-of-two ordering policy for one-warehouse multiretailer systems with stochastic demand","Chu L.Y., Shen Z.-J.M.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-77951152071&doi=10.1287%2fopre.1090.0707&partnerID=40&md5=08655c17f5cb1dd2cc94989fa166042a",2010)));
  		listaArticoli.add((new Articolo(546,"The anticipative concept in warehouse optimization using simulation in an uncertain environment","Kofjač D., Kljajić M., Rejec V.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-53649107901&doi=10.1016%2fj.ejor.2007.06.055&partnerID=40&md5=525cb85ee38de220d83c831a83eb95c0",2009)));
  		listaArticoli.add((new Articolo(566,"Order-batching methods for an order-picking warehouse with two cross aisles","Ho Y.-C., Su T.-S., Shi Z.-B.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-50349093411&doi=10.1016%2fj.cie.2007.12.018&partnerID=40&md5=f6130a39657687a441b7ca0d960fcb0b",2008)));
  		listaArticoli.add((new Articolo(580,"Benchmarking and monitoring international warehouse operations in Europe","De Koster M.B.M., Balk B.M.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-44349153637&doi=10.3401%2fpoms.1080.0013&partnerID=40&md5=8170a13177766e90c88cc699daf4095a",2008)));																																																								listaArticoli.add((new Articolo(582,"Performance analysis of air cycle refrigerator integrated desiccant system for cooling and dehumidifying warehouse","Elsayed S.S., Miyazaki T., Hamamoto Y., Akisawa A., Kashiwagi T.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-39549120195&doi=10.1016%2fj.ijrefrig.2007.07.002&partnerID=40&md5=9af47a4e6262e7d277589c9dfafeff2f",2008)));
  		listaArticoli.add((new Articolo(607,"Order oriented slotting: a new assignment strategy for warehouses","Mantel R.J., Schuur P.C., Heragu S.S.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84969450502&doi=10.1504%2fEJIE.2007.014689&partnerID=40&md5=9f07abb6c2f8b02b499a0a4df0861a83",2007)));
  		listaArticoli.add((new Articolo(633,"A virtual warehouse system for production logistics","Fung S.H., Cheung C.F., Lee W.B., Kwok S.K.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-32144463867&doi=10.1080%2f09537280500112140&partnerID=40&md5=f1cd61e39736e945ceee86a8ab360db1",2005)));
  		listaArticoli.add((new Articolo(653,"Warehouse space capacity and delivery time window considerations in dynamic lot-sizing for a simple supply chain","Jaruphongsa W., Çetinkaya S., Lee C.-Y.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-5744227918&doi=10.1016%2fj.ijpe.2003.10.012&partnerID=40&md5=e1cea52e5061a09ff147c90eae1cca22",2004)));
  		listaArticoli.add((new Articolo(656,"Two-warehouse inventory models for deteriorating items with shortages under inflation","Yang H.-L.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-2042482734&doi=10.1016%2fS0377-2217%2803%2900221-2&partnerID=40&md5=89ee530c608f9f47e5a01729e663b7dc",2004)));
  		listaArticoli.add((new Articolo(752,"Perishable inventory control with two types of customers and different selling prices under the warehouse capacity constraint","Ishii H., Nose T.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-0030174007&doi=10.1016%2f0925-5273%2895%2900102-6&partnerID=40&md5=5a70300a10e2aff271a8194c8e9e9205",1996)));																																																																		listaArticoli.add((new Articolo(	753,"Warehouse and distribution facilities and community attributes: An empirical study","Sivitanidou R.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-0030485645&doi=10.1068%2fa281261&partnerID=40&md5=08ddebe6427e8e2aea35a3eaa83bff97",1996)));
  		listaArticoli.add((new Articolo(820,"98%-EFFECTIVE LOT-SIZING FOR ONE-WAREHOUSE, MULTI-RETAILER INVENTORY SYSTEMS WITH BACKLOGGING.","Mitchell Joseph S.B.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-0023342121&doi=10.1287%2fopre.35.3.399&partnerID=40&md5=9cb6c18d41f81704f501ff379d6e172f",1986)));
  		listaArticoli.add((new Articolo(827,"A warehouse location-routing problem","Perl J., Daskin M.S.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-0022267384&doi=10.1016%2f0191-2615%2885%2990052-9&partnerID=40&md5=f241cf7c8464f03488121dc8fddd2394",1985)));
		//altri 15 articoli
  		listaArticoli.add(new Articolo(67,"Strobe algorithms for multi-source warehouse consistency","Kembro J.H., Norrman A.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85090451071&doi=10.1108%2fIJPDLM-08-2019-0264&partnerID=40&md5=09cab31cc0f52886f2e089733d370cac",2020));
  		listaArticoli.add(new Articolo(131,"Optimizing a two-warehouse system under shortage backordering, trade credit, and decreasing rental conditions","Yu J.C.P.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85063317340&doi=10.1016%2fj.ijpe.2018.06.003&partnerID=40&md5=e7b66d715d1ab3d3a31812ca6f102cec",2019));
  		listaArticoli.add(new Articolo(144,"Correction to: Digital twin-driven joint optimisation of packing and storage assignment in large-scale automated high-rise warehouse product-service system (International Journal of Computer Integrated Manufacturing, (2019), (1-18), 10.1080/0951192X.2019.1667032)","","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85074852842&doi=10.1080%2f0951192X.2019.1682219&partnerID=40&md5=ae725772a8f10f9de107e02e303b030a",2019));
  		listaArticoli.add(new Articolo(195,"Assessing and facilitating warehouse safety","Hofstra N., Petkova B., Dullaert W., Reniers G., de Leeuw S.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85042069107&doi=10.1016%2fj.ssci.2018.02.010&partnerID=40&md5=893836c7afa267b064cfd95848eb881a",2018));
  		listaArticoli.add(new Articolo(261,"Analytical models for a new turnover-based hybrid storage policy in unit-load warehouses","Rao S.S., Adil G.K.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84961390799&doi=10.1080%2f00207543.2016.1158428&partnerID=40&md5=a7bcce788e9f52693f9b4412bd75bc73",2017));
  		listaArticoli.add(new Articolo(270,"The regional cooperation-based warehouse location problem for relief supplies","Chen Y., Zhao Q., Wang L., Dessouky M.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-85000360890&doi=10.1016%2fj.cie.2016.10.021&partnerID=40&md5=4f9a61c1328c4e358ada60ef12bd6640",2016));
  		listaArticoli.add(new Articolo(321,"W@reRISK method: Security risk level classification of stock keeping units in a warehouse","Cedillo-Campos M.G., Cedillo-Campos H.O.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84937053763&doi=10.1016%2fj.ssci.2015.06.009&partnerID=40&md5=8753f063fb936ac7f4a122261a59d787",2015));
  		listaArticoli.add(new Articolo(346,"Greening the food supply chain: An optimisation model for sustainable design of refrigerated automated warehouses","Meneghetti A., Monti L.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84941944526&doi=10.1080%2f00207543.2014.985449&partnerID=40&md5=bc3212d885ce1221381444d4fc81d06f",2015));
  		listaArticoli.add(new Articolo(354,"Warehouse performance measurement: A literature review","Staudt F.H., Alpan G., Di Mascolo M., Rodriguez C.M.T.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84938200691&doi=10.1080%2f00207543.2015.1030466&partnerID=40&md5=efcd29fe9c268fbfb5eb9bd91ccc4bcc",2015));
  		listaArticoli.add(new Articolo(413,"An agent-based modeling approach to analyze the impact of warehouse congestion on cost and performance","Heath B.L., Ciarallo F.W., Hill R.R.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84888358830&doi=10.1007%2fs00170-012-4505-5&partnerID=40&md5=025640efca859eaf392876b921b35685",2013));
  		listaArticoli.add(new Articolo(456,"A two-warehouse inventory model with increasing demand and time varying deterioration","Kumar Sett B., Sarkar B., Goswami A.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-84871986710&doi=10.1016%2fj.scient.2012.10.040&partnerID=40&md5=db6c7e4808e0aeb62e17fbcf1304cd55",2012));
  		listaArticoli.add(new Articolo(644,"A two-warehouse inventory model for items with stock-level-dependent demand rate","Zhou Y.-W., Yang S.-L.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-11844277587&doi=10.1016%2fj.ijpe.2003.12.007&partnerID=40&md5=9c468d6386625919c2ac1481d4476601",2005));
  		listaArticoli.add(new Articolo(654,"A simple tabu search for warehouse location","Michel L., Van Hentenryck P.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-2342526588&doi=10.1016%2fS0377-2217%2803%2900247-9&partnerID=40&md5=212c00bad9bcf6330eb257563f6c939a",2004));
  		listaArticoli.add(new Articolo(661,"Learning domain ontologies from document warehouses and dedicated web sites","Navigli R., Velardi P.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-22944440839&doi=10.1162%2f089120104323093276&partnerID=40&md5=5cd19f58b372f8d9fb60f782f93f7cdb",2004));
  		listaArticoli.add(new Articolo(748,"Strobe algorithms for multi-source warehouse consistency","Zhuge Yue, Garcia-Molina Hector, Wiener Janet L.","https://www.scopus.com/inward/record.uri?eid=2-s2.0-0030396131&partnerID=40&md5=9219482c9b0acafd75d3bad5a4475d21",1996));
  		
  																																																									
		String s="";
		String r="";
		TreeMap<String,Integer> mappaRiga = new TreeMap<String,Integer>();
		//Stampo i parametri KPI (csv) e li salvo nella mappa
		for(int i=0;(i<riga.length) && (riga!=null);i++) {
			s +=(String)riga[i]+"\n";
			mappaRiga.put((String)riga[i], i);
		}
		//Stampo i parametri KPI (alfabetico )
		System.out.println(s);
		for(String ss: mappaRiga.keySet()) {
			r+= (String)ss+"\n";
		}
		System.out.println(r);
		//Stampo i titoli degli articoli 
		String aa ="";
		for(Articolo a: listaArticoli) {
			aa += String.valueOf(a.numeroArticolo)+"; "+ a.nomeArticolo+"\n";
		}
		System.out.println(aa);
		//System.out.println();
		
		String listaFile="";
		for(Articolo aaa : listaArticoli) {
			String[] campo;
			campo=aaa.getAutori().split(" ");
			listaFile+= campo[0] + aaa.anno +" - "+aaa.nomeArticolo+" (s258465)\n";
		}
		System.out.println(listaFile);
	}

}
