package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u1y implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u1y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj2;
                dme0 dme0Var = (dme0) obj;
                dme0Var.getClass();
                if (dme0Var == dme0.b) {
                    function0.invoke();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return Double.valueOf(((Double) obj).doubleValue() - ((yui0) obj2).E1().getStepAmount());
        }
    }
}
