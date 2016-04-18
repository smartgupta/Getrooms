package com.example.rahulgupta.getrooms;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rahul Gupta on 18-04-2016.
 */
public class SearchRequest extends StringRequest {
    private static final String SEARCH_REQUEST_URL = "http://192.168.43.196/search.php";
    private Map<String, String> params;

    public SearchRequest(int price, String shared,String location,String laundry,String mess, Response.Listener<String> Listener) {
        super(Request.Method.POST, SEARCH_REQUEST_URL, Listener, null);
        params = new HashMap<>();
        params.put("price", String.valueOf(price));
        params.put("shared", shared);
        params.put("location", location);
        params.put("laundry", laundry);
        params.put("mess", mess);


    }
    @Override
    public Map<String, String> getParams() {
        return params;

    }
}
