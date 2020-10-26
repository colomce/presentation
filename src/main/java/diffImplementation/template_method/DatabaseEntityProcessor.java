package diffImplementation.template_method;

public abstract class DatabaseEntityProcessor {

    public final void processEntity() {
        getEntityData();
        createEntity();
        validateEntity();
        persistEntity();
    }

    protected abstract void getEntityData();
    protected abstract void createEntity();
    protected abstract void validateEntity();
    protected abstract void persistEntity();

}

