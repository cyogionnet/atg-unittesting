
package atg.service.cache;

import java.util.HashMap;
import java.util.Map;

import atg.service.cache.Cache;

/**
 * @author Yogendra Chauhan
 *
 */
public class MockCache extends Cache {
	
	private static final long serialVersionUID = -7361411011417742932L;
	private Map<Object,Object> cache = new HashMap<>();
	
	@Override
	public synchronized void put(Object pKey, Object pValue) {
		cache.put(pKey, pValue);
	}
	
	@Override
	public Object get(Object pKeys) {
		if (cache.containsKey(pKeys)) {
			return cache.get(pKeys);
		}
		return null;
	}
	
	@Override
	public boolean remove(Object key) {
		return cache.remove(key) != null ? true : false;
	}
}
