
import java.util.Comparator;

public class KeywordComparator implements Comparator<Keyword>{//�M�wo1�����Y �Mo2��� o1��
	@Override
	public int compare(Keyword o1, Keyword o2){
		if(o1==null || o2==null) throw new NullPointerException();
		//count �Ȥp����e��(�ܦ���)  min heap [count �Ȥj����e��(�ܦ���) max heap]
		if(o1.count<o2.count){ 
			return -1;
		}else if(o1.count>o2.count){
			return 1;
		}
		return 0;
	}
}
