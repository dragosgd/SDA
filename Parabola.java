package exercitii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// CTRL + I, CTRL + shift + F pt indentare automata
// CTRL + SHIFT + O pt librarii automate
// f5=step into, f6=step over


public class Parabola {
	private double a,b,c;
	


    
	Parabola(double aa, double bb, double cc){
		this.a = aa;
		this.b = bb;
		this.c = cc;
		
	}
	Parabola(Parabola p){
		this(p.a,p.b,p.c);
	}
	void afisare() {
		System.out.println("f(x)=" + a + "x^2" + b + "x" + c);
	}
	
	double[] calculeazaVarf() {
		double [] varf ;
		double x,y,z;
		x = this.a;
		y = this.b;
		z = this.c;
		varf = new double[2];
		varf[0] = -((y) / (2 * x));
		varf[1] = (-(y*y) + 4*(x*z)) / (4*x);
		return varf;
	}
	
	public static double[] CalulMijloc (Parabola x ,Parabola y){
		double mijlocPrimPunct, mijlocSecundPunct;
		double[] virfPrim;
		double[] virfSecund;
		double[] mijloc;
		virfPrim = new double[2];
		virfSecund = new double[2];
		mijloc = new double[2];
		virfPrim = x.calculeazaVarf();
		virfSecund =y.calculeazaVarf();
		mijlocPrimPunct = (virfPrim[0]+virfPrim[1])/2;
		mijlocSecundPunct = (virfSecund[0]+virfSecund[1]);
		mijloc[0] = mijlocPrimPunct;
		mijloc[1] = mijlocSecundPunct;
		return mijloc;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		int a,b,c;
		double a1,b1,c1;
		BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dati a ");
		String s = Reader.readLine();
		System.out.println("Dati b ");
		s = Reader.readLine();
		System.out.println("Dati c ");
		s = Reader.readLine();
		a = Integer.parseInt(s);	
		b = Integer.parseInt(s);
		c = Integer.parseInt(s);
        a1 = a;
        b1 = b;
        c1 = c;
        Parabola p = new Parabola(a1,b1,c1);
        p.afisare();
		
		
		
	}

}



/*
 * 	public double getA( ) { return a; }
	public double getB( ) { return b; }
	public double getc( ) { return c; }*/
