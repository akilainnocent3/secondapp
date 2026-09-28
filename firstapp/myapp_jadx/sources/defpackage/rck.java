package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.domain.usecase.GetRecapDataUseCase", f = "GetRecapDataUseCase.kt", l = {21, 24, KYCBannerItem.STATUS_DEPRECATE}, m = "invoke", v = 2)
public final class rck extends x1b {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qck d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rck(qck qckVar, x1b x1bVar) {
        super(x1bVar);
        this.d = qckVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
