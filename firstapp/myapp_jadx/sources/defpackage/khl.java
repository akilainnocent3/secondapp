package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class khl implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ qhl b;

    public khl(cq40 cq40Var, qhl qhlVar) {
        this.a = cq40Var;
        this.b = qhlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 200) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        Object tag = view.getTag();
        pl6 pl6Var = tag instanceof pl6 ? (pl6) tag : null;
        if (pl6Var != null) {
            this.b.e.invoke(pl6Var);
        }
    }
}
