/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class EnemyShip {
    private String name;
    private double damage;
    
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public double getdamage()
    {
        return damage;
    }
    public void setdamage(double damage)
    {
        this.damage=damage;
    }
    public void followHeroShip()
    {
        System.out.println(getname()+"is following the Hero");
    }
    public void displayEnemyShip()
    {
        System.out.println(getname()+"is on the screen");
    }
    public void EnemyShipshoots()
    {
        System.out.println(getname()+"attacks and does damage " + getdamage());
    }
    
}
