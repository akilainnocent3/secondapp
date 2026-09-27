package n9;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import dr.i0;
import dr.k0;
import dr.o0;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements m9.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final a f116387i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final String f116388j = "SupportSQLite";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Context f116389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final String f116390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final m9.f.a f116391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f116392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f116393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public final i0<c> f116394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f116395h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        public f f116396a;

        public b(@oy.m f fVar) {
            this.f116396a = fVar;
        }

        @oy.m
        public final f a() {
            return this.f116396a;
        }

        public final void b(@oy.m f fVar) {
            this.f116396a = fVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @oy.l
        public static final C1068c f116397i = new C1068c(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final Context f116398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public final b f116399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public final m9.f.a f116400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f116401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f116402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oy.l
        public final p9.a f116403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f116404h;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends RuntimeException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @oy.l
            public final b f116405b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @oy.l
            public final Throwable f116406c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@oy.l b callbackName, @oy.l Throwable cause) {
                super(cause);
                m0.p(callbackName, "callbackName");
                m0.p(cause, "cause");
                this.f116405b = callbackName;
                this.f116406c = cause;
            }

            @oy.l
            public final b d() {
                return this.f116405b;
            }

            @Override // java.lang.Throwable
            @oy.l
            public Throwable getCause() {
                return this.f116406c;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN;


            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final /* synthetic */ sr.a f116413h = sr.c.c(d());

            @oy.l
            public static sr.a<b> g() {
                return f116413h;
            }
        }

        /* JADX INFO: renamed from: n9.h$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @s1({"SMAP\nFrameworkSQLiteOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
        public static final class C1068c {
            public /* synthetic */ C1068c(x xVar) {
                this();
            }

            @oy.l
            public final f a(@oy.l b refHolder, @oy.l SQLiteDatabase sqLiteDatabase) {
                m0.p(refHolder, "refHolder");
                m0.p(sqLiteDatabase, "sqLiteDatabase");
                f fVarA = refHolder.a();
                if (fVarA != null && fVarA.r(sqLiteDatabase)) {
                    return fVarA;
                }
                f fVar = new f(sqLiteDatabase);
                refHolder.b(fVar);
                return fVar;
            }

            public C1068c() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f116414a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f116414a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@oy.l Context context, @oy.m String str, @oy.l final b dbRef, @oy.l final m9.f.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.f107128a, new DatabaseErrorHandler() { // from class: n9.i
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    h.c.b(callback, dbRef, sQLiteDatabase);
                }
            });
            m0.p(context, "context");
            m0.p(dbRef, "dbRef");
            m0.p(callback, "callback");
            this.f116398b = context;
            this.f116399c = dbRef;
            this.f116400d = callback;
            this.f116401e = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                m0.o(string, "toString(...)");
            } else {
                string = str;
            }
            this.f116403g = new p9.a(string, context.getCacheDir(), false);
        }

        public static final void b(m9.f.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            C1068c c1068c = f116397i;
            m0.m(sQLiteDatabase);
            aVar.c(c1068c.a(bVar, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                p9.a.c(this.f116403g, false, 1, null);
                super.close();
                this.f116399c.b(null);
                this.f116404h = false;
            } finally {
                this.f116403g.d();
            }
        }

        public final boolean d() {
            return this.f116401e;
        }

        @oy.l
        public final m9.f.a h() {
            return this.f116400d;
        }

        @oy.l
        public final Context k() {
            return this.f116398b;
        }

        @oy.l
        public final b l() {
            return this.f116399c;
        }

        @oy.l
        public final m9.e m(boolean z10) {
            m9.e eVarN;
            try {
                this.f116403g.b((this.f116404h || getDatabaseName() == null) ? false : true);
                this.f116402f = false;
                SQLiteDatabase sQLiteDatabaseP = p(z10);
                if (this.f116402f) {
                    close();
                    eVarN = m(z10);
                } else {
                    eVarN = n(sQLiteDatabaseP);
                }
                return eVarN;
            } finally {
                this.f116403g.d();
            }
        }

        @oy.l
        public final f n(@oy.l SQLiteDatabase sqLiteDatabase) {
            m0.p(sqLiteDatabase, "sqLiteDatabase");
            return f116397i.a(this.f116399c, sqLiteDatabase);
        }

        public final SQLiteDatabase o(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                m0.m(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            m0.m(readableDatabase);
            return readableDatabase;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@oy.l SQLiteDatabase db2) {
            m0.p(db2, "db");
            if (!this.f116402f && this.f116400d.f107128a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.f116400d.b(n(db2));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@oy.l SQLiteDatabase sqLiteDatabase) {
            m0.p(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f116400d.d(n(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@oy.l SQLiteDatabase db2, int i10, int i11) {
            m0.p(db2, "db");
            this.f116402f = true;
            try {
                this.f116400d.e(n(db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@oy.l SQLiteDatabase db2) {
            m0.p(db2, "db");
            if (!this.f116402f) {
                try {
                    this.f116400d.f(n(db2));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f116404h = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@oy.l SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            m0.p(sqLiteDatabase, "sqLiteDatabase");
            this.f116402f = true;
            try {
                this.f116400d.g(n(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }

        public final SQLiteDatabase p(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f116404h;
            if (databaseName != null && !z11 && (parentFile = this.f116398b.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return o(z10);
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return o(z10);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        Throwable cause = aVar.getCause();
                        int i10 = d.f116414a[aVar.d().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                            throw cause;
                        }
                        if (i10 != 5) {
                            throw new o0();
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.f116401e) {
                        throw th;
                    }
                    this.f116398b.deleteDatabase(databaseName);
                    try {
                        return o(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @cs.k
    public h(@oy.l Context context, @oy.m String str, @oy.l m9.f.a callback) {
        this(context, str, callback, false, false, 24, null);
        m0.p(context, "context");
        m0.p(callback, "callback");
    }

    public static Object h(h hVar) {
        return hVar.f116394g;
    }

    public static final c i(h hVar) {
        c cVar;
        if (hVar.f116390c == null || !hVar.f116392e) {
            cVar = new c(hVar.f116389b, hVar.f116390c, new b(null), hVar.f116391d, hVar.f116393f);
        } else {
            cVar = new c(hVar.f116389b, new File(m9.c.C1003c.a(hVar.f116389b), hVar.f116390c).getAbsolutePath(), new b(null), hVar.f116391d, hVar.f116393f);
        }
        cVar.setWriteAheadLoggingEnabled(hVar.f116395h);
        return cVar;
    }

    @Override // m9.f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f116394g.isInitialized()) {
            d().close();
        }
    }

    public final c d() {
        return this.f116394g.getValue();
    }

    @Override // m9.f
    @oy.m
    public String getDatabaseName() {
        return this.f116390c;
    }

    @Override // m9.f
    @oy.l
    public m9.e getReadableDatabase() {
        return d().m(false);
    }

    @Override // m9.f
    @oy.l
    public m9.e getWritableDatabase() {
        return d().m(true);
    }

    @Override // m9.f
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f116394g.isInitialized()) {
            d().setWriteAheadLoggingEnabled(z10);
        }
        this.f116395h = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @cs.k
    public h(@oy.l Context context, @oy.m String str, @oy.l m9.f.a callback, boolean z10) {
        this(context, str, callback, z10, false, 16, null);
        m0.p(context, "context");
        m0.p(callback, "callback");
    }

    @cs.k
    public h(@oy.l Context context, @oy.m String str, @oy.l m9.f.a callback, boolean z10, boolean z11) {
        m0.p(context, "context");
        m0.p(callback, "callback");
        this.f116389b = context;
        this.f116390c = str;
        this.f116391d = callback;
        this.f116392e = z10;
        this.f116393f = z11;
        this.f116394g = k0.b(new ds.a() { // from class: n9.g
            @Override // ds.a
            public final Object invoke() {
                return h.i(this.f116386b);
            }
        });
    }

    public /* synthetic */ h(Context context, String str, m9.f.a aVar, boolean z10, boolean z11, int i10, x xVar) {
        this(context, str, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }
}
