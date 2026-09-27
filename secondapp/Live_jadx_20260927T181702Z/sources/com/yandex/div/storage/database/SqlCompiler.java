package com.yandex.div.storage.database;

import android.database.sqlite.SQLiteStatement;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface SqlCompiler {
    @l
    ReadState compileQuery(@l String str, @l String... strArr);

    @l
    SQLiteStatement compileStatement(@l String str);
}
