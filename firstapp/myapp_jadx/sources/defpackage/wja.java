package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {132, 135}, m = "onScrollCaptureImageRequest")
public final class wja extends x1b {
    public Object a;
    public owo b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vja f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wja(vja vjaVar, x1b x1bVar) {
        super(x1bVar);
        this.f = vjaVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
