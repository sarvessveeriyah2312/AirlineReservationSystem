package modelClass;

/**
 * Name: Sarvess S/O Veeriyah Matrix No: CB20146 Section: 03 | 03B
 */
public class Pilot extends User {

    private String licenseId;
    private RankingEnum ranking;

    public Pilot(String licenseId, RankingEnum ranking, int age, String name, String icNo, String phoneNo, String email, GenderEnum gender) {
        super(age, name, icNo, phoneNo, email, gender);
        this.licenseId = licenseId;
        this.ranking = ranking;
    }

    public Pilot() {
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public RankingEnum getRanking() {
        return ranking;
    }

    public void setRanking(RankingEnum ranking) {
        this.ranking = ranking;
    }

    @Override
    public String generateId() {
        String idGenerated = "PI" + super.generateRandomNumber();
        super.setId(idGenerated);

        return idGenerated;
    }

    @Override
    public String getUserType() {
        return "Pilot";
    }

}
