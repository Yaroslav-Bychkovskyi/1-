package com.github.ybychkovskyi.springstart;


import static javax.persistence.GenerationType.IDENTITY;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "contact")
public class Contact implements Serializable {
  private Long id;
  private int version;
  private String firstName;
  private String lastName;
  private Date birthDate;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id")
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Version
  @Column(name = "version")
  public int getVersion() {
    return this.version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  @Column(name = "FIRST_NAME")
  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Column(name = "LAST_NAME")
  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Temporal(TemporalType.DATE)
  @Column(name = "BIRTH_DATE")
  public Date getBirthDate() {
    return this.birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public String toString() {
    return "Contact - Id: " + id + ", First name: " + firstName
      + ", Last name: " + lastName + ", Birthday: " + birthDate;
  }

  private Set<ContactTelDetail> contactTelDetails = new HashSet<ContactTelDetail>();

  @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<ContactTelDetail> getContactTelDetails() {
    return this.contactTelDetails;
  }

  public void setContactTelDetails(Set<ContactTelDetail> contactTelDetails) {
    this.contactTelDetails = contactTelDetails;
  }

  public void addContactDetail(ContactTelDetail contactTelDetail) {
    contactTelDetail.setContact(this);
    getContactTelDetails().add(contactTelDetail);
  }

  public void removeContactTelDetail(ContactTelDetail contactTelDetail) {
    getContactTelDetails().remove(contactTelDetail);
  }

  private Set<Hobby> hobbies = new HashSet<Hobby>();

  @ManyToMany
  @JoinTable(name = "contact_hobby_detail",
    joinColumns = @JoinColumn(name = "CONTACT_ID"),
    inverseJoinColumns = @JoinColumn(name = "HOBBY_ID"))

  public Set<Hobby> getHobbies() {
    return this.hobbies;
  }

  public void setHobbies(Set<Hobby> hobbies) {
    this.hobbies = hobbies;
  }
}


