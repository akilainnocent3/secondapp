package n9;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k implements m9.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final SQLiteProgram f116417b;

    public k(@oy.l SQLiteProgram delegate) {
        m0.p(delegate, "delegate");
        this.f116417b = delegate;
    }

    @Override // m9.g
    public void c0(int i10, @oy.l String value) {
        m0.p(value, "value");
        this.f116417b.bindString(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f116417b.close();
    }

    @Override // m9.g
    public void e(int i10, long j10) {
        this.f116417b.bindLong(i10, j10);
    }

    @Override // m9.g
    public void f(int i10, @oy.l byte[] value) {
        m0.p(value, "value");
        this.f116417b.bindBlob(i10, value);
    }

    @Override // m9.g
    public void g(int i10) {
        this.f116417b.bindNull(i10);
    }

    @Override // m9.g
    public void j(int i10, double d10) {
        this.f116417b.bindDouble(i10, d10);
    }

    @Override // m9.g
    public void x() {
        this.f116417b.clearBindings();
    }
}
