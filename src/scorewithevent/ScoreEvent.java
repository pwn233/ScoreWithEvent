/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithevent;
import java.util.EventObject;
/**
 *
 * @author pwn233
 */
public class ScoreEvent extends EventObject{
    private String data;
    public ScoreEvent(Object o, String data) {
        super(o);
        this.data = data;
    }
    public String getData() {
        return data;
    }
}
