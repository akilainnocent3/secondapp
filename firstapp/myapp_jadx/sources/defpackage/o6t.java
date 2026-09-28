package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o6t implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o6t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                nt4 nt4Var = (nt4) obj;
                nt4Var.getClass();
                ((Function1) obj2).invoke(nt4Var);
                break;
            case 1:
                zy10 zy10Var = (zy10) obj2;
                ((String) obj).getClass();
                zt50 zt50Var = zy10Var.b;
                zy10Var.C0(zt50Var != null ? zt50Var.z : null);
                zy10Var.f = false;
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((l560) obj2).z0(str);
                break;
        }
        return Unit.a;
    }
}
