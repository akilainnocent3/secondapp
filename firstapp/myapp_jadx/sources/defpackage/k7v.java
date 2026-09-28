package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class k7v implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ vh6 b;

    public k7v(cq40 cq40Var, vh6 vh6Var) {
        this.a = cq40Var;
        this.b = vh6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 500) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        Object tag = view.getTag();
        pl6 pl6Var = tag instanceof pl6 ? (pl6) tag : null;
        if (pl6Var == null) {
            return;
        }
        this.b.invoke(pl6Var);
    }
}
