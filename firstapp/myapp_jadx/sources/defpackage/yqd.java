package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class yqd implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ lrd b;

    public yqd(cq40 cq40Var, lrd lrdVar) {
        this.a = cq40Var;
        this.b = lrdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        this.b.u1();
    }
}
