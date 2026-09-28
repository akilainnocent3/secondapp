package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lv20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lv20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fjf0 fjf0Var = (fjf0) obj2;
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                if (ijf0Var.a.b.length() <= 4) {
                    ((x5a0) fjf0Var.c).setValue(ijf0Var);
                }
                return Unit.a;
            default:
                m480.k kVar = (m480.k) obj;
                kVar.getClass();
                vtw<m480> vtwVar = ((xqj0) obj2).n;
                if (vtwVar != null) {
                    vtwVar.a(kVar);
                    return Unit.a;
                }
                Intrinsics.n("securityUiEventFlow");
                throw null;
        }
    }
}
