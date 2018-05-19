package com.ncic.yufan.test;

import java.util.Arrays;

public class Knapsack {
	public static class Element implements Comparable{
		int id; //物品编号
		double d;
		public Element(int id,double d){
			this.id = id;
			this.d = d;
		}
		@Override
		public int compareTo(Object o) {
			double xd = ((Element)o).d;
			if(d < xd ) return -1;
			if(d == xd) return 0;
			return 1;
		}
	}
	double c; //背包容量
	int n ;  //物品数
	double[] w;//物品重量数组
	double[] p;//物品价值数据
	double cw; //当前重量
	double cp; //当前价值
	double bestp; //最优价值
	int[] x; //当前装入背包顺序
	int[] bestx; // 最优装入背包顺序
	Element[] q; // q为单位重量价值数组
	public double knapsack(double[] pp,double[] ww,double cc){
		//初始化
		c = cc;
		n = pp.length - 1;
		cw = 0;
		cp = 0;
		bestp = 0;
		x = new int[n+1];
		bestx = new int[n+1];
		
		for(int i = 0;i <= n;i++){
			q[i] = new Element(i,pp[i]/ww[i]);
		}
		//将个物品依单位价值从大到小排列
		Arrays.sort(q);
		p = new double[n + 1];
		w = new double[n + 1];
		for(int i = 1;i <= n;i++){
			p[i] = pp[q[i].id];
			w[i] = ww[q[i].id];
		}
		backtrack(1);
		return bestp;
	}
	public void backtrack(int i){
		if(i > n){//到达叶子结点
			bestp = cp;
			for(int j = 1;j <= n;j++){
				bestx[j] = x[j];
			}
			return ;
			}
		if(cw+ w[i] <= c){ //左子树
			x[i] = 1;
			cw  += w[i];
			cp += p[i];
		}
	}
	
}
