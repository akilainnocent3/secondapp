package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabKt$LNMissionTab$1$1", f = "LNMissionTab.kt", l = {}, m = "invokeSuspend", v = 2)
public final class luq extends tje0 implements gaj<v5b, duq, v1b<? super Unit>, Object> {
    public /* synthetic */ duq a;
    public final /* synthetic */ Function1<nvp, Unit> b;
    public final /* synthetic */ Function0<Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public luq(Function1<? super nvp, Unit> function1, Function0<Unit> function0, v1b<? super luq> v1bVar) {
        super(3, v1bVar);
        this.b = function1;
        this.c = function0;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, duq duqVar, v1b<? super Unit> v1bVar) {
        luq luqVar = new luq(this.b, this.c, v1bVar);
        luqVar.a = duqVar;
        return luqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        duq duqVar = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (duqVar instanceof duq.b) {
            this.b.invoke(((duq.b) duqVar).a);
        } else {
            if (!Intrinsics.g(duqVar, duq.a.a)) {
                uhc.a();
                return null;
            }
            this.c.invoke();
        }
        return Unit.a;
    }
}
