package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.experiment.OneUpExperimentAttributionRecorder", f = "OneUpExperimentAttributionRecorder.kt", l = {32}, m = "clear", v = 2)
public final class fsy extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ isy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsy(isy isyVar, x1b x1bVar) {
        super(x1bVar);
        this.b = isyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
