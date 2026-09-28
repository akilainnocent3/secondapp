package defpackage;

import android.view.View;
import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class lwa0 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ yva0 b;

    public lwa0(cq40 cq40Var, yva0 yva0Var) {
        this.a = cq40Var;
        this.b = yva0Var;
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
        yva0.a aVar = yva0.c0;
        zwa0 zwa0VarC1 = this.b.c1();
        m800 m800Var = zwa0VarC1.v;
        int i = zwa0VarC1.W.a;
        m800Var.getClass();
        ResourceUiText resourceUiTextA = m800.a(i);
        od9 od9Var = zwa0VarC1.z;
        wwd0 wwd0Var = zwa0VarC1.E;
        zwa0VarC1.y1(new xwa0.g(resourceUiTextA, od9.b(od9Var, ((wwa0) wwd0Var.getValue()).c.a.b), ((wwa0) wwd0Var.getValue()).b, zwa0VarC1.T));
    }
}
