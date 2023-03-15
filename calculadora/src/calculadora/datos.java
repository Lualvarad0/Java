package calculadora;

public class datos {
	int datos;
	int num1,num2;
	void suma() {
		datos=num1+num2;
	}
	void resta() {
		datos=num1-num2;
	}
	void funtion(){
	 suma();
	 resta();
	}
	public int getDatos() {
		return datos;
	}
	public void setDatos(int datos) {
		this.datos = datos;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
