package m9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import cs.o;
import cv.k0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface f extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nSupportSQLiteOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,366:1\n1#2:367\n1869#3,2:368\n108#4:370\n80#4,22:371\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n220#1:368,2\n228#1:370\n228#1:371,22\n*E\n"})
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        public static final C1004a f107126b = new C1004a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        public static final String f107127c = "SupportSQLite";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @cs.g
        public final int f107128a;

        /* JADX INFO: renamed from: m9.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C1004a {
            public /* synthetic */ C1004a(x xVar) {
                this();
            }

            public C1004a() {
            }
        }

        public a(int i10) {
            this.f107128a = i10;
        }

        public final void a(String str) {
            if (k0.c2(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = m0.t(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(@l e db2) {
            m0.p(db2, "db");
        }

        public void c(@l e db2) {
            m0.p(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> listZ = null;
            try {
                try {
                    listZ = db2.z();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (listZ != null) {
                    return;
                }
            } finally {
                if (listZ != null) {
                    Iterator<T> it = listZ.iterator();
                    while (it.hasNext()) {
                        Object second = ((Pair) it.next()).second;
                        m0.o(second, "second");
                        a((String) second);
                    }
                } else {
                    String path2 = db2.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        }

        public abstract void d(@l e eVar);

        public void e(@l e db2, int i10, int i11) {
            m0.p(db2, "db");
            throw new SQLiteException("Can't downgrade database from version " + i10 + " to " + i11);
        }

        public void f(@l e db2) {
            m0.p(db2, "db");
        }

        public abstract void g(@l e eVar, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        @l
        f a(@l b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @m
    String getDatabaseName();

    @l
    e getReadableDatabase();

    @l
    e getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @l
        public static final C1005b f107129f = new C1005b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        @cs.g
        public final Context f107130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @cs.g
        @m
        public final String f107131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        @cs.g
        public final a f107132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @cs.g
        public final boolean f107133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @cs.g
        public final boolean f107134e;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @s1({"SMAP\nSupportSQLiteOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @l
            public final Context f107135a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @m
            public String f107136b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @m
            public a f107137c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f107138d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f107139e;

            public a(@l Context context) {
                m0.p(context, "context");
                this.f107135a = context;
            }

            @l
            public a a(boolean z10) {
                this.f107139e = z10;
                return this;
            }

            @l
            public b b() {
                String str;
                a aVar = this.f107137c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f107138d && ((str = this.f107136b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f107135a, this.f107136b, aVar, this.f107138d, this.f107139e);
            }

            @l
            public a c(@l a callback) {
                m0.p(callback, "callback");
                this.f107137c = callback;
                return this;
            }

            @l
            public a d(@m String str) {
                this.f107136b = str;
                return this;
            }

            @l
            public a e(boolean z10) {
                this.f107138d = z10;
                return this;
            }
        }

        /* JADX INFO: renamed from: m9.f$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C1005b {
            public /* synthetic */ C1005b(x xVar) {
                this();
            }

            @l
            @o
            public final a a(@l Context context) {
                m0.p(context, "context");
                return new a(context);
            }

            public C1005b() {
            }
        }

        public b(@l Context context, @m String str, @l a callback, boolean z10, boolean z11) {
            m0.p(context, "context");
            m0.p(callback, "callback");
            this.f107130a = context;
            this.f107131b = str;
            this.f107132c = callback;
            this.f107133d = z10;
            this.f107134e = z11;
        }

        @l
        @o
        public static final a a(@l Context context) {
            return f107129f.a(context);
        }

        public /* synthetic */ b(Context context, String str, a aVar, boolean z10, boolean z11, int i10, x xVar) {
            this(context, str, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
        }
    }
}
