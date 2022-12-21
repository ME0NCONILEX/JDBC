package se.me0nly.model;

import se.me0nly.CityInterface.CityDao;

import java.util.List;
import java.util.ArrayList;


public class CityDaoJDBC implements CityDao {

    private List <City> cityStorage;
    private static CityDaoJDBC instance;

    public  CityDaoJDBC() {
        cityStorage = new ArrayList<>();
    }
    public static CityDaoJDBC getInstance() {
        if (instance == null) instance = new CityDaoJDBC();
        return instance;
    }
    @Override
    public City findById(Integer ID) {
        if(ID == 0) throw new IllegalArgumentException("the id was null");
        for (City city: cityStorage) {
            if (city.getID()==(ID))return city;
        }

        return null;
    }
    @Override
    public List<City> findByCode(String code) {
        if(code == null) throw new IllegalArgumentException("the city code was null");
        for (City cityCod: cityStorage){
            if(cityCod.getCountryCode().equalsIgnoreCase(code))
                cityStorage.add(cityCod);
                return cityStorage;
        }
        return null;
    }
    @Override
    public List<City> findByName(String name) {
        if(name == null) throw new IllegalArgumentException("City name is null");
        for(City city: cityStorage){
            if(city.getName().equalsIgnoreCase(name))
                cityStorage.add(city);
                return cityStorage;
        }
        return  null;

    }

    @Override
    public List<City> findAll() {
        return new ArrayList<>(cityStorage);
    }
    @Override
    public City add(City city) {
        if(city != null) throw  new IllegalArgumentException("this city already exist");
        cityStorage.add(city);
        return city;

    }
    @Override
    public void update(City city) {
        if(city == null) throw new IllegalArgumentException("city data was null");
        for(City OriginalCity: cityStorage){
            if(OriginalCity.getID()==city.getID()){
                OriginalCity.setID(city.getID());
                OriginalCity.setName(city.getName());
                OriginalCity.setCountryCode(city.getCountryCode());
                OriginalCity.setDistrict(city.getDistrict());
                OriginalCity.setPopulation(city.getPopulation());
                break;
            }
        }
    }
    @Override
    public int delete(Integer ID) {
        if(ID==0) throw new IllegalArgumentException("the id not exist");
        cityStorage.remove(ID);
        return ID;

    }
}
