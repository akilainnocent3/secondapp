package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {187, 196}, m = "boundsUpdatesEventLoop$ui_release")
public final class i60 extends x1b {
    public c77 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e60 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(e60 e60Var, x1b x1bVar) {
        super(x1bVar);
        this.c = e60Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
