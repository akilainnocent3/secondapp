package defpackage;

import com.sporty.android.core.model.instantwin.InstantWinPromotionData;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl", f = "InstantWinPromotionManagerImpl.kt", l = {226, 227, 233, 236, 237}, m = "maybeResetOnModuleChange", v = 2)
public final class qio extends x1b {
    public InstantWinPromotionData a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ pio v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qio(pio pioVar, x1b x1bVar) {
        super(x1bVar);
        this.v = pioVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        int i = pio.w;
        return this.v.c(null, this);
    }
}
