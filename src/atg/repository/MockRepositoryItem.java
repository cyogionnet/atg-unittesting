package atg.repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryItemDescriptor;

/**
 * @author Yogendra Chauhan
 *
 */
public class MockRepositoryItem implements RepositoryItem {
	
	private Map<String, Object> values = new HashMap<>();
	
	/**
	 * @param values
	 */
	public MockRepositoryItem(Map<String, Object> values) {
		this.values = values;
	}
	
	@Override
	public Object getPropertyValue(String propName) {
		return values.get(propName);
	}
	
	@Override
	public String getRepositoryId() {
		if (values.get("id") != null) {
			return (String) values.get("id");
		}
		return "";
	}

	@Override
	public String getItemDisplayName() {
		return "";
	}

	@Override
	public Collection<String> getContextMemberships() throws RepositoryException {
		return Collections.emptyList();
	}

	@Override
	public RepositoryItemDescriptor getItemDescriptor() throws RepositoryException {
		return null;
	}	

	@Override
	public Repository getRepository() {
		return null;
	}	

	@Override
	public boolean isTransient() {
		return false;
	}
}
