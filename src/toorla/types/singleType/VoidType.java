package toorla.types.singleType;

public class VoidType extends SingleType {
    @Override
    public String toString() {
        return "(VoidType)";
    }

    @Override
    public String toStringForError() { return "void"; }
}
