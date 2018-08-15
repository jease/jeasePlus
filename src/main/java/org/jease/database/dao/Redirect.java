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
 */
public class Redirect implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String source;
    private String target;
    private Date timestamp;
    private String pattern;

    public Redirect() {
    }

    public Redirect(Integer id) {
        this.id = id;
    }

    public Redirect(Integer id, String source, String target, Date timestamp, String pattern) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.timestamp = timestamp;
        this.pattern = pattern;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
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
        if (!(object instanceof Redirect)) {
            return false;
        }
        Redirect other = (Redirect) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jease.database.dao.Redirect[ id=" + id + " ]";
    }
    
}
