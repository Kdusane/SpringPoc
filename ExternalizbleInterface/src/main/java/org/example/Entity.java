package org.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Entity implements Externalizable {
    private int id;
    private String name;
    private String lastname;
    private String emailid;
    private long phoneno;

    public Entity() {
    }

    public Entity(int id, String name, String lastname, String emailid, long phoneno) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.emailid = emailid;
        this.phoneno = phoneno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    @Override
    public String toString() {
        return "entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", emailid='" + emailid + '\'' +
                ", phoneno=" + phoneno +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
                out.writeObject(name);
                out.writeObject(emailid);
                out.writeInt(id);
                out.writeLong(phoneno);
        System.out.println("write externalizable is called ");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        emailid = (String) in.readObject();
        id = in.readInt();
        phoneno = in.readLong();
        System.out.println("read external is called ");

    }
}
