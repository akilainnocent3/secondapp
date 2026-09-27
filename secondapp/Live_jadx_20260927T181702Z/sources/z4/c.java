package z4;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteOpenHelper f160300b;

    public c(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f160300b = sQLiteOpenHelper;
    }

    @Override // z4.b
    public SQLiteDatabase getReadableDatabase() {
        return this.f160300b.getReadableDatabase();
    }

    @Override // z4.b
    public SQLiteDatabase getWritableDatabase() {
        return this.f160300b.getWritableDatabase();
    }
}
