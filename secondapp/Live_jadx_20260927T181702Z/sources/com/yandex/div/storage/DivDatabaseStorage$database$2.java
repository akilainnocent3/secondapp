package com.yandex.div.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.div.storage.db.DatabaseOpenHelper;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivDatabaseStorage$database$2 extends o0 implements ds.a<SQLiteDatabase> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $databaseName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivDatabaseStorage$database$2(Context context, String str) {
        super(0);
        this.$context = context;
        this.$databaseName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    public final SQLiteDatabase invoke() {
        return new DatabaseOpenHelper(this.$context, this.$databaseName).getWritableDatabase();
    }
}
