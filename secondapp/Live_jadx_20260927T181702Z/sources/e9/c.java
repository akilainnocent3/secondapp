package e9;

import cs.g;
import dr.p0;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g
    public final int f80590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    public final int f80591b;

    public c(int i10, int i11) {
        this.f80590a = i10;
        this.f80591b = i11;
    }

    public void a(@l l9.d connection) {
        m0.p(connection, "connection");
        if (!(connection instanceof o9.d)) {
            throw new p0("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((o9.d) connection).d());
    }

    public void b(@l m9.e db2) {
        m0.p(db2, "db");
        throw new p0("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
