package o9;

import dr.e0;
import java.io.IOException;
import kotlin.jvm.internal.m0;
import l9.i;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements l9.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final m9.e f118846b;

    public d(@l m9.e db2) {
        m0.p(db2, "db");
        this.f118846b = db2;
    }

    @Override // l9.d
    @l
    public i F0(@l String sql) {
        m0.p(sql, "sql");
        if (this.f118846b.isOpen()) {
            return f.f118848e.a(this.f118846b, sql);
        }
        l9.b.b(21, "connection is closed");
        throw new e0();
    }

    @Override // l9.d, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f118846b.close();
    }

    @l
    public final m9.e d() {
        return this.f118846b;
    }

    @Override // l9.d
    public boolean w() {
        return this.f118846b.w();
    }
}
