/**
 * 
 */
package atg.commerce.pricing.priceLists;

import atg.repository.RepositoryItem;

/**
 * @author Yogendra Chauhan
 *
 */
public class MockPriceListManager extends PriceListManager {
	
	private RepositoryItem mockPrice;
	private boolean exceptionFlag;
	
	/**
	 * @param mockPrice
	 */
	public MockPriceListManager(RepositoryItem mockPrice) {
		this.mockPrice = mockPrice;
	}
	
	/**
	 * @param mockPrice
	 * @param exceptionFlag
	 */
	public MockPriceListManager(RepositoryItem mockPrice, boolean exceptionFlag) {
		this.mockPrice = mockPrice;
		this.exceptionFlag = exceptionFlag;
	}
	
	@Override
	public RepositoryItem getPrice(String priceList, String product, String sku) throws PriceListException {
		if (exceptionFlag) {
			throw new PriceListException();
		}
		return mockPrice;
	}
	
	public void setExceptionFlag(boolean exceptionFlag) {
		this.exceptionFlag = exceptionFlag;
	}
}
