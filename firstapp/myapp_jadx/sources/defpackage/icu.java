package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.mfa.MFARepoImpl", f = "MFARepoImpl.kt", l = {98}, m = "get2FAInfo", v = 2)
public final class icu extends x1b {
    public ResourceUiText a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lcu c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icu(lcu lcuVar, x1b x1bVar) {
        super(x1bVar);
        this.c = lcuVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
