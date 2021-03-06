package myJava;

/*
 * @(#)SimpleRead.java	1.12 98/06/25 SMI
 *
 * Copyright (c) 1998 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Sun grants you ("Licensee") a non-exclusive, royalty free, license 
 * to use, modify and redistribute this software in source and binary
 * code form, provided that i) this copyright notice and license appear
 * on all copies of the software; and ii) Licensee does not utilize the
 * software in a manner which is disparaging to Sun.
 *
 * This software is provided "AS IS," without a warranty of any kind.
 * ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES,
 * INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN AND
 * ITS LICENSORS SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 * LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THE
 * SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS
 * BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT,
 * INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES,
 * HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING
 * OUT OF THE USE OF OR INABILITY TO USE SOFTWARE, EVEN IF SUN HAS BEEN
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *
 * This software is not designed or intended for use in on-line control
 * of aircraft, air traffic, aircraft navigation or aircraft
 * communications; or in the design, construction, operation or
 * maintenance of any nuclear facility. Licensee represents and
 * warrants that it will not use or redistribute the Software for such
 * purposes.
 */

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;

import javax.comm.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SimpleRead implements Runnable, SerialPortEventListener {
	static CommPortIdentifier portId;
	static Enumeration portList;

	static InputStream inputStream;
	static OutputStream outputStream;
	static SerialPort serialPort;
	static Thread readThread;

	private JTextField txtOutput = new JTextField("");
	private int Count;
	private boolean Status = false;
	private String getStr = new String();

	public static void main(String[] args) {

		portList = CommPortIdentifier.getPortIdentifiers();
		// System.out.println(portList.hasMoreElements());
		// System.out.println(CommPortIdentifier.getPortIdentifiers());

		while (portList.hasMoreElements()) {
			portId = (CommPortIdentifier) portList.nextElement();
			// System.out.println(portId);
			// System.out.println(portId.getPortType());
			// System.out.println(portId.getName());
			// System.out.println(CommPortIdentifier.PORT_SERIAL);
			// System.out.println(CommPortIdentifier.PORT_PARALLEL);

			if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
				System.out.println(portId.getName());
				if (portId.getName().equals("COM4")) {
					// if (portId.getName().equals("/dev/term/a/")) {
					SimpleRead reader = new SimpleRead();
				}
			}
		}
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public SimpleRead() {
		initialize();
		
		try {
			serialPort = (SerialPort) portId.open("SimpleReadApp", 2000);
		} catch (PortInUseException e) {
			System.out.println(e.toString());
		}
		try {
			inputStream = serialPort.getInputStream();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		try {
			outputStream = serialPort.getOutputStream();
		} catch (IOException e) {
		}
		try {
			serialPort.addEventListener(this);
		} catch (TooManyListenersException e) {
			System.out.println(e.toString());
		}
		serialPort.notifyOnDataAvailable(true);
		try {
			serialPort.setFlowControlMode(serialPort.FLOWCONTROL_XONXOFF_IN);
		} catch (UnsupportedCommOperationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			serialPort.setSerialPortParams(19200, SerialPort.DATABITS_8,
					SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
		} catch (UnsupportedCommOperationException e) {
			System.out.println(e.toString());
		}
		readThread = new Thread(this);
		readThread.start();

	}

	private boolean SerialCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	private void initialize() {
		// TODO Auto-generated method stub
		JFrame frm1 = new JFrame("test");
		frm1.setBounds(200, 200, 300, 500);
		frm1.setVisible(true);
		frm1.getContentPane().setLayout(null);
		frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		txtOutput.setBounds(100, 25, 100, 80);
		txtOutput.setEditable(false);
		// 設定文字位置
		// txtOutput.setHorizontalAlignment(SwingConstants.CENTER);
		// 設定文字font(family,Plain,size)
		// txtOutput.setFont(new Font("新細明體", Font.PLAIN, 72));
		frm1.getContentPane().add(txtOutput);
	}

	public void run() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
	}

	public void serialEvent(SerialPortEvent event) {
		switch (event.getEventType()) {
		case SerialPortEvent.BI:
		case SerialPortEvent.OE:
		case SerialPortEvent.FE:
		case SerialPortEvent.PE:
		case SerialPortEvent.CD:
		case SerialPortEvent.CTS:
		case SerialPortEvent.DSR:
		case SerialPortEvent.RI:
		case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
			break;
		case SerialPortEvent.DATA_AVAILABLE:
			byte[] readBuffer = new byte[1];
			try {

				// while (inputStream.available() > 0) {
				// int numBytes = inputStream.read(readBuffer);
				inputStream.read(readBuffer);
				// }

				getStr += new String(readBuffer);
				String byteToString = new String(readBuffer);
				char[] ch = byteToString.toCharArray();
				Status = true;
				if (ch[0] == ',') {
					Count++;
					if (Count == 32) {
						Status=false;
						Count = 0;
						System.out.println();
						String[] str = getStr.split(",");
						Integer[] getInt = new Integer[str.length];

						for (int i = 0; i < str.length; i++) {
							getInt[i] = Integer.parseInt(str[i]);
							str[i] = Integer.toHexString(getInt[i]);
							str[i] = str[i].toUpperCase();
							System.out.print(i + "byte" + "\t");
						}
						System.out.println();
						for (int i = 0; i < str.length; i++) {
							System.out.print(str[i] + "\t");
						}
						System.out.println("end");
						getStr = "";

					}

				}

			} catch (IOException e) {
				System.out.println(e.toString());
			}
			break;
		}
	}
}
