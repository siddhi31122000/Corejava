package desingpatterns.factorymethod;

public class GetPlanFactory {
   public void getPlan(String PlanType) {
	   if(PlanType ==null) {
		   return null;
		   
	   }
       if (PlanType.equalsIgnoreCase("DOMESTICPLAN")) {
    	   return new DomesticPlan ();
       }else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
    	   return new commercialPlan();
    	   
       }elseif(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
    	   return new InstitutionalPlan ();
    	   
       }
     return null;  
   }
   
}