package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipActivity$initViewModel$3", f = "BetslipActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wj3 extends tje0 implements jaj<q43, Boolean, Integer, Boolean, v1b<? super p43>, Object> {
    public /* synthetic */ q43 a;
    public /* synthetic */ boolean b;
    public /* synthetic */ int c;
    public /* synthetic */ boolean d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        q43 q43Var = this.a;
        boolean z = this.b;
        int i = this.c;
        boolean z2 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new p43(q43Var, z, i, z2);
    }

    @Override // defpackage.jaj
    public final Object l(q43 q43Var, Boolean bool, Integer num, Boolean bool2, v1b<? super p43> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        wj3 wj3Var = new wj3(5, v1bVar);
        wj3Var.a = q43Var;
        wj3Var.b = zBooleanValue;
        wj3Var.c = iIntValue;
        wj3Var.d = zBooleanValue2;
        return wj3Var.invokeSuspend(Unit.a);
    }
}
