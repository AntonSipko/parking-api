package telran.parking.dto;

public enum FineStatus {
	PAID("Fine is paid", 1),
    UNPAID("Fine unpaid", 2),
    CANCELED("Fine was canceled", 3);

    private final String description;
    private final int code;

    FineStatus(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "PaymentStatus{" +
                "description='" + description + '\'' +
                ", code=" + code +
                '}';
    }
	

}
