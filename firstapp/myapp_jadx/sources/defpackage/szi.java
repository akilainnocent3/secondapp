package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class szi implements wfe0 {
    public final Context a;
    public final String b;
    public final wfe0.a c;
    public final boolean d;
    public final boolean e;
    public final mpe0 f;
    public boolean i;

    public static final class a {
        public rzi a = null;
    }

    public szi(Context context, String str, wfe0.a aVar, boolean z, boolean z2) {
        context.getClass();
        aVar.getClass();
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.d = z;
        this.e = z2;
        this.f = hwr.b(new j1e(this, 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mpe0 mpe0Var = this.f;
        if (mpe0Var.a()) {
            ((b) mpe0Var.getValue()).close();
        }
    }

    @Override // defpackage.wfe0
    public final vfe0 f1() {
        return ((b) this.f.getValue()).d(true);
    }

    @Override // defpackage.wfe0
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.wfe0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        mpe0 mpe0Var = this.f;
        if (mpe0Var.a()) {
            ((b) mpe0Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.i = z;
    }

    public static final class b extends SQLiteOpenHelper {
        public static final /* synthetic */ int v = 0;
        public final Context a;
        public final a b;
        public final wfe0.a c;
        public final boolean d;
        public boolean e;
        public final kx20 f;
        public boolean i;

        public static final class a extends RuntimeException {
            public final EnumC1110b a;
            public final Throwable b;

            public a(EnumC1110b enumC1110b, Throwable th) {
                super(th);
                this.a = enumC1110b;
                this.b = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.b;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: szi$b$b, reason: collision with other inner class name */
        public static final class EnumC1110b {
            public static final EnumC1110b a;
            public static final EnumC1110b b;
            public static final EnumC1110b c;
            public static final EnumC1110b d;
            public static final EnumC1110b e;
            public static final /* synthetic */ EnumC1110b[] f;

            static {
                EnumC1110b enumC1110b = new EnumC1110b("ON_CONFIGURE", 0);
                a = enumC1110b;
                EnumC1110b enumC1110b2 = new EnumC1110b("ON_CREATE", 1);
                b = enumC1110b2;
                EnumC1110b enumC1110b3 = new EnumC1110b("ON_UPGRADE", 2);
                c = enumC1110b3;
                EnumC1110b enumC1110b4 = new EnumC1110b("ON_DOWNGRADE", 3);
                d = enumC1110b4;
                EnumC1110b enumC1110b5 = new EnumC1110b("ON_OPEN", 4);
                e = enumC1110b5;
                f = new EnumC1110b[]{enumC1110b, enumC1110b2, enumC1110b3, enumC1110b4, enumC1110b5};
            }

            public EnumC1110b() {
                throw null;
            }

            public static EnumC1110b valueOf(String str) {
                return (EnumC1110b) Enum.valueOf(EnumC1110b.class, str);
            }

            public static EnumC1110b[] values() {
                return (EnumC1110b[]) f.clone();
            }
        }

        public static final class c {
            public static rzi a(a aVar, SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                rzi rziVar = aVar.a;
                if (rziVar != null && Intrinsics.g(rziVar.a, sQLiteDatabase)) {
                    return rziVar;
                }
                rzi rziVar2 = new rzi(sQLiteDatabase);
                aVar.a = rziVar2;
                return rziVar2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, final a aVar, final wfe0.a aVar2, boolean z) {
            String string;
            super(context, str, null, aVar2.a, new DatabaseErrorHandler() { // from class: tzi
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i = szi.b.v;
                    sQLiteDatabase.getClass();
                    rzi rziVarA = szi.b.c.a(aVar, sQLiteDatabase);
                    aVar2.getClass();
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + rziVarA + ".path");
                    SQLiteDatabase sQLiteDatabase2 = rziVarA.a;
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            wfe0.a.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } finally {
                            if (attachedDbs != null) {
                                Iterator<T> it = attachedDbs.iterator();
                                while (it.hasNext()) {
                                    Object obj = ((Pair) it.next()).second;
                                    obj.getClass();
                                    wfe0.a.a((String) obj);
                                }
                            } else {
                                String path2 = sQLiteDatabase2.getPath();
                                if (path2 != null) {
                                    wfe0.a.a(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        rziVarA.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                }
            });
            context.getClass();
            aVar2.getClass();
            this.a = context;
            this.b = aVar;
            this.c = aVar2;
            this.d = z;
            if (str == null) {
                string = UUID.randomUUID().toString();
                string.getClass();
            } else {
                string = str;
            }
            this.f = new kx20(string, context.getCacheDir(), false);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            kx20 kx20Var = this.f;
            try {
                kx20Var.a(kx20Var.a);
                super.close();
                this.b.a = null;
                this.i = false;
            } finally {
                kx20Var.b();
            }
        }

        public final vfe0 d(boolean z) {
            kx20 kx20Var = this.f;
            try {
                kx20Var.a((this.i || getDatabaseName() == null) ? false : true);
                this.e = false;
                SQLiteDatabase sQLiteDatabaseF = f(z);
                if (!this.e) {
                    return c.a(this.b, sQLiteDatabaseF);
                }
                close();
                return d(z);
            } finally {
                kx20Var.b();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            boolean z = this.e;
            wfe0.a aVar = this.c;
            if (!z && aVar.a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                aVar.b(c.a(this.b, sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(EnumC1110b.a, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            try {
                this.c.c(c.a(this.b, sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(EnumC1110b.b, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.getClass();
            this.e = true;
            try {
                this.c.d(c.a(this.b, sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(EnumC1110b.d, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            if (!this.e) {
                try {
                    this.c.e(c.a(this.b, sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(EnumC1110b.e, th);
                }
            }
            this.i = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.getClass();
            this.e = true;
            try {
                this.c.f(c.a(this.b, sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(EnumC1110b.c, th);
            }
        }

        public final SQLiteDatabase f(boolean z) throws Throwable {
            SQLiteDatabase readableDatabase;
            SQLiteDatabase readableDatabase2;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.i;
            Context context = this.a;
            if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w(jbkEboCkTqmGf.iOPEAYzjBM, "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    writableDatabase.getClass();
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase3 = getReadableDatabase();
                readableDatabase3.getClass();
                return readableDatabase3;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z) {
                        readableDatabase2 = getWritableDatabase();
                        readableDatabase2.getClass();
                    } else {
                        readableDatabase2 = getReadableDatabase();
                        readableDatabase2.getClass();
                    }
                    return readableDatabase2;
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        int iOrdinal = aVar.a.ordinal();
                        th = aVar.b;
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                            if (iOrdinal == 4) {
                                if (!(th instanceof SQLiteException)) {
                                    throw th;
                                }
                            } else {
                                uhc.a();
                                return null;
                            }
                        } else {
                            throw th;
                        }
                    }
                    if ((th instanceof SQLiteException) && databaseName != null && this.d) {
                        context.deleteDatabase(databaseName);
                        try {
                            if (z) {
                                readableDatabase = getWritableDatabase();
                                readableDatabase.getClass();
                            } else {
                                readableDatabase = getReadableDatabase();
                                readableDatabase.getClass();
                            }
                            return readableDatabase;
                        } catch (a e) {
                            throw e.b;
                        }
                    }
                    throw th;
                }
            }
        }
    }
}
