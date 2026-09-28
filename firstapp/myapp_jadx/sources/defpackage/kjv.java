package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.k;

/* JADX INFO: loaded from: classes.dex */
public final class kjv implements u5i0.a {
    public final /* synthetic */ ljv b;

    public kjv(ljv ljvVar) {
        this.b = ljvVar;
    }

    @Override // u5i0.a
    public final void b() {
        k.a aVar = this.b.U;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // u5i0.a
    public final void c() {
        ljv ljvVar = this.b;
        Surface surface = ljvVar.h1;
        if (surface != null) {
            t5i0.a aVar = ljvVar.T0;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new l5i0(aVar, surface, SystemClock.elapsedRealtime()));
            }
            ljvVar.k1 = true;
        }
    }

    @Override // u5i0.a
    public final void g() {
        ljv ljvVar = this.b;
        if (ljvVar.h1 != null) {
            ljvVar.X0(0, 1);
        }
    }

    @Override // u5i0.a
    public final void a(v5i0 v5i0Var) {
    }
}
