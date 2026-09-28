package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r10(Object obj, int i) {
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
                return !zIsNaN ? c20Var.c(fJ, 0.0f, ((x5a0) ytwVar).getValue()) : ((x5a0) ytwVar).getValue();
            case 1:
                return Float.valueOf(((l65) obj).a.e.g());
            default:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
        }
    }
}
