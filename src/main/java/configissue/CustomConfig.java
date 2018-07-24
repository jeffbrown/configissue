package configissue;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.http.MediaType;

import java.util.Collections;
import java.util.List;

@EachProperty("micronaut.codec")
public class CustomConfig {

    protected List<MediaType> additionalTypes = Collections.emptyList();

    public List<MediaType> getAdditionalTypes() {
        return additionalTypes;
    }

}
