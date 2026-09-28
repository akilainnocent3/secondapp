package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class syg implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ uyg b;

    public syg(cq40 cq40Var, uyg uygVar) {
        this.a = cq40Var;
        this.b = uygVar;
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
        uyg uygVar = this.b;
        pl6 pl6Var = uygVar.f;
        if (pl6Var != null) {
            uygVar.d.a(pl6Var);
        }
    }
}
