package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.util.SportyBetImagePreloader", f = "SportyBetImagePreloader.kt", l = {69, 183, 183, 183}, m = "preloadResources", v = 2)
public final class uib0 extends x1b {
    public List a;
    public String b;
    public Object c;
    public tuw d;
    public /* synthetic */ Object e;
    public final /* synthetic */ wib0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uib0(wib0 wib0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = wib0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.c(this, null, null);
    }
}
