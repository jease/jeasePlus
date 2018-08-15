/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jease.database.dao;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mnm
 */
public class Linkcheck implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String path;
    private String url;
    private int status;

    public Linkcheck() {
    }

    public Linkcheck(Integer id) {
        this.id = id;
    }

    public Linkcheck(Integer id, String path, String url, int status) {
        this.id = id;
        this.path = path;
        this.url = url;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
        if (!(object instanceof Linkcheck)) {
            return false;
        }
        Linkcheck other = (Linkcheck) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jease.database.dao.Linkcheck[ id=" + id + " ]";
    }
    
}
