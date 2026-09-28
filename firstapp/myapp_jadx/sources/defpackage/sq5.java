package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.signup.domain.CPFValidator", f = "CPFValidator.kt", l = {54}, m = "validateRemotely", v = 2)
public final class sq5 extends x1b {
    public String a;
    public ResourceUiText b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tq5 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq5(tq5 tq5Var, x1b x1bVar) {
        super(x1bVar);
        this.d = tq5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, false, this);
    }
}
