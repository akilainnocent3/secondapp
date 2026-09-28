package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y830 extends saj implements Function1<Float, Float> {
    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f) {
        float fJ;
        float fFloatValue = f.floatValue();
        d930 d930Var = (d930) this.receiver;
        isw iswVar = d930Var.f;
        isw iswVar2 = d930Var.g;
        float f2 = 0.0f;
        if (!d930Var.b()) {
            t5a0 t5a0Var = (t5a0) iswVar;
            float fJ2 = t5a0Var.j() + fFloatValue;
            if (fJ2 < 0.0f) {
                fJ2 = 0.0f;
            }
            float fJ3 = fJ2 - t5a0Var.j();
            ((t5a0) d930Var.f).A(fJ2);
            t5a0 t5a0Var2 = (t5a0) iswVar2;
            if (d930Var.a() <= t5a0Var2.j()) {
                fJ = d930Var.a();
            } else {
                float fD = f.d(Math.abs(d930Var.a() / ((t5a0) iswVar2).j()) - 1.0f, 0.0f, 2.0f);
                fJ = t5a0Var2.j() + (t5a0Var2.j() * (fD - (((float) Math.pow(fD, 2.0d)) / 4.0f)));
            }
            ((t5a0) d930Var.e).A(fJ);
            f2 = fJ3;
        }
        return Float.valueOf(f2);
    }
}
