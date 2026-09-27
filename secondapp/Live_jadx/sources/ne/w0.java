package ne;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends SQLiteOpenHelper {
    public static final a A;
    public static final List<a> B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f116513d = "com.google.android.datatransport.events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f116514e = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f116515f = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f116516g = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f116517h = "CREATE INDEX events_backend_id on events(context_id)";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f116518i = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f116519j = "DROP TABLE events";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f116520k = "DROP TABLE event_metadata";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f116521l = "DROP TABLE transport_contexts";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f116522m = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f116523n = "DROP TABLE IF EXISTS event_payloads";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f116524o = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f116525p = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f116527r = "DROP TABLE IF EXISTS log_event_dropped";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f116528s = "DROP TABLE IF EXISTS global_log_event_state";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f116530u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f116531v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f116532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f116533x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f116534y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f116535z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f116537c;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f116526q = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + gi.j.f86771d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f116529t = 7;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: ne.p0
            @Override // ne.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.a(sQLiteDatabase);
            }
        };
        f116530u = aVar;
        a aVar2 = new a() { // from class: ne.q0
            @Override // ne.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.i(sQLiteDatabase);
            }
        };
        f116531v = aVar2;
        a aVar3 = new a() { // from class: ne.r0
            @Override // ne.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f116532w = aVar3;
        a aVar4 = new a() { // from class: ne.s0
            @Override // ne.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.k(sQLiteDatabase);
            }
        };
        f116533x = aVar4;
        a aVar5 = new a() { // from class: ne.t0
            @Override // ne.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.d(sQLiteDatabase);
            }
        };
        f116534y = aVar5;
        a aVar6 = new a() { // from class: ne.u0
            @Override // ne.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f116535z = aVar6;
        a aVar7 = new a() { // from class: ne.v0
            @Override // ne.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.b(sQLiteDatabase);
            }
        };
        A = aVar7;
        B = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    @cr.a
    public w0(Context context, @cr.b("SQLITE_DB_NAME") String str, @cr.b("SCHEMA_VERSION") int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f116537c = false;
        this.f116536b = i10;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f116514e);
        sQLiteDatabase.execSQL(f116515f);
        sQLiteDatabase.execSQL(f116516g);
        sQLiteDatabase.execSQL(f116517h);
        sQLiteDatabase.execSQL(f116518i);
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f116527r);
        sQLiteDatabase.execSQL(f116528s);
        sQLiteDatabase.execSQL(f116524o);
        sQLiteDatabase.execSQL(f116525p);
        sQLiteDatabase.execSQL(f116526q);
    }

    public static /* synthetic */ void i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(f116523n);
        sQLiteDatabase.execSQL(f116522m);
    }

    public final void l(SQLiteDatabase sQLiteDatabase) {
        if (this.f116537c) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    public final void m(SQLiteDatabase sQLiteDatabase, int i10) {
        l(sQLiteDatabase);
        n(sQLiteDatabase, 0, i10);
    }

    public final void n(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = B;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                B.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f116537c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m(sQLiteDatabase, this.f116536b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(f116519j);
        sQLiteDatabase.execSQL(f116520k);
        sQLiteDatabase.execSQL(f116521l);
        sQLiteDatabase.execSQL(f116523n);
        sQLiteDatabase.execSQL(f116527r);
        sQLiteDatabase.execSQL(f116528s);
        m(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        l(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l(sQLiteDatabase);
        n(sQLiteDatabase, i10, i11);
    }
}
