package javacore.lesson2.task2.object;

public abstract class SpaceAbstract {
    private final Double massObject;
    private final TypeObject typeObject;
    private final String nameObject;
    private final Double size;

    public SpaceAbstract(Double massObject, TypeObject typeObject, String NameObject, Double size) {
        this.massObject = massObject;
        this.typeObject = typeObject;
        this.nameObject = NameObject;
        this.size = size;

    }

    public Double diameterCalculate() {
        return ((size / 10) * typeObject.getRank()) * 2;
    }

    public void massEquals(SpaceAbstract object) {
        if (object.getMassObject() < massObject) {
            System.out.println(getNameObject() + " имеет большую массу");
        } else if (object.getMassObject() > massObject) {
            System.out.println(object.getNameObject() + " имеет большую массу");
        } else {
            System.out.println(" массы равны");
        }
    }

    abstract public void description();

    @Override
    public String toString() {
        return String.format("Object Name: %s%nMass: %.2f kg%nType: %s%nSize: %.2f m^2",
                nameObject, massObject, typeObject, size); // Добавлено поле size
    }

    public Double getMassObject() {
        return massObject;
    }

    public TypeObject getTypeObject() {
        return typeObject;
    }

    public String getNameObject() {
        return nameObject;
    }

    public Double getSize() {
        return size;
    }

}
