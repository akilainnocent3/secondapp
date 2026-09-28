package defpackage;

import com.sportygames.commons.remote.model.LoadingState;
import foa0.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xx10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xx10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nle nleVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj2;
                int i2 = zy10.b.a[((LoadingState) obj).getStatus().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            uhc.a();
                            return null;
                        }
                        zt50 zt50Var = zy10Var.b;
                        if (zt50Var != null) {
                            zt50Var.Q.P();
                        }
                        zy10Var.J = true;
                    }
                } else if (!zy10Var.J) {
                    zt50 zt50Var2 = zy10Var.b;
                    if (zt50Var2 != null) {
                        zt50Var2.Q.P();
                    }
                    zy10Var.J = true;
                } else if (!zy10Var.d && ((nleVar = zy10Var.j0) == null || !nleVar.isShowing())) {
                    zy10Var.b1().x1();
                }
                return Unit.a;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, ((foa0) obj2).new c(f1e0Var, null), 3);
                return Unit.a;
        }
    }
}
