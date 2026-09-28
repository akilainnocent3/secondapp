package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u00 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            default:
                lj0 lj0Var = (lj0) obj;
                return new lk40(lj0Var.a, lj0Var.b, lj0Var.c, lj0Var.d);
        }
    }
}
