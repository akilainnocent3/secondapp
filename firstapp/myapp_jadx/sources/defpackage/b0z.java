package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class b0z implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ mzy b;

    public b0z(cq40 cq40Var, mzy mzyVar) {
        this.a = cq40Var;
        this.b = mzyVar;
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
        mzy mzyVar = this.b;
        if (mzyVar != null) {
            vzy vzyVar = mzyVar.a;
            vzyVar.C.demandAccount(vzyVar.getActivity(), vzyVar);
        }
    }
}
