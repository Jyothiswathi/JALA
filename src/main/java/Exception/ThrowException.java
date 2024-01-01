package Exception;

public class ThrowException {
	
	public void throwException() throws Exception
	{
		throw new Exception("throw exception");
	}
public static void main(String[] args) throws Exception {
	ThrowException ThrowException=new ThrowException();
	ThrowException.throwException();
}
}
