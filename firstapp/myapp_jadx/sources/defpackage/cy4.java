package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class cy4 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ jy4 b;

    public cy4(cq40 cq40Var, jy4 jy4Var) {
        this.a = cq40Var;
        this.b = jy4Var;
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
        this.b.invoke();
    }
}
