package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.a;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jic implements a.b {
    @Override // ua.naiksoftware.stomp.a.b
    public final void a() {
        pjc pjcVar = pjc.a;
        x2 x2Var = pjc.k;
        if (x2Var == null) {
            Intrinsics.n("connectionProvider");
            throw null;
        }
        jm8 jm8VarI = x2Var.i("\r\n");
        zd2<Boolean> zd2VarB = pjcVar.b();
        new ric(0);
        new nm8(jm8VarI.c(new mdv(new fdy(new idy(zd2VarB, new sic()))))).d();
    }
}
