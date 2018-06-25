/*
 * This file is generated by jOOQ.
 */
package org.jease.entity.tables;


import org.jease.entity.Indexes;
import org.jease.entity.Jease;
import org.jease.entity.Keys;
import org.jease.entity.tables.records.ContentRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Date;
import java.sql.Timestamp;
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
public class Content extends TableImpl<ContentRecord> {

    private static final long serialVersionUID = 398478541;

    /**
     * The reference instance of <code>jease.content</code>
     */
    public static final Content CONTENT = new Content();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContentRecord> getRecordType() {
        return ContentRecord.class;
    }

    /**
     * The column <code>jease.content.id</code>.
     */
    public final TableField<ContentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jease.content.parentID</code>.
     */
    public final TableField<ContentRecord, Integer> PARENTID = createField("parentID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jease.content.title</code>.
     */
    public final TableField<ContentRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>jease.content.lastModified</code>.
     */
    public final TableField<ContentRecord, Timestamp> LASTMODIFIED = createField("lastModified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jease.content.creationDate</code>.
     */
    public final TableField<ContentRecord, Timestamp> CREATIONDATE = createField("creationDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>jease.content.visible</code>.
     */
    public final TableField<ContentRecord, Byte> VISIBLE = createField("visible", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>jease.content.editorID</code>.
     */
    public final TableField<ContentRecord, Integer> EDITORID = createField("editorID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jease.content.Access_login</code>.
     */
    public final TableField<ContentRecord, String> ACCESS_LOGIN = createField("Access_login", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jease.content.Access_password</code>.
     */
    public final TableField<ContentRecord, String> ACCESS_PASSWORD = createField("Access_password", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jease.content.Access_start</code>.
     */
    public final TableField<ContentRecord, Date> ACCESS_START = createField("Access_start", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>jease.content.Access_stop</code>.
     */
    public final TableField<ContentRecord, Date> ACCESS_STOP = createField("Access_stop", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>jease.content.Discussion_author</code>.
     */
    public final TableField<ContentRecord, String> DISCUSSION_AUTHOR = createField("Discussion_author", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jease.content.Discussion_comment</code>.
     */
    public final TableField<ContentRecord, String> DISCUSSION_COMMENT = createField("Discussion_comment", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jease.content.Document_text</code>.
     */
    public final TableField<ContentRecord, String> DOCUMENT_TEXT = createField("Document_text", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jease.content.Document_lastTextUpdate</code>.
     */
    public final TableField<ContentRecord, Long> DOCUMENT_LASTTEXTUPDATE = createField("Document_lastTextUpdate", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>jease.content.Factory_sequence</code>.
     */
    public final TableField<ContentRecord, String> FACTORY_SEQUENCE = createField("Factory_sequence", org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>jease.content.File_contentType</code>.
     */
    public final TableField<ContentRecord, String> FILE_CONTENTTYPE = createField("File_contentType", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jease.content.File_uuid</code>.
     */
    public final TableField<ContentRecord, String> FILE_UUID = createField("File_uuid", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jease.content.Gallery_preface</code>.
     */
    public final TableField<ContentRecord, String> GALLERY_PREFACE = createField("Gallery_preface", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jease.content.Gallery_scale</code>.
     */
    public final TableField<ContentRecord, Integer> GALLERY_SCALE = createField("Gallery_scale", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jease.content.Gallery_labeled</code>.
     */
    public final TableField<ContentRecord, Byte> GALLERY_LABELED = createField("Gallery_labeled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>jease.content.Link_url</code>.
     */
    public final TableField<ContentRecord, String> LINK_URL = createField("Link_url", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jease.content.News_teaser</code>.
     */
    public final TableField<ContentRecord, String> NEWS_TEASER = createField("News_teaser", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jease.content.News_story</code>.
     */
    public final TableField<ContentRecord, String> NEWS_STORY = createField("News_story", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jease.content.News_date</code>.
     */
    public final TableField<ContentRecord, Date> NEWS_DATE = createField("News_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>jease.content.Reference_id</code>.
     */
    public final TableField<ContentRecord, Integer> REFERENCE_ID = createField("Reference_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jease.content.Script_code</code>.
     */
    public final TableField<ContentRecord, String> SCRIPT_CODE = createField("Script_code", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jease.content.Script_forward</code>.
     */
    public final TableField<ContentRecord, Byte> SCRIPT_FORWARD = createField("Script_forward", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>jease.content.Text_content</code>.
     */
    public final TableField<ContentRecord, String> TEXT_CONTENT = createField("Text_content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jease.content.Test_plain</code>.
     */
    public final TableField<ContentRecord, Byte> TEST_PLAIN = createField("Test_plain", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>jease.content.Transit_uri</code>.
     */
    public final TableField<ContentRecord, String> TRANSIT_URI = createField("Transit_uri", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jease.content.Transit_forward</code>.
     */
    public final TableField<ContentRecord, Byte> TRANSIT_FORWARD = createField("Transit_forward", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>jease.content.Wiki_content</code>.
     */
    public final TableField<ContentRecord, String> WIKI_CONTENT = createField("Wiki_content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jease.content.ClazzName</code>.
     */
    public final TableField<ContentRecord, String> CLAZZNAME = createField("ClazzName", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>jease.content</code> table reference
     */
    public Content() {
        this(DSL.name("content"), null);
    }

    /**
     * Create an aliased <code>jease.content</code> table reference
     */
    public Content(String alias) {
        this(DSL.name(alias), CONTENT);
    }

    /**
     * Create an aliased <code>jease.content</code> table reference
     */
    public Content(Name alias) {
        this(alias, CONTENT);
    }

    private Content(Name alias, Table<ContentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Content(Name alias, Table<ContentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Content(Table<O> child, ForeignKey<O, ContentRecord> key) {
        super(child, key, CONTENT);
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
        return Arrays.<Index>asList(Indexes.CONTENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ContentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContentRecord> getPrimaryKey() {
        return Keys.KEY_CONTENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContentRecord>> getKeys() {
        return Arrays.<UniqueKey<ContentRecord>>asList(Keys.KEY_CONTENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content as(String alias) {
        return new Content(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content as(Name alias) {
        return new Content(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Content rename(String name) {
        return new Content(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Content rename(Name name) {
        return new Content(name, null);
    }
}
