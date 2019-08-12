import java.util.LinkedList;
import java.util.List;

public class RecordStorage {

    private static RecordStorage instance;
    private List<Record> records = new LinkedList<Record>();

    private static RecordStorage getInstance() {
        return instance == null ? new RecordStorage() : instance;
    }

    public static void reset() {
        instance = new RecordStorage();
    }


}
