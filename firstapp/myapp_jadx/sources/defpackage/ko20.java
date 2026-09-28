package defpackage;

import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko20 implements Function1 {
    public final /* synthetic */ dq40 a;

    public /* synthetic */ ko20(dq40 dq40Var) {
        this.a = dq40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T tL;
        hvg0 hvg0Var = (hvg0) obj;
        hvg0Var.getClass();
        gyr gyrVar = ((ivg0) hvg0Var).D;
        dq40 dq40Var = this.a;
        List list = (List) dq40Var.a;
        if (list != null) {
            list.add(gyrVar);
            tL = list;
        } else {
            tL = b.l(gyrVar);
        }
        dq40Var.a = tL;
        return gvg0.b;
    }
}
