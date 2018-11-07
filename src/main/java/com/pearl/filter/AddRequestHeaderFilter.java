package com.pearl.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class AddRequestHeaderFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
		RequestContext ctx = RequestContext.getCurrentContext();
		ctx.addZuulRequestHeader("x-location", "India");
		return null;
	}

	@Override
	public String filterType() {
		return "Pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
