package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.remixbet.antest.RemixBetAnTestManager", f = "RemixBetAnTestManager.kt", l = {84, 86}, m = "markWinningPopupRemixBetClicked", v = 2)
public final class v350 extends x1b {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u350 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v350(u350 u350Var, x1b x1bVar) {
        super(x1bVar);
        this.c = u350Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(false, this);
    }
}
