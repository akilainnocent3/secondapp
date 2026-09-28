package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.a;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jrj implements a.b {
    @Override // ua.naiksoftware.stomp.a.b
    public final void a() {
        msj msjVar = msj.a;
        x2 x2Var = msj.k;
        if (x2Var == null) {
            Intrinsics.n("connectionProvider");
            throw null;
        }
        jm8 jm8VarI = x2Var.i("\r\n");
        zd2<Boolean> zd2VarB = msjVar.b();
        new si6(1);
        new nm8(jm8VarI.c(new mdv(new fdy(new idy(zd2VarB, new vrj()))))).d();
    }
}
