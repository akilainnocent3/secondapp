package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.mappers.BettingStreakLobbyUiMapper", f = "BettingStreakLobbyUiMapper.kt", l = {111}, m = "updateScreenDataWithMissions", v = 2)
public final class y14 extends x1b {
    public b24 a;
    public n7e0 b;
    public s24 c;
    public Long d;
    public StringUiText e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ z14 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y14(z14 z14Var, x1b x1bVar) {
        super(x1bVar);
        this.v = z14Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.f(null, null, 0L, this);
    }
}
