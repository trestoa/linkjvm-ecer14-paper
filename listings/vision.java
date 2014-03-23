public static void main(String[] args) throws InterruptedException {
	Create create = new Create();
	create.connect();
	camera = new ImageProcessor(new CameraConfig(Resolution.MED_RES), 0);
	camera.openCamera();
	SideButton sb = new SideButton();
	while(!sb.getValue()) {
		camera.update();
		if(camera.getObjectCount() &gt; 0) {
			Rectangle rec = camera.getBoundingBox(0);
			if(rec.getWidth() &gt; 80){
				if(rec.getCenter().getX() &lt; 290){
					create.driveDirect(100, 0);
				}
				else if(rec.getCenter().getX() &gt; 350){
					create.driveDirect(100, 0);
				}
				Thread.sleep(500);
			}
		}
		create.stop();
	}
	create.disconnect();
	camera.close();
}

