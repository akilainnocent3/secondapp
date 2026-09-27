package yads;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qc0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cursor f154425a;

    public qc0(Cursor cursor) {
        this.f154425a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f154425a.close();
    }
}
