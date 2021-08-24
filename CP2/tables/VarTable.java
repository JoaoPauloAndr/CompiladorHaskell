package tables;

import java.util.*;

import typing.Type;

public final class VarTable {

    private Hashtable<String, Entry> hashtable = new Hashtable<String, Entry>();

    public Void addVar(String s, int line, Type type) {
		Entry entry = new Entry(line, type);
        this.hashtable.put(s, entry);
		return null;
	}

    public boolean lookUpVar(String s) {
        Entry var = new Entry(this.hashtable.get(s));
        if (var != null){
            return true;
        }else{
            //Entry no_entry = new Entry(-1, -1);    
            return false;
        }
    }

    public int getLine(String s) {
        Entry var = new Entry(this.hashtable.get(s));
        if (var != null){
            return var.line;
        }else{
            return -1;
        }
    }

    public Type getType(String s) {
        Entry var = new Entry(this.hashtable.get(s));
        if (var != null){
            return var.type;
        }else{
            return NO_TYPE;
        }
    }

    public String toString() {
        System.out.println("Tabela de variáveis:\n" + this.hashtable.toString());
    }

    private final class Entry {
		int line;
		Type type;
		
		Entry(int line, Type type) {
			this.line = line;
			this.type = type;
		}
	}
}

