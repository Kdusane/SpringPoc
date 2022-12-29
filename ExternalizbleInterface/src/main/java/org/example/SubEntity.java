package org.example;

        import java.io.Externalizable;
        import java.io.IOException;
        import java.io.ObjectInput;
        import java.io.ObjectOutput;

public class SubEntity extends Entity implements Externalizable {
    private String rating;
    private String areaOfExpertise;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    @Override
    public String toString() {
        return "SubEntity{" +
                "rating='" + rating + '\'' +
                ", areaOfExpertise='" + areaOfExpertise + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        super.writeExternal(out);
        out.writeObject(rating);
        out.writeObject(areaOfExpertise);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.readExternal(in);
        rating = (String) in.readObject();
        areaOfExpertise = (String) in.readObject();
    }
}
