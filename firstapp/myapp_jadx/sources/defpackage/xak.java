package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixBankAccountsUseCase", f = "GetPixBankAccountsUseCase.kt", l = {22, 24, KYCBannerItem.STATUS_DEPRECATE}, m = "invoke-gIAlu-s", v = 2)
public final class xak extends x1b {
    public boolean a;
    public yak b;
    public Map c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yak e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xak(yak yakVar, x1b x1bVar) {
        super(x1bVar);
        this.e = yakVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Serializable serializableA = this.e.a(false, this);
        return serializableA == y5b.a ? serializableA : new zi50(serializableA);
    }
}
