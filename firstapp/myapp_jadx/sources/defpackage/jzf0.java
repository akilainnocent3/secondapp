package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jzf0 extends rr7 {
    public boolean a0;
    public Function1<? super Boolean, Unit> b0;
    public final jwb0 c0;

    public jzf0(final boolean z, psw pswVar, boolean z2, boolean z3, su50 su50Var, final Function1 function1) {
        super(pswVar, null, z2, z3, null, su50Var, new Function0() { // from class: izf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                function1.invoke(Boolean.valueOf(!z));
                return Unit.a;
            }
        });
        this.a0 = z;
        this.b0 = function1;
        this.c0 = new jwb0(this, 1);
    }

    @Override // defpackage.g2
    public final void s2(pb80 pb80Var) {
        kzf0 kzf0Var = this.a0 ? kzf0.a : kzf0.b;
        ohp<Object>[] ohpVarArr = lb80.a;
        ob80<kzf0> ob80Var = hb80.I;
        ohp<Object> ohpVar = lb80.a[24];
        pb80Var.b(ob80Var, kzf0Var);
    }
}
