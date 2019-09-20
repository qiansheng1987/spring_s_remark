package test.qs;

/**
 * 描述:<p></p>
 *
 * @author sheng.qian01@ucarinc.com
 * @version V1.0
 * @date 2019/9/18 10:39
 */
public class DaoImpl implements Dao{

	@Override
	public void select() {
		System.out.println("Enter DaoImpl.select()");
	}

	@Override
	public void insert() {
		System.out.println("Enter DaoImpl.insert()");
	}
}
