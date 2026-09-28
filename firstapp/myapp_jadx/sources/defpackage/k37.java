package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.mapper.ChallengeUiMapper", f = "ChallengeUiMapper.kt", l = {305, 310}, m = "buildPrizes", v = 2)
public final class k37 extends x1b {
    public int a;
    public int b;
    public j27 c;
    public Object d;
    public ResourceUiText e;
    public /* synthetic */ Object f;
    public final /* synthetic */ j37 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k37(j37 j37Var, x1b x1bVar) {
        super(x1bVar);
        this.i = j37Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(0, null, null, this);
    }
}
