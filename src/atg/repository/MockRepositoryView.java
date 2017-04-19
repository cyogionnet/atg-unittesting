/**
 * 
 */
package atg.repository;

import java.util.List;

/**
 * @author Yogendra Chauhan
 *
 */
public class MockRepositoryView implements ParameterSupportView {
	
	List<RepositoryItem> items;
	boolean exceptionFlag;

	/**
	 * @param items
	 */
	public MockRepositoryView (List<RepositoryItem> items, boolean exceptionFlag) {
		this.items = items;
		this.exceptionFlag = exceptionFlag;
	}

	@Override
	public String getViewName() {
		return null;
	}


	@Override
	public RepositoryItemDescriptor getItemDescriptor() throws RepositoryException {
		return null;
	}


	@Override
	public QueryBuilder getQueryBuilder() {
		return new MockQueryBuilder(this);
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery) throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, SortDirectives paramSortDirectives) throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, int paramInt) throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, int paramInt, SortDirectives paramSortDirectives) throws RepositoryException {
		return returnRepositoryItemArray();
	}

	
	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, int paramInt1, int paramInt2) throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, int paramInt1, int paramInt2, SortDirectives paramSortDirectives)
			throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, QueryOptions paramQueryOptions) throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public int executeCountQuery(Query paramQuery) throws RepositoryException {
		return 0;
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, Object[] paramArrayOfObject) throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, SortDirectives paramSortDirectives, Object[] paramArrayOfObject)
			throws RepositoryException {
		return returnRepositoryItemArray();
	}

	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, int paramInt, Object[] paramArrayOfObject) throws RepositoryException {
		return returnRepositoryItemArray();
	}

	
	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, int paramInt, SortDirectives paramSortDirectives, Object[] paramArrayOfObject)
			throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, int paramInt1, int paramInt2, Object[] paramArrayOfObject) throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, int paramInt1, int paramInt2, SortDirectives paramSortDirectives,
			Object[] paramArrayOfObject) throws RepositoryException {
		return returnRepositoryItemArray();
	}


	@Override
	public RepositoryItem[] executeQuery(Query paramQuery, QueryOptions paramQueryOptions, Object[] paramArrayOfObject) throws RepositoryException {
		return returnRepositoryItemArray();
	}
	
	private RepositoryItem[] returnRepositoryItemArray() throws RepositoryException {
		if (this.exceptionFlag) {
			throw new RepositoryException();
		}
		RepositoryItem[] itemArray = new RepositoryItem[1];
		itemArray[0] = items.get(0);
		return itemArray;
	}


	@Override
	public int executeCountQuery(Query paramQuery, Object[] paramArrayOfObject) throws RepositoryException {
		return 0;
	}

}
