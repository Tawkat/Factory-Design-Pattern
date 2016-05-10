/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class EnemyShipFactory {
    EnemyShip makeEnemy(String Enemyname)
    {
        //EnemyShip theEnemy=null;
        if(Enemyname.equals("U"))
        {
            return new UFOEnemyShip(); 
        }
        if(Enemyname.equals("B"))
        {
            return new BigUFOEnemyShip(); 
        }
        if(Enemyname.equals("R"))
        {
            return new RocketEnemyShip(); 
        }
        else
        {
            return null;
        }
        
    }
    
}
