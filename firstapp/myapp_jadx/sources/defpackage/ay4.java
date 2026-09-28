package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class ay4 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ hy4 b;

    public ay4(cq40 cq40Var, hy4 hy4Var) {
        this.a = cq40Var;
        this.b = hy4Var;
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
