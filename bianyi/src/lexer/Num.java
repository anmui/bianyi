package lexer;
//得到tag对应的值
public class Num extends Token{
	public final int value;
	public Num(int v)
	{
		super(Tag.NUM);
			value=v;
	}
	public String toString()
	{
		return ""+value;
	}
}
