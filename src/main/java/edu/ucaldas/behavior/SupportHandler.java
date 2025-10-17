package edu.ucaldas.behavior;

public class SupportHandler {

    public static Handler createChain() {
        Handler basic = new BasicSupportHandler();
        Handler supervisor = new SupervisorHandler();
        Handler manager = new ManagerHandler();

        basic.setNextHandler(supervisor);
        supervisor.setNextHandler(manager);

        // Este es el primer eslabón de la cadena
        return basic;
    }
}
