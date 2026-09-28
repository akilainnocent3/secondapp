package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vvc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vvc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fxc) obj2).c(((Long) obj).longValue());
                break;
            case 1:
                kr00 kr00Var = (kr00) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                kr00Var.A = bool;
                kr00Var.F.postDelayed(kr00Var.I, 500L);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((nn40) obj2).v0(str);
                break;
        }
        return Unit.a;
    }
}
