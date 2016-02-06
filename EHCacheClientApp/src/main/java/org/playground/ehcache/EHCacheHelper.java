/**
 * 
 */
package org.playground.ehcache;

import java.io.Serializable;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * @author kulkamah
 *
 */
public class EHCacheHelper {

	/**
	 * 
	 */
	public EHCacheHelper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		CacheManager cm = CacheManager.getInstance();
		
		cm.addCache("cache1");
		
		Cache cache = cm.getCache("cache1");
		
		
		cache.put(new Element("1", "one"));
		cache.put(new Element("2", "two"));
		cache.put(new Element("3", "three"));
		

		Element ele = cache.get("1");
		
		System.out.println(ele.getObjectValue().toString());
		
		System.out.println(cache.isKeyInCache("2"));
		
		@SuppressWarnings("deprecation")
		Serializable val = ele.getValue();
		
		System.out.println(val);
		
		
	}

}
