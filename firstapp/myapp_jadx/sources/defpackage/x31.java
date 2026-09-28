package defpackage;

import android.os.Handler;
import androidx.media3.exoplayer.d;

/* JADX INFO: loaded from: classes.dex */
public final class x31 {
    public final Handler a;
    public final d.a b;

    public x31(Handler handler, d.a aVar) {
        this.a = handler;
        this.b = aVar;
    }

    public final void a(final e5d e5dVar) {
        synchronized (e5dVar) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l31
                @Override // java.lang.Runnable
                public final void run() {
                    x31 x31Var = this.a;
                    e5d e5dVar2 = e5dVar;
                    synchronized (e5dVar2) {
                    }
                    d.a aVar = x31Var.b;
                    String str = jrh0.a;
                    d.this.s.T(e5dVar2);
                }
            });
        }
    }
}
