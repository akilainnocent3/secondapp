package com.yandex.div.storage;

import android.database.Cursor;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.StorageSchema;
import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStorageImpl$loadData$cardsReadState$1 extends o0 implements l<DatabaseOpenHelper.Database, Cursor> {
    final /* synthetic */ String $selection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivStorageImpl$loadData$cardsReadState$1(String str) {
        super(1);
        this.$selection = str;
    }

    @Override // ds.l
    @oy.l
    public final Cursor invoke(@oy.l DatabaseOpenHelper.Database database) {
        return database.query(StorageSchema.TABLE_CARDS, null, this.$selection, null, null, null, null, null);
    }
}
