package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel", f = "LoyaltyViewModel.kt", l = {1377}, m = "getLockedTierDataList", v = 2)
public final class v3u extends x1b {
    public ArrayList a;
    public ArrayList b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b3u d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3u(b3u b3uVar, x1b x1bVar) {
        super(x1bVar);
        this.d = b3uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.I1(null, null, null, null, null, null, null, null, null, 0L, null, this);
    }
}
