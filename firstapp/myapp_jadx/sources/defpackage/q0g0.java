package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class q0g0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ dtg0<Boolean> a;

    public q0g0(dtg0<Boolean> dtg0Var) {
        this.a = dtg0Var;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        d dVar2 = dVar;
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(-1498516085);
        goh gohVarB = a6w.b(z5w.b, aVar2);
        goh gohVarB2 = a6w.b(z5w.d, aVar2);
        g0h0 g0h0Var = gjs.b;
        dtg0<Boolean> dtg0Var = this.a;
        o oVar = dtg0Var.a;
        ytw ytwVar = dtg0Var.d;
        boolean zBooleanValue = ((Boolean) oVar.V()).booleanValue();
        aVar2.N(-1553362193);
        float f = zBooleanValue ? 1.0f : 0.8f;
        aVar2.H();
        Float fValueOf = Float.valueOf(f);
        x5a0 x5a0Var = (x5a0) ytwVar;
        boolean zBooleanValue2 = ((Boolean) x5a0Var.getValue()).booleanValue();
        aVar2.N(-1553362193);
        float f2 = zBooleanValue2 ? 1.0f : 0.8f;
        aVar2.H();
        Float fValueOf2 = Float.valueOf(f2);
        dtg0Var.f();
        aVar2.N(386845748);
        aVar2.H();
        dtg0.d dVarD = vtg0.d(dtg0Var, fValueOf, fValueOf2, gohVarB, g0h0Var, aVar2, 196608);
        boolean zBooleanValue3 = ((Boolean) dtg0Var.a.V()).booleanValue();
        aVar2.N(2073045083);
        float f3 = zBooleanValue3 ? 1.0f : 0.0f;
        aVar2.H();
        Float fValueOf3 = Float.valueOf(f3);
        boolean zBooleanValue4 = ((Boolean) x5a0Var.getValue()).booleanValue();
        aVar2.N(2073045083);
        float f4 = zBooleanValue4 ? 1.0f : 0.0f;
        aVar2.H();
        Float fValueOf4 = Float.valueOf(f4);
        dtg0Var.f();
        aVar2.N(-281714272);
        aVar2.H();
        d dVarB = androidx.compose.ui.graphics.a.b(dVar2, ((Number) dVarD.getValue()).floatValue(), ((Number) dVarD.getValue()).floatValue(), ((Number) vtg0.d(dtg0Var, fValueOf3, fValueOf4, gohVarB2, g0h0Var, aVar2, 196608).getValue()).floatValue(), 0.0f, null, 131064);
        aVar2.H();
        return dVarB;
    }
}
