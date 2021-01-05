import Resources.MotherBase;

public class AddNumberToUser implements Command{
    MotherBase base;

    public AddNumberToUser(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.AddNumberToUser();
    }
}
