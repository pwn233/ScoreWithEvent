/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithevent;

import java.util.ArrayList;

/**
 *
 * @author pwn233
 */
public class ScoreSource {
    private ArrayList<ScoreListener> listeners;
	public ScoreSource() {
		listeners = new ArrayList<>();
	}
	public void setScore(String data) {
		fireScoreEvent(new ScoreEvent(this, data));
	}
	public void addScoreListener(ScoreListener l) {
		listeners.add(l);
	}
	public void removeScoreListener(ScoreListener l) {
		listeners.remove(l);
	}
	public void fireScoreEvent(ScoreEvent e) {
        for(int i = 0; i < listeners.size(); i++) {
			ScoreListener l = listeners.get(i);
			l.update(e);
		}
	}
}
