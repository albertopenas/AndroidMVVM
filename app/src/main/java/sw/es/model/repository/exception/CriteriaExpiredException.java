package sw.es.model.repository.exception;

/**
 * Created by albertopenasamor on 27/5/15.
 */
public class CriteriaExpiredException extends Exception {

    public CriteriaExpiredException(Class clazz) {
        super("Criteria expired: " + clazz.getSimpleName());
    }

}
