package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetResultsUseCase$invoke$result$1", f = "LNGetResultsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lcq extends tje0 implements gaj<lk50<? extends icq.b>, qcn<? extends erq>, v1b<? super lk50<? extends d7r>>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ qcn b;
    public final /* synthetic */ icq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcq(icq icqVar, v1b<? super lcq> v1bVar) {
        super(3, v1bVar);
        this.c = icqVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends icq.b> lk50Var, qcn<? extends erq> qcnVar, v1b<? super lk50<? extends d7r>> v1bVar) {
        lcq lcqVar = new lcq(this.c, v1bVar);
        lcqVar.a = lk50Var;
        lcqVar.b = qcnVar;
        return lcqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        qcn qcnVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return bm50.l(lk50Var, new j4l(this.c, qcnVar));
    }
}
