package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class by4 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ iy4 b;

    public by4(cq40 cq40Var, iy4 iy4Var) {
        this.a = cq40Var;
        this.b = iy4Var;
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
