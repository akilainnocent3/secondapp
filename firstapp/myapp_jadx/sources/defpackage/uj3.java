package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipActivity$initViewModel$13", f = "BetslipActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uj3 extends tje0 implements gaj<q43, vwv, v1b<? super Pair<? extends q43, ? extends vwv>>, Object> {
    public /* synthetic */ q43 a;
    public /* synthetic */ vwv b;

    @Override // defpackage.gaj
    public final Object invoke(q43 q43Var, vwv vwvVar, v1b<? super Pair<? extends q43, ? extends vwv>> v1bVar) {
        uj3 uj3Var = new uj3(3, v1bVar);
        uj3Var.a = q43Var;
        uj3Var.b = vwvVar;
        return uj3Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        q43 q43Var = this.a;
        vwv vwvVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(q43Var, vwvVar);
    }
}
