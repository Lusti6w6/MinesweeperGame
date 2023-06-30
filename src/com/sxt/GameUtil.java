package com.sxt;

/*
* 工具类
* 存放静态参数
* 工具方法
*/

import java.awt.*;

public class GameUtil {

    //地雷个数
    static int RAY_MAX =5;


    static int MAP_W = 11;  //地图宽
    static int MAP_H = 11;  //地图高
    static int OFFSET = 45;  //雷区偏移量
    static int SQUARE_LENGTH = 50;  //格子的边长

    static int FLAG_NUM = 0 ;//插旗数量

    //鼠标相关参数
    static int MOUSE_X; //坐标
    static int MOUSE_Y;
    //状态
    static boolean LEFT=false;
    static boolean RIGHT=false;

    //游戏状态 0为游戏中，1为胜利，2为失败
    static int state = 0;



    //底层元素 -1为雷， 0表空， 1-8表示对应数字
    static int[][] DATA_BOTTOM = new  int[MAP_W+2][MAP_H+2];

    //顶层元素 -1为无覆盖， 0覆盖， 1插旗， 2 插错旗
    static int[][] DATA_TOP = new  int[MAP_W+2][MAP_H+2];


    //载入图片
    static Image lei = Toolkit.getDefaultToolkit().getImage("imgs/lei.png");
    static Image top = Toolkit.getDefaultToolkit().getImage("imgs/top.gif");
    static Image flag = Toolkit.getDefaultToolkit().getImage("imgs/flag.gif");
    static Image noflag = Toolkit.getDefaultToolkit().getImage("imgs/noflag.png");

    static Image face = Toolkit.getDefaultToolkit().getImage("imgs/face.png");
    static Image over = Toolkit.getDefaultToolkit().getImage("imgs/over.png");
    static Image win = Toolkit.getDefaultToolkit().getImage("imgs/win.png");

    static Image[] images = new Image[9];
    static {
        for (int i = 1; i <=8 ; i++) {
            images[i] = Toolkit.getDefaultToolkit().getImage("imgs/num/"+i+".png");

        }
    }




}
