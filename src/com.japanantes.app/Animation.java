package com.japanantes.app;

import java.util.*;

public class Animation {
	
    private Date debut,
                 fin;
    
    private List<SalleAnim> salles;
    
    public Animation(Date debut, Date fin){
    	this.salles = new ArrayList<SalleAnim>();
    }
    
	public Date getDebut() { return debut; }
	public void setDebut(Date debut) { this.debut = debut; }
	
	public Date getFin() { return fin; }
	public void setFin(Date fin) { this.fin = fin; }
	
	public List<SalleAnim> getSalles() { return salles; }

}
