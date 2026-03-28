package permissions;

import java.util.ArrayList;
import java.util.List;

import primary.Bus;
import primary.User;

public class BusManager extends User {
    // Created Arraylist for buses
    private static List<Bus> buses = new ArrayList<>();

    /* Subclass for bus manager(s) that extends User */
    public BusManager() {
    }

    public BusManager(String name, String username, String password, String perms) {
        super(name, username, password, "busManager");
    }
    /* ----------------------------BusManager methods---------------------------- */
    // private void addBus(){
    // System print: Input bus make
    // Scanner equals new Scanner: bMake

    // System print: Input bus model
    // Scanner equals new Scanner: bModel

    // System print: Input bus tank size
    // Scanner equals new Scanner: bTankSize

    // System print: Input bus' fuel burn rate
    // Scanner equals new Scanner: bFuelBurnRate

    // System print: Input bus' cruise speed
    // Scanner equals new Scanner: bCruiseSpeed

    // busList.add(new Bus(bMake, bModel, bTankSize, bFuelBurnRate, bCruiseSpeed))
    // }

    // private void removeBus(){
    // System print: Input bus make or ID
    // Scanner equals new Scanner: bnameID

    // for (bus in busList):
    // if bnameID equals bus.getMake() || bnameID equals
    // String.valueOf(bus.getBusID()):
    // busList.remove(bus)
    // break
    // else:
    // System print: Invalid bus name. Please try again.
    // }

    // private void updateBus(){
    // System print: Input bus make or ID
    // Scanner equals new Scanner: bnameID

    // for (bus in busList):
    // if bnameID equals bus.getMake() || bnameID equals
    // String.valueOf(bus.getBusID()):
    // System print: Input new bus name (or press enter to keep current name)
    // Scanner equals new Scanner: newBName
    // if newBName is not empty:
    // bus.setMake(newBName)

    // System print: Input new bus tank size (or press enter to keep current tank
    // size)
    // Scanner equals new Scanner: newBTankSize
    // if newBTankSize is not empty:
    // bus.setTankSize(newBTankSize)
    // else:
    // System print: Invalid bus name. Please try again.
    // }

    // private void viewBuses(){
    // for (bus in busList):
    // System print: bus.getMake() + " - Model: " + bus.getModel() + ", Tank Size: "
    // + bus.getTankSize() + ", Fuel Burn Rate: " + bus.getFuelBurnRate() + ",
    // Cruise Speed: " + bus.getCruiseSpeed()
    // }

    // private void viewBus(){
    // System print: Input bus make or ID
    // Scanner equals new Scanner: bnameID

    // for (bus in busList):
    // if bnameID equals bus.getMake() || bnameID equals
    // String.valueOf(bus.getBusID()):
    // System print: bus.getMake() + " - Model: " + bus.getModel() + ", Tank Size: "
    // + bus.getTankSize() + ", Fuel Burn Rate: " + bus.getFuelBurnRate() + ",
    // Cruise Speed: " + bus.getCruiseSpeed()
    // break
    // else:
    // System print: Invalid bus name. Please try again.
    // }
}
