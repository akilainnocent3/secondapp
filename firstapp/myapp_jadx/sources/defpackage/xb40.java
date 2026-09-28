package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.antest.RebetRemixCombineAnTestHelper", f = "RebetRemixCombineAnTestHelper.kt", l = {166}, m = "reportPlaceBetConversion", v = 2)
public final class xb40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hc40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb40(hc40 hc40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = hc40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        int i = hc40.e;
        return this.b.b(null, this);
    }
}
