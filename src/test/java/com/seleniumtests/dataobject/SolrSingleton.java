package com.seleniumtests.dataobject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

public class SolrSingleton {

	
	private static SolrSingleton SolrSingleton = new SolrSingleton( );

	private static Map<String,SolrDocument> documentsMap= new HashMap<>();
	
	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private SolrSingleton() { }

	   /* Static 'instance' method */
	   public static SolrSingleton getInstance( ) {
	      return SolrSingleton;
	   }

	   /* Other methods protected by singleton-ness */
	    public static  SolrDocument getDocument(String queryString,String url) throws SolrServerException, IOException{
			SolrDocument SolrDocument = null;
			
			if(!documentsMap.containsKey(queryString)) {	
				
				SolrClient client = new HttpSolrClient.Builder(url).build();
	
		        SolrQuery query = new SolrQuery();
		        query.setQuery(queryString);
		       // query.addFilterQuery("cat:electronics","store:amazon.com");
		      // query.setFields("id","isVis","parLt","bgs");
		        query.setStart(0);
		        //query.set("id","isVis","parLt","bgs");
	
		        QueryResponse response = client.query(query);
		        SolrDocumentList results = response.getResults();
		        for (int i = 0; i < results.size(); ++i) {
		        	SolrDocument = (SolrDocument)results.get(i);
		        
		        }
		        documentsMap.put(queryString, SolrDocument);
			}
			
			return documentsMap.get(queryString);
		}
}
