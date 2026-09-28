package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sf1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sf1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                if (((Boolean) ((ytw) obj2).getValue()).booleanValue()) {
                    lzaVar.b2();
                }
                break;
            case 1:
                une0 une0Var = (une0) obj;
                une0Var.getClass();
                ((doe0) obj2).c.invoke(une0Var);
                break;
            default:
                n27 n27Var = (n27) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.b(n27Var.m.d().floatValue());
                a7lVar.f(n27Var.n.d().floatValue());
                break;
        }
        return Unit.a;
    }
}
