package Chapter11.gumball;

import java.rmi.*;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://austin.mightygumball.com/gumballmachine"};

//        if (args.length >= 0) {
//            location = new String[1];
//            location[0] = "rmi://" + args[0] + "/gumballmachine";
//        }

        GumballMonitor[] monitor = new GumballMonitor[location.length];


        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine =
                        (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }

//		GumballMachineRemote gumballMachine = null;
//		int count;
//
//		if(args.length<2){
//			System.out.println("GumballMachine <name> <inventory>");
//			System.exit(1);
//		}
//
//		try {
//			count = Integer.parseInt(args[1]);
//
//			gumballMachine = new GumballMachine(args[0], count);
//			Naming.rebind("//"+args[0]+"/gumballmachine",gumballMachine);
//		}catch (Exception e){
//			e.printStackTrace();
//		}
}

