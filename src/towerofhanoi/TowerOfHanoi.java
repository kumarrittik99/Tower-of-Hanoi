/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TowerOfHanoi
{
    public void Tower(int disk,char beg,char aux,char end)
    {
        if(disk==1)
        {
            System.out.println(beg+" -> "+end);
        }
        else
        {
            Tower(disk-1,beg,end,aux);
            Tower(1,beg,aux,end);
            Tower(disk-1,aux,beg,end);
        }
    }

    
    public static void main(String[] args)
    {
        int n;
        TowerOfHanoi t = new TowerOfHanoi();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of disks to see the total number of moves");
        n=scan.nextInt();
        t.Tower(n, 'A', 'B', 'c');
    }
    
}
