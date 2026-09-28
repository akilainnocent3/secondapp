package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.usecase.DepositUseCase", f = "DepositUseCase.kt", l = {50, 52}, m = "invoke", v = 2)
public final class h9e extends x1b {
    public tje0 a;
    public DepositRequest b;
    public BaseResponse c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i9e e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9e(i9e i9eVar, x1b x1bVar) {
        super(x1bVar);
        this.e = i9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
