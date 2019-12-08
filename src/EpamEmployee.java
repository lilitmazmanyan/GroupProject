public class EpamEmployee {
    private String fullName;
    private String hometown;
    private String topSkills;
    private String favoritePhrase;
    private String university;
    private String lecturingSubject;
    private String workingInEpam;
    private String birthday;

    public EpamEmployee(String fullName, String hometown, String topSkills, String favoritePhrase, String university, String lecturingSubject, String workingInEpam, String birthday) {
        this.fullName = fullName;
        this.hometown = hometown;
        this.topSkills = topSkills;
        this.favoritePhrase = favoritePhrase;
        this.university = university;
        this.lecturingSubject = lecturingSubject;
        this.workingInEpam = workingInEpam;
        this.birthday = birthday;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getWorkingInEpam() {
        return workingInEpam;
    }

    public void setWorkingInEpam(String workingInEpam) {
        this.workingInEpam = workingInEpam;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public String getTopSkills() {
        return topSkills;
    }

    public void setTopSkills(String topSkills) {
        this.topSkills = topSkills;
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
