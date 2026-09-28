package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class byi implements cbs {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ ayi b;

    public byi(Handler handler, ayi ayiVar) {
        this.a = handler;
        this.b = ayiVar;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        if (aVar == s9s.a.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            ibsVar.getLifecycle().d(this);
        }
    }
}
