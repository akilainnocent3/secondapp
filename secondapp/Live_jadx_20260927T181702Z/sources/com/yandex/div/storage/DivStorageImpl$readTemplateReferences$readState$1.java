package com.yandex.div.storage;

import android.database.Cursor;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.StorageSchema;
import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStorageImpl$readTemplateReferences$readState$1 extends o0 implements l<DatabaseOpenHelper.Database, Cursor> {
    public static final DivStorageImpl$readTemplateReferences$readState$1 INSTANCE = new DivStorageImpl$readTemplateReferences$readState$1();

    public DivStorageImpl$readTemplateReferences$readState$1() {
        super(1);
    }

    @Override // ds.l
    @oy.l
    public final Cursor invoke(@oy.l DatabaseOpenHelper.Database database) {
        return database.query(StorageSchema.TABLE_TEMPLATE_REFERENCES, null, null, null, null, null, null, null);
    }
}
