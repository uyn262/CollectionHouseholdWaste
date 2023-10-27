/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.GarbageTruck;
import dataAccess.CollectingGarbageDAO;
/**
 *
 * @author Admin
 */
public class CollectingGarbageRepository implements ICollectingGarbageRepository{

    @Override
    public void getInput(GarbageTruck g) {
        CollectingGarbageDAO.Instance().getInput(g);
    }

    @Override
    public void printTheCost(GarbageTruck g) {
        CollectingGarbageDAO.Instance().printTheCost(g);
    }
    
}
