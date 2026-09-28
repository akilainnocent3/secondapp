package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.component.animation.scorepanel.SportyPenaltySettlementScorePanelKt$ShiftAnimationScoreSequence$1$1", f = "SportyPenaltySettlementScorePanel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f3d0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<s2d0> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3d0(ytw<s2d0> ytwVar, v1b<? super f3d0> v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f3d0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f3d0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.setValue(s2d0.b);
        return Unit.a;
    }
}
