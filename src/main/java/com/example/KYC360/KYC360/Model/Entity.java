package com.example.KYC360.KYC360;

import java.sql.Date;
import java.util.List;

public class Entity implements IEntity{
    @Override
    public List<Address> setAddresses() {
        return null;
    }

    @Override
    public List<Date> setDates() {
        return null;
    }

    @Override
    public boolean setDeceased() {
        return false;
    }

    @Override
    public void setGender() {}

    @Override
    public void setId() {}

    @Override
    public void setNames() {}

    @Override
    public List<Address> getAddresses() {
        return null;
    }

    @Override
    public List<Date> getDates() {
        return null;
    }

    @Override
    public boolean getDeceased() {
        return false;
    }

    @Override
    public char getGender() {
        return 'c';
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public List<Name> getNames() {
        return null;
    }
}
