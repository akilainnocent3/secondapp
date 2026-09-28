package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.data.repository.CampaignRepository", f = "CampaignRepository.kt", l = {KYCBannerItem.STATUS_DEPRECATE, 28, 30}, m = "getTierNotReachedData", v = 1)
public final class i86 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v86 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i86(v86 v86Var, x1b x1bVar) {
        super(x1bVar);
        this.c = v86Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
