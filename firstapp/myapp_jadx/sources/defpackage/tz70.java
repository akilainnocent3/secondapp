package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchTooltipViewModel", f = "SearchTooltipViewModel.kt", l = {40, 40}, m = "shouldShowTooltip", v = 2)
public final class tz70 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ sz70 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz70(sz70 sz70Var, x1b x1bVar) {
        super(x1bVar);
        this.b = sz70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(this);
    }
}
