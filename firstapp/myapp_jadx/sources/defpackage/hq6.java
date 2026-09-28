package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutOpenBetsCountManagerImpl", f = "CashoutOpenBetsCountManagerImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "fetchOpenBetCount", v = 2)
public final class hq6 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jq6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq6(jq6 jq6Var, x1b x1bVar) {
        super(x1bVar);
        this.c = jq6Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, false, this);
    }
}
