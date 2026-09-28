package defpackage;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x3p implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ z3p b;

    public x3p(cq40 cq40Var, z3p z3pVar) {
        this.a = cq40Var;
        this.b = z3pVar;
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
        z3p z3pVar = this.b;
        uqm uqmVar = z3pVar.f;
        if (uqmVar != null) {
            uqmVar.demandAccount(z3pVar.requireActivity(), new y3p(z3pVar));
        } else {
            Intrinsics.n("accountHelper");
            throw null;
        }
    }
}
