package tables;

import java.util.Hashtable;
import java.util.Formatter;
import java.util.Enumeration;

import static typing.Type.NO_TYPE;
import typing.Type;

public final class VarTable {

    private Hashtable<String, Entry> hashtable = new Hashtable<String, Entry>();

    public Void addVar(String s, int line, Type type) {
		Entry entry = new Entry(line, type);
        this.hashtable.put(s, entry);
		return null;
	}

    public boolean lookUpVar(String s) {
        Entry var = this.hashtable.get(s);
        if (var != null){
            return true;
        }else{
            //Entry no_entry = new Entry(-1, -1);    
            return false;
        }
    }

    public int getLine(String s) {
        Entry var = this.hashtable.get(s);
        if (var != null){
            return var.line;
        }else{
            return -1;
        }
    }

    public Type getType(String s) {
        Entry var = this.hashtable.get(s);
        if (var != null){
            return var.type;
        }else{
            return NO_TYPE;
        }
    }

    public String toString() {
		StringBuilder sb      = new StringBuilder();
		Formatter f           = new Formatter(sb);
        Enumeration<String> e = this.hashtable.keys();
        int entry             = 0;
		f.format("Variables table:\n");
        while(e.hasMoreElements()){
            String nome = e.nextElement();
            f.format("Variavel %d -- Nome: %s, linha: %d, tipo: %s\n", entry, nome, getLine(nome), getType(nome).toString());
        }
		f.close();
		return sb.toString();
	}

    private final class Entry {
		int line;
		Type type;
		
		Entry(int line, Type type) {
			this.line = line;
			this.type = type;
		}
	}

    public int size(){
        return this.hashtable.size();
    }
}

