package com.redrock.java;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入主角名称：");
        String pName = scan.nextLine();
        System.out.println("请输入主角初始生命值（1-999）：");
        int pLife = scan.nextInt();
        System.out.println("请输入主角攻击力（1-999）：");
        int pAtk = scan.nextInt();
        System.out.println("请输入主角防御力（1-999）：");
        int pDefense = scan.nextInt();

        System.out.println("请输入怪物名称：");
        String mName = scan.next();
        System.out.println("请输入怪物初始生命值（1-999）：");
        int mLife = scan.nextInt();
        System.out.println("请输入怪物攻击力（1-999）：");
        int mAtk = scan.nextInt();

        boolean isFlag = false;
        for(int i = 1;;){
            if(i  % 2 != 0){
                mLife -= pAtk;
                System.out.println(pName + "对" + mName + "造成了" + pAtk + "点伤害");
                if(mLife <= 0){
                    isFlag = false;
                    break;
                }
            }else{
                pLife = (pLife - mAtk + pDefense > 1)?pLife - mAtk + pDefense:1 ;
                System.out.println(mName + "对" + pName + "造成了" + mAtk + "点伤害");
                if(pLife <= 0){
                    isFlag = true;
                    break;
                }
            }
            i++;
        }
        if(isFlag){
            System.out.println(mName +"胜利了");
        }else{
            System.out.println(pName +"胜利了");
        }
    }
}
