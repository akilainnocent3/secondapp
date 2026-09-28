package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class yrj0 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ lsj0 b;

    public yrj0(cq40 cq40Var, lsj0 lsj0Var) {
        this.a = cq40Var;
        this.b = lsj0Var;
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
        this.b.o1();
    }
}
