package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class mka0 implements Function1 {
    public final /* synthetic */ foa0 a;

    public /* synthetic */ mka0(foa0 foa0Var) {
        this.a = foa0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bbs bbsVar = (bbs) obj;
        bbsVar.getClass();
        int i = foa0.d.a[bbsVar.a.ordinal()];
        foa0 foa0Var = this.a;
        if (i == 1) {
            foa0Var.A = true;
        } else if (i != 2) {
            if (i == 3) {
                foa0Var.A = false;
                foa0Var.c.j("closed");
            } else if (i != 4) {
                uhc.a();
                return null;
            }
        }
        return Unit.a;
    }
}
