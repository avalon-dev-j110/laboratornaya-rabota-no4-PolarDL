package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;

public class PersonImpl implements Person{
    private String name;
    private LocalDate birthDate;
    
    public PersonImpl(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        PersonImpl personImpl = (PersonImpl) o;
        
        if (name.compareTo(personImpl.name) < 0) {
            return -1;
        } else if (name.compareTo(personImpl.name) > 0) {
            return 1;
        } else if (birthDate.isBefore(personImpl.birthDate)) {
            return  1;
        } else if (birthDate.isAfter(personImpl.birthDate)) {
            return -1;
        }
        else return 0;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return name + " " + birthDate;
    }
}
