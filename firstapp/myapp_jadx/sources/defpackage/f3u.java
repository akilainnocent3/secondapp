package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel", f = "LoyaltyViewModel.kt", l = {899}, m = "buildFreeBetGiftReward", v = 2)
public final class f3u extends x1b {
    public uqf0 a;
    public uqf0 b;
    public ResourceUiText c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b3u e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3u(b3u b3uVar, x1b x1bVar) {
        super(x1bVar);
        this.e = b3uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.y1(null, null, null, this);
    }
}
