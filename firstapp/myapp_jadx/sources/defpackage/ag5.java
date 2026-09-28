package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog$observeBuildAndGoData$1", f = "BuildAndGoRunningPageDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ag5 extends tje0 implements gaj<lk50<? extends Sports>, lk50<? extends Round>, v1b<? super Pair<? extends lk50<? extends Sports>, ? extends lk50<? extends Round>>>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ lk50 b;

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends Sports> lk50Var, lk50<? extends Round> lk50Var2, v1b<? super Pair<? extends lk50<? extends Sports>, ? extends lk50<? extends Round>>> v1bVar) {
        ag5 ag5Var = new ag5(3, v1bVar);
        ag5Var.a = lk50Var;
        ag5Var.b = lk50Var2;
        return ag5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        lk50 lk50Var2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(lk50Var, lk50Var2);
    }
}
