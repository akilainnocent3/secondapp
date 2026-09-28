package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl", f = "InstantWinPromotionManagerImpl.kt", l = {242, 244, 245, 248}, m = "getTodaysBetSportIds", v = 2)
public final class mio extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pio c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mio(pio pioVar, x1b x1bVar) {
        super(x1bVar);
        this.c = pioVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        int i = pio.w;
        return this.c.a(this);
    }
}
