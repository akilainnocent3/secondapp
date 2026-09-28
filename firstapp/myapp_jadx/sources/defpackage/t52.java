package defpackage;

import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class t52 {
    public boolean a;
    public boolean b;

    public final class a implements xp60 {
        public final xp60 a;
        public final /* synthetic */ fv50 b;

        public a(fv50 fv50Var, xp60 xp60Var) {
            xp60Var.getClass();
            this.b = fv50Var;
            this.a = xp60Var;
        }

        @Override // defpackage.xp60
        public final vp60 a(String str) {
            FileChannel fileChannel;
            FileChannel fileChannel2;
            str.getClass();
            boolean zG = Intrinsics.g(str, ":memory:");
            fv50 fv50Var = this.b;
            if (!zG) {
                str = fv50Var.c.a.getDatabasePath(str).getAbsolutePath();
                str.getClass();
            }
            boolean z = true;
            vtg vtgVar = new vtg(str, (fv50Var.a || fv50Var.b || str.equals(":memory:")) ? false : true);
            ReentrantLock reentrantLock = vtgVar.a;
            reentrantLock.lock();
            hkh hkhVar = vtgVar.b;
            if (hkhVar != null) {
                try {
                    hkhVar.a();
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
            }
            try {
                try {
                    if (fv50Var.b) {
                        throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                    }
                    vp60 vp60VarA = this.a.a(str);
                    if (fv50Var.a) {
                        if (fv50Var.d().g == lv50.c.c) {
                            up60.a(vp60VarA, "PRAGMA synchronous = NORMAL");
                        } else {
                            up60.a(vp60VarA, "PRAGMA synchronous = FULL");
                        }
                        t52.a(vp60VarA);
                        fv50Var.e().d(vp60VarA);
                    } else {
                        try {
                            fv50Var.b = true;
                            fv50Var.b(vp60VarA);
                            fv50Var.b = false;
                        } catch (Throwable th2) {
                            fv50Var.b = false;
                            throw th2;
                        }
                    }
                    if (hkhVar != null && (fileChannel2 = hkhVar.b) != null) {
                        try {
                            fileChannel2.close();
                            hkhVar.b = null;
                        } catch (Throwable th3) {
                            hkhVar.b = null;
                            throw th3;
                        }
                    }
                    reentrantLock.unlock();
                    return vp60VarA;
                } catch (Throwable th4) {
                    if (hkhVar != null && (fileChannel = hkhVar.b) != null) {
                        try {
                            fileChannel.close();
                        } finally {
                            hkhVar.b = null;
                        }
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            th = th5;
            try {
                if (z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            } catch (Throwable th6) {
                reentrantLock.unlock();
                throw th6;
            }
        }

        @Override // defpackage.xp60
        public final boolean b() {
            return this.a.b();
        }
    }

    public static void a(vp60 vp60Var) {
        hq60 hq60VarH1 = vp60Var.H1("PRAGMA busy_timeout");
        try {
            hq60VarH1.D1();
            long j = hq60VarH1.getLong(0);
            vc1.a(hq60VarH1, null);
            if (j < 3000) {
                up60.a(vp60Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }

    public final void b(vp60 vp60Var) throws Throwable {
        Object bVar;
        lv50.c cVar = d().g;
        lv50.c cVar2 = lv50.c.c;
        if (cVar == cVar2) {
            up60.a(vp60Var, "PRAGMA journal_mode = WAL");
        } else {
            up60.a(vp60Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (d().g == cVar2) {
            up60.a(vp60Var, "PRAGMA synchronous = NORMAL");
        } else {
            up60.a(vp60Var, "PRAGMA synchronous = FULL");
        }
        a(vp60Var);
        hq60 hq60VarH1 = vp60Var.H1("PRAGMA user_version");
        try {
            hq60VarH1.D1();
            int i = (int) hq60VarH1.getLong(0);
            vc1.a(hq60VarH1, null);
            if (i != e().a) {
                up60.a(vp60Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    zi50.a aVar = zi50.b;
                    if (i == 0) {
                        f(vp60Var);
                    } else {
                        g(vp60Var, i, e().a);
                    }
                    up60.a(vp60Var, "PRAGMA user_version = " + e().a);
                    bVar = Unit.a;
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (!(bVar instanceof zi50.b)) {
                    up60.a(vp60Var, "END TRANSACTION");
                }
                Throwable thA = zi50.a(bVar);
                if (thA != null) {
                    up60.a(vp60Var, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            h(vp60Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                vc1.a(hq60VarH1, th2);
                throw th3;
            }
        }
    }

    public abstract List<lv50.b> c();

    public abstract esc d();

    public abstract tv50 e();

    public final void f(vp60 vp60Var) {
        vp60Var.getClass();
        hq60 hq60VarH1 = vp60Var.H1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (hq60VarH1.D1() && hq60VarH1.getLong(0) == 0) {
                z = true;
            }
            vc1.a(hq60VarH1, null);
            e().a(vp60Var);
            if (!z) {
                tv50.a aVarG = e().g(vp60Var);
                if (!aVarG.a) {
                    s52.a(aVarG.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            i(vp60Var);
            e().c(vp60Var);
            Iterator<T> it = c().iterator();
            while (it.hasNext()) {
                ((lv50.b) it.next()).getClass();
                if (vp60Var instanceof ufe0) {
                    ((ufe0) vp60Var).a.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(vp60 vp60Var, int i, int i2) {
        vp60Var.getClass();
        List<upv> listA = vpv.a(d().d, i, i2);
        if (listA != null) {
            e().f(vp60Var);
            for (upv upvVar : listA) {
                upvVar.getClass();
                if (!(vp60Var instanceof ufe0)) {
                    throw new czx("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                upvVar.a(((ufe0) vp60Var).a);
            }
            tv50.a aVarG = e().g(vp60Var);
            if (!aVarG.a) {
                s52.a(aVarG.b, "Migration didn't properly handle: ");
                return;
            } else {
                e().e(vp60Var);
                i(vp60Var);
                return;
            }
        }
        if (vpv.b(d(), i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (d().s) {
            hq60 hq60VarH1 = vp60Var.H1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                ngs ngsVarB = kotlin.collections.a.b();
                while (hq60VarH1.D1()) {
                    String strK1 = hq60VarH1.k1(0);
                    if (!c.u(strK1, "sqlite_", false) && !strK1.equals("android_metadata")) {
                        ngsVarB.add(new Pair(strK1, Boolean.valueOf(Intrinsics.g(hq60VarH1.k1(1), "view"))));
                    }
                }
                ngs ngsVarA = kotlin.collections.a.a(ngsVarB);
                vc1.a(hq60VarH1, null);
                ListIterator listIterator = ngsVarA.listIterator(0);
                while (true) {
                    ngs.c cVar = (ngs.c) listIterator;
                    if (!cVar.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) cVar.next();
                    String str = (String) pair.a;
                    if (((Boolean) pair.b).booleanValue()) {
                        up60.a(vp60Var, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        up60.a(vp60Var, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    vc1.a(hq60VarH1, th);
                    throw th2;
                }
            }
        } else {
            e().b(vp60Var);
        }
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            ((lv50.b) it.next()).getClass();
            if (vp60Var instanceof ufe0) {
                ((ufe0) vp60Var).a.getClass();
            }
        }
        e().a(vp60Var);
    }

    public final void h(vp60 vp60Var) {
        Object bVar;
        vp60Var.getClass();
        hq60 hq60VarH1 = vp60Var.H1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = hq60VarH1.D1() && hq60VarH1.getLong(0) != 0;
            vc1.a(hq60VarH1, null);
            if (z) {
                hq60 hq60VarH2 = vp60Var.H1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strK1 = hq60VarH2.D1() ? hq60VarH2.k1(0) : null;
                    vc1.a(hq60VarH2, null);
                    if (!e().b.equals(strK1) && !e().c.equals(strK1)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + e().b + ", found: " + strK1).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vc1.a(hq60VarH2, th);
                        throw th2;
                    }
                }
            } else {
                up60.a(vp60Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    zi50.a aVar = zi50.b;
                    tv50.a aVarG = e().g(vp60Var);
                    if (!aVarG.a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarG.b).toString());
                    }
                    e().e(vp60Var);
                    i(vp60Var);
                    bVar = Unit.a;
                    if (!(bVar instanceof zi50.b)) {
                        up60.a(vp60Var, "END TRANSACTION");
                    }
                    Throwable thA = zi50.a(bVar);
                    if (thA != null) {
                        up60.a(vp60Var, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th3);
                }
            }
            e().d(vp60Var);
            for (lv50.b bVar2 : c()) {
                bVar2.getClass();
                if (vp60Var instanceof ufe0) {
                    bVar2.a(((ufe0) vp60Var).a);
                }
            }
            this.a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                vc1.a(hq60VarH1, th4);
                throw th5;
            }
        }
    }

    public final void i(vp60 vp60Var) {
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + e().b + "')");
    }
}
