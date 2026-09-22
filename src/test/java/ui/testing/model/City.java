package ui.testing.model;

public enum City {

    DELHI("Delhi", State.NCR),
    NOIDA("Noida", State.NCR),
    GURGAON("Gurgaon", State.NCR),

    LUCKNOW("Lucknow", State.UTTAR_PRADESH),
    AGRA("Agra", State.UTTAR_PRADESH),
    MERRUT("Merrut", State.UTTAR_PRADESH),

    FARIDABAD("Faridabad", State.HARYANA),
    PANIPAT("Paanipat", State.HARYANA),

    JAIPUR("Jaipur", State.RAJASTHAN),
    UDAIPUR("Udaipur", State.RAJASTHAN);

    private final String displayName;
    private final State state;

    City(String displayName, State state) {
        this.displayName = displayName;
        this.state = state;
    }

    public String getDisplayName() {
        return displayName;
    }

    public State getState() {
        return state;
    }
}
