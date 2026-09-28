package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.antest.RebetRemixFunnelState", f = "RebetRemixFunnelState.kt", l = {22, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "markStep2", v = 2)
public final class lc40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mc40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc40(mc40 mc40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = mc40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
