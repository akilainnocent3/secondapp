package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.experiment.OneUpExperimentCoordinator", f = "OneUpExperimentCoordinator.kt", l = {186}, m = "awaitResolvedExperimentState", v = 2)
public final class lsy extends x1b {
    public psy a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ksy c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsy(ksy ksyVar, x1b x1bVar) {
        super(x1bVar);
        this.c = ksyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
