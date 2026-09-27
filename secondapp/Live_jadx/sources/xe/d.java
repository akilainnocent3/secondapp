package xe;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteOpenHelper f144860b;

    public d(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f144860b = sQLiteOpenHelper;
    }

    @Override // xe.c
    public SQLiteDatabase getReadableDatabase() {
        return this.f144860b.getReadableDatabase();
    }

    @Override // xe.c
    public SQLiteDatabase getWritableDatabase() {
        return this.f144860b.getWritableDatabase();
    }
}
