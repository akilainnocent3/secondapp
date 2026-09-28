package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel", f = "LoyaltyViewModel.kt", l = {849, 861}, m = "buildClaimableActivityRewards", v = 2)
public final class e3u extends x1b {
    public String a;
    public String b;
    public List c;
    public Iterator d;
    public LoyaltyActivityData e;
    public String f;
    public String i;
    public List v;
    public /* synthetic */ Object w;
    public final /* synthetic */ b3u y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3u(b3u b3uVar, x1b x1bVar) {
        super(x1bVar);
        this.y = b3uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.x1(null, null, null, null, null, this);
    }
}
