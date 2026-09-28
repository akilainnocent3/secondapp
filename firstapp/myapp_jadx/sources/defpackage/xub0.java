package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose", f = "SportyHeroCompose.kt", l = {2653, 5536}, m = "runTurboProgressSlideIn", v = 1)
public final class xub0 extends x1b {
    public View a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ qub0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xub0(qub0 qub0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = qub0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.l4(null, null, false, false, this);
    }
}
