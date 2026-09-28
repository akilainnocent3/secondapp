package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.data.repository.TeamsRepositoryImpl", f = "TeamsRepositoryImpl.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "getTeamNews-BWLJW6A", v = 2)
public final class baf0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ daf0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baf0(daf0 daf0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = daf0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(0, this, null, null);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
