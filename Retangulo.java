/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

public class Retangulo implements IShape,IShow{
	
	private double altura;
	private double largura;

    public Retangulo(double altura , double largura){
    	this.altura = altura;
    	this.largura = largura;
    }
	@Override
	public double getArea() {
		return this.altura*this.largura;
	}
	@Override
	public void print(){
    System.out.printf("Retangulo - A área é: %.2f \n", getArea());
    System.out.printf("Retangulo - O perímetro é: %.2f \n", getPerimetro());
	}
	@Override
	public double getPerimetro() {
		return 2*(this.altura + this.largura);
	}

}
