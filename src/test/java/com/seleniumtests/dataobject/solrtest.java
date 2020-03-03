package com.seleniumtests.dataobject;
import java.io.IOException;
import java.util.Map;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import com.seleniumtests.webpage.WebCRMPage;
public class solrtest {
	public static String  url ="http://192.168.207.112/MagicBricks/";
    //public static String core = "Property";
	//public static String  url ="http://solrall.magicbricks.com/MagicBricks/";
    public static String core = "CompiledProject";

	public static void main(String[] args) throws SolrServerException, IOException {
		
	   /* String  URL = WebCRMPage.url;
	    if(URL.contains("deployment")) {
	    	URL="http://192.168.207.111/MagicBricks/";
	    }else if(URL.contains("testqc")) {
	    	URL="http://192.168.207.111/MagicBricks/";
	    }else {
	    	URL="http://192.168.207.111/MagicBricks/";
	    }*/
	    
	    //String Value = "id:26975653";
		//String getValue = "bd";
		String Value = "psmid:5022215";
	    String getValue = "totalUnit";
		SolrDocument SolrDocument = SolrSingleton.getDocument(Value,getDomain(url,core));
		//SolrDocument SolrDocument = new SolrDocument();
		 System.out.println(SolrDocument.get(getValue));
		//System.out.println(SolrDocument);
		
	}
	
	public static String getDomain(String url,String core) {
		String URL = url+core;
		return URL;
		
	}
	
	
}
