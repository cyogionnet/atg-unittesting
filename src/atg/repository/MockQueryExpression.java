/**
 * 
 */
package atg.repository;

/**
 * @author Yogendra Chauhan
 *
 */
public class MockQueryExpression implements QueryExpression {

	/* (non-Javadoc)
	 * @see atg.repository.QueryExpression#getQueryOperation()
	 */
	@Override
	public String getQueryOperation() {
		return "";
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryExpression#getQueryRepresentation()
	 */
	@Override
	public String getQueryRepresentation() {
		return "";
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryExpression#isNoop()
	 */
	@Override
	public boolean isNoop() {
		return false;
	}

	/* (non-Javadoc)
	 * @see atg.repository.QueryExpression#setNoop(boolean)
	 */
	@Override
	public void setNoop(boolean paramBoolean) {

	}

}
