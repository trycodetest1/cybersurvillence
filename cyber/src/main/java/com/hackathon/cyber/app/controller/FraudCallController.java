package com.hackathon.cyber.app.controller;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackathon.cyber.app.sentiment.dto.FraudCallDTO;
import com.hackathon.cyber.app.sentiment.dto.FraudCallDTO.Category;
import com.hackathon.cyber.app.sentiment.dto.FraudCallDTO.FraudType;


@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/cyber")
public class FraudCallController {
	
	
	String hostName = "192.168.4.125";
	int portNo = 5000;
	Socket socket = null;

	@RequestMapping(value = "/frauds", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody String save(@RequestBody FraudCallDTO fraudCallDTO1) {
		try {
			socket = new Socket(this.hostName, this.portNo);
			DataOutputStream os = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			ObjectMapper mapper = new ObjectMapper();
			String sdf;
			System.out.println(fraudCallDTO1);
			sdf = mapper.writeValueAsString(fraudCallDTO1);
			os.writeBytes(sdf + "\n");
			os.flush();
			os.close();
			socket.close();
			System.out.println("done");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	
}
