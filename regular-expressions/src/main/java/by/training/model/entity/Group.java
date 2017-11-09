package by.training.model.entity;


public enum Group {
    FAMILY("Family"),
    FRIENDS("Friends");

    private String text;

    Group(String text) {
        this.text = text;
    }

    public static Group fromString(String text) {
        for (Group group : Group.values()) {
            if (group.text.equalsIgnoreCase(text)) {
                return group;
            }
        }
        return null;
    }
}
