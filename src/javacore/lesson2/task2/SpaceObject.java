package javacore.lesson2.task2;

public abstract class SpaceObject {
    private final Double massObject;
    private final TypeObject typeObject;
    private final Double flightSpeed;
    private final String NameObject;

    public SpaceObject(Double massObject, TypeObject typeObject, Double flightSpeed, String NameObject) {
        this.massObject = massObject;
        this.typeObject = typeObject;
        this.flightSpeed = flightSpeed;
        this.NameObject = NameObject;
    }

    public Double diameterCalculate(){
        return ((massObject / 10) * typeObject.getRank());
    }

    public void massEquals(SpaceObject object){
        if(object.getMassObject()<massObject){
            System.out.println(NameObject + "имеет большую массу");
        }
        else if(object.getMassObject()>massObject){
            System.out.println(object.getNameObject() + "имеет большую массу");
        }
        else{
            System.out.println("массы равны");
        }
    }
    @Override
    abstract public String toString();

    @Override
    abstract public boolean equals(Object obj);

    public Double getMassObject() {
        return massObject;
    }
    public TypeObject getTypeObject() {
        return typeObject;
    }
    public Double getFlightSpeed() {
        return flightSpeed;
    }
    public String getNameObject() {
        return NameObject;
    }


}
