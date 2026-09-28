package defpackage;

import android.content.Context;
import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.welcomereward.WelcomeRewardHelperImpl", f = "WelcomeRewardHelperImpl.kt", l = {20}, m = "provideKycIntent", v = 2)
public final class n2j0 extends x1b {
    public Context a;
    public CountryCodeName b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m2j0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2j0(m2j0 m2j0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = m2j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
