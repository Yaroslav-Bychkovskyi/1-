package com.github.ybychkovskyi.springstart;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "hobby")
public class Hobby implements Serializable {

  private String hobbyId;

  @Id
  @Column(name = "HOBBY_ID")

  public String getHobbyId() {
    return this.hobbyId;
  }

  public void setHobbyId(String hobbyId) {
    this.hobbyId = hobbyId;
  }

  public String toString() {
    return "Hobby :" + getHobbyId();
  }

  private Set<Contact> contacts = new HashSet<Contact>();

  @ManyToMany
  @JoinTable(name = "contact_hobby_detail",
    joinColumns = @JoinColumn(name = "HOBBY_ID"),
    inverseJoinColumns = @JoinColumn(name = "CONTACT_ID"))

  public Set<Contact> getContacts(){
    return this.contacts;
  }

  public void setContacts(Set<Contact> contacts){
    this.contacts = contacts;
  }
}
