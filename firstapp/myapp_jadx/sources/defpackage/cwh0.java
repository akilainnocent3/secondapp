package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cwh0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jj0 jj0Var = (jj0) obj;
        float f = jj0Var.a;
        return new gly((((long) Float.floatToRawIntBits(jj0Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
