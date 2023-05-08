package sg.edu.np.mad.madpractical;

public class UserTest {
    public String Name;
    public String Description;
    public int Id;
    public static boolean Followed;

    public UserTest(String name, String description, int id, boolean followed) {
        Name = name;
        Description = description;
        Id = id;
        Followed = followed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public static boolean isFollowed() {
        return Followed;
    }

    public static void setFollowed(boolean followed) {
        Followed = followed;
    }
}
