package defpackage;

import com.google.android.material.datepicker.c;

/* JADX INFO: loaded from: classes4.dex */
public final class nbv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public nbv(c cVar, int i) {
        this.b = cVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.y.s0(this.a);
    }
}
