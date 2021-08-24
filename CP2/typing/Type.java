package typing;

public enum Type {
    NUM_TYPE {
        public String toString() {
            return "num";
        }
    },
    FRACTIONAL_TYPE {
        public String toString() {
            return "fractional";
        }
    },
    CHAR_TYPE {
        public String toString() {
            return "char";
        }
    },
    STRING_TYPE {
        public String toString() {
            return "string";
        }
    },
    BOOL_TYPE {
        public String toString() {
            return "bool";
        }
    },
    NO_TYPE {
        public String toString() {
            return "no_type";
        }
    };

    private static Type arithmetic[][] = {
        {NUM_TYPE, FRACTIONAL_TYPE, NO_TYPE, NO_TYPE, NO_TYPE},
        {FRACTIONAL_TYPE, FRACTIONAL_TYPE, NO_TYPE, NO_TYPE, NO_TYPE},
        {NO_TYPE, NO_TYPE, NO_TYPE, NO_TYPE, NO_TYPE},
        {NO_TYPE, NO_TYPE, NO_TYPE, NO_TYPE, NO_TYPE},
        {NO_TYPE, NO_TYPE, NO_TYPE, NO_TYPE, NO_TYPE},
    };

    public Type unifyArithmetic(Type that) {
		return plus[this.ordinal()][that.ordinal()];
	}

    private static Type comp[][] = {
        {BOOL_TYPE, BOOL_TYPE, NO_TYPE, NO_TYPE, NO_TYPE},
        {BOOL_TYPE, BOOL_TYPE, NO_TYPE, NO_TYPE, NO_TYPE},
        {NO_TYPE, NO_TYPE, BOOL_TYPE, NO_TYPE, NO_TYPE},
        {NO_TYPE, NO_TYPE, NO_TYPE, BOOL_TYPE, NO_TYPE},
        {NO_TYPE, NO_TYPE, NO_TYPE, NO_TYPE, BOOL_TYPE},
    };

    public Type unifyComp(Type that) {
		return plus[this.ordinal()][that.ordinal()];
	}
}




