package defpackage;

import com.sporty.android.core.model.loyalty.UserTier;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel", f = "LoyaltyViewModel.kt", l = {772, 783, 785}, m = "createRewardData", v = 2)
public final class q3u extends x1b {
    public uqf0 a;
    public uqf0 b;
    public uqf0 c;
    public UserTier d;
    public List e;
    public List f;
    public /* synthetic */ Object i;
    public final /* synthetic */ b3u v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3u(b3u b3uVar, x1b x1bVar) {
        super(x1bVar);
        this.v = b3uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.B1(null, null, null, null, null, null, null, this);
    }
}
