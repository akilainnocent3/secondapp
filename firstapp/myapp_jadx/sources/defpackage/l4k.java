package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.mobileMoney.domain.GetCmMobileMoneyChannelsUseCase", f = "GetCmMobileMoneyChannelsUseCase.kt", l = {17}, m = "invoke-gIAlu-s", v = 2)
public final class l4k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ m4k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4k(m4k m4kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = m4kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Serializable serializableA = this.b.a(null, this);
        return serializableA == y5b.a ? serializableA : new zi50(serializableA);
    }
}
