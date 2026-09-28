package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel", f = "LoyaltyViewModel.kt", l = {703, 716}, m = "createTab", v = 2)
public final class r3u extends x1b {
    public jwv a;
    public uqf0 b;
    public tyt c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b3u f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3u(b3u b3uVar, x1b x1bVar) {
        super(x1bVar);
        this.f = b3uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.C1(null, null, null, null, null, null, null, null, null, this);
    }
}
