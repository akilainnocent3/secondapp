package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e540 extends saj implements Function1<Float, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        o540 o540Var = (o540) this.receiver;
        o540Var.H = Float.valueOf(fFloatValue);
        o540Var.m0();
        return Unit.a;
    }
}
