package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class ohl implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ qhl b;

    public ohl(cq40 cq40Var, qhl qhlVar) {
        this.a = cq40Var;
        this.b = qhlVar;
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
        try {
            Object tag = view.getTag();
            tag.getClass();
            this.b.c.h((onf) tag);
        } catch (Exception unused) {
        }
    }
}
