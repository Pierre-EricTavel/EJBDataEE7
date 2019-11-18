/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours.ejbdata;

import javax.ejb.ApplicationException;


@ApplicationException
public class MetierException extends RuntimeException {

    public MetierException() {
    }

    public MetierException(String message) {
        super(message);
    }

    public MetierException(String message, Throwable cause) {
        super(message, cause);
    }

    public MetierException(Exception ex) {
        super(ex);
    }
    
}
