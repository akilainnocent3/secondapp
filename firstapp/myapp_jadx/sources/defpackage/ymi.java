package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$1", f = "FootballViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ymi extends tje0 implements jaj<Boolean, Boolean, Boolean, py90, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ py90 d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        py90 py90Var = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(z && z2 && (z3 || py90Var == py90.b));
    }

    @Override // defpackage.jaj
    public final Object l(Boolean bool, Boolean bool2, Boolean bool3, py90 py90Var, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        boolean zBooleanValue3 = bool3.booleanValue();
        ymi ymiVar = new ymi(5, v1bVar);
        ymiVar.a = zBooleanValue;
        ymiVar.b = zBooleanValue2;
        ymiVar.c = zBooleanValue3;
        ymiVar.d = py90Var;
        return ymiVar.invokeSuspend(Unit.a);
    }
}
