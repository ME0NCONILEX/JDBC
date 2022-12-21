package se.me0nly.model;

public class City {
    private  int ID;
    private  String Name;
    private  String CountryCode;
    private String District;
    private String Population;

    public City(int ID, String name, String countryCode, String district, String population) {
        this.ID = ID;
        Name = name;
        CountryCode = countryCode;
        District = district;
        Population = population;
    }

    public City(String name, String countryCode, String district, String population) {
        Name = name;
        CountryCode = countryCode;
        District = district;
        Population = population;
    }

    public City(String name, String countryCode, String population) {
        Name = name;
        CountryCode = countryCode;
        Population = population;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getDistrict() {
        return District;
    }

    public String getPopulation() {
        return Population;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public void setPopulation(String population) {
        Population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Population='" + Population + '\'' +
                '}';
    }
}
