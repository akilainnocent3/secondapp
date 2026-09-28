package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class ee3 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ yd3 b;

    public ee3(cq40 cq40Var, yd3 yd3Var) {
        this.a = cq40Var;
        this.b = yd3Var;
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
        this.b.v0();
    }
}
