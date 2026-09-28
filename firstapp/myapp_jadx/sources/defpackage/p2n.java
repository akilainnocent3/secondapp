package defpackage;

import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.matchtracker.animation.IbMatchTrackerAnimator", f = "IbMatchTrackerAnimator.kt", l = {177, 179}, m = "playAttackAndCommentary", v = 2)
public final class p2n extends x1b {
    public String a;
    public UiText b;
    public /* synthetic */ Object c;
    public final /* synthetic */ x2n d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2n(x2n x2nVar, x1b x1bVar) {
        super(x1bVar);
        this.d = x2nVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
