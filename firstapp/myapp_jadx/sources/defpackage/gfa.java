package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gfa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gfa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nk2 binding;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((isw) obj2).A(eb9.c(urrVar).P(urrVar, true).d);
                break;
            default:
                zy10 zy10Var = (zy10) obj2;
                ((Boolean) obj).getClass();
                zt50 zt50Var = zy10Var.b;
                if (zt50Var != null && (binding = zt50Var.z.getBinding()) != null) {
                    binding.d.setStatus(false);
                }
                ((x5a0) zy10Var.d1).setValue(Boolean.TRUE);
                break;
        }
        return Unit.a;
    }
}
