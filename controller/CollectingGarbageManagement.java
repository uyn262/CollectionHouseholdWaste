/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;

import model.GarbageTruck;
import repository.CollectingGarbageRepository;
import repository.ICollectingGarbageRepository;
import view.Menu;

/**
 *
 * @author Admin
 */
public class CollectingGarbageManagement extends Menu<String>{
    private ICollectingGarbageRepository garbageRepository;
    static String[] options = {"Input", "Print", "Exit"};
    GarbageTruck g;
    public CollectingGarbageManagement() {
        super("===== COLLECTING GARBAGE MANAGEMENT =====", options);
        garbageRepository = new CollectingGarbageRepository();
        g = new GarbageTruck();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1: garbageRepository.getInput(g);
                break;
            case 2: garbageRepository.printTheCost(g);
                break;
            case 3: System.exit(0);
                break;
        }
    }
  
}
