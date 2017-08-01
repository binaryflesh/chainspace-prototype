package uk.ac.ucl.cs.sec.chainspace.bft;

/**
 * Created by sheharbano on 12/07/2017.
 */
public class ObjectStatus {
    public static final String ACTIVE = "0";
    public static final String LOCKED = "1";
    public static final String INACTIVE = "2";

    public static int mapObjectToShard(String object) {
        // TODO: objects are not integers
        int iObject = Integer.parseInt(object);
        if(iObject%2 == 0)
            return 0;
        return 1;
    }
}