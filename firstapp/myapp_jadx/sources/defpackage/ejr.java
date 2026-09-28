package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNUpdateClock", f = "LNUpdateClock.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 24}, m = "startClock", v = 2)
public final class ejr extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fjr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejr(fjr fjrVar, x1b x1bVar) {
        super(x1bVar);
        this.b = fjrVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.e(this);
        return y5b.a;
    }
}
