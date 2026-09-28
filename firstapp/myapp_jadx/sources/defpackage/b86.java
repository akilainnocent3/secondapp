package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b86 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b86(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (f46) ((v86) obj).a.invoke();
            default:
                zy10 zy10Var = (zy10) obj;
                int i2 = zy10Var.t0;
                if (i2 == zy10Var.u0) {
                    zt50 zt50Var = zy10Var.b;
                    if (zt50Var != null) {
                        zt50Var.S.setCross();
                    }
                } else {
                    int i3 = zy10Var.v0;
                    zt50 zt50Var2 = zy10Var.b;
                    if (i2 == i3) {
                        if (zt50Var2 != null) {
                            zt50Var2.R.setCross();
                        }
                    } else if (zt50Var2 != null) {
                        zt50Var2.z.setCross();
                    }
                }
                return Unit.a;
        }
    }
}
