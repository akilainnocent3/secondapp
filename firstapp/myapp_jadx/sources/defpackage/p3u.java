package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel", f = "LoyaltyViewModel.kt", l = {956, 979}, m = "createEventData", v = 2)
public final class p3u extends x1b {
    public int A;
    public List a;
    public p34 b;
    public uyt.j c;
    public String d;
    public String e;
    public LoyaltyActivityData f;
    public String i;
    public String v;
    public String w;
    public /* synthetic */ Object y;
    public final /* synthetic */ b3u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3u(b3u b3uVar, x1b x1bVar) {
        super(x1bVar);
        this.z = b3uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.A1(null, null, this);
    }
}
