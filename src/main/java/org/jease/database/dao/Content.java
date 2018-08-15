/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jease.database.dao;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mnm
 */public class Content implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private int parentID;
    private String title;
    private Date lastModified;
    private Date creationDate;
    private boolean visible;
    private int editorID;
    private String accesslogin;
    private String accesspassword;
    private Date accessstart;
    private Date accessstop;
    private String discussionauthor;
    private String discussioncomment;
    private String documenttext;
    private long documentlastTextUpdate;
    private String factorysequence;
    private String filecontentType;
    private String fileuuid;
    private String gallerypreface;
    private int galleryscale;
    private boolean gallerylabeled;
    private String linkurl;
    private String newsteaser;
    private String newsstory;
    private Date newsdate;
    private int referenceid;
    private String scriptcode;
    private boolean scriptforward;
    private String textcontent;
    private boolean testplain;
    private String transituri;
    private boolean transitforward;
    private String wikicontent;
    private String clazzName;

    public Content() {
    }

    public Content(Integer id) {
        this.id = id;
    }

    public Content(Integer id, int parentID, String title, Date lastModified, boolean visible, int editorID, Date accessstart, Date accessstop, String discussionauthor, String discussioncomment, String documenttext, long documentlastTextUpdate, String factorysequence, String filecontentType, String fileuuid, String gallerypreface, int galleryscale, boolean gallerylabeled, String linkurl, String newsteaser, String newsstory, Date newsdate, int referenceid, String scriptcode, boolean scriptforward, String textcontent, boolean testplain, String transituri, boolean transitforward, String wikicontent, String clazzName) {
        this.id = id;
        this.parentID = parentID;
        this.title = title;
        this.lastModified = lastModified;
        this.visible = visible;
        this.editorID = editorID;
        this.accessstart = accessstart;
        this.accessstop = accessstop;
        this.discussionauthor = discussionauthor;
        this.discussioncomment = discussioncomment;
        this.documenttext = documenttext;
        this.documentlastTextUpdate = documentlastTextUpdate;
        this.factorysequence = factorysequence;
        this.filecontentType = filecontentType;
        this.fileuuid = fileuuid;
        this.gallerypreface = gallerypreface;
        this.galleryscale = galleryscale;
        this.gallerylabeled = gallerylabeled;
        this.linkurl = linkurl;
        this.newsteaser = newsteaser;
        this.newsstory = newsstory;
        this.newsdate = newsdate;
        this.referenceid = referenceid;
        this.scriptcode = scriptcode;
        this.scriptforward = scriptforward;
        this.textcontent = textcontent;
        this.testplain = testplain;
        this.transituri = transituri;
        this.transitforward = transitforward;
        this.wikicontent = wikicontent;
        this.clazzName = clazzName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getEditorID() {
        return editorID;
    }

    public void setEditorID(int editorID) {
        this.editorID = editorID;
    }

    public String getAccesslogin() {
        return accesslogin;
    }

    public void setAccesslogin(String accesslogin) {
        this.accesslogin = accesslogin;
    }

    public String getAccesspassword() {
        return accesspassword;
    }

    public void setAccesspassword(String accesspassword) {
        this.accesspassword = accesspassword;
    }

    public Date getAccessstart() {
        return accessstart;
    }

    public void setAccessstart(Date accessstart) {
        this.accessstart = accessstart;
    }

    public Date getAccessstop() {
        return accessstop;
    }

    public void setAccessstop(Date accessstop) {
        this.accessstop = accessstop;
    }

    public String getDiscussionauthor() {
        return discussionauthor;
    }

    public void setDiscussionauthor(String discussionauthor) {
        this.discussionauthor = discussionauthor;
    }

    public String getDiscussioncomment() {
        return discussioncomment;
    }

    public void setDiscussioncomment(String discussioncomment) {
        this.discussioncomment = discussioncomment;
    }

    public String getDocumenttext() {
        return documenttext;
    }

    public void setDocumenttext(String documenttext) {
        this.documenttext = documenttext;
    }

    public long getDocumentlastTextUpdate() {
        return documentlastTextUpdate;
    }

    public void setDocumentlastTextUpdate(long documentlastTextUpdate) {
        this.documentlastTextUpdate = documentlastTextUpdate;
    }

    public String getFactorysequence() {
        return factorysequence;
    }

    public void setFactorysequence(String factorysequence) {
        this.factorysequence = factorysequence;
    }

    public String getFilecontentType() {
        return filecontentType;
    }

    public void setFilecontentType(String filecontentType) {
        this.filecontentType = filecontentType;
    }

    public String getFileuuid() {
        return fileuuid;
    }

    public void setFileuuid(String fileuuid) {
        this.fileuuid = fileuuid;
    }

    public String getGallerypreface() {
        return gallerypreface;
    }

    public void setGallerypreface(String gallerypreface) {
        this.gallerypreface = gallerypreface;
    }

    public int getGalleryscale() {
        return galleryscale;
    }

    public void setGalleryscale(int galleryscale) {
        this.galleryscale = galleryscale;
    }

    public boolean getGallerylabeled() {
        return gallerylabeled;
    }

    public void setGallerylabeled(boolean gallerylabeled) {
        this.gallerylabeled = gallerylabeled;
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    public String getNewsteaser() {
        return newsteaser;
    }

    public void setNewsteaser(String newsteaser) {
        this.newsteaser = newsteaser;
    }

    public String getNewsstory() {
        return newsstory;
    }

    public void setNewsstory(String newsstory) {
        this.newsstory = newsstory;
    }

    public Date getNewsdate() {
        return newsdate;
    }

    public void setNewsdate(Date newsdate) {
        this.newsdate = newsdate;
    }

    public int getReferenceid() {
        return referenceid;
    }

    public void setReferenceid(int referenceid) {
        this.referenceid = referenceid;
    }

    public String getScriptcode() {
        return scriptcode;
    }

    public void setScriptcode(String scriptcode) {
        this.scriptcode = scriptcode;
    }

    public boolean getScriptforward() {
        return scriptforward;
    }

    public void setScriptforward(boolean scriptforward) {
        this.scriptforward = scriptforward;
    }

    public String getTextcontent() {
        return textcontent;
    }

    public void setTextcontent(String textcontent) {
        this.textcontent = textcontent;
    }

    public boolean getTestplain() {
        return testplain;
    }

    public void setTestplain(boolean testplain) {
        this.testplain = testplain;
    }

    public String getTransituri() {
        return transituri;
    }

    public void setTransituri(String transituri) {
        this.transituri = transituri;
    }

    public boolean getTransitforward() {
        return transitforward;
    }

    public void setTransitforward(boolean transitforward) {
        this.transitforward = transitforward;
    }

    public String getWikicontent() {
        return wikicontent;
    }

    public void setWikicontent(String wikicontent) {
        this.wikicontent = wikicontent;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Content)) {
            return false;
        }
        Content other = (Content) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jease.database.dao.Content[ id=" + id + " ]";
    }
    
}
