package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.matchtracker.animation.IbMatchTrackerAnimator", f = "IbMatchTrackerAnimator.kt", l = {ModuleDescriptor.MODULE_VERSION, 157}, m = "playTeamAnimation", v = 2)
public final class w2n extends x1b {
    public long a;
    public long b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x2n f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2n(x2n x2nVar, x1b x1bVar) {
        super(x1bVar);
        this.f = x2nVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.i(0L, 0, 0, 0L, this);
    }
}
