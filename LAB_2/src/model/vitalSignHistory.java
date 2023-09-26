/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pavan
 */
public class vitalSignHistory {
    
    private ArrayList<vitalSigns> history;
     
    public vitalSignHistory(){
        this.history = new ArrayList<>();
    }

    public ArrayList<vitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<vitalSigns> history) {
        this.history = history;
    }
    
    public vitalSigns addNewVitals(){
    
        vitalSigns newVitals = new vitalSigns();
        history.add(newVitals);
        return newVitals;       
    }

    public void deleteVital(vitalSigns selectedValues) {
        history.remove(selectedValues);
    }  
}
