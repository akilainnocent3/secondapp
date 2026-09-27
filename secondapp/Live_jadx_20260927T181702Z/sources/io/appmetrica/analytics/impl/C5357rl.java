package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5357rl implements InterfaceC5542z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z6 f98244a;

    public C5357rl(Z6 z10) {
        this.f98244a = z10;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5542z6
    public final void a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5542z6
    @Nullable
    public final SQLiteDatabase a() {
        try {
            return this.f98244a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
