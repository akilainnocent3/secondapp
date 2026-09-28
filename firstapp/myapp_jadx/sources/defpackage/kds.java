package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkds;", "Lavw;", "Lids;", "Lcbs;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kds extends avw<ids> implements cbs {
    public final gds e;
    public final o3k f;
    public final psm i;
    public final hrd0 v;
    public jvd0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kds(gds gdsVar, o3k o3kVar, psm psmVar, hrd0 hrd0Var) {
        super(ids.b.a);
        psmVar.getClass();
        hrd0Var.getClass();
        this.e = gdsVar;
        this.f = o3kVar;
        this.i = psmVar;
        this.v = hrd0Var;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        if (aVar == s9s.a.ON_RESUME) {
            jvd0 jvd0Var = this.w;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.w = y1(new jds(this, null));
        }
    }
}
