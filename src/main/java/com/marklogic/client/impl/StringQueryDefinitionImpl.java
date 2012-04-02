package com.marklogic.client.impl;

import com.marklogic.client.config.StringQueryDefinition;

/**
 * Created by IntelliJ IDEA.
 * User: ndw
 * Date: 3/14/12
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringQueryDefinitionImpl implements StringQueryDefinition {
    private String criteria = null;
    private String optionsUri = null;
    
    public StringQueryDefinitionImpl(String uri) {
        optionsUri = uri;
    }
    
    @Override
    public String getCriteria() {
        return criteria;
    }

    @Override
    public void setCriteria(String criteria) {
        // FIXME: check for null?
        this.criteria = criteria;
    }

    @Override
    public String getOptionsName() {
        return optionsUri;
    }

    @Override
    public void setOptionsName(String uri) {
        // FIXME: check for null?
        optionsUri = uri;
    }
}
