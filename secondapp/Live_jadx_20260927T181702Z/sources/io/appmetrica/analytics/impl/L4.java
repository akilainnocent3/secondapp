package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class L4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K4 f96096a = new K4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J4 f96097b = new J4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@oy.l SQLiteDatabase sQLiteDatabase) {
        this.f96096a.runScript(sQLiteDatabase);
        this.f96097b.runScript(sQLiteDatabase);
    }
}
