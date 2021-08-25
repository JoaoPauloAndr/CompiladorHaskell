package tables;

import java.util.Hashtable;
import java.util.Formatter;

public final class StrTable {

    private Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
    
    public int addStr(String s) {
        this.hashtable.put(this.hashtable.size(),s);
        return this.hashtable.size();
    }

    //@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
		Formatter f = new Formatter(sb);
		f.format("Strings table:\n");
        for (int i = 0; i < this.hashtable.size(); i++) {
			f.format("Entry %d -- %s\n", i, this.hashtable.get(i));
		}
        f.close();
		return sb.toString();
    }
}