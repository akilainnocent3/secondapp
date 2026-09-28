package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dm2 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ dm2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                hl30 hl30Var = (hl30) obj;
                if (hl30Var instanceof cu30) {
                    return (cu30) hl30Var;
                }
                return null;
            default:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                uv60 uv60Var = kx60.a;
                Boolean bool = Boolean.FALSE;
                nk0 nk0Var = (Intrinsics.g(obj2, bool) || obj2 == null) ? null : (nk0) uv60Var.b.invoke(obj2);
                nk0Var.getClass();
                Object obj3 = list.get(1);
                int i = ulf0.c;
                ulf0 ulf0Var = (Intrinsics.g(obj3, bool) || obj3 == null) ? null : (ulf0) kx60.p.b.invoke(obj3);
                ulf0Var.getClass();
                return new ijf0(nk0Var, ulf0Var.a, (ulf0) null);
        }
    }
}
