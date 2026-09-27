package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Z6 extends SQLiteOpenHelper implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicLogger f96863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5158jn f96864c;

    public Z6(Context context, String str, C5158jn c5158jn, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC5491x5.f98564b);
        this.f96864c = c5158jn;
        this.f96862a = str;
        this.f96863b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th2) {
            this.f96863b.error(th2, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f96862a);
            Rj rj2 = AbstractC5306pj.f98149a;
            rj2.getClass();
            rj2.a(new C5331qj("db_read_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th2) {
            this.f96863b.error(th2, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f96862a);
            Rj rj2 = AbstractC5306pj.f98149a;
            rj2.getClass();
            rj2.a(new C5331qj("db_write_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f96864c.f97669a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        C5158jn c5158jn = this.f96864c;
        if (i10 <= i11) {
            c5158jn.getClass();
            return;
        }
        try {
            c5158jn.f97670b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c5158jn.f97669a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C5158jn c5158jn = this.f96864c;
        c5158jn.getClass();
        try {
            InterfaceC5184kn interfaceC5184kn = c5158jn.f97672d;
            if (interfaceC5184kn == null || interfaceC5184kn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c5158jn.f97670b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c5158jn.f97669a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        boolean z10;
        C5158jn c5158jn = this.f96864c;
        c5158jn.getClass();
        if (i11 > i10) {
            for (int i12 = i10 + 1; i12 <= i11; i12++) {
                try {
                    Collection collection = (Collection) c5158jn.f97671c.f98186a.get(Integer.valueOf(i12));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || (!c5158jn.f97672d.a(sQLiteDatabase))) {
            try {
                c5158jn.f97670b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c5158jn.f97669a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
