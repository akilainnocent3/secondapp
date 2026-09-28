package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.mappers.BettingStreakLobbyUiMapper", f = "BettingStreakLobbyUiMapper.kt", l = {66}, m = "lobbyDataToScreenData", v = 2)
public final class x14 extends x1b {
    public int A;
    public int B;
    public int C;
    public boolean D;
    public /* synthetic */ Object E;
    public final /* synthetic */ z14 F;
    public int G;
    public w14 a;
    public b24 b;
    public t6e0 c;
    public StringUiText d;
    public UiText e;
    public UiText f;
    public String i;
    public UiText v;
    public s24 w;
    public Long y;
    public StringUiText z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x14(z14 z14Var, x1b x1bVar) {
        super(x1bVar);
        this.F = z14Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(null, 0L, this);
    }
}
