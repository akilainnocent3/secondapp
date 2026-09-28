package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.data.repository.ChallengeRepositoryImpl", f = "ChallengeRepositoryImpl.kt", l = {35}, m = "participateChallenge", v = 2)
public final class h27 extends x1b {
    public ResourceUiText a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i27 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h27(i27 i27Var, x1b x1bVar) {
        super(x1bVar);
        this.c = i27Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(0L, this);
    }
}
