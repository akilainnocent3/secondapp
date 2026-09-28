package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.matchtracker.animation.IbMatchTrackerAnimator", f = "IbMatchTrackerAnimator.kt", l = {137, 144, 145}, m = "playOvertime", v = 2)
public final class u2n extends x1b {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public qcn f;
    public /* synthetic */ Object i;
    public final /* synthetic */ x2n v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2n(x2n x2nVar, x1b x1bVar) {
        super(x1bVar);
        this.v = x2nVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.g(0, 0, 0, null, this);
    }
}
