package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$state$1", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ubr extends tje0 implements iaj<ijf0, sx70, ux70, v1b<? super abr>, Object> {
    public /* synthetic */ ijf0 a;
    public /* synthetic */ sx70 b;
    public /* synthetic */ ux70 c;

    @Override // defpackage.iaj
    public final Object d(ijf0 ijf0Var, sx70 sx70Var, ux70 ux70Var, v1b<? super abr> v1bVar) {
        ubr ubrVar = new ubr(4, v1bVar);
        ubrVar.a = ijf0Var;
        ubrVar.b = sx70Var;
        ubrVar.c = ux70Var;
        return ubrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ijf0 ijf0Var = this.a;
        sx70 sx70Var = this.b;
        ux70 ux70Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new abr(ijf0Var, sx70Var, ux70Var);
    }
}
