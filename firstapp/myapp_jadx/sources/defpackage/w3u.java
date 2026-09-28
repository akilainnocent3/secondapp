package defpackage;

import com.sporty.android.core.model.loyalty.UserTier;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel", f = "LoyaltyViewModel.kt", l = {1210, 1235}, m = "getOthersTierDataList", v = 2)
public final class w3u extends x1b {
    public uqf0 a;
    public uqf0 b;
    public uqf0 c;
    public List d;
    public UserTier e;
    public String f;
    public List i;
    public /* synthetic */ Object v;
    public final /* synthetic */ b3u w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3u(b3u b3uVar, x1b x1bVar) {
        super(x1bVar);
        this.w = b3uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.K1(null, null, null, null, null, null, this);
    }
}
