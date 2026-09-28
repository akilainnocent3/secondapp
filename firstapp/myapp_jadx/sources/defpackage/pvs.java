package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class pvs implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ qvs b;
    public final /* synthetic */ float c;

    public pvs(View view, qvs qvsVar, float f) {
        this.a = view;
        this.b = qvsVar;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.n0((this.a.getMeasuredWidth() * this.c) + (bqe.c() * 154.0f));
    }
}
