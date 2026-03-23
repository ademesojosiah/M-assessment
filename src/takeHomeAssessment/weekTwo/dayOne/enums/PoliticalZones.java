package takeHomeAssessment.weekTwo.dayOne.enums;

public enum PoliticalZones {
    NORTH_CENTRAL("North Central",new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTH_EAST("North East", new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_WEST("North West", new String[]{"Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTH_EAST("South East", new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH("South South", new String[]{"Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST("South West", new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"});
    private String name;
    private String[] states;

    PoliticalZones(String name, String[] states) {
        this.name = name;
        this.states = states;
    }

    public String getName() {
        return name;
    }

    public String[] getStates() {
        return states;
    }

    public static String getGeoPoliticalZone(String stateName) {
        for(PoliticalZones politicalZone : PoliticalZones.values()) {
            for(String state : politicalZone.states) {
                if(state.equalsIgnoreCase(stateName)) {
                    return politicalZone.getName();
                }
            }
        }
        return null;
    }
}
