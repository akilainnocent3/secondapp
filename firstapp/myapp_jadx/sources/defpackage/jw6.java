package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession")
public final class jw6 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ow6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw6(ow6 ow6Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ow6Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.a(null, null, this);
        return y5b.a;
    }
}
