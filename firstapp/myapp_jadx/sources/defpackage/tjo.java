package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinQuickBetViewViewModel$loadTeamStrengthGuidelineStatus$1", f = "InstantWinQuickBetViewViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class tjo extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vjo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjo(vjo vjoVar, v1b<? super tjo> v1bVar) {
        super(2, v1bVar);
        this.b = vjoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tjo(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tjo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        vjo vjoVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = vjoVar.a;
            this.a = 1;
            obj = m2lVar.a.getBoolean("team_strength_guideline_shown", true, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        vjoVar.b.m(bool);
        return Unit.a;
    }
}
