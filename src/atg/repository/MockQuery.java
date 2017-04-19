/**
 * 
 */
package atg.repository;

/**
 * @author Yogendra Chauhan
 *
 */
public class MockQuery implements Query {
	

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

	/* (non-Javadoc)
	 * @see atg.repository.Query#getQueryOperation()
	 */
	@Override
	public String getQueryOperation() {
		return "";
	}

	/* (non-Javadoc)
	 * @see atg.repository.Query#getQueryRepresentation()
	 */
	@Override
	public String getQueryRepresentation() {
		return "";
	}

}
