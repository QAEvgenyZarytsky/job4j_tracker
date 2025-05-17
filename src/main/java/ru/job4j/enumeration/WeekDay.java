package ru.job4j.enumeration;

public enum WeekDay {
    MONDAY("1day") {
        private String message = "11111";
        public String getMessage() {
            return message;
        }
    },
    TUESDAY("2day") {
        private String message = "22222";
        public String getMessage() {
            return message;
        }
    },
    WEDNESDAY("3day") {
        private String message = "33333";
        public String getMessage() {
            return message;
        }
    },
    THURSDAY("4day") {
        private String message = "44444";
        public String getMessage() {
            return message;
        }
    },
    FRIDAY("5day") {
        private String message = "55555";
        public String getMessage() {
            return message;
        }
    },
    SATURDAY("6day") {
        private String message = "66666";
        public String getMessage() {
            return message;
        }
    },
    SUNDAY("7day") {
        private String message = "77777";
        public String getMessage() {
            return message;
        }
    };

    private String info;

    WeekDay(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public abstract String getMessage();
}
