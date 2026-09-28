package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.usecase.GetMxMinDepositTierUseCase", f = "GetMxMinDepositTierUseCase.kt", l = {20}, m = "invoke-IoAF18A", v = 2)
public final class c9k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ d9k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9k(d9k d9kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = d9kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Serializable serializableA = this.b.a(this);
        return serializableA == y5b.a ? serializableA : new zi50(serializableA);
    }
}
