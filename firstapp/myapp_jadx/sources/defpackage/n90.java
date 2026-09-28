package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {71}, m = "startInputMethod")
public final class n90 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ r90 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(r90 r90Var, x1b x1bVar) {
        super(x1bVar);
        this.b = r90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.a(null, this);
        return y5b.a;
    }
}
