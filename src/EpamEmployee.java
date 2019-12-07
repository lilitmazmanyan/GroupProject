public class EpamEmployee {
    private String fullName;
    private String hometown;
    private String skills;
    private String favoritePhrase;
    private String lecturingSubject;

    public EpamEmployee(String fullName, String hometown, String skills, String favoritePhrase, String lecturingSubject) {
        this.fullName = fullName;
        this.hometown = hometown;
        this.skills = skills;
        this.favoritePhrase = favoritePhrase;
        this.lecturingSubject = lecturingSubject;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getFavoritePhrase() {
        return favoritePhrase;
    }

    public void setFavoritePhrase(String favoritePhrase) {
        this.favoritePhrase = favoritePhrase;
    }

    public String getLecturingSubject() {
        return lecturingSubject;
    }

    public void setLecturingSubject(String lecturingSubject) {
        this.lecturingSubject = lecturingSubject;
    }
}
