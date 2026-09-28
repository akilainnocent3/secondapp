package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.experiment.OneUpExperimentCoordinator", f = "OneUpExperimentCoordinator.kt", l = {132, 143, 146}, m = "toExperimentState", v = 2)
public final class nsy extends x1b {
    public lk50 a;
    public ksy.c b;
    public String c;
    public x66 d;
    public String e;
    public long f;
    public /* synthetic */ Object i;
    public final /* synthetic */ ksy v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsy(ksy ksyVar, x1b x1bVar) {
        super(x1bVar);
        this.v = ksyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.h(null, null, null, 0L, this);
    }
}
