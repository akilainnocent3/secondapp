package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.experiment.OneUpExperimentAttributionRecorder", f = "OneUpExperimentAttributionRecorder.kt", l = {40}, m = "isEligible", v = 2)
public final class gsy extends x1b {
    public yty a;
    public /* synthetic */ Object b;
    public final /* synthetic */ isy c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsy(isy isyVar, x1b x1bVar) {
        super(x1bVar);
        this.c = isyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, null, this);
    }
}
