package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z830 extends pf implements Function2<Float, v1b<? super Float>, Object> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, v1b<? super Float> v1bVar) {
        float fFloatValue = f.floatValue();
        d930 d930Var = (d930) this.a;
        boolean zB = d930Var.b();
        isw iswVar = d930Var.f;
        float f2 = 0.0f;
        if (!zB) {
            if (d930Var.a() > ((t5a0) d930Var.g).j()) {
                ((Function0) d930Var.b.getValue()).invoke();
            }
            ej5.c(d930Var.a, null, null, new c930(d930Var, 0.0f, null), 3);
            if (((t5a0) iswVar).j() == 0.0f || fFloatValue < 0.0f) {
                fFloatValue = 0.0f;
            }
            ((t5a0) iswVar).A(0.0f);
            f2 = fFloatValue;
        }
        return new Float(f2);
    }
}
