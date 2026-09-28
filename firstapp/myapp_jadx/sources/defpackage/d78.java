package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d78 extends qlr implements Function1<lj0, j58> {
    public final /* synthetic */ h68 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d78(h68 h68Var) {
        super(1);
        this.a = h68Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j58 invoke(lj0 lj0Var) {
        lj0 lj0Var2 = lj0Var;
        float f = lj0Var2.b;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = lj0Var2.c;
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        float f3 = lj0Var2.d;
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float f6 = lj0Var2.a;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        return new j58(j58.b(r58.a(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, x68.x), this.a));
    }
}
