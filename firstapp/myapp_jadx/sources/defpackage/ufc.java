package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.a;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ufc implements a.b, baj {
    @Override // ua.naiksoftware.stomp.a.b
    public void a() {
        hic hicVar = hic.a;
        hicVar.getClass();
        x2 x2Var = hic.k;
        if (x2Var != null) {
            new nm8(x2Var.i("\r\n").c(new mdv(new fdy(new idy(hicVar.b(), new ogc()))))).d();
        } else {
            Intrinsics.n("connectionProvider");
            throw null;
        }
    }

    @Override // defpackage.baj
    public Object apply(Object obj) {
        return Long.valueOf(((q4c) obj).b);
    }
}
