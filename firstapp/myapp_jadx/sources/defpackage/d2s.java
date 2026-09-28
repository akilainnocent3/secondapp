package defpackage;

import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.mapper.LeaderboardUiMapper", f = "LeaderboardUiMapper.kt", l = {50}, m = "mapToEntryUiModel", v = 2)
public final class d2s extends x1b {
    public f1s a;
    public String b;
    public UiText c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b2s f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2s(b2s b2sVar, x1b x1bVar) {
        super(x1bVar);
        this.f = b2sVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.d(null, null, this);
    }
}
