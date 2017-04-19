/**
 * 
 */
package atg.repository;

/**
 * @author Yogendra Chauhan
 *
 */
public class MockQueryBuilder implements QueryBuilder {
	
	RepositoryView view;
	
	/**
	 * @param view
	 */
	public MockQueryBuilder(RepositoryView view) {
		this.view = view;
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#addContextMembershipFilters(atg.repository.Query, atg.repository.ContextFilteringRules)
	 */
	@Override
	public Query addContextMembershipFilters(Query arg0, ContextFilteringRules arg1) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createAndQuery(atg.repository.Query[])
	 */
	@Override
	public Query createAndQuery(Query[] arg0) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createComparisonQuery(atg.repository.QueryExpression, atg.repository.QueryExpression, int)
	 */
	@Override
	public Query createComparisonQuery(QueryExpression arg0, QueryExpression arg1, int arg2) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createConstantQueryExpression(java.lang.Object)
	 */
	@Override
	public QueryExpression createConstantQueryExpression(Object arg0) throws RepositoryException {
		return new MockQueryExpression();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createCountQueryExpression(atg.repository.QueryExpression)
	 */
	@Override
	public QueryExpression createCountQueryExpression(QueryExpression arg0) throws RepositoryException {
		return new MockQueryExpression();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createElementAtQueryExpression(atg.repository.QueryExpression, atg.repository.QueryExpression)
	 */
	@Override
	public QueryExpression createElementAtQueryExpression(QueryExpression arg0, QueryExpression arg1) throws RepositoryException {
		return new MockQueryExpression();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createIdMatchingQuery(java.lang.String[])
	 */
	@Override
	public Query createIdMatchingQuery(String[] arg0) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createIncludesAllQuery(atg.repository.QueryExpression, atg.repository.QueryExpression)
	 */
	@Override
	public Query createIncludesAllQuery(QueryExpression arg0, QueryExpression arg1) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createIncludesAnyQuery(atg.repository.QueryExpression, atg.repository.QueryExpression)
	 */
	@Override
	public Query createIncludesAnyQuery(QueryExpression arg0, QueryExpression arg1) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createIncludesItemQuery(atg.repository.QueryExpression, atg.repository.Query)
	 */
	@Override
	public Query createIncludesItemQuery(QueryExpression arg0, Query arg1) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createIncludesQuery(atg.repository.QueryExpression, atg.repository.QueryExpression)
	 */
	@Override
	public Query createIncludesQuery(QueryExpression arg0, QueryExpression arg1) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createIndexOfQueryExpression(atg.repository.QueryExpression, atg.repository.QueryExpression)
	 */
	@Override
	public QueryExpression createIndexOfQueryExpression(QueryExpression arg0, QueryExpression arg1) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createIsNullQuery(atg.repository.QueryExpression)
	 */
	@Override
	public Query createIsNullQuery(QueryExpression arg0) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createNotQuery(atg.repository.Query)
	 */
	@Override
	public Query createNotQuery(Query arg0) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createOrQuery(atg.repository.Query[])
	 */
	@Override
	public Query createOrQuery(Query[] arg0) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createPatternMatchQuery(atg.repository.QueryExpression, atg.repository.QueryExpression, int)
	 */
	@Override
	public Query createPatternMatchQuery(QueryExpression arg0, QueryExpression arg1, int arg2) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createPatternMatchQuery(atg.repository.QueryExpression, atg.repository.QueryExpression, int, boolean)
	 */
	@Override
	public Query createPatternMatchQuery(QueryExpression arg0, QueryExpression arg1, int arg2, boolean arg3) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createPropertyQueryExpression(java.lang.String)
	 */
	@Override
	public QueryExpression createPropertyQueryExpression(String arg0) throws RepositoryException {
		return new MockQueryExpression();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createPropertyQueryExpression(atg.repository.QueryExpression, java.lang.String)
	 */
	@Override
	public QueryExpression createPropertyQueryExpression(QueryExpression arg0, String arg1) throws RepositoryException {
		return new MockQueryExpression();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createReferencedByQuery(atg.repository.RepositoryPropertyDescriptor, atg.repository.Query)
	 */
	@Override
	public Query createReferencedByQuery(RepositoryPropertyDescriptor arg0, Query arg1) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createTextSearchQuery(atg.repository.QueryExpression, atg.repository.QueryExpression, atg.repository.QueryExpression)
	 */
	@Override
	public Query createTextSearchQuery(QueryExpression arg0, QueryExpression arg1, QueryExpression arg2) throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createTextSearchQuery(atg.repository.QueryExpression, atg.repository.QueryExpression, atg.repository.QueryExpression, atg.repository.QueryExpression)
	 */
	@Override
	public Query createTextSearchQuery(QueryExpression arg0, QueryExpression arg1, QueryExpression arg2, QueryExpression arg3)
			throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#createUnconstrainedQuery()
	 */
	@Override
	public Query createUnconstrainedQuery() throws RepositoryException {
		return new MockQuery();
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryBuilder#getRepositoryView()
	 */
	@Override
	public RepositoryView getRepositoryView() {
		// TODO Auto-generated method stub
		return view;
	}

}
