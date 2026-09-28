package defpackage;

import com.sporty.android.core.model.loyalty.UserTier;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel", f = "LoyaltyViewModel.kt", l = {1278, 1305}, m = "getCurrentTierDataList", v = 2)
public final class t3u extends x1b {
    public long A;
    public /* synthetic */ Object B;
    public final /* synthetic */ b3u C;
    public int D;
    public uqf0 a;
    public uqf0 b;
    public UserTier c;
    public List d;
    public tyt e;
    public jwv f;
    public String i;
    public p34 v;
    public b3u.a w;
    public List y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3u(b3u b3uVar, x1b x1bVar) {
        super(x1bVar);
        this.C = b3uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.G1(null, null, null, null, null, null, null, null, null, null, 0L, null, this);
    }
}
