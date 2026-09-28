package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                c20 c20Var = (c20) obj;
                Object value = ((x5a0) c20Var.l).getValue();
                if (value != null) {
                    return value;
                }
                float fJ = ((t5a0) c20Var.j).j();
                boolean zIsNaN = Float.isNaN(fJ);
                ytw ytwVar = c20Var.g;
                if (zIsNaN) {
                    return ((x5a0) ytwVar).getValue();
                }
                Object value2 = ((x5a0) ytwVar).getValue();
                m9f m9fVarE = c20Var.e();
                float fD = m9fVarE.d(value2);
                if (fD != fJ && !Float.isNaN(fD)) {
                    if (fD < fJ) {
                        Object objB = m9fVarE.b(fJ, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = m9fVarE.b(fJ, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value2;
            default:
                return Integer.valueOf(((List) obj).size());
        }
    }
}
