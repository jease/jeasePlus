# [JeasePlus](https://github.com/jease/jeasePlus)
===========================

[![Build Status](https://travis-ci.org/jease/jease.svg?branch=master)](https://travis-ci.org/jease/jease)
[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)


Jease eases the development of content- & database-driven web-applications with Java.

[Home Page of Jease](http://jease.org)



About
-----

Jease eases the development of content- & database-driven web-applications with Java.
Out of the box Jease provides an Ajax-powered Content-Management-System (CMS) which makes use of drag & drop to organize content.
* A relational database that holds blog posts and users.


This project is just meant to be a demonstration, therefore it is neither well documented nor well tested. Use it to learn about the technologies used, but do not use it for productive applications.

Any feedback is welcome, and I will incorporate useful pull requests.

Technologies
------------

* [DB4O](http://db4o.com) db4o or Perst or ZooDB as object-oriented persistence engines
* [Lucene](http://lucene.apache.org/) Lucene as high performance indexing and search technology.
* [Bootstrap](http://getbootstrap.com/)
* [ZK](https://zkoss.org/) ZK as component- & event-driven Ajax-Web-Framework.
* [Solr](http://lucene.apache.org/solr/) Apache  Solr is the popular, blazing-fast, open source enterprise search platform built on Apache Lucene™.
* [Mysql](https://mariadb.org/)


User Levels
------------
* User Level = {View posts, Apply new Comment}
* Editor Level = {Add new Post,Edit posts,Delete posts}
* Admin Level = {Manage Users, Posts, Comments, Files, Categories}

Running
-------

Make sure [Maven](http://maven.apache.org/) >= 2.2.1 is installed on your system. Go into the project dir and type `mvn clean package`, then deploy war file generated in target folder on a java webserver like tomcat and then point your browser to `http://localhost:8080`.


## Contribution
Please Join us Jease User Group at GoogleGroup
https://groups.google.com/forum/#!forum/jease

RoadMap
-------
* Add configuration properties file
* Change admin UI framework from zk to jsf based ui
* Update lucene and use solr based search (Completed [#141](https://github.com/jease/jease/issues/141))
* Add Shopping service and shopping cart
* Add Email support
* Add seo Setting (Completed [#140](https://github.com/jease/jease/issues/140) )
* Add new responsive themes (Completed [#133](https://github.com/jease/jease/issues/133))



License
-------

[GPL 3](http://jease.org/gpl3)







