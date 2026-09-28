package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class fwu implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ gwu b;

    public fwu(cq40 cq40Var, gwu gwuVar) {
        this.a = cq40Var;
        this.b = gwuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bi6 bi6Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        Object tag = view.getTag();
        if (!(tag instanceof pl6)) {
            tag = null;
        }
        pl6 pl6Var = (pl6) tag;
        if (pl6Var == null || (bi6Var = this.b.b) == null) {
            return;
        }
        xh6 xh6Var = bi6Var.a;
        xh6Var.l(pl6Var);
        gym.a(xh6Var.e.a.E0(), nyy.a);
    }
}
