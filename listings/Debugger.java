public static void main(String[] args){
	Debugger debugger = new Debugger(IP);
	debugger.write("Some text!");
	debugger.writeln("Some line!");
	debugger.close();
}
