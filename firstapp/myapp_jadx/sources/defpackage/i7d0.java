package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i7d0 extends saj implements Function1<Set<? extends String>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Set<? extends String> set) {
        Set<? extends String> set2 = set;
        set2.getClass();
        c8d0 c8d0Var = (c8d0) this.receiver;
        c8d0Var.getClass();
        wwd0 wwd0Var = c8d0Var.w;
        if (!set2.equals(((w7d0) wwd0Var.getValue()).b)) {
            List<pt00> list = ((w7d0) wwd0Var.getValue()).a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (set2.contains(((pt00) obj).a)) {
                    arrayList.add(obj);
                }
            }
            c8d0Var.d.a(new r7d0(CollectionsKt.a0(arrayList, ",", null, null, new nu4(1), 30)), k00.d);
            wwd0Var.k(null, w7d0.a((w7d0) wwd0Var.getValue(), null, set2, null, 5));
            wwd0Var.k(null, w7d0.a((w7d0) wwd0Var.getValue(), null, null, e0b.d.a, 3));
            c8d0Var.A = 1;
            jvd0 jvd0Var = c8d0Var.C;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            c8d0Var.C = ej5.c(o8i0.d(c8d0Var), null, null, new a8d0(c8d0Var, null), 3);
        }
        return Unit.a;
    }
}
