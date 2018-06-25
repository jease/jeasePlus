/*
 * This file is generated by jOOQ.
 */
package org.jease.entity.tables;


import org.jease.entity.Indexes;
import org.jease.entity.Jease;
import org.jease.entity.Keys;
import org.jease.entity.tables.records.RedirectRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Date;
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
public class Redirect extends TableImpl<RedirectRecord> {

    private static final long serialVersionUID = -1428191546;

    /**
     * The reference instance of <code>jease.redirect</code>
     */
    public static final Redirect REDIRECT = new Redirect();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RedirectRecord> getRecordType() {
        return RedirectRecord.class;
    }

    /**
     * The column <code>jease.redirect.id</code>.
     */
    public final TableField<RedirectRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jease.redirect.source</code>.
     */
    public final TableField<RedirectRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jease.redirect.target</code>.
     */
    public final TableField<RedirectRecord, String> TARGET = createField("target", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jease.redirect.timestamp</code>.
     */
    public final TableField<RedirectRecord, Date> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>jease.redirect.pattern</code>.
     */
    public final TableField<RedirectRecord, String> PATTERN = createField("pattern", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>jease.redirect</code> table reference
     */
    public Redirect() {
        this(DSL.name("redirect"), null);
    }

    /**
     * Create an aliased <code>jease.redirect</code> table reference
     */
    public Redirect(String alias) {
        this(DSL.name(alias), REDIRECT);
    }

    /**
     * Create an aliased <code>jease.redirect</code> table reference
     */
    public Redirect(Name alias) {
        this(alias, REDIRECT);
    }

    private Redirect(Name alias, Table<RedirectRecord> aliased) {
        this(alias, aliased, null);
    }

    private Redirect(Name alias, Table<RedirectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Redirect(Table<O> child, ForeignKey<O, RedirectRecord> key) {
        super(child, key, REDIRECT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jease.JEASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.REDIRECT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RedirectRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REDIRECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RedirectRecord> getPrimaryKey() {
        return Keys.KEY_REDIRECT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RedirectRecord>> getKeys() {
        return Arrays.<UniqueKey<RedirectRecord>>asList(Keys.KEY_REDIRECT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Redirect as(String alias) {
        return new Redirect(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Redirect as(Name alias) {
        return new Redirect(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Redirect rename(String name) {
        return new Redirect(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Redirect rename(Name name) {
        return new Redirect(name, null);
    }
}
