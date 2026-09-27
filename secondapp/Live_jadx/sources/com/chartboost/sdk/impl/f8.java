package com.chartboost.sdk.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f8 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(Context context, String name, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, name, cursorFactory, i10);
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(name, "name");
    }

    public /* synthetic */ f8(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, int i11, kotlin.jvm.internal.x xVar) {
        this(context, (i11 & 2) != 0 ? "chartboost_exoplayer.db" : str, (i11 & 4) != 0 ? null : cursorFactory, (i11 & 8) != 0 ? 1 : i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
