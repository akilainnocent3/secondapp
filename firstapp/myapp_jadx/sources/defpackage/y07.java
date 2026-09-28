package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y07 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y07(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f07 f07Var = (f07) obj;
                f07Var.getClass();
                ((Function1) obj2).invoke(new rw6.k(f07Var));
                return Unit.a;
            default:
                t4b t4bVar = (t4b) obj2;
                ytw ytwVar = t4bVar.H.t;
                Boolean bool = Boolean.TRUE;
                ((x5a0) ytwVar).setValue(bool);
                ((x5a0) t4bVar.H.s).setValue(bool);
                t4b.s2(t4bVar.H, ((nk0) obj).b, t4bVar.I, t4bVar.J);
                return bool;
        }
    }
}
