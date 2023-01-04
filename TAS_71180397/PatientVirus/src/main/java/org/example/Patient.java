package org.example;

public class Patient extends Virus{
    private static int DIE = 0;
    private static int ALIVE = 1;
    private int m_state;
    private int m_resistance;

    public Patient(){

    }

    public void DoInitResistance(){

    }

    public void DoStart(){

    }

    public void TakeMedicine(int DIE){

    }

    public void DoDie(){

    }

    public int getState() {
        return m_state;
    }

    public void setState(int m_state) {
        this.m_state = m_state;
    }

    public int getResistance() {
        return m_resistance;
    }

    public void setResistance(int m_resistance) {
        this.m_resistance = m_resistance;
    }
}
