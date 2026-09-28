package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hbb implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Integer) obj).getClass();
                break;
            case 1:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.v0(null);
                a7lVar.l(false);
                a7lVar.c0(1);
                break;
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                break;
        }
        return Unit.a;
    }
}
