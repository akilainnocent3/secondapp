package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.a;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tfc implements a.b {
    @Override // ua.naiksoftware.stomp.a.b
    public final void a() {
        iic iicVar = iic.a;
        x2 x2Var = iic.k;
        if (x2Var != null) {
            new nm8(x2Var.i("\r\n").c(new mdv(new fdy(new idy(iicVar.b(), new xhc()))))).d();
        } else {
            Intrinsics.n("connectionProvider");
            throw null;
        }
    }
}
