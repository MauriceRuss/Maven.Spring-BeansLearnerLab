package models;

import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{


    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }
    public void add(PersonType personType){
        this.personList.add(personType);
    }

    public void remove(PersonType personType){
        this.personList.remove(personType);
    }

    public int size(){
        return personList.size();
    }
    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> perTypeIterable){
        perTypeIterable.forEach(personList::add);
    }

    public PersonType findById(long id){
        for(PersonType p : personList){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }

}
