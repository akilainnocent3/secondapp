package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class nhl implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ qhl b;

    public nhl(cq40 cq40Var, qhl qhlVar) {
        this.a = cq40Var;
        this.b = qhlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qhl qhlVar = this.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 500) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        try {
            Object tag = view.getTag();
            tag.getClass();
            ez80 ez80Var = (ez80) tag;
            Object tag2 = qhlVar.b.w.getTag();
            tag2.getClass();
            qhlVar.c.k(ez80Var, ((Boolean) tag2).booleanValue());
        } catch (Exception unused) {
        }
    }
}
