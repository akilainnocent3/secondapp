package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "proceed")
public final class g840 extends x1b {
    public dyo a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h840 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g840(h840 h840Var, x1b x1bVar) {
        super(x1bVar);
        this.c = h840Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
