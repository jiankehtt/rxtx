package com.rxtx;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SerialReader r = new SerialReader();
		
		List<String> ports = r.findPort();
		for(String s: ports){
			r.openSerialPort(s);
		}
	}
}
