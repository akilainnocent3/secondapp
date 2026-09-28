package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.data.repository.LoyaltyMainRepositoryImpl", f = "LoyaltyMainRepositoryImpl.kt", l = {33}, m = "getPublicLoyaltyOverviewV2", v = 2)
public final class bwt extends x1b {
    public ResourceUiText a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cwt c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwt(cwt cwtVar, x1b x1bVar) {
        super(x1bVar);
        this.c = cwtVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
