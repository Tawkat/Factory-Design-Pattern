/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class EnemyShipTesting {

    /**
     * @param args the command line arguments
     */
    public static void dosomething(EnemyShip enemy)
    {
        enemy.displayEnemyShip();
        enemy.followHeroShip();
        enemy.EnemyShipshoots();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        EnemyShip enemy=null;
        EnemyShipFactory newenemy=new EnemyShipFactory();
        String str="";
        System.out.println("What type of Ship (U/R/B)???");
        //if(in.hasNextLine())
        //{
            str=in.nextLine();
           
        //}
        enemy=newenemy.makeEnemy(str);
        if(enemy!=null)
        {
            dosomething(enemy);
        }
        else
        {
            System.out.println("What type of Ship (U/R/B)??? again");
            
        }
    }
    
}
