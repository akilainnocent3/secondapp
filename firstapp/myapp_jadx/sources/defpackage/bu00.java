package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportypicks.data.repository.PicksRepositoryImpl", f = "PicksRepositoryImpl.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "getPickMarkets-BWLJW6A", v = 2)
public final class bu00 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ du00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu00(du00 du00Var, x1b x1bVar) {
        super(x1bVar);
        this.b = du00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(0, 0, this, null);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
