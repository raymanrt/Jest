package io.searchbox.indices;

import io.searchbox.AbstractAction;
import io.searchbox.Action;

/**
 * @author Dogukan Sonmez
 */


public class DeleteIndex extends AbstractAction implements Action {

    public DeleteIndex(String indexName) {
        super.indexName = indexName;
        setURI(buildURI(indexName, null, null));
        setRestMethodName("DELETE");
    }

    public DeleteIndex(String indexName, String type) {
        super.indexName = indexName;
        super.typeName = type;
        setURI(buildURI(indexName, type, null));
        setRestMethodName("DELETE");
    }
}
