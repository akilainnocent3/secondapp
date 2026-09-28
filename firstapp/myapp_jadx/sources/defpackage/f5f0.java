package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f5f0 implements mv0<Float, ij0> {
    public final xi0<Float> a;

    public f5f0(xi0<Float> xi0Var) {
        this.a = xi0Var;
    }

    @Override // defpackage.mv0
    public final Object a(tp70 tp70Var, Float f, Float f2, Function1 function1, s4a0 s4a0Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objD = ssi.d(tp70Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, cj0.a(28, 0.0f, fFloatValue2), this.a, function1, s4a0Var);
        return objD == y5b.a ? objD : (ti0) objD;
    }
}
