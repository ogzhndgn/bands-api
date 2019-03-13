package org.thepoet.service.impl;

import org.springframework.stereotype.Service;
import org.thepoet.model.Band;
import org.thepoet.model.Member;
import org.thepoet.service.spec.BandService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oguzhan Dogan <dogan_oguzhan@hotmail.com>
 */
@Service
public class BandServiceImpl implements BandService {
    @Override
    public List<Band> getBandList() {
        List<Band> bandList = new ArrayList<>();
        Band pos = new Band();
        pos.setName("Pain of Salvation");
        pos.setCountry("Sweden");
        pos.setFoundedYear("1991");
        List<Member> posMemberList = getPosMembers();

        pos.setMembers(posMemberList);
        bandList.add(pos);
        return bandList;
    }

    private List<Member> getPosMembers() {
        List<Member> posMemberList = new ArrayList<>();

        Member guitarVocal = new Member();
        guitarVocal.setName("Daniel Gildenlöw");
        guitarVocal.setInstrument("Guitar & Vocal");
        guitarVocal.setYearOfBirth(1973);
        posMemberList.add(guitarVocal);

        Member drummer = new Member();
        drummer.setName("Leo Margarit");
        drummer.setInstrument("Drums");
        drummer.setYearOfBirth(1981);
        posMemberList.add(drummer);

        Member guitarist = new Member();
        guitarist.setName("Johan Hallgren");
        guitarist.setInstrument("Guitar");
        guitarist.setYearOfBirth(1975);
        posMemberList.add(guitarist);
        return posMemberList;
    }
}