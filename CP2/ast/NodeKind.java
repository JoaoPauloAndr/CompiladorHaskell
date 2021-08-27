package ast;

public enum NodeKind {
    ASSIGN_NODE {
		public String toString() {
            return "=";
        }
	},
    EQUAL_NODE { //visitVarsym_no_minus token getSymbol == '==' 
		public String toString() {
            return "==";
        }
	},
    IF_NODE {
		public String toString() {
            return "if";
        }
	},
    INT_VAL_NODE {
		public String toString() {
            return "";
        }
	},
    LT_NODE {
		public String toString() {
            return "<";
        }
	},
    MINUS_NODE {
		public String toString() {
            return "-";
        }
	},
    OVER_NODE {
		public String toString() {
            return "/";
        }
	},
    TIMES_NODE {
		public String toString() {
            return "*";
        }
	},
    PLUS_NODE {
		public String toString() {
            return "+";
        }
	},
    READ_NODE {
		public String toString() {
            return "read";
        }
	},
    FRAC_VAL_NODE {
		public String toString() {
            return "";
        }
	},
    STR_VAL_NODE {
		public String toString() {
            return "";
        }
	},
    //Conversao de tipos
    I2F_NODE {
		public String toString() {
            return "I2F";
        }
	},
    I2S_NODE {
		public String toString() {
            return "I2S";
        }
	},
    F2S_NODE {
		public String toString() {
            return "R2S";
        }
	},
    F2I_NODE {
		public String toString() {
            return "R2S";
        }
	},
    B2S_NODE {
		public String toString() {
            return "R2S";
        }
	};
}