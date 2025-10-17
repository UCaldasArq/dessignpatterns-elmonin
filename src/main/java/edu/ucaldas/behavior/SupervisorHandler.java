package edu.ucaldas.behavior;

public class SupervisorHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("intermedia")) {
            return "Atendido por Supervisor";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(request);
        } else {
            return "No se puede atender la solicitud.";
        }
    }
}
