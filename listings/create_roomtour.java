public static void main(String[] args) {
	Create create = new Create();
	create.connect();
	SideButton sb = new SideButton();
	BButton bb = new BButton();
	bb.setText("Start");
	while(!bb.getValue());
	while(!sb.getValue()) {
		if(create.getLeftBump())
			create.spinClockwise(250);
		else if(create.getRightBump())
			create.spinCounterClockwise(250);
		else
			create.driveStraigth(400);
		Botball.msleep(50);
	}
	create.stop();
	create.disconnect();
}