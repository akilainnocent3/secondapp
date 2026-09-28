package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballDefaultDisplayAnTestHelper", f = "ScheduledFootballDefaultDisplayAnTestHelper.kt", l = {32}, m = "shouldCollapseTargetMatchday", v = 2)
public final class v370 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ x370 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v370(x370 x370Var, x1b x1bVar) {
        super(x1bVar);
        this.b = x370Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
