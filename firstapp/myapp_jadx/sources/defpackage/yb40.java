package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.antest.RebetRemixCombineAnTestHelper", f = "RebetRemixCombineAnTestHelper.kt", l = {139, 141, 142}, m = "reportPlaceBetIfEligible", v = 2)
public final class yb40 extends x1b {
    public boolean a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hc40 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb40(hc40 hc40Var, x1b x1bVar) {
        super(x1bVar);
        this.d = hc40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(false, this);
    }
}
