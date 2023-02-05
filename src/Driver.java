
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /**
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class   																					*
         ******************************************************************************************************************************************/



        Thread network = new Thread(new Network("network"));
        network.start();
        Thread server = new Thread(new Server());
        server.start();
        Thread client_sending = new Thread(new Client("sending"));
        client_sending.start();
        Thread client_receiving = new Thread(new Client("receiving"));
        client_receiving.start();
    }
}
