package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lc2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lc2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                lb80.d(pb80Var, 1);
                lb80.e(pb80Var, (String) obj2);
                return Unit.a;
            default:
                m480.l lVar = (m480.l) obj;
                lVar.getClass();
                vtw<m480> vtwVar = ((xqj0) obj2).n;
                if (vtwVar != null) {
                    vtwVar.a(lVar);
                    return Unit.a;
                }
                Intrinsics.n("securityUiEventFlow");
                throw null;
        }
    }
}
