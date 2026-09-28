package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
@fae
public final class vv50 extends wfe0.a {
    public esc b;
    public final List<lv50.b> c;
    public final WorkDatabase_Impl.a d;

    @fae
    public static abstract class a {
    }

    @fae
    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public vv50(esc escVar, WorkDatabase_Impl.a aVar) {
        super(23);
        this.c = escVar.e;
        this.b = escVar;
        this.d = aVar;
    }

    @Override // wfe0.a
    public final void c(rzi rziVar) throws IOException {
        Cursor cursorW = rziVar.w(new ok90("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z = false;
            if (cursorW.moveToFirst() && cursorW.getInt(0) == 0) {
                z = true;
            }
            cursorW.close();
            WorkDatabase_Impl.a aVar = this.d;
            aVar.a(rziVar);
            if (!z) {
                b bVarB = aVar.b(rziVar);
                if (!bVarB.a) {
                    uj5.a(bVarB.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = rziVar.a;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            List<lv50.b> list = this.c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((lv50.b) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ft7.a(cursorW, th);
                throw th2;
            }
        }
    }

    @Override // wfe0.a
    public final void d(rzi rziVar, int i, int i2) throws IOException {
        f(rziVar, i, i2);
    }

    @Override // wfe0.a
    public final void e(rzi rziVar) throws IOException {
        SQLiteDatabase sQLiteDatabase = rziVar.a;
        Cursor cursorW = rziVar.w(new ok90("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            boolean z = cursorW.moveToFirst() && cursorW.getInt(0) != 0;
            cursorW.close();
            WorkDatabase_Impl.a aVar = this.d;
            if (z) {
                Cursor cursorW2 = rziVar.w(new ok90("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorW2.moveToFirst() ? cursorW2.getString(0) : null;
                    cursorW2.close();
                    if (!"86254750241babac4b8d52996a675549".equals(string) && !"1cbd3130fa23b59692c061c594c16cc0".equals(string)) {
                        ib5.a(inm.a("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: ", string));
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ft7.a(cursorW2, th);
                        throw th2;
                    }
                }
            } else {
                b bVarB = aVar.b(rziVar);
                if (!bVarB.a) {
                    uj5.a(bVarB.b, "Pre-packaged database has an invalid schema: ");
                    return;
                } else {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                }
            }
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.s(new ufe0(rziVar));
            List<lv50.b> list = this.c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((lv50.b) it.next()).a(rziVar);
                }
            }
            this.b = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ft7.a(cursorW, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wfe0.a
    public final void f(rzi rziVar, int i, int i2) throws IOException {
        List<upv> listA;
        SQLiteDatabase sQLiteDatabase = rziVar.a;
        esc escVar = this.b;
        WorkDatabase_Impl.a aVar = this.d;
        if (escVar != null && (listA = vpv.a(escVar.d, i, i2)) != null) {
            klc.a(new ufe0(rziVar));
            for (upv upvVar : listA) {
                upvVar.getClass();
                upvVar.a(rziVar);
            }
            b bVarB = aVar.b(rziVar);
            if (!bVarB.a) {
                uj5.a(bVarB.b, "Migration didn't properly handle: ");
                return;
            } else {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                return;
            }
        }
        esc escVar2 = this.b;
        if (escVar2 == null || vpv.b(escVar2, i, i2)) {
            ib5.a(n36.a("A migration from ", i, i2, " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (escVar2.s) {
            Cursor cursorW = rziVar.w(new ok90("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                ngs ngsVarB = kotlin.collections.a.b();
                while (cursorW.moveToNext()) {
                    String string = cursorW.getString(0);
                    string.getClass();
                    if (!c.u(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        ngsVarB.add(new Pair(string, Boolean.valueOf(Intrinsics.g(cursorW.getString(1), "view"))));
                    }
                }
                ngs ngsVarA = kotlin.collections.a.a(ngsVarB);
                cursorW.close();
                ListIterator listIterator = ngsVarA.listIterator(0);
                while (true) {
                    ngs.c cVar = (ngs.c) listIterator;
                    if (!cVar.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) cVar.next();
                    String str = (String) pair.a;
                    if (((Boolean) pair.b).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ft7.a(cursorW, th);
                    throw th2;
                }
            }
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
        }
        List<lv50.b> list = this.c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((lv50.b) it.next()).getClass();
            }
        }
        aVar.a(rziVar);
    }

    @Override // wfe0.a
    public final void b(rzi rziVar) {
    }
}
