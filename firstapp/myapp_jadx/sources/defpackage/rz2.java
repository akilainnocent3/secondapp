package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class rz2 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ qz2 b;

    public rz2(cq40 cq40Var, qz2 qz2Var) {
        this.a = cq40Var;
        this.b = qz2Var;
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
        qz2 qz2Var = this.b;
        qz2Var.getAccountHelper().demandAccount(qz2Var.requireActivity(), new sz2(qz2Var));
    }
}
