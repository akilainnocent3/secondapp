package defpackage;

import android.view.View;
import com.sportybet.android.account.international.verify.INTVerifyFragment;

/* JADX INFO: loaded from: classes5.dex */
public final class exm implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ INTVerifyFragment b;

    public exm(cq40 cq40Var, INTVerifyFragment iNTVerifyFragment) {
        this.a = cq40Var;
        this.b = iNTVerifyFragment;
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
        ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
        this.b.y0();
    }
}
