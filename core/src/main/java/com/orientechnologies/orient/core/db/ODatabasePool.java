package com.orientechnologies.orient.core.db;

import com.orientechnologies.orient.core.db.document.ODatabaseDocument;

import java.io.Closeable;

/**
 * Created by tglman on 27/06/16.
 */
public interface ODatabasePool extends AutoCloseable {

  static ODatabasePool pool(String url) {
    return new ODatabasePoolWrapper(url);
  }

  ODatabaseDocument acquire();

  void close();
}
