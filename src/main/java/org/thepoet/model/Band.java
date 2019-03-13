package org.thepoet.model;

import java.util.List;

/**
 * @author Oguzhan Dogan <dogan_oguzhan@hotmail.com>
 */
public class Band {
    private String name;
    private String country;
    private String foundedYear;
    private List<Member> members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(String foundedYear) {
        this.foundedYear = foundedYear;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
