package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g2f0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ z1f0 a;

    public g2f0(z1f0 z1f0Var) {
        this.a = z1f0Var;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(-1541271084);
        z1f0 z1f0Var = this.a;
        float f = z1f0Var.b;
        z5w z5wVar = z5w.a;
        twd0 twd0VarA = xe0.a(f, a6w.b(z5wVar, aVar2), null, aVar2, 0, 12);
        twd0 twd0VarA2 = xe0.a(z1f0Var.a, a6w.b(z5wVar, aVar2), null, aVar2, 0, 12);
        int i = 2;
        d dVarC = j.C(j.g(dVar, 1.0f), ht.a.g, 2);
        boolean zM = aVar2.M(twd0VarA2);
        Object objY = aVar2.y();
        if (zM || objY == a.C0041a.a) {
            objY = new e72(twd0VarA2, i);
            aVar2.r(objY);
        }
        d dVarW = j.w(g.b(dVarC, (Function1) objY), ((g7f) twd0VarA.getValue()).a);
        aVar2.H();
        return dVarW;
    }
}
