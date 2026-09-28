package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.repository.ApiRepository", f = "ApiRepository.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "fetchTournamentRankList", v = 1)
public final class rn0 extends x1b {
    public ko0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ko0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn0(ko0 ko0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ko0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(0L, this);
    }
}
