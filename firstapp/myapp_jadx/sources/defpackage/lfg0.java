package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentStatsUiKt$TournamentStatsUi$3$2$1", f = "TournamentStatsUi.kt", l = {}, m = "invokeSuspend", v = 1)
public final class lfg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ aig0 a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfg0(aig0 aig0Var, long j, v1b<? super lfg0> v1bVar) {
        super(2, v1bVar);
        this.a = aig0Var;
        this.b = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lfg0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lfg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        aig0 aig0Var = this.a;
        aig0Var.getClass();
        ej5.c(o8i0.d(aig0Var), null, null, new whg0(aig0Var, this.b, null), 3);
        return Unit.a;
    }
}
