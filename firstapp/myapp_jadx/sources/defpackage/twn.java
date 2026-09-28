package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class twn implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ twn(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                break;
            default:
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szr.f(szrVar, 10, null, nu9.a, 6);
                break;
        }
        return Unit.a;
    }
}
