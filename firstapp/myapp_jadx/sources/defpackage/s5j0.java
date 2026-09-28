package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel", f = "WelcomeRewardViewModel.kt", l = {615, 343, 350}, m = "updateLastShownPopupIndex", v = 2)
public final class s5j0 extends x1b {
    public List a;
    public Map b;
    public o2g c;
    public w4j0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ w4j0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5j0(w4j0 w4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = w4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.D1(null, this);
    }
}
