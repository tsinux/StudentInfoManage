package com.tsing.util;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ResponseUtil { 
	
	public static void write(HttpServletResponse response,Object o)throws Exception {
		response.setContentType("text/html;charset=utf-8");
		//   PrintWriter  I/O流
		PrintWriter out=response.getWriter();
		out.println(o.toString());
		out.flush();
		out.close();
	}

}
