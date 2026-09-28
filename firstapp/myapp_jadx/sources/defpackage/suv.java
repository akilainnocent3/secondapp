package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.api.mission.components.MissionRewardsKt$BetslipThemeTooltipAnchor$3$1", f = "MissionRewards.kt", l = {293}, m = "invokeSuspend", v = 2)
public final class suv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wtt c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suv(boolean z, wtt wttVar, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = wttVar;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new suv(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((suv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ytw<Boolean> ytwVar = this.d;
        if (i == 0) {
            uj50.b(obj);
            if (this.b) {
                float f = xuv.a;
                if (!ytwVar.getValue().booleanValue()) {
                    this.a = 1;
                    if (hkd.b(1000L, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        float f2 = xuv.a;
        ytwVar.setValue(Boolean.TRUE);
        this.c.invoke();
        return Unit.a;
    }
}
