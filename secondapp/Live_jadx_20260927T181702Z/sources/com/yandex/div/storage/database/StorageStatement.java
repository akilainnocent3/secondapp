package com.yandex.div.storage.database;

import android.database.SQLException;
import k.i1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface StorageStatement {
    @i1
    void execute(@l SqlCompiler sqlCompiler) throws SQLException;
}
