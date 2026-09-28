package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.antest.RebetRemixFunnelState", f = "RebetRemixFunnelState.kt", l = {28, 29}, m = "consumeStep2ToStep3DurationSeconds", v = 2)
public final class kc40 extends x1b {
    public Long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mc40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc40(mc40 mc40Var, x1b x1bVar) {
        super(x1bVar);
        this.c = mc40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
