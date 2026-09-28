package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x46 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x46(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((Number) ((wd0) obj2).d()).floatValue());
                break;
            default:
                zy10 zy10Var = (zy10) obj2;
                ((String) obj).getClass();
                zt50 zt50Var = zy10Var.b;
                zy10Var.C0(zt50Var != null ? zt50Var.S : null);
                zy10Var.e = false;
                break;
        }
        return Unit.a;
    }
}
