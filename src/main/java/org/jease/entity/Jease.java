/*
 * This file is generated by jOOQ.
 */
package org.jease.entity;


import org.jease.entity.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Jease extends SchemaImpl {

    private static final long serialVersionUID = 939812290;

    /**
     * The reference instance of <code>jease</code>
     */
    public static final Jease JEASE = new Jease();

    /**
     * The table <code>jease.content</code>.
     */
    public final Content CONTENT = org.jease.entity.tables.Content.CONTENT;

    /**
     * The table <code>jease.linkcheck</code>.
     */
    public final Linkcheck LINKCHECK = org.jease.entity.tables.Linkcheck.LINKCHECK;

    /**
     * The table <code>jease.parameter</code>.
     */
    public final Parameter PARAMETER = org.jease.entity.tables.Parameter.PARAMETER;

    /**
     * The table <code>jease.redirect</code>.
     */
    public final Redirect REDIRECT = org.jease.entity.tables.Redirect.REDIRECT;

    /**
     * The table <code>jease.role</code>.
     */
    public final Role ROLE = org.jease.entity.tables.Role.ROLE;

    /**
     * The table <code>jease.sequence</code>.
     */
    public final Sequence SEQUENCE = org.jease.entity.tables.Sequence.SEQUENCE;

    /**
     * The table <code>jease.users</code>.
     */
    public final Users USERS = org.jease.entity.tables.Users.USERS;

    /**
     * The table <code>jease.version</code>.
     */
    public final Version VERSION = org.jease.entity.tables.Version.VERSION;

    /**
     * No further instances allowed
     */
    private Jease() {
        super("jease", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Content.CONTENT,
            Linkcheck.LINKCHECK,
            Parameter.PARAMETER,
            Redirect.REDIRECT,
            Role.ROLE,
            Sequence.SEQUENCE,
            Users.USERS,
            Version.VERSION);
    }
}
