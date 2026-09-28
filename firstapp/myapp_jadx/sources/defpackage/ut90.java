package defpackage;

import androidx.camera.core.b;
import androidx.camera.core.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ut90 extends b {
    public final AtomicBoolean d;

    public ut90(c cVar) {
        super(cVar);
        this.d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.b, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
