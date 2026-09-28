package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ela0 implements Function1 {
    public final /* synthetic */ goa0 a;

    public /* synthetic */ ela0(goa0 goa0Var) {
        this.a = goa0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bbs bbsVar = (bbs) obj;
        bbsVar.getClass();
        int i = goa0.d.a[bbsVar.a.ordinal()];
        goa0 goa0Var = this.a;
        if (i == 1) {
            goa0Var.y = true;
        } else if (i != 2) {
            if (i == 3) {
                goa0Var.y = false;
                goa0Var.c.j("closed");
            } else if (i != 4) {
                uhc.a();
                return null;
            }
        }
        return Unit.a;
    }
}
