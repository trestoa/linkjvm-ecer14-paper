public static void main(String[] args){
	Motor leftMotor = new Motor(0);
	Motor rightMotor = new Motor(1);
	DigitalSensor bumpSensor = 
	new DigitalSensor(0);
	leftMotor.turn(100);
	rightMotor.turn(100);
	while(!bumpSensor.getValue()){
		Botball.msleep(100);
	}
	leftMotor.freeze();
	rightMotor.freeze();		
}