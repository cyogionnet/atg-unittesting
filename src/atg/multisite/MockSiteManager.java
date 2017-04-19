package atg.multisite;

import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;

/**
 * @author Yogendra Chauhan
 *
 */
public class MockSiteManager extends SiteManager {
	
	RepositoryItem siteItem;
	boolean exceptionFlag;
	
	/**
	 * @param siteItem
	 */
	public MockSiteManager(RepositoryItem siteItem) {
		this.siteItem = siteItem;
	}
	
	/**
	 * @param siteItem
	 * @param exceptionFlag
	 */
	public MockSiteManager(RepositoryItem siteItem, boolean exceptionFlag) {
		this.siteItem = siteItem;
		this.exceptionFlag = exceptionFlag;
	}
	
	@Override
	public RepositoryItem getSite(String siteId) throws RepositoryException {
		if (exceptionFlag) {
			throw new RepositoryException();
		}
		return siteItem;
	}
	
	public void setExceptionFlag(boolean exceptionFlag) {
		this.exceptionFlag = exceptionFlag;		
	}

}
