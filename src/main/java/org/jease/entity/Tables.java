/*
 * This file is generated by jOOQ.
 */
package org.jease.entity;


import org.jease.entity.tables.*;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in jease
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>jease.content</code>.
     */
    public static final Content CONTENT = org.jease.entity.tables.Content.CONTENT;

    /**
     * The table <code>jease.linkcheck</code>.
     */
    public static final Linkcheck LINKCHECK = org.jease.entity.tables.Linkcheck.LINKCHECK;

    /**
     * The table <code>jease.parameter</code>.
     */
    public static final Parameter PARAMETER = org.jease.entity.tables.Parameter.PARAMETER;

    /**
     * The table <code>jease.redirect</code>.
     */
    public static final Redirect REDIRECT = org.jease.entity.tables.Redirect.REDIRECT;

    /**
     * The table <code>jease.role</code>.
     */
    public static final Role ROLE = org.jease.entity.tables.Role.ROLE;

    /**
     * The table <code>jease.sequence</code>.
     */
    public static final Sequence SEQUENCE = org.jease.entity.tables.Sequence.SEQUENCE;

    /**
     * The table <code>jease.users</code>.
     */
    public static final Users USERS = org.jease.entity.tables.Users.USERS;

    /**
     * The table <code>jease.version</code>.
     */
    public static final Version VERSION = org.jease.entity.tables.Version.VERSION;
}
