package configissue;

import io.micronaut.codec.CodecConfiguration;
import io.micronaut.context.annotation.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Context
public class SomeBean {

    Logger log = LoggerFactory.getLogger(SomeBean.class);

    public SomeBean(@Named("json") CustomConfig customConfig,
                    @Named("json") CodecConfiguration codecConfiguration) {
        log.debug("CustomConfig.additionalTypes.size is " + customConfig.getAdditionalTypes().size());
        log.debug("CodecConfiguration.additionalTypes.size is " + codecConfiguration.getAdditionalTypes().size());
    }
}
