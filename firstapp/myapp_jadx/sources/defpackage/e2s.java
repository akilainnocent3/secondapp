package defpackage;

import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.mapper.LeaderboardUiMapper", f = "LeaderboardUiMapper.kt", l = {93, 95}, m = "mapToUserRanking", v = 2)
public final class e2s extends x1b {
    public String a;
    public UiText b;
    public String c;
    public String d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ b2s i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2s(b2s b2sVar, x1b x1bVar) {
        super(x1bVar);
        this.i = b2sVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.e(null, null, false, 0, 0, null, this);
    }
}
