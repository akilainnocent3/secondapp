package defpackage;

import androidx.compose.foundation.gestures.b;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uhf0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ yhf0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ psw c;

    public uhf0(yhf0 yhf0Var, boolean z, psw pswVar) {
        this.a = yhf0Var;
        this.b = z;
        this.c = pswVar;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        yhf0 yhf0Var = this.a;
        ytw ytwVar = yhf0Var.f;
        aVar2.N(805428266);
        boolean z = ((i3z) ((x5a0) ytwVar).getValue()) == i3z.a || !(aVar2.O(kna.n) == asr.b);
        boolean zM = aVar2.M(yhf0Var);
        Object objY = aVar2.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (zM || objY == c0042a) {
            objY = new lk2(yhf0Var, 1);
            aVar2.r(objY);
        }
        ytw ytwVarC = m.c((Function1) objY, aVar2);
        Object objY2 = aVar2.y();
        if (objY2 == c0042a) {
            sfd sfdVar = new sfd(new hfg(ytwVarC, 3));
            aVar2.r(sfdVar);
            objY2 = sfdVar;
        }
        fr70 fr70Var = (fr70) objY2;
        boolean zM2 = aVar2.M(fr70Var) | aVar2.M(yhf0Var);
        Object objY3 = aVar2.y();
        if (zM2 || objY3 == c0042a) {
            objY3 = new thf0(fr70Var, yhf0Var);
            aVar2.r(objY3);
        }
        d dVarA = b.a((thf0) objY3, (i3z) ((x5a0) ytwVar).getValue(), this.b && ((t5a0) yhf0Var.b).j() != 0.0f, z, this.c);
        aVar2.H();
        return dVarA;
    }
}
