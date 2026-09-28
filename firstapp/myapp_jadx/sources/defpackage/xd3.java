package defpackage;

import android.content.Context;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xd3 implements yfo {
    public final /* synthetic */ yd3 a;

    public xd3(yd3 yd3Var) {
        this.a = yd3Var;
    }

    @Override // defpackage.yfo
    public final void b(boolean z) {
        yd3 yd3Var = this.a;
        jlo jloVar = yd3Var.I;
        if (jloVar == null) {
            Intrinsics.n("instantWinRouter");
            throw null;
        }
        Context contextRequireContext = yd3Var.requireContext();
        contextRequireContext.getClass();
        yd3Var.startActivity(jloVar.t(contextRequireContext, new InstantWinBetHistoryInput(((n4p) yd3Var.s0()).c())));
    }

    @Override // defpackage.yfo
    public final void a() {
    }
}
