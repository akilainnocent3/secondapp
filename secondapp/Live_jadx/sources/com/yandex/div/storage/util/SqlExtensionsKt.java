package com.yandex.div.storage.util;

import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.io.Closeable;
import java.io.IOException;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SqlExtensionsKt {
    public static final void bindNullableBlob(@l SQLiteStatement sQLiteStatement, int i10, @m byte[] bArr) {
        if (bArr == null) {
            sQLiteStatement.bindNull(i10);
        } else {
            sQLiteStatement.bindBlob(i10, bArr);
        }
    }

    public static final void closeSilently(@l Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void endTransactionSilently(@l DatabaseOpenHelper.Database database) {
        try {
            database.endTransaction();
        } catch (IllegalStateException unused) {
        }
    }
}
