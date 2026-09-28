package androidx.media3.exoplayer;

import android.os.Looper;
import defpackage.cft;
import defpackage.fqe0;
import defpackage.ly0;
import defpackage.qxf0;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final b a;
    public final a b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public interface a {
    }

    public interface b {
        void m(int i, Object obj);
    }

    public j(a aVar, b bVar, qxf0 qxf0Var, int i, fqe0 fqe0Var, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        ly0.f(!this.f);
        this.f = true;
        e eVar = (e) this.b;
        if (!eVar.X && eVar.y.getThread().isAlive()) {
            eVar.v.e(14, this).b();
        } else {
            cft.g("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
