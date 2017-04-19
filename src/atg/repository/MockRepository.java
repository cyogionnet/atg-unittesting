/**
 * 
 */
package atg.repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Yogendra Chauhan
 *
 */
public class MockRepository implements Repository {
	
	
	private Map<String, List<RepositoryItem>> items = new HashMap<>();
	private boolean exceptionViewFlag;
	private boolean exceptionFlag;
	
	
	/**
	 * @param itemType
	 * @param item
	 */
	public MockRepository(String itemType, List<RepositoryItem> item) {
		items.put(itemType, item);
	}
	
	/**
	 * @param items
	 */
	public MockRepository(Map<String, List<RepositoryItem>> items) {
		this.items = items;
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getDefaultViewName()
	 */
	@Override
	public String getDefaultViewName() {
		return null;
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getItem(java.lang.String)
	 */
	@Override
	public RepositoryItem getItem(String arg0) throws RepositoryException {
		if (this.exceptionFlag) {
			throw new RepositoryException();
		}
		Collection<List<RepositoryItem>> itemColelction =  items.values();
		Iterator<List<RepositoryItem>> it = itemColelction.iterator();
		while (it.hasNext()) {
			List<RepositoryItem> itemList = it.next();
			for (RepositoryItem item : itemList) {
				if (arg0.equalsIgnoreCase(item.getRepositoryId())) {
					return item;
				}
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getItem(java.lang.String, java.lang.String)
	 */
	@Override
	public RepositoryItem getItem(String arg0, String arg1) throws RepositoryException {
		if (this.exceptionFlag) {
			throw new RepositoryException();
		}
		List<RepositoryItem> itemList = items.get(arg1);
		if (itemList ==  null) {
			return null;
		}
		for (RepositoryItem item : itemList) {
			if (arg0.equalsIgnoreCase(item.getRepositoryId())) {
				return item;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getItemDescriptor(java.lang.String)
	 */
	@Override
	public RepositoryItemDescriptor getItemDescriptor(String arg0) throws RepositoryException {
		return null;
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getItemDescriptor(atg.repository.RepositoryItemDescriptor)
	 */
	@Override
	public RepositoryItemDescriptor getItemDescriptor(RepositoryItemDescriptor arg0) throws RepositoryException {
		return null;
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getItemDescriptorNames()
	 */
	@Override
	public String[] getItemDescriptorNames() {
		return (String[]) Collections.emptyList().toArray();
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getItems(java.lang.String[])
	 */
	@Override
	public RepositoryItem[] getItems(String[] arg0) throws RepositoryException {
		return (RepositoryItem[]) Collections.emptyList().toArray();
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getItems(java.lang.String[], java.lang.String)
	 */
	@Override
	public RepositoryItem[] getItems(String[] arg0, String arg1) throws RepositoryException {
		return (RepositoryItem[]) Collections.emptyList().toArray();
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getRepositoryName()
	 */
	@Override
	public String getRepositoryName() {
		return null;
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getView(java.lang.String)
	 */
	@Override
	public RepositoryView getView(String arg0) throws RepositoryException {
		if (this.exceptionViewFlag) {
			throw new RepositoryException();
		}
		return new MockRepositoryView(items.get(arg0), exceptionViewFlag);
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getView(atg.repository.RepositoryItemDescriptor)
	 */
	@Override
	public RepositoryView getView(RepositoryItemDescriptor arg0) throws RepositoryException {
		return null;
	}

	/* (non-Javadoc)
	 * @see atg.repository.Repository#getViewNames()
	 */
	@Override
	public String[] getViewNames() {
		return (String[]) Collections.emptyList().toArray();
	}
	
	public void setExceptionFlag(boolean flag) {
		this.exceptionFlag = flag;
	}
	
	public void setViewExceptionFlag(boolean flag) {
		this.exceptionViewFlag = flag;
	}

}
