package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.sporty.android.permission.location.KN.qUnCRF;

/* JADX INFO: loaded from: classes4.dex */
public final class d4l0 extends guk0 {
    public final /* synthetic */ h4l0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4l0(h4l0 h4l0Var, Context context) {
        super(context, "google_app_measurement_local.db");
        this.a = h4l0Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        y4l0 y4l0Var = this.a.a.f;
        k8l0.m(y4l0Var);
        qqk0.b(y4l0Var, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        y4l0 y4l0Var = this.a.a.f;
        k8l0.m(y4l0Var);
        qqk0.a(y4l0Var, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", h4l0.e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        k8l0 k8l0Var = this.a.a;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a(qUnCRF.iFRtcuphPcwob);
            if (!k8l0Var.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                y4l0 y4l0Var3 = k8l0Var.f;
                k8l0.m(y4l0Var3);
                y4l0Var3.f.b(e2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }
}
