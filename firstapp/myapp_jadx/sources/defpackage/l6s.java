package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l6s implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                n6s n6sVar = (n6s) obj2;
                ytw ytwVar = n6sVar.t;
                ijf0 ijf0Var = (ijf0) obj;
                String str = ijf0Var.a.b;
                nk0 nk0Var = n6sVar.j;
                if (!Intrinsics.g(str, nk0Var != null ? nk0Var.b : null)) {
                    ((x5a0) n6sVar.k).setValue(ocl.a);
                    if (((Boolean) ((x5a0) ytwVar).getValue()).booleanValue()) {
                        ((x5a0) ytwVar).setValue(Boolean.FALSE);
                    } else {
                        ((x5a0) n6sVar.s).setValue(Boolean.FALSE);
                    }
                }
                long j = ulf0.b;
                n6sVar.f(j);
                n6sVar.e(j);
                n6sVar.u.invoke(ijf0Var);
                n6sVar.b.invalidate();
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                ((Function1) obj2).invoke(new pq90.f(str2));
                break;
        }
        return Unit.a;
    }
}
