package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class lhl implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ qhl b;

    public lhl(cq40 cq40Var, qhl qhlVar) {
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
        zzy zzyVar = this.b.c;
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = "";
        }
        zzyVar.o(str);
    }
}
