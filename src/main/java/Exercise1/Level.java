package Exercise1;

public enum Level {
    LOW {
        public String getColor() {
            return "GREEN";
        }
    },
    MEDIUM {
        public String getColor() {
            return "YELLOW";
        }
    },
    HIGH {
        public String getColor() {
            return "RED";
        }
    };

    public abstract String getColor();
}
